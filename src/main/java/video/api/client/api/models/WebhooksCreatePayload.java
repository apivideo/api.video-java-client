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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * WebhooksCreatePayload
 */

public class WebhooksCreatePayload implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_EVENTS = "events";
    @SerializedName(SERIALIZED_NAME_EVENTS)
    private List<String> events = new ArrayList<>();

    public static final String SERIALIZED_NAME_URL = "url";
    @SerializedName(SERIALIZED_NAME_URL)
    private String url;

    public WebhooksCreatePayload events(List<String> events) {
        this.events = events;
        return this;
    }

    public WebhooksCreatePayload addEventsItem(String eventsItem) {
        this.events.add(eventsItem);
        return this;
    }

    /**
     * A list of the webhooks that you are subscribing to. Currently \&quot;video.encoding.quality.completed\&quot; is
     * the only option. video.encoding.quality.completed - a video encoding quality is ready for the video (for example
     * the 720p quality hls encoding video is ready.)
     * 
     * @return events
     **/
    @ApiModelProperty(example = "video.encoding.quality.completed", required = true, value = "A list of the webhooks that you are subscribing to. Currently \"video.encoding.quality.completed\" is the only option. video.encoding.quality.completed - a video encoding quality is ready for the video (for example the 720p quality hls encoding video is ready.)")

    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public WebhooksCreatePayload url(String url) {
        this.url = url;
        return this;
    }

    /**
     * The the url to which HTTP notifications are sent. It could be any http or https URL.
     * 
     * @return url
     **/
    @ApiModelProperty(example = "https://example.com/webhooks", required = true, value = "The the url to which HTTP notifications are sent. It could be any http or https URL.")

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
        WebhooksCreatePayload webhooksCreatePayload = (WebhooksCreatePayload) o;
        return Objects.equals(this.events, webhooksCreatePayload.events)
                && Objects.equals(this.url, webhooksCreatePayload.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(events, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksCreatePayload {\n");
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
