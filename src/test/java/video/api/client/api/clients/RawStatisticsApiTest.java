package video.api.client.api.clients;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;

import java.time.OffsetDateTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * API tests for RawStatisticsApi
 */
@DisplayName("RawStatisticsApi")
public class RawStatisticsApiTest extends AbstractApiTest {

    private final RawStatisticsApi api = apiClientMock.rawStatistics();

    @Nested
    @DisplayName("getLiveStreamAnalytics")
    class getLiveStreamAnalytics {
        private static final String PAYLOADS_PATH = "/payloads/rawStatistics/getLiveStreamAnalytics/";

        @Test
        @DisplayName("required parameters")
        public void requiredParametersTest() {
            answerOnAnyRequest(201, "{}");

            assertThatNoException().isThrownBy(() -> api.getLiveStreamAnalytics("vi4k0jvEUuaTdRAEjQ4Jfrgz").execute());
        }

        @Test
        @DisplayName("200 response")
        public void responseWithStatus200Test() throws ApiException {
            answerOnAnyRequest(200, readResourceFile(PAYLOADS_PATH + "responses/200.json"));

            Page<LiveStreamSession> res = api.getLiveStreamAnalytics("vi4k0jvEUuaTdRAEjQ4Jfrgz").execute();

            /*
             * sample response: { "data" : [ { "session" : { "sessionId" : "ps4zRWVOv2If2vzKJLMr3jQo", "loadedAt" :
             * "2018-09-11T13:04:37.89+00", "endedAt" : "2018-09-11 14:47:22.186+00" }, "location" : { "country" :
             * "France", "city" : "Paris" }, "referrer" : { "url" : "unknown", "medium" : "unknown", "source" :
             * "unknown", "searchTerm" : "unknown" }, "device" : { "type" : "desktop", "vendor" : "unknown", "model" :
             * "unknown" }, "os" : { "name" : "unknown", "shortname" : "unknown", "version" : "unknown" }, "client" : {
             * "type" : "browser", "name" : "Firefox", "version" : "61.0" } } ], "pagination" : { "currentPage" : 1,
             * "currentPageItems" : 1, "pageSize" : 25, "pagesTotal" : 1, "itemsTotal" : 1, "links" : [ { "rel" :
             * "self", "uri" : "/analytics/sessions/ps4zRWVOv2If2vzKJLMr3jQo?currentPage&#x3D;1&amp;pageSize&#x3D;25" },
             * { "rel" : "first", "uri" :
             * "/analytics/sessions/ps4zRWVOv2If2vzKJLMr3jQo?currentPage&#x3D;1&amp;pageSize&#x3D;25" }, { "rel" :
             * "last", "uri" : "/analytics/sessions/ps4zRWVOv2If2vzKJLMr3jQo?currentPage&#x3D;1&amp;pageSize&#x3D;25" }
             * ] } }
             */
        }

        @Test
        @DisplayName("404 response")
        public void responseWithStatus404Test() throws ApiException {
            answerOnAnyRequest(404, readResourceFile(PAYLOADS_PATH + "responses/404.json"));

            assertThatThrownBy(() -> api.getLiveStreamAnalytics("vi4k0jvEUuaTdRAEjQ4Jfrgz").execute())
                    .isInstanceOf(ApiException.class)
                    .satisfies(e -> assertThat(((ApiException) e).getCode()).isEqualTo(404))
                    .hasMessage("The requested resource was not found.");
        }
    }

    @Nested
    @DisplayName("listPlayerSessionEvents")
    class listPlayerSessionEvents {
        private static final String PAYLOADS_PATH = "/payloads/rawStatistics/listPlayerSessionEvents/";

        @Test
        @DisplayName("required parameters")
        public void requiredParametersTest() {
            answerOnAnyRequest(201, "{}");

            assertThatNoException().isThrownBy(() -> api.listPlayerSessionEvents("psEmFwGQUAXR2lFHj5nDOpy").execute());
            // String sessionId, Integer currentPage, Integer pageSize
        }

        @Test
        @DisplayName("200 response")
        public void responseWithStatus200Test() throws ApiException {
            answerOnAnyRequest(200, readResourceFile(PAYLOADS_PATH + "responses/200.json"));

            Page<PlayerSessionEvent> res = api.listPlayerSessionEvents("psEmFwGQUAXR2lFHj5nDOpy").execute();

            /*
             * sample response: { "data" : [ { "type" : "ready", "emittedAt" : "2020-09-15T09:47:42+00:00", "at" : 0 },
             * { "type" : "play", "emittedAt" : "2020-09-15T21:35:57+00:00", "at" : 0 }, { "type" : "pause", "emittedAt"
             * : "2020-09-15T21:36:05+00:00", "at" : 7 }, { "type" : "resume", "emittedAt" :
             * "2020-09-15T21:36:19+00:00", "at" : 21 }, { "type" : "seek.forward", "emittedAt" :
             * "2020-09-15T21:36:19+00:00", "from" : 7, "to" : 21 }, { "type" : "end", "emittedAt" :
             * "2020-09-15T21:36:28+00:00", "at" : 30 }, { "type" : "play", "emittedAt" : "2020-09-15T21:36:29+00:00",
             * "at" : 0 }, { "type" : "seek.backward", "emittedAt" : "2020-09-15T21:36:29+00:00", "from" : 30, "to" : 0
             * }, { "type" : "pause", "emittedAt" : "2020-09-15T21:36:29+00:00", "at" : 21 }, { "type" : "resume",
             * "emittedAt" : "2020-09-15T21:36:30+00:00", "at" : 21 }, { "type" : "seek.forward", "emittedAt" :
             * "2020-09-15T21:36:30+00:00", "from" : 0, "to" : 21 }, { "type" : "pause", "emittedAt" :
             * "2020-09-15T21:36:33+00:00", "at" : 20 }, { "type" : "resume", "emittedAt" : "2020-09-15T21:36:33+00:00",
             * "at" : 20 }, { "type" : "seek.backward", "emittedAt" : "2020-09-15T21:36:33+00:00", "from" : 24, "to" :
             * 20 }, { "type" : "pause", "emittedAt" : "2020-09-15T21:36:39+00:00", "at" : 17 }, { "type" : "resume",
             * "emittedAt" : "2020-09-15T21:36:39+00:00", "at" : 17 }, { "type" : "seek.forward", "emittedAt" :
             * "2020-09-15T21:36:39+00:00", "from" : 17, "to" : 17 }, { "type" : "pause", "emittedAt" :
             * "2020-09-15T21:36:41+00:00", "at" : 19 }, { "type" : "ready", "emittedAt" : "2020-09-17T09:20:47+00:00",
             * "at" : 0 }, { "type" : "ready", "emittedAt" : "2020-09-17T09:41:01+00:00", "at" : 0 }, { "type" :
             * "ready", "emittedAt" : "2020-09-17T09:41:08+00:00", "at" : 0 }, { "type" : "play", "emittedAt" :
             * "2020-09-17T09:41:10+00:00", "at" : 0 }, { "type" : "pause", "emittedAt" : "2020-09-17T09:41:12+00:00",
             * "at" : 1 }, { "type" : "resume", "emittedAt" : "2020-09-17T09:41:13+00:00", "at" : 1 }, { "type" :
             * "pause", "emittedAt" : "2020-09-17T09:41:15+00:00", "at" : 3 } ], "pagination" : { "currentPage" : 1,
             * "currentPageItems" : 25, "pageSize" : 25, "pagesTotal" : 2, "itemsTotal" : 30, "links" : [ { "rel" :
             * "self", "uri" :
             * "/analytics/sessions/ps5ltuhfsTOeh6bP03Tq5OWc/events?currentPage&#x3D;1&amp;pageSize&#x3D;25" }, { "rel"
             * : "first", "uri" :
             * "/analytics/sessions/ps5ltuhfsTOeh6bP03Tq5OWc/events?currentPage&#x3D;1&amp;pageSize&#x3D;25" }, { "rel"
             * : "next", "uri" :
             * "/analytics/sessions/ps5ltuhfsTOeh6bP03Tq5OWc/events?currentPage&#x3D;2&amp;pageSize&#x3D;25" }, { "rel"
             * : "last", "uri" :
             * "/analytics/sessions/ps5ltuhfsTOeh6bP03Tq5OWc/events?currentPage&#x3D;2&amp;pageSize&#x3D;25" } ] } }
             */
        }

        @Test
        @DisplayName("404 response")
        public void responseWithStatus404Test() throws ApiException {
            answerOnAnyRequest(404, readResourceFile(PAYLOADS_PATH + "responses/404.json"));

            assertThatThrownBy(() -> api.listPlayerSessionEvents("psEmFwGQUAXR2lFHj5nDOpy").execute())
                    .isInstanceOf(ApiException.class)
                    .satisfies(e -> assertThat(((ApiException) e).getCode()).isEqualTo(404))
                    .hasMessage("The requested resource was not found.");

            /*
             * sample response: { "type" : "https://docs.api.video/docs/resourcenot_found", "title" :
             * "The requested resource was not found.", "name" : "videoId", "status" : 404 }
             */
        }
    }

    @Nested
    @DisplayName("listSessions")
    class listSessions {
        private static final String PAYLOADS_PATH = "/payloads/rawStatistics/listSessions/";

        @Test
        @DisplayName("required parameters")
        public void requiredParametersTest() {
            answerOnAnyRequest(201, "{}");

            assertThatThrownBy(() -> api.listSessions(null).execute()).isInstanceOf(ApiException.class)
                    .hasMessage("Missing the required parameter 'videoId' when calling listSessions");

            assertThatNoException().isThrownBy(() -> api.listSessions("vi4k0jvEUuaTdRAEjQ4Prklg").execute());
        }

        @Test
        @DisplayName("200 response")
        public void responseWithStatus200Test() throws ApiException {
            answerOnAnyRequest(200, readResourceFile(PAYLOADS_PATH + "responses/200.json"));

            Page<VideoSession> res = api.listSessions("vi4k0jvEUuaTdRAEjQ4Prklg").execute();

            assertThat(res.getCurrentPage()).isEqualTo(1);
            assertThat(res.getPageSize()).isEqualTo(25);
            assertThat(res.getPagesTotal()).isEqualTo(1);
            assertThat(res.getCurrentPageItems()).isEqualTo(1);

            assertThat(res.getItems()).hasSize(1);

            assertThat(res.getItems()).containsExactlyInAnyOrder(new VideoSession()
                    .session(new VideoSessionSession().sessionId("psEmFwGQUAXR2lFHj5nDOpy")
                            .loadedAt(OffsetDateTime.parse("2019-06-24T11:45:01.109Z"))
                            .endedAt(OffsetDateTime.parse("2019-06-24T11:49:19.243Z")))
                    .location(new VideoSessionLocation().country("France").city("Paris"))
                    .referrer(new VideoSessionReferrer().url("https://api.video").medium("organic")
                            .source("https://google.com").searchTerm("video encoding hosting and delivery"))
                    .device(new VideoSessionDevice().type("desktop").vendor("Dell").model("unknown"))
                    .os(new VideoSessionOs().name("Microsoft Windows").shortname("W10").version("Windows10"))
                    .client(new VideoSessionClient().name("Firefox").version("67.0")));
        }

        @Test
        @DisplayName("404 response")
        public void responseWithStatus404Test() throws ApiException {
            answerOnAnyRequest(404, readResourceFile(PAYLOADS_PATH + "responses/404.json"));

            assertThatThrownBy(() -> api.listSessions("vi4k0jvEUuaTdRAEjQ4Prklg").execute())
                    .isInstanceOf(ApiException.class)
                    .satisfies(e -> assertThat(((ApiException) e).getCode()).isEqualTo(404))
                    .hasMessage("The requested resource was not found.");

            /*
             * sample response: { "type" : "https://docs.api.video/docs/resourcenot_found", "title" :
             * "The requested resource was not found.", "name" : "videoId", "status" : 404 }
             */
        }
    }

}
