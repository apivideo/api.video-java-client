package video.api.integration;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;

@DisplayName("Integration tests of api.videosDelegatedUpload() methods")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@EnabledIfEnvironmentVariable(named = "INTEGRATION_TESTS_API_TOKEN", matches = ".+")
public class PlayersTest {

    private ApiVideoClient authenticatedApiClient;

    @BeforeAll
    public void beforeAll() {
        this.authenticatedApiClient = new ApiVideoClient(System.getenv().get("INTEGRATION_TESTS_API_TOKEN"));
        authenticatedApiClient.getHttpClient().setBasePath("https://ws-staging.api.video");
    }

    @Nested
    @DisplayName("upload without chunk by authenticated user")
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class WithoutChunkAuthenticated {
        private UploadToken uploadToken;
        private Video video;
        private Player player;

        @Test
        @Order(1)
        @DisplayName("create a player")
        public void createPlayer() throws ApiException {
            this.player = authenticatedApiClient.players().create(new PlayerCreationPayload());
        }

        @Test
        @Order(2)
        @DisplayName("upload a logo")
        public void uploadLogo() throws ApiException {
            File jpgFile = new File(this.getClass().getResource("/assets/logo-api-video.jpg").getFile());
            authenticatedApiClient.players().uploadLogo(player.getPlayerId(), jpgFile, "http://api.video");
        }

        @Test
        @Order(3)
        @DisplayName("update a player")
        public void updatePlayer() throws ApiException {
            Player updated = authenticatedApiClient.players().update(player.getPlayerId(),
                    new PlayerUpdatePayload().text("rgba(255, 255, 255, 1)"));
            assertThat(updated.getText()).isEqualTo("rgba(255, 255, 255, 1)");
        }

        @Test
        @Order(4)
        @DisplayName("get a player")
        public void getPlayer() throws ApiException {
            Player get = authenticatedApiClient.players().get(player.getPlayerId());
            assertThat(get.getPlayerId()).isEqualTo(player.getPlayerId());
        }

        @Test
        @Order(4)
        @DisplayName("list players")
        public void listPlayers() throws ApiException {
            Page<Player> page = authenticatedApiClient.players().list().execute();

            assertThat(page.getItems()).hasSizeGreaterThan(0);
            assertThat(page.getItems()).anyMatch(p -> p.getPlayerId().equals(player.getPlayerId()));
        }

        @Test
        @Order(5)
        @DisplayName("delete logo")
        public void deleteLogo() {
            assertThatNoException().isThrownBy(() -> authenticatedApiClient.players().deleteLogo(player.getPlayerId()));
        }

        @Test
        @Order(6)
        @DisplayName("delete the video")
        public void deletePlayer() {
            if (player != null) {
                assertThatNoException().isThrownBy(() -> authenticatedApiClient.players().delete(player.getPlayerId()));
            }
        }
    }

}
