package video.api.integration;

import video.api.client.ApiException;
import video.api.client.ApiVideoClient;
import video.api.client.models.LiveStream;
import video.api.client.models.LiveStreamCreatePayload;
import video.api.client.models.LiveStreamUpdatePayload;
import video.api.client.models.Page;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;

@DisplayName("Integration tests of api.live() methods")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@EnabledIfEnvironmentVariable(named = "INTEGRATION_TESTS_API_TOKEN", matches = ".+")
public class LiveTest {

    private ApiVideoClient apiClient;
    private LiveStream liveStream;

    public LiveTest() {
        this.apiClient = new ApiVideoClient(System.getenv().get("INTEGRATION_TESTS_API_TOKEN"));
        apiClient.getHttpClient().setBasePath("https://ws-staging.api.video");
    }

    @Test
    @Order(1)
    @DisplayName("create a live stream")
    public void createLive() throws ApiException {
        liveStream = apiClient.live().create(new LiveStreamCreatePayload().name("[Java-SDK-tests] live stream"));

        assertThat(liveStream.getLiveStreamId()).isNotNull();
    }

    @Test
    @Order(2)
    @DisplayName("get the live stream")
    public void getLive() throws ApiException {
        LiveStream gotLiveStream = apiClient.live().get(this.liveStream.getLiveStreamId());

        assertThat(gotLiveStream).isEqualTo(liveStream);
    }

    @Test
    @Order(3)
    @DisplayName("live the live streams")
    public void listLives() throws ApiException {
        Page<LiveStream> page = apiClient.live().list().execute();

        assertThat(page.getItemsTotal()).isGreaterThan(0);
        assertThat(page.getItems()).contains(liveStream);
    }

    @Test
    @Order(4)
    @DisplayName("upload a thumbnail")
    public void uploadThumbnail() {
        File jpgFile = new File(this.getClass().getResource("/assets/cat.jpg").getFile());
        assertThatNoException()
                .isThrownBy(() -> apiClient.live().uploadThumbnail(this.liveStream.getLiveStreamId(), jpgFile));
    }

    @Test
    @Order(5)
    @DisplayName("delete a thumbnail")
    public void deleteThumbnail() {
        assertThatNoException().isThrownBy(() -> apiClient.live().deleteThumbnail(this.liveStream.getLiveStreamId()));
    }

    @Test
    @Order(6)
    @DisplayName("update the live")
    public void updateLive() throws ApiException {
        LiveStream updated = apiClient.live().update(liveStream.getLiveStreamId(),
                new LiveStreamUpdatePayload()._public(true).name("[Java-SDK-tests] delegated tokens (modified)"));

        assertThat(updated.getName()).isEqualTo("[Java-SDK-tests] delegated tokens (modified)");
        assertThat(updated.getPublic()).isTrue();
    }

    @AfterAll
    public void deleteLiveStream() throws ApiException {
        apiClient.live().delete(liveStream.getLiveStreamId());
    }
}
