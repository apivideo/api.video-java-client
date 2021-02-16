package video.api.integration;

import video.api.client.ApiException;
import video.api.client.ApiVideoClient;
import video.api.client.models.Metadata;
import video.api.client.models.Page;
import video.api.client.models.Webhook;
import video.api.client.models.WebhooksCreatePayload;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Integration tests of api.webhooks() methods")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@EnabledIfEnvironmentVariable(named = "INTEGRATION_TESTS_API_TOKEN", matches = ".+")
public class WebhooksTest {

    private ApiVideoClient apiClient;
    private Webhook webhook;

    public WebhooksTest() {
        this.apiClient = new ApiVideoClient(System.getenv().get("INTEGRATION_TESTS_API_TOKEN"));
        apiClient.getHttpClient().setBasePath("https://ws-staging.api.video");
    }

    @Test
    @Order(1)
    @DisplayName("create a webhook")
    public void createWebhook() throws ApiException {
        this.webhook = apiClient.webhooks()
                .create(new WebhooksCreatePayload().url("https://webhooks.test-java-api-client"));
        System.out.println(webhook);
        assertThat(webhook.getWebhookId()).isNotNull();
    }

    @Test
    @Order(2)
    @DisplayName("create a webhook")
    public void listWebhooks() throws ApiException {
        Page<Webhook> list = apiClient.webhooks().list().execute();

        Collections.<Metadata> emptySet();
        // TODO
    }

    @AfterAll
    public void deleteWebhook() throws ApiException {
        apiClient.webhooks().delete(this.webhook.getWebhookId());
    }

}
