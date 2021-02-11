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
 * LiveStreamSessionReferrer
 */

public class LiveStreamSessionReferrer implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_URL = "url";
    @SerializedName(SERIALIZED_NAME_URL)
    private String url;

    public static final String SERIALIZED_NAME_MEDIUM = "medium";
    @SerializedName(SERIALIZED_NAME_MEDIUM)
    private String medium;

    public static final String SERIALIZED_NAME_SOURCE = "source";
    @SerializedName(SERIALIZED_NAME_SOURCE)
    private String source;

    public static final String SERIALIZED_NAME_SEARCH_TERM = "searchTerm";
    @SerializedName(SERIALIZED_NAME_SEARCH_TERM)
    private String searchTerm;

    public LiveStreamSessionReferrer url(String url) {
        this.url = url;
        return this;
    }

    /**
     * The website the viewer of the live stream was referred to in order to view the live stream.
     * 
     * @return url
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "https://api.video", value = "The website the viewer of the live stream was referred to in order to view the live stream.")

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LiveStreamSessionReferrer medium(String medium) {
        this.medium = medium;
        return this;
    }

    /**
     * The type of search that brought the viewer to the live stream. Organic would be they found it on their own, paid
     * would be they found it via an advertisement.
     * 
     * @return medium
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "organic", value = "The type of search that brought the viewer to the live stream. Organic would be they found it on their own, paid would be they found it via an advertisement.")

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public LiveStreamSessionReferrer source(String source) {
        this.source = source;
        return this;
    }

    /**
     * Where the viewer came from to see the live stream (usually where they searched from).
     * 
     * @return source
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "https://google.com", value = "Where the viewer came from to see the live stream (usually where they searched from).")

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public LiveStreamSessionReferrer searchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
        return this;
    }

    /**
     * What term they searched for that led them to the live stream.
     * 
     * @return searchTerm
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "video stream", value = "What term they searched for that led them to the live stream.")

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LiveStreamSessionReferrer liveStreamSessionReferrer = (LiveStreamSessionReferrer) o;
        return Objects.equals(this.url, liveStreamSessionReferrer.url)
                && Objects.equals(this.medium, liveStreamSessionReferrer.medium)
                && Objects.equals(this.source, liveStreamSessionReferrer.source)
                && Objects.equals(this.searchTerm, liveStreamSessionReferrer.searchTerm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, medium, source, searchTerm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveStreamSessionReferrer {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    searchTerm: ").append(toIndentedString(searchTerm)).append("\n");
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
