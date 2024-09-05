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
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * Watermark
 */

public class Watermark implements Serializable, DeepObject {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_WATERMARK_ID = "watermarkId";
    @SerializedName(SERIALIZED_NAME_WATERMARK_ID)
    private String watermarkId;

    public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private OffsetDateTime createdAt;

    public Watermark watermarkId(String watermarkId) {
        this.watermarkId = watermarkId;
        return this;
    }

    /**
     * The unique identifier of the watermark.
     * 
     * @return watermarkId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "watermark_1BWr2L5MTQwxGkuxKjzh6i", value = "The unique identifier of the watermark.")

    public String getWatermarkId() {
        return watermarkId;
    }

    public void setWatermarkId(String watermarkId) {
        this.watermarkId = watermarkId;
    }

    public Watermark createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * When the watermark was created, presented in ISO-8601 format.
     * 
     * @return createdAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "When the watermark was created, presented in ISO-8601 format.")

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Watermark watermark = (Watermark) o;
        return Objects.equals(this.watermarkId, watermark.watermarkId)
                && Objects.equals(this.createdAt, watermark.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(watermarkId, createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Watermark {\n");
        sb.append("    watermarkId: ").append(toIndentedString(watermarkId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
