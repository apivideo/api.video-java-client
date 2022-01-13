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
import java.io.Serializable;

/**
 * VideoClip
 */

public class VideoClip implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_START_TIMECODE = "startTimecode";
    @SerializedName(SERIALIZED_NAME_START_TIMECODE)
    private String startTimecode;

    public static final String SERIALIZED_NAME_END_TIMECODE = "endTimecode";
    @SerializedName(SERIALIZED_NAME_END_TIMECODE)
    private String endTimecode;

    public VideoClip startTimecode(String startTimecode) {
        this.startTimecode = startTimecode;
        return this;
    }

    /**
     * Get startTimecode
     * 
     * @return startTimecode
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getStartTimecode() {
        return startTimecode;
    }

    public void setStartTimecode(String startTimecode) {
        this.startTimecode = startTimecode;
    }

    public VideoClip endTimecode(String endTimecode) {
        this.endTimecode = endTimecode;
        return this;
    }

    /**
     * Get endTimecode
     * 
     * @return endTimecode
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getEndTimecode() {
        return endTimecode;
    }

    public void setEndTimecode(String endTimecode) {
        this.endTimecode = endTimecode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoClip videoClip = (VideoClip) o;
        return Objects.equals(this.startTimecode, videoClip.startTimecode)
                && Objects.equals(this.endTimecode, videoClip.endTimecode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTimecode, endTimecode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoClip {\n");
        sb.append("    startTimecode: ").append(toIndentedString(startTimecode)).append("\n");
        sb.append("    endTimecode: ").append(toIndentedString(endTimecode)).append("\n");
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
