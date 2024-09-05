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
 * VideoThumbnailPickPayload
 */

public class VideoThumbnailPickPayload implements Serializable, DeepObject {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_TIMECODE = "timecode";
    @SerializedName(SERIALIZED_NAME_TIMECODE)
    private String timecode;

    public VideoThumbnailPickPayload timecode(String timecode) {
        this.timecode = timecode;
        return this;
    }

    /**
     * Frame in video to be used as a placeholder before the video plays. Example: &#39;\&quot;00:01:00.000\&quot; for 1
     * minute into the video.&#39; Valid Patterns: \&quot;hh:mm:ss.ms\&quot; \&quot;hh:mm:ss:frameNumber\&quot;
     * \&quot;124\&quot; (integer value is reported as seconds) If selection is out of range, \&quot;00:00:00.00\&quot;
     * will be chosen.
     * 
     * @return timecode
     **/
    @ApiModelProperty(required = true, value = "Frame in video to be used as a placeholder before the video plays.  Example: '\"00:01:00.000\" for 1 minute into the video.' Valid Patterns:  \"hh:mm:ss.ms\" \"hh:mm:ss:frameNumber\" \"124\" (integer value is reported as seconds)  If selection is out of range, \"00:00:00.00\" will be chosen.")

    public String getTimecode() {
        return timecode;
    }

    public void setTimecode(String timecode) {
        this.timecode = timecode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoThumbnailPickPayload videoThumbnailPickPayload = (VideoThumbnailPickPayload) o;
        return Objects.equals(this.timecode, videoThumbnailPickPayload.timecode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timecode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoThumbnailPickPayload {\n");
        sb.append("    timecode: ").append(toIndentedString(timecode)).append("\n");
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
