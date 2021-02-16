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
import java.io.Serializable;

/**
 * BytesRange
 */

public class BytesRange implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_FROM = "from";
    @SerializedName(SERIALIZED_NAME_FROM)
    private Integer from;

    public static final String SERIALIZED_NAME_TO = "to";
    @SerializedName(SERIALIZED_NAME_TO)
    private Integer to;

    public static final String SERIALIZED_NAME_TOTAL = "total";
    @SerializedName(SERIALIZED_NAME_TOTAL)
    private Integer total;

    public BytesRange from(Integer from) {
        this.from = from;
        return this;
    }

    /**
     * The starting point for the range of bytes for a chunk of a video.
     * 
     * @return from
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "0", value = "The starting point for the range of bytes for a chunk of a video.")

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public BytesRange to(Integer to) {
        this.to = to;
        return this;
    }

    /**
     * The ending point for the range of bytes for a chunk of a video.
     * 
     * @return to
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "9999", value = "The ending point for the range of bytes for a chunk of a video.")

    public Integer getTo() {
        return to;
    }

    public void setTo(Integer to) {
        this.to = to;
    }

    public BytesRange total(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * The total number of bytes in the provided range.
     * 
     * @return total
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "10000", value = "The total number of bytes in the provided range.")

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
        BytesRange bytesRange = (BytesRange) o;
        return Objects.equals(this.from, bytesRange.from) && Objects.equals(this.to, bytesRange.to)
                && Objects.equals(this.total, bytesRange.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BytesRange {\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
