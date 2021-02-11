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

package api.video.client.models;

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
 * Quality
 */

public class Quality implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * The quality of the video you have, in pixels. Choices include 360p, 480p, 720p, 1080p, and 2160p.
     */
    @JsonAdapter(QualityEnum.Adapter.class)
    public enum QualityEnum {
        _240P("240p"),

        _360P("360p"),

        _480P("480p"),

        _720P("720p"),

        _1080P("1080p"),

        _2160P("2160p");

        private String value;

        QualityEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static QualityEnum fromValue(String value) {
            for (QualityEnum b : QualityEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<QualityEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final QualityEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public QualityEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return QualityEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_QUALITY = "quality";
    @SerializedName(SERIALIZED_NAME_QUALITY)
    private QualityEnum quality;

    /**
     * The status of your video. Statuses include waiting - the video is waiting to be encoded. encoding - the video is
     * in the process of being encoded. encoded - the video was successfully encoded. failed - the video failed to be
     * encoded.
     */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        WAITING("waiting"),

        ENCODING("encoding"),

        ENCODED("encoded"),

        FAILED("failed");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<StatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StatusEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_STATUS = "status";
    @SerializedName(SERIALIZED_NAME_STATUS)
    private StatusEnum status;

    public Quality quality(QualityEnum quality) {
        this.quality = quality;
        return this;
    }

    /**
     * The quality of the video you have, in pixels. Choices include 360p, 480p, 720p, 1080p, and 2160p.
     * 
     * @return quality
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "720p", value = "The quality of the video you have, in pixels. Choices include 360p, 480p, 720p, 1080p, and 2160p.")

    public QualityEnum getQuality() {
        return quality;
    }

    public void setQuality(QualityEnum quality) {
        this.quality = quality;
    }

    public Quality status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * The status of your video. Statuses include waiting - the video is waiting to be encoded. encoding - the video is
     * in the process of being encoded. encoded - the video was successfully encoded. failed - the video failed to be
     * encoded.
     * 
     * @return status
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The status of your video. Statuses include waiting - the video is waiting to be encoded. encoding - the video is in the process of being encoded. encoded - the video was successfully encoded. failed - the video failed to be encoded.")

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Quality quality = (Quality) o;
        return Objects.equals(this.quality, quality.quality) && Objects.equals(this.status, quality.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quality, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Quality {\n");
        sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
