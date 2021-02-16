package video.api.client.api;

import video.api.client.ApiException;
import video.api.client.models.Account;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * API tests for AccountApi
 */
@DisplayName("AccountApi")
public class AccountApiTest extends AbstractApiTest {

    private final AccountApi api = apiClientMock.account();

    @Nested
    @DisplayName("get")
    class get {
        private static final String PAYLOADS_PATH = "/payloads/account/get/";

        @Test
        @DisplayName("required parameters")
        public void requiredParametersTest() {
            answerOnAnyRequest(201, "{}");

            assertThatNoException().isThrownBy(() -> api.get());
            assertThatNoException().isThrownBy(() -> api.get());
            //
        }

        @Test
        @DisplayName("200 response")
        public void responseWithStatus200Test() throws ApiException {
            answerOnAnyRequest(200, readResourceFile(PAYLOADS_PATH + "responses/200.json"));

            Account res = api.get();

            /*
             * sample response: { "quota" : { "quotaUsed" : 6, "quotaRemaining" : 54, "quotaTotal" : 60 }, "environment"
             * : "production", "features" : [ "app.dynamic_metadata", "app.event_log", "player.white_label",
             * "stats.player_events", "transcode.mp4_support" ] }
             */
        }

        @Test
        @DisplayName("404 response")
        public void responseWithStatus404Test() throws ApiException {
            answerOnAnyRequest(404, readResourceFile(PAYLOADS_PATH + "responses/404.json"));

            assertThatThrownBy(api::get).isInstanceOf(ApiException.class)
                    .satisfies(e -> assertThat(((ApiException) e).getCode()).isEqualTo(404))
                    .hasMessage("The requested resource was not found.");

            /*
             * sample response: { "type" : "https://docs.api.video/docs/resourcenot_found", "title" :
             * "The requested resource was not found.", "name" : "", "status" : 404 }
             */
        }
    }

}
