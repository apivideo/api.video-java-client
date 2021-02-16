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
import video.api.client.api.models.VideoSourceLiveStream;
import java.io.Serializable;

/**
 * Source information about the video.
 */
@ApiModel(description = "Source information about the video.")

public class VideoSource implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_URI = "uri";
    @SerializedName(SERIALIZED_NAME_URI)
    private String uri;

    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private String type;

    public static final String SERIALIZED_NAME_LIVE_STREAM = "liveStream";
    @SerializedName(SERIALIZED_NAME_LIVE_STREAM)
    private VideoSourceLiveStream liveStream;

    public VideoSource uri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * The URL where the video is stored.
     * 
     * @return uri
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "/videos/vi4k0jvEUuaTdRAEjQ4Prklg/source", value = "The URL where the video is stored.")

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public VideoSource type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * 
     * @return type
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public VideoSource liveStream(VideoSourceLiveStream liveStream) {
        this.liveStream = liveStream;
        return this;
    }

    /**
     * Get liveStream
     * 
     * @return liveStream
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public VideoSourceLiveStream getLiveStream() {
        return liveStream;
    }

    public void setLiveStream(VideoSourceLiveStream liveStream) {
        this.liveStream = liveStream;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoSource videoSource = (VideoSource) o;
        return Objects.equals(this.uri, videoSource.uri) && Objects.equals(this.type, videoSource.type)
                && Objects.equals(this.liveStream, videoSource.liveStream);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri, type, liveStream);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoSource {\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    liveStream: ").append(toIndentedString(liveStream)).append("\n");
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
