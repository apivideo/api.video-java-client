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
 * VideoStatusIngestReceivedParts
 */

public class VideoStatusIngestReceivedParts implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_PARTS = "parts";
    @SerializedName(SERIALIZED_NAME_PARTS)
    private List<Integer> parts = null;

    public static final String SERIALIZED_NAME_TOTAL = "total";
    @SerializedName(SERIALIZED_NAME_TOTAL)
    private Integer total;

    public VideoStatusIngestReceivedParts parts(List<Integer> parts) {
        this.parts = parts;
        return this;
    }

    public VideoStatusIngestReceivedParts addPartsItem(Integer partsItem) {
        if (this.parts == null) {
            this.parts = new ArrayList<>();
        }
        this.parts.add(partsItem);
        return this;
    }

    /**
     * The parts that are have been uploaded, ordered. For example, if part 2 was sent before part 1, and both have been
     * uploaded, the output will be [1, 2].
     * 
     * @return parts
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "[1, 2, 3]", value = "The parts that are have been uploaded, ordered. For example, if part 2 was sent before part 1, and both have been uploaded, the output will be [1, 2].")

    public List<Integer> getParts() {
        return parts;
    }

    public void setParts(List<Integer> parts) {
        this.parts = parts;
    }

    public VideoStatusIngestReceivedParts total(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * Contains the number of expected parts. The total will be listed as \&quot;null\&quot; until the total number of
     * parts is known.
     * 
     * @return total
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "3", value = "Contains the number of expected parts. The total will be listed as \"null\" until the total number of parts is known.")

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoStatusIngestReceivedParts videoStatusIngestReceivedParts = (VideoStatusIngestReceivedParts) o;
        return Objects.equals(this.parts, videoStatusIngestReceivedParts.parts)
                && Objects.equals(this.total, videoStatusIngestReceivedParts.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parts, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoStatusIngestReceivedParts {\n");
        sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
