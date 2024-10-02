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
 * ListTagsResponseData
 */

public class ListTagsResponseData implements Serializable, DeepObject {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_VALUE = "value";
    @SerializedName(SERIALIZED_NAME_VALUE)
    private String value;

    public static final String SERIALIZED_NAME_VIDEO_COUNT = "videoCount";
    @SerializedName(SERIALIZED_NAME_VIDEO_COUNT)
    private Integer videoCount;

    public ListTagsResponseData value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Returns the value of a video tag used in your project.
     * 
     * @return value
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Returns the value of a video tag used in your project.")

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ListTagsResponseData videoCount(Integer videoCount) {
        this.videoCount = videoCount;
        return this;
    }

    /**
     * Returns the number of times a video tag is used.
     * 
     * @return videoCount
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Returns the number of times a video tag is used.")

    public Integer getVideoCount() {
        return videoCount;
    }

    public void setVideoCount(Integer videoCount) {
        this.videoCount = videoCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTagsResponseData listTagsResponseData = (ListTagsResponseData) o;
        return Objects.equals(this.value, listTagsResponseData.value)
                && Objects.equals(this.videoCount, listTagsResponseData.videoCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, videoCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTagsResponseData {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    videoCount: ").append(toIndentedString(videoCount)).append("\n");
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
