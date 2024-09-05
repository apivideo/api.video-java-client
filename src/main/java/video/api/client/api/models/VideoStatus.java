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
import video.api.client.api.models.VideoStatusEncoding;
import video.api.client.api.models.VideoStatusIngest;
import java.io.Serializable;

/**
 * VideoStatus
 */

public class VideoStatus implements Serializable, DeepObject {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_INGEST = "ingest";
    @SerializedName(SERIALIZED_NAME_INGEST)
    private VideoStatusIngest ingest;

    public static final String SERIALIZED_NAME_ENCODING = "encoding";
    @SerializedName(SERIALIZED_NAME_ENCODING)
    private VideoStatusEncoding encoding;

    public VideoStatus ingest(VideoStatusIngest ingest) {
        this.ingest = ingest;
        return this;
    }

    /**
     * Get ingest
     * 
     * @return ingest
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public VideoStatusIngest getIngest() {
        return ingest;
    }

    public void setIngest(VideoStatusIngest ingest) {
        this.ingest = ingest;
    }

    public VideoStatus encoding(VideoStatusEncoding encoding) {
        this.encoding = encoding;
        return this;
    }

    /**
     * Get encoding
     * 
     * @return encoding
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public VideoStatusEncoding getEncoding() {
        return encoding;
    }

    public void setEncoding(VideoStatusEncoding encoding) {
        this.encoding = encoding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoStatus videoStatus = (VideoStatus) o;
        return Objects.equals(this.ingest, videoStatus.ingest) && Objects.equals(this.encoding, videoStatus.encoding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingest, encoding);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoStatus {\n");
        sb.append("    ingest: ").append(toIndentedString(ingest)).append("\n");
        sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
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
