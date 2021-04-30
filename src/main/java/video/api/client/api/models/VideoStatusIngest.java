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
import video.api.client.api.models.BytesRange;
import java.io.Serializable;

/**
 * Details about the capturing, transferring, and storing of your video for use immediately or in the future.
 */
@ApiModel(description = "Details about the capturing, transferring, and storing of your video for use immediately or in the future.")

public class VideoStatusIngest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * There are three possible ingest statuses. missing - you are missing information required to ingest the video.
     * uploading - the video is in the process of being uploaded. uploaded - the video is ready for use.
     */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        MISSING("missing"),

        UPLOADING("uploading"),

        UPLOADED("uploaded");

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

    public static final String SERIALIZED_NAME_FILESIZE = "filesize";
    @SerializedName(SERIALIZED_NAME_FILESIZE)
    private Integer filesize;

    public static final String SERIALIZED_NAME_RECEIVED_BYTES = "receivedBytes";
    @SerializedName(SERIALIZED_NAME_RECEIVED_BYTES)
    private List<BytesRange> receivedBytes = null;

    public VideoStatusIngest status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * There are three possible ingest statuses. missing - you are missing information required to ingest the video.
     * uploading - the video is in the process of being uploaded. uploaded - the video is ready for use.
     * 
     * @return status
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "uploaded", value = "There are three possible ingest statuses. missing - you are missing information required to ingest the video. uploading - the video is in the process of being uploaded. uploaded - the video is ready for use.")

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public VideoStatusIngest filesize(Integer filesize) {
        this.filesize = filesize;
        return this;
    }

    /**
     * The size of your file in bytes.
     * 
     * @return filesize
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "200000", value = "The size of your file in bytes.")

    public Integer getFilesize() {
        return filesize;
    }

    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }

    public VideoStatusIngest receivedBytes(List<BytesRange> receivedBytes) {
        this.receivedBytes = receivedBytes;
        return this;
    }

    public VideoStatusIngest addReceivedBytesItem(BytesRange receivedBytesItem) {
        if (this.receivedBytes == null) {
            this.receivedBytes = new ArrayList<>();
        }
        this.receivedBytes.add(receivedBytesItem);
        return this;
    }

    /**
     * The total number of bytes received, listed for each chunk of the upload.
     * 
     * @return receivedBytes
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The total number of bytes received, listed for each chunk of the upload.")

    public List<BytesRange> getReceivedBytes() {
        return receivedBytes;
    }

    public void setReceivedBytes(List<BytesRange> receivedBytes) {
        this.receivedBytes = receivedBytes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoStatusIngest videoStatusIngest = (VideoStatusIngest) o;
        return Objects.equals(this.status, videoStatusIngest.status)
                && Objects.equals(this.filesize, videoStatusIngest.filesize)
                && Objects.equals(this.receivedBytes, videoStatusIngest.receivedBytes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, filesize, receivedBytes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoStatusIngest {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    filesize: ").append(toIndentedString(filesize)).append("\n");
        sb.append("    receivedBytes: ").append(toIndentedString(receivedBytes)).append("\n");
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
