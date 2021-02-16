/*
 * api.video Java API client
 * api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.
 *
 * The version of the OpenAPI document: 1
 * Contact: ecosystem-team@api.video
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 */

package video.api.client.api.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Webhook
 */

public class Webhook implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_WEBHOOK_ID = "webhookId";
    @SerializedName(SERIALIZED_NAME_WEBHOOK_ID)
    private String webhookId;

    public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private OffsetDateTime createdAt;

    public static final String SERIALIZED_NAME_EVENTS = "events";
    @SerializedName(SERIALIZED_NAME_EVENTS)
    private List<String> events = null;

    public static final String SERIALIZED_NAME_URL = "url";
    @SerializedName(SERIALIZED_NAME_URL)
    private String url;

    public Webhook webhookId(String webhookId) {
        this.webhookId = webhookId;
        return this;
    }

    /**
     * Unique identifier of the webhook
     * 
     * @return webhookId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "webhook_XXXXXXXXXXXXXXX", value = "Unique identifier of the webhook")

    public String getWebhookId() {
        return webhookId;
    }

    public void setWebhookId(String webhookId) {
        this.webhookId = webhookId;
    }

    public Webhook createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * When an webhook was created, presented in ISO-8601 format.
     * 
     * @return createdAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "2019-06-24T11:45:01.109Z", value = "When an webhook was created, presented in ISO-8601 format.")

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Webhook events(List<String> events) {
        this.events = events;
        return this;
    }

    public Webhook addEventsItem(String eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    /**
     * A list of events that will trigger the webhook.
     * 
     * @return events
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "[\"video.encoding.quality.completed\"]", value = "A list of events that will trigger the webhook.")

    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public Webhook url(String url) {
        this.url = url;
        return this;
    }

    /**
     * URL of the webhook
     * 
     * @return url
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "http://clientnotificationserver.com/notif?myquery=query", value = "URL of the webhook")

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Webhook webhook = (Webhook) o;
        return Objects.equals(this.webhookId, webhook.webhookId) && Objects.equals(this.createdAt, webhook.createdAt)
                && Objects.equals(this.events, webhook.events) && Objects.equals(this.url, webhook.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(webhookId, createdAt, events, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Webhook {\n");
        sb.append("    webhookId: ").append(toIndentedString(webhookId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
