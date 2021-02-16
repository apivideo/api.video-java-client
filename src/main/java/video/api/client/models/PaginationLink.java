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

package video.api.client.models;

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
import java.net.URI;
import java.io.Serializable;

/**
 * PaginationLink
 */

public class PaginationLink implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_REL = "rel";
    @SerializedName(SERIALIZED_NAME_REL)
    private String rel;

    public static final String SERIALIZED_NAME_URI = "uri";
    @SerializedName(SERIALIZED_NAME_URI)
    private URI uri;

    public PaginationLink rel(String rel) {
        this.rel = rel;
        return this;
    }

    /**
     * Get rel
     * 
     * @return rel
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public PaginationLink uri(URI uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get uri
     * 
     * @return uri
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public URI getUri() {
        return uri;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaginationLink paginationLink = (PaginationLink) o;
        return Objects.equals(this.rel, paginationLink.rel) && Objects.equals(this.uri, paginationLink.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rel, uri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaginationLink {\n");
        sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
