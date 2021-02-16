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
import video.api.client.api.models.VideoSourceLiveStreamLinks;
import java.io.Serializable;

/**
 * This appears if the video is from a Live Record.
 */
@ApiModel(description = "This appears if the video is from a Live Record.")

public class VideoSourceLiveStream implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_LIVE_STREAM_ID = "liveStreamId";
    @SerializedName(SERIALIZED_NAME_LIVE_STREAM_ID)
    private String liveStreamId;

    public static final String SERIALIZED_NAME_LINKS = "links";
    @SerializedName(SERIALIZED_NAME_LINKS)
    private List<VideoSourceLiveStreamLinks> links = null;

    public VideoSourceLiveStream liveStreamId(String liveStreamId) {
        this.liveStreamId = liveStreamId;
        return this;
    }

    /**
     * The unique identifier for the live stream.
     * 
     * @return liveStreamId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "li400mYKSgQ6xs7taUeSaEKr", value = "The unique identifier for the live stream.")

    public String getLiveStreamId() {
        return liveStreamId;
    }

    public void setLiveStreamId(String liveStreamId) {
        this.liveStreamId = liveStreamId;
    }

    public VideoSourceLiveStream links(List<VideoSourceLiveStreamLinks> links) {
        this.links = links;
        return this;
    }

    public VideoSourceLiveStream addLinksItem(VideoSourceLiveStreamLinks linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    /**
     * Get links
     * 
     * @return links
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<VideoSourceLiveStreamLinks> getLinks() {
        return links;
    }

    public void setLinks(List<VideoSourceLiveStreamLinks> links) {
        this.links = links;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoSourceLiveStream videoSourceLiveStream = (VideoSourceLiveStream) o;
        return Objects.equals(this.liveStreamId, videoSourceLiveStream.liveStreamId)
                && Objects.equals(this.links, videoSourceLiveStream.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(liveStreamId, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoSourceLiveStream {\n");
        sb.append("    liveStreamId: ").append(toIndentedString(liveStreamId)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
