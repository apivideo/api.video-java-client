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
 * Summary
 */

public class Summary implements Serializable, DeepObject {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_SUMMARY_ID = "summaryId";
    @SerializedName(SERIALIZED_NAME_SUMMARY_ID)
    private String summaryId;

    public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private OffsetDateTime createdAt;

    public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    private OffsetDateTime updatedAt;

    public static final String SERIALIZED_NAME_VIDEO_ID = "videoId";
    @SerializedName(SERIALIZED_NAME_VIDEO_ID)
    private String videoId;

    /**
     * Returns the origin of how the summary was created. - &#x60;api&#x60; means that no summary was generated
     * automatically. You can add summary manually using the &#x60;PATCH /summaries/{summaryId}/source&#x60; endpoint
     * operation. Until this happens, &#x60;sourceStatus&#x60; returns &#x60;missing&#x60;. - &#x60;auto&#x60; means
     * that the API generated the summary automatically.
     */
    @JsonAdapter(OriginEnum.Adapter.class)
    public enum OriginEnum {
        API("api"),

        AUTO("auto");

        private String value;

        OriginEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OriginEnum fromValue(String value) {
            for (OriginEnum b : OriginEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<OriginEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OriginEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public OriginEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return OriginEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_ORIGIN = "origin";
    @SerializedName(SERIALIZED_NAME_ORIGIN)
    private OriginEnum origin;

    /**
     * Returns the current status of summary generation. &#x60;missing&#x60;: the input for a summary is not present.
     * &#x60;waiting&#x60; : the input video is being processed and a summary will be generated. &#x60;failed&#x60;: a
     * technical issue prevented summary generation. &#x60;completed&#x60;: the summary is generated.
     * &#x60;unprocessable&#x60;: the API rules the source video to be unsuitable for summary generation. An example for
     * this is an input video that has no audio.
     */
    @JsonAdapter(SourceStatusEnum.Adapter.class)
    public enum SourceStatusEnum {
        MISSING("missing"),

        WAITING("waiting"),

        FAILED("failed"),

        COMPLETED("completed"),

        UNPROCESSABLE("unprocessable");

        private String value;

        SourceStatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static SourceStatusEnum fromValue(String value) {
            for (SourceStatusEnum b : SourceStatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<SourceStatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final SourceStatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public SourceStatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return SourceStatusEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_SOURCE_STATUS = "sourceStatus";
    @SerializedName(SERIALIZED_NAME_SOURCE_STATUS)
    private SourceStatusEnum sourceStatus;

    public Summary summaryId(String summaryId) {
        this.summaryId = summaryId;
        return this;
    }

    /**
     * The unique identifier of the summary object.
     * 
     * @return summaryId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "summary_1CGHWuXjhxmeH4WiZ51234", value = "The unique identifier of the summary object.")

    public String getSummaryId() {
        return summaryId;
    }

    public void setSummaryId(String summaryId) {
        this.summaryId = summaryId;
    }

    public Summary createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Returns the date and time when the summary was created in ATOM date-time format.
     * 
     * @return createdAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "2024-05-28T11:15:07Z", value = "Returns the date and time when the summary was created in ATOM date-time format.")

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Summary updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Returns the date and time when the summary was last updated in ATOM date-time format.
     * 
     * @return updatedAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "2024-05-28T11:15:07Z", value = "Returns the date and time when the summary was last updated in ATOM date-time format.")

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Summary videoId(String videoId) {
        this.videoId = videoId;
        return this;
    }

    /**
     * The unique identifier of the video object.
     * 
     * @return videoId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "vi4k0jvEUuaTdRAEjQ4Prklg", value = "The unique identifier of the video object.")

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public Summary origin(OriginEnum origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Returns the origin of how the summary was created. - &#x60;api&#x60; means that no summary was generated
     * automatically. You can add summary manually using the &#x60;PATCH /summaries/{summaryId}/source&#x60; endpoint
     * operation. Until this happens, &#x60;sourceStatus&#x60; returns &#x60;missing&#x60;. - &#x60;auto&#x60; means
     * that the API generated the summary automatically.
     * 
     * @return origin
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Returns the origin of how the summary was created.  - `api` means that no summary was generated automatically. You can add summary manually using the `PATCH /summaries/{summaryId}/source` endpoint operation. Until this happens, `sourceStatus` returns `missing`. - `auto` means that the API generated the summary automatically.")

    public OriginEnum getOrigin() {
        return origin;
    }

    public void setOrigin(OriginEnum origin) {
        this.origin = origin;
    }

    public Summary sourceStatus(SourceStatusEnum sourceStatus) {
        this.sourceStatus = sourceStatus;
        return this;
    }

    /**
     * Returns the current status of summary generation. &#x60;missing&#x60;: the input for a summary is not present.
     * &#x60;waiting&#x60; : the input video is being processed and a summary will be generated. &#x60;failed&#x60;: a
     * technical issue prevented summary generation. &#x60;completed&#x60;: the summary is generated.
     * &#x60;unprocessable&#x60;: the API rules the source video to be unsuitable for summary generation. An example for
     * this is an input video that has no audio.
     * 
     * @return sourceStatus
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Returns the current status of summary generation.  `missing`: the input for a summary is not present. `waiting` : the input video is being processed and a summary will be generated. `failed`: a technical issue prevented summary generation. `completed`: the summary is generated. `unprocessable`: the API rules the source video to be unsuitable for summary generation. An example for this is an input video that has no audio.")

    public SourceStatusEnum getSourceStatus() {
        return sourceStatus;
    }

    public void setSourceStatus(SourceStatusEnum sourceStatus) {
        this.sourceStatus = sourceStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Summary summary = (Summary) o;
        return Objects.equals(this.summaryId, summary.summaryId) && Objects.equals(this.createdAt, summary.createdAt)
                && Objects.equals(this.updatedAt, summary.updatedAt) && Objects.equals(this.videoId, summary.videoId)
                && Objects.equals(this.origin, summary.origin)
                && Objects.equals(this.sourceStatus, summary.sourceStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(summaryId, createdAt, updatedAt, videoId, origin, sourceStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Summary {\n");
        sb.append("    summaryId: ").append(toIndentedString(summaryId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
        sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
        sb.append("    sourceStatus: ").append(toIndentedString(sourceStatus)).append("\n");
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
