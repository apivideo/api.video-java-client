package video.api.client.api;

import video.api.client.ApiException;
import video.api.client.models.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.net.URI;
import java.time.OffsetDateTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * API tests for VideosDelegatedUploadApi
 */
@DisplayName("VideosDelegatedUploadApi")
public class VideosDelegatedUploadApiTest extends AbstractApiTest {

    private final VideosDelegatedUploadApi api = apiClientMock.videosDelegatedUpload();

    @Nested
    @DisplayName("deleteToken")
    class deleteToken {
        private static final String PAYLOADS_PATH = "/payloads/videosDelegatedUpload/deleteToken/";

        @Test
        @DisplayName("required parameters")
        public void requiredParametersTest() {
            answerOnAnyRequest(201, "{}");

            assertThatThrownBy(() -> api.deleteToken(null)).isInstanceOf(ApiException.class)
                    .hasMessage("Missing the required parameter 'uploadToken' when calling deleteToken");

            assertThatNoException().isThrownBy(() -> api.deleteToken("to1tcmSFHeYY5KzyhOqVKMKb"));
            // String uploadToken
        }

        @Test
        @DisplayName("204 response")
        public void responseWithStatus204Test() throws ApiException {
            answerOnAnyRequest(204, "");

            api.deleteToken("to1tcmSFHeYY5KzyhOqVKMKb");
        }

        @Test
        @DisplayName("404 response")
        public void responseWithStatus404Test() throws ApiException {
            answerOnAnyRequest(404, "");

            assertThatThrownBy(() -> api.deleteToken("to1tcmSFHeYY5KzyhOqVKMKb")).isInstanceOf(ApiException.class)
                    .satisfies(e -> assertThat(((ApiException) e).getCode()).isEqualTo(404)).hasMessage("");
        }
    }

    @Nested
    @DisplayName("listTokens")
    class listTokens {
        private static final String PAYLOADS_PATH = "/payloads/videosDelegatedUpload/listTokens/";

        @Test
        @DisplayName("required parameters")
        public void requiredParametersTest() {
            answerOnAnyRequest(201, "{}");

            assertThatNoException().isThrownBy(() -> api.listTokens().execute());
        }

        @Test
        @DisplayName("200 response")
        public void responseWithStatus200Test() throws ApiException {
            answerOnAnyRequest(200, readResourceFile(PAYLOADS_PATH + "responses/200.json"));

            Page<UploadToken> res = api.listTokens().execute();

            assertThat(res.getCurrentPage()).isEqualTo(1);
            assertThat(res.getPageSize()).isEqualTo(25);
            assertThat(res.getPagesTotal()).isEqualTo(1);
            assertThat(res.getCurrentPageItems()).isEqualTo(2);
            assertThat(res.getLinks()).containsExactlyInAnyOrder(
                    new PaginationLink().rel("self").uri(URI.create("/upload-tokens?currentPage=1&pageSize=25")),
                    new PaginationLink().rel("first").uri(URI.create("/upload-tokens?currentPage=1&pageSize=25")),
                    new PaginationLink().rel("last").uri(URI.create("/upload-tokens?currentPage=1&pageSize=25")));

            assertThat(res.getItems()).containsExactlyInAnyOrder(
                    new UploadToken().token("to37YfoPDRR2pcDKa6LsUE0M").ttl(3600)
                            .createdAt(OffsetDateTime.parse("2020-12-02T10:26:46Z"))
                            .expiresAt(OffsetDateTime.parse("2020-12-02T11:26:46Z")),
                    new UploadToken().token("to1W3ZS9PdUBZWzzTEZr1B79").ttl(0)
                            .createdAt(OffsetDateTime.parse("2020-12-02T10:26:28Z")).expiresAt(null));
        }
    }

    @Nested
    @DisplayName("getToken")
    class getToken {
        private static final String PAYLOADS_PATH = "/payloads/videosDelegatedUpload/getToken/";

        @Test
        @DisplayName("required parameters")
        public void requiredParametersTest() {
            answerOnAnyRequest(201, "{}");

            assertThatThrownBy(() -> api.getToken(null)).isInstanceOf(ApiException.class)
                    .hasMessage("Missing the required parameter 'uploadToken' when calling getToken");

            assertThatNoException().isThrownBy(() -> api.getToken("to1tcmSFHeYY5KzyhOqVKMKb"));
        }

        @Test
        @DisplayName("200 response")
        public void responseWithStatus200Test() throws ApiException {
            answerOnAnyRequest(200, readResourceFile(PAYLOADS_PATH + "responses/200.json"));

            UploadToken res = api.getToken("to1tcmSFHeYY5KzyhOqVKMKb");

            assertThat(res.getToken()).isEqualTo("to1tcmSFHeYY5KzyhOqVKMKb");
            assertThat(res.getTtl()).isEqualTo(0);
        }

        @Test
        @DisplayName("404 response")
        public void responseWithStatus404Test() throws ApiException {
            answerOnAnyRequest(404, "");

            assertThatThrownBy(() -> api.getToken("to1tcmSFHeYY5KzyhOqVKMKb")).isInstanceOf(ApiException.class)
                    .satisfies(e -> assertThat(((ApiException) e).getCode()).isEqualTo(404)).hasMessage("");
        }
    }

    @Nested
    @DisplayName("upload")
    class upload {
        private static final String PAYLOADS_PATH = "/payloads/videosDelegatedUpload/upload/";

        @Test
        @DisplayName("required parameters")
        public void requiredParametersTest() {
            answerOnAnyRequest(201, "{}");

            assertThatThrownBy(() -> api.upload(null, new File(""))).isInstanceOf(ApiException.class)
                    .hasMessage("Missing the required parameter 'token' when calling upload");

            assertThatThrownBy(() -> api.upload("to1tcmSFHeYY5KzyhOqVKMKb", null)).isInstanceOf(ApiException.class)
                    .hasMessage("Missing the required parameter 'file' when calling upload");

            assertThatNoException().isThrownBy(() -> api.upload("to1tcmSFHeYY5KzyhOqVKMKb", new File("")));
        }

        @Test
        @DisplayName("201 response")
        public void responseWithStatus201Test() throws ApiException {
            answerOnAnyRequest(201, readResourceFile(PAYLOADS_PATH + "responses/201.json"));

            Video res = api.upload("to1tcmSFHeYY5KzyhOqVKMKb", new File(""));

            assertThat(res.getVideoId()).isEqualTo("vi4k0jvEUuaTdRAEjQ4Jfrgz");
            assertThat(res.getPlayerId()).isEqualTo("pl45KFKdlddgk654dspkze");
            assertThat(res.getTitle()).isEqualTo("Maths video");
            assertThat(res.getDescription()).isEqualTo("An amazing video explaining the string theory");
            assertThat(res.getPublic()).isEqualTo(false);
            assertThat(res.getPanoramic()).isEqualTo(false);
            assertThat(res.getTags()).containsExactlyInAnyOrder("maths", "string theory", "video");
            assertThat(res.getMetadata()).containsExactlyInAnyOrder(new Metadata("Author", "John Doe"),
                    new Metadata("Format", "Tutorial"));
            assertThat(res.getPublishedAt()).isEqualTo("4665-07-14T23:36:18.598Z");
            assertThat(res.getSource()).isEqualTo(new VideoSource().uri("/videos/vi4k0jvEUuaTdRAEjQ4Jfrgz/source"));
            assertThat(res.getAssets()).isEqualTo(new VideoAssets().iframe(
                    "<iframe src=\"//embed.api.video/vi4k0jvEUuaTdRAEjQ4Jfrgz?token=831a9bd9-9f50-464c-a369-8e9d914371ae\" width=\"100%\" height=\"100%\" frameborder=\"0\" scrolling=\"no\" allowfullscreen=\"\"></iframe>")
                    .player(URI.create(
                            "https://embed.api.video/vi4k0jvEUuaTdRAEjQ4Jfrgz?token=831a9bd9-9f50-464c-a369-8e9d914371ae"))
                    .hls(URI.create(
                            "https://cdn.api.video/stream/831a9bd9-9f50-464c-a369-8e9d914371ae/hls/manifest.m3u8"))
                    .thumbnail(URI.create(
                            "https://cdn.api.video/stream/831a9bd9-9f50-464c-a369-8e9d914371ae/thumbnail.jpg")));
        }

        @Test
        @DisplayName("400 response")
        public void responseWithStatus400Test() throws ApiException {
            answerOnAnyRequest(400, readResourceFile(PAYLOADS_PATH + "responses/400.json"));

            assertThatThrownBy(() -> api.upload("to1tcmSFHeYY5KzyhOqVKMKb", new File("")))
                    .isInstanceOf(ApiException.class)
                    .satisfies(e -> assertThat(((ApiException) e).getCode()).isEqualTo(400)).hasMessage("");
        }
    }

    @Nested
    @DisplayName("createToken")
    class createToken {
        private static final String PAYLOADS_PATH = "/payloads/videosDelegatedUpload/createToken/";

        @Test
        @DisplayName("required parameters")
        public void requiredParametersTest() {
            answerOnAnyRequest(201, "{}");

            assertThatThrownBy(() -> api.createToken(null)).isInstanceOf(ApiException.class)
                    .hasMessage("Missing the required parameter 'tokenCreatePayload' when calling createToken");

            assertThatNoException().isThrownBy(() -> api.createToken(new TokenCreatePayload()));
        }

        @Test
        @DisplayName("200 response")
        public void responseWithStatus200Test() throws ApiException {
            answerOnAnyRequest(200, readResourceFile(PAYLOADS_PATH + "responses/200.json"));

            UploadToken res = api.createToken(new TokenCreatePayload());

            assertThat(res.getToken()).isEqualTo("to1tcmSFHeYY5KzyhOqVKMKb");
            assertThat(res.getTtl()).isEqualTo(3600);
        }

        @Test
        @DisplayName("400 response")
        public void responseWithStatus400Test() throws ApiException {
            answerOnAnyRequest(400, "");

            assertThatThrownBy(() -> api.createToken(new TokenCreatePayload())).isInstanceOf(ApiException.class)
                    .satisfies(e -> assertThat(((ApiException) e).getCode()).isEqualTo(400)).hasMessage("");
        }
    }

}
