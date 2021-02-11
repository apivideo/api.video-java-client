package api.video.integration;

import api.video.client.ApiException;
import api.video.client.ApiVideoClient;
import api.video.client.models.Page;
import api.video.client.models.TokenCreatePayload;
import api.video.client.models.UploadToken;
import api.video.client.models.Video;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import java.io.File;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicLong;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;

@DisplayName("Integration tests of api.videosDelegatedUpload() methods")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@EnabledIfEnvironmentVariable(named = "INTEGRATION_TESTS_API_TOKEN", matches = ".+")
public class VideosDelegatedUploadTest {

    private ApiVideoClient authenticatedApiClient;
    private ApiVideoClient unauthenticatedApiClient;

    @BeforeAll
    public void beforeAll() throws ApiException {
        this.authenticatedApiClient = new ApiVideoClient(System.getenv().get("INTEGRATION_TESTS_API_TOKEN"));
        authenticatedApiClient.getHttpClient().setBasePath("https://ws-staging.api.video");

        this.unauthenticatedApiClient = new ApiVideoClient();
        unauthenticatedApiClient.getHttpClient().setBasePath("https://ws-staging.api.video");
    }

    @Nested
    @DisplayName("upload without chunk by authenticated user")
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class WithoutChunkAuthenticated {
        private UploadToken uploadToken;
        private Video video;

        @Test
        @Order(1)
        @DisplayName("create a delegated token")
        public void createToken() throws ApiException {
            uploadToken = authenticatedApiClient.videosDelegatedUpload().createToken(new TokenCreatePayload().ttl(100));

            assertThat(uploadToken.getTtl()).isEqualTo(100);
            assertThat(uploadToken.getToken()).isNotNull();
        }

        @Test
        @Order(2)
        @DisplayName("upload")
        public void upload() throws ApiException {
            File mp4File = new File(this.getClass().getResource("/assets/sample.mp4").getFile());
            long fileSize = mp4File.length();
            long chunkSize = fileSize + 1;
            authenticatedApiClient.getHttpClient().setUploadChunkSize(chunkSize);

            AtomicLong totalUploadedAtomic = new AtomicLong(0);
            AtomicLong totalBytesAtomic = new AtomicLong(0);
            AtomicLong chunkCountAtomic = new AtomicLong(0);
            HashSet<Integer> seenChunkNums = new HashSet<>();

            this.video = authenticatedApiClient.videosDelegatedUpload().upload(uploadToken.getToken(), mp4File,
                    (bytesWritten, totalBytes, chunkCount, chunkNum) -> {
                        totalUploadedAtomic.set(bytesWritten);
                        totalBytesAtomic.set(totalBytes);
                        chunkCountAtomic.set(chunkCount);
                        seenChunkNums.add(chunkNum);
                    });

            assertThat(totalBytesAtomic.get()).isEqualTo(fileSize);
            assertThat(totalUploadedAtomic.get()).isEqualTo(fileSize);
            assertThat(chunkCountAtomic.get())
                    .isEqualTo(new Double(Math.ceil((float) fileSize / chunkSize)).longValue());
            assertThat(seenChunkNums).containsExactly(1);
        }

        @Test
        @Order(3)
        @DisplayName("delete the video")
        public void deleteVideo() {
            if (video != null) {
                assertThatNoException().isThrownBy(() -> authenticatedApiClient.videos().delete(video.getVideoId()));
            }
        }
    }

    @Nested
    @DisplayName("upload without chunk by unauthenticated user")
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class WithoutChunkUnauthenticated {
        private UploadToken uploadToken;
        private Video video;

        @Test
        @Order(1)
        @DisplayName("create a delegated token")
        public void createToken() throws ApiException {
            uploadToken = authenticatedApiClient.videosDelegatedUpload().createToken(new TokenCreatePayload().ttl(100));

            assertThat(uploadToken.getTtl()).isEqualTo(100);
            assertThat(uploadToken.getToken()).isNotNull();
        }

        @Test
        @Order(2)
        @DisplayName("upload")
        public void upload() throws ApiException {
            File mp4File = new File(this.getClass().getResource("/assets/sample.mp4").getFile());
            long fileSize = mp4File.length();
            long chunkSize = fileSize + 1;
            unauthenticatedApiClient.getHttpClient().setUploadChunkSize(chunkSize);

            AtomicLong totalUploadedAtomic = new AtomicLong(0);
            AtomicLong totalBytesAtomic = new AtomicLong(0);
            AtomicLong chunkCountAtomic = new AtomicLong(0);
            HashSet<Integer> seenChunkNums = new HashSet<>();

            this.video = unauthenticatedApiClient.videosDelegatedUpload().upload(uploadToken.getToken(), mp4File,
                    (bytesWritten, totalBytes, chunkCount, chunkNum) -> {
                        totalUploadedAtomic.set(bytesWritten);
                        totalBytesAtomic.set(totalBytes);
                        chunkCountAtomic.set(chunkCount);
                        seenChunkNums.add(chunkNum);
                    });

            assertThat(totalBytesAtomic.get()).isEqualTo(fileSize);
            assertThat(totalUploadedAtomic.get()).isEqualTo(fileSize);
            assertThat(chunkCountAtomic.get())
                    .isEqualTo(new Double(Math.ceil((float) fileSize / chunkSize)).longValue());
            assertThat(seenChunkNums).containsExactly(1);
        }

        @Test
        @Order(3)
        @DisplayName("delete the video")
        public void deleteVideo() {
            if (video != null) {
                assertThatNoException().isThrownBy(() -> authenticatedApiClient.videos().delete(video.getVideoId()));
            }
        }
    }

    @Nested
    @DisplayName("upload by chunk by authenticated user")
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class ByChunkAuthenticated {
        private UploadToken uploadToken;
        private Video video;

        @Test
        @Order(1)
        @DisplayName("create a delegated token")
        public void createToken() throws ApiException {
            uploadToken = authenticatedApiClient.videosDelegatedUpload().createToken(new TokenCreatePayload().ttl(100));

            assertThat(uploadToken.getTtl()).isEqualTo(100);
            assertThat(uploadToken.getToken()).isNotNull();
        }

        @Test
        @Order(2)
        @DisplayName("upload")
        public void upload() throws ApiException {
            File mp4File = new File(this.getClass().getResource("/assets/sample.mp4").getFile());
            long fileSize = mp4File.length();
            long chunkSize = fileSize / 3;
            authenticatedApiClient.getHttpClient().setUploadChunkSize(chunkSize);

            AtomicLong totalUploadedAtomic = new AtomicLong(0);
            AtomicLong totalBytesAtomic = new AtomicLong(0);
            AtomicLong chunkCountAtomic = new AtomicLong(0);
            HashSet<Integer> seenChunkNums = new HashSet<>();

            this.video = authenticatedApiClient.videosDelegatedUpload().upload(uploadToken.getToken(), mp4File,
                    (bytesWritten, totalBytes, chunkCount, chunkNum) -> {
                        totalUploadedAtomic.set(bytesWritten);
                        totalBytesAtomic.set(totalBytes);
                        chunkCountAtomic.set(chunkCount);
                        seenChunkNums.add(chunkNum);
                    });

            assertThat(totalBytesAtomic.get()).isEqualTo(fileSize);
            assertThat(totalUploadedAtomic.get()).isEqualTo(fileSize);
            assertThat(chunkCountAtomic.get())
                    .isEqualTo(new Double(Math.ceil((float) fileSize / chunkSize)).longValue());
            assertThat(seenChunkNums).containsExactly(1, 2, 3, 4);
        }

        @Test
        @Order(3)
        @DisplayName("delete the video")
        public void deleteVideo() {
            if (video != null) {
                assertThatNoException().isThrownBy(() -> authenticatedApiClient.videos().delete(video.getVideoId()));
            }
        }
    }

    @Nested
    @DisplayName("upload by chunk by unauthenticated user")
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class ByChunkUnauthenticated {
        private UploadToken uploadToken;
        private Video video;

        @Test
        @Order(1)
        @DisplayName("create a delegated token")
        public void createToken() throws ApiException {
            uploadToken = authenticatedApiClient.videosDelegatedUpload().createToken(new TokenCreatePayload().ttl(100));

            assertThat(uploadToken.getTtl()).isEqualTo(100);
            assertThat(uploadToken.getToken()).isNotNull();
        }

        @Test
        @Order(2)
        @DisplayName("upload")
        public void upload() throws ApiException {
            File mp4File = new File(this.getClass().getResource("/assets/sample.mp4").getFile());
            long fileSize = mp4File.length();
            long chunkSize = fileSize / 3;
            unauthenticatedApiClient.getHttpClient().setUploadChunkSize(chunkSize);

            AtomicLong totalUploadedAtomic = new AtomicLong(0);
            AtomicLong totalBytesAtomic = new AtomicLong(0);
            AtomicLong chunkCountAtomic = new AtomicLong(0);
            HashSet<Integer> seenChunkNums = new HashSet<>();

            this.video = unauthenticatedApiClient.videosDelegatedUpload().upload(uploadToken.getToken(), mp4File,
                    (bytesWritten, totalBytes, chunkCount, chunkNum) -> {
                        totalUploadedAtomic.set(bytesWritten);
                        totalBytesAtomic.set(totalBytes);
                        chunkCountAtomic.set(chunkCount);
                        seenChunkNums.add(chunkNum);
                    });

            assertThat(totalBytesAtomic.get()).isEqualTo(fileSize);
            assertThat(totalUploadedAtomic.get()).isEqualTo(fileSize);
            assertThat(chunkCountAtomic.get())
                    .isEqualTo(new Double(Math.ceil((float) fileSize / chunkSize)).longValue());
            assertThat(seenChunkNums).containsExactly(1, 2, 3, 4);
        }

        @Test
        @Order(3)
        @DisplayName("delete the video")
        public void deleteVideo() {
            if (video != null) {
                assertThatNoException().isThrownBy(() -> authenticatedApiClient.videos().delete(video.getVideoId()));
            }
        }
    }

    @Nested
    @DisplayName("create, get, list and delete token")
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class GetListDelete {
        private UploadToken uploadToken;

        @Test
        @Order(1)
        @DisplayName("create a delegated token")
        public void createToken() throws ApiException {
            uploadToken = authenticatedApiClient.videosDelegatedUpload().createToken(new TokenCreatePayload().ttl(100));

            assertThat(uploadToken.getTtl()).isEqualTo(100);
            assertThat(uploadToken.getToken()).isNotNull();
        }

        @Test
        @Order(2)
        @DisplayName("get the token")
        public void getToken() throws ApiException {
            UploadToken gotToken = authenticatedApiClient.videosDelegatedUpload().getToken(uploadToken.getToken());

            assertThat(gotToken).isEqualTo(uploadToken);
        }

        @Test
        @Order(3)
        @DisplayName("list the tokens")
        public void listToken() throws ApiException {
            Page<UploadToken> page = authenticatedApiClient.videosDelegatedUpload().listTokens().execute();

            assertThat(page.getItems()).contains(uploadToken);
        }

        @Test
        @Order(4)
        @DisplayName("delete token")
        public void deleteToken() {
            assertThatNoException().isThrownBy(
                    () -> authenticatedApiClient.videosDelegatedUpload().deleteToken(uploadToken.getToken()));
        }

        @Test
        @Order(5)
        @DisplayName("list the tokens after delete")
        public void listTokenAfterDelete() throws ApiException {
            Page<UploadToken> page = authenticatedApiClient.videosDelegatedUpload().listTokens().execute();

            assertThat(page.getItems()).doesNotContain(uploadToken);
        }
    }
}
