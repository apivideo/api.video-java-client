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
import video.api.client.api.models.VideostatusEncoding;
import video.api.client.api.models.VideostatusIngest;
import java.io.Serializable;

/**
 * Videostatus
 */

public class Videostatus implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_INGEST = "ingest";
    @SerializedName(SERIALIZED_NAME_INGEST)
    private VideostatusIngest ingest;

    public static final String SERIALIZED_NAME_ENCODING = "encoding";
    @SerializedName(SERIALIZED_NAME_ENCODING)
    private VideostatusEncoding encoding;

    public Videostatus ingest(VideostatusIngest ingest) {
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

    public VideostatusIngest getIngest() {
        return ingest;
    }

    public void setIngest(VideostatusIngest ingest) {
        this.ingest = ingest;
    }

    public Videostatus encoding(VideostatusEncoding encoding) {
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

    public VideostatusEncoding getEncoding() {
        return encoding;
    }

    public void setEncoding(VideostatusEncoding encoding) {
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
        Videostatus videostatus = (Videostatus) o;
        return Objects.equals(this.ingest, videostatus.ingest) && Objects.equals(this.encoding, videostatus.encoding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingest, encoding);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Videostatus {\n");
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
