/*
 * api.video Java API client
 * api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.
 *
 * The version of the OpenAPI document: 1
 * Contact: ecosystem@api.video
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
 * WebhooksCreationPayload
 */

public class WebhooksCreationPayload implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_EVENTS = "events";
    @SerializedName(SERIALIZED_NAME_EVENTS)
    private List<String> events = new ArrayList<>();

    public static final String SERIALIZED_NAME_URL = "url";
    @SerializedName(SERIALIZED_NAME_URL)
    private String url;

    public WebhooksCreationPayload events(List<String> events) {
        this.events = events;
        return this;
    }

    public WebhooksCreationPayload addEventsItem(String eventsItem) {
        this.events.add(eventsItem);
        return this;
    }

    /**
     * A list of the webhooks that you are subscribing to. There are Currently four webhook options: *
     * &#x60;&#x60;&#x60;video.encoding.quality.completed&#x60;&#x60;&#x60; When a new video is uploaded into your
     * account, it will be encoded into several different HLS sizes/bitrates. When each version is encoded, your webhook
     * will get a notification. It will look like &#x60;&#x60;&#x60;{ \\\&quot;type\\\&quot;:
     * \\\&quot;video.encoding.quality.completed\\\&quot;, \\\&quot;emittedAt\\\&quot;:
     * \\\&quot;2021-01-29T16:46:25.217+01:00\\\&quot;, \\\&quot;videoId\\\&quot;: \\\&quot;viXXXXXXXX\\\&quot;,
     * \\\&quot;encoding\\\&quot;: \\\&quot;hls\\\&quot;, \\\&quot;quality\\\&quot;: \\\&quot;720p\\\&quot;}
     * &#x60;&#x60;&#x60;. This request says that the 720p HLS encoding was completed. *
     * &#x60;&#x60;&#x60;live-stream.broadcast.started&#x60;&#x60;&#x60; When a livestream begins broadcasting, the
     * broadcasting parameter changes from false to true, and this webhook fires. *
     * &#x60;&#x60;&#x60;live-stream.broadcast.ended&#x60;&#x60;&#x60; This event fores when the livestream has finished
     * broadcasting, and the broadcasting parameter flips from false to true. *
     * &#x60;&#x60;&#x60;video.source.recorded&#x60;&#x60;&#x60; This event is similar to
     * &#x60;&#x60;&#x60;video.encoding.quality.completed&#x60;&#x60;&#x60;, but tells you if a livestream has been
     * recorded as a VOD.
     * 
     * @return events
     **/
    @ApiModelProperty(example = "[\"video.encoding.quality.completed\"]", required = true, value = "A list of the webhooks that you are subscribing to. There are Currently four webhook options: * ```video.encoding.quality.completed```  When a new video is uploaded into your account, it will be encoded into several different HLS sizes/bitrates.  When each version is encoded, your webhook will get a notification.  It will look like ```{ \\\"type\\\": \\\"video.encoding.quality.completed\\\", \\\"emittedAt\\\": \\\"2021-01-29T16:46:25.217+01:00\\\", \\\"videoId\\\": \\\"viXXXXXXXX\\\", \\\"encoding\\\": \\\"hls\\\", \\\"quality\\\": \\\"720p\\\"} ```. This request says that the 720p HLS encoding was completed. * ```live-stream.broadcast.started```  When a livestream begins broadcasting, the broadcasting parameter changes from false to true, and this webhook fires. * ```live-stream.broadcast.ended```  This event fores when the livestream has finished broadcasting, and the broadcasting parameter flips from false to true. * ```video.source.recorded```  This event is similar to ```video.encoding.quality.completed```, but tells you if a livestream has been recorded as a VOD.")

    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public WebhooksCreationPayload url(String url) {
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
        WebhooksCreationPayload webhooksCreationPayload = (WebhooksCreationPayload) o;
        return Objects.equals(this.events, webhooksCreationPayload.events)
                && Objects.equals(this.url, webhooksCreationPayload.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(events, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksCreationPayload {\n");
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
