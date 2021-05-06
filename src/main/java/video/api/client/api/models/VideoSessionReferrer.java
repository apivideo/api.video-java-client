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
import java.io.Serializable;

/**
 * VideoSessionReferrer
 */

public class VideoSessionReferrer implements Serializable {
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

    public VideoSessionReferrer url(String url) {
        this.url = url;
        return this;
    }

    /**
     * The link the viewer used to reach the video session.
     * 
     * @return url
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "https://api.video", value = "The link the viewer used to reach the video session.")

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public VideoSessionReferrer medium(String medium) {
        this.medium = medium;
        return this;
    }

    /**
     * How they arrived at the site, for example organic or paid. Organic meaning they found it themselves and paid
     * meaning they followed a link from an advertisement.
     * 
     * @return medium
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "organic", value = "How they arrived at the site, for example organic or paid. Organic meaning they found it themselves and paid meaning they followed a link from an advertisement.")

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public VideoSessionReferrer source(String source) {
        this.source = source;
        return this;
    }

    /**
     * The source the referrer came from to the video session. For example if they searched through google to find the
     * stream.
     * 
     * @return source
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "https://google.com", value = "The source the referrer came from to the video session. For example if they searched through google to find the stream.")

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public VideoSessionReferrer searchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
        return this;
    }

    /**
     * The search term they typed to arrive at the video session.
     * 
     * @return searchTerm
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The search term they typed to arrive at the video session.")

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
        VideoSessionReferrer videoSessionReferrer = (VideoSessionReferrer) o;
        return Objects.equals(this.url, videoSessionReferrer.url)
                && Objects.equals(this.medium, videoSessionReferrer.medium)
                && Objects.equals(this.source, videoSessionReferrer.source)
                && Objects.equals(this.searchTerm, videoSessionReferrer.searchTerm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, medium, source, searchTerm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoSessionReferrer {\n");
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
