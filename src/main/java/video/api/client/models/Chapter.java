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
import java.io.Serializable;

/**
 * Chapter
 */

public class Chapter implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_URI = "uri";
    @SerializedName(SERIALIZED_NAME_URI)
    private String uri;

    public static final String SERIALIZED_NAME_SRC = "src";
    @SerializedName(SERIALIZED_NAME_SRC)
    private String src;

    public static final String SERIALIZED_NAME_LANGUAGE = "language";
    @SerializedName(SERIALIZED_NAME_LANGUAGE)
    private String language;

    public Chapter uri(String uri) {
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

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Chapter src(String src) {
        this.src = src;
        return this;
    }

    /**
     * The link to your VTT file, which contains your chapters information for the video.
     * 
     * @return src
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "https://cdn.api.video/vod/vi3N6cDinStg3oBbN79GklWS/chapters/fr.vtt", value = "The link to your VTT file, which contains your chapters information for the video.")

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public Chapter language(String language) {
        this.language = language;
        return this;
    }

    /**
     * Get language
     * 
     * @return language
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Chapter chapter = (Chapter) o;
        return Objects.equals(this.uri, chapter.uri) && Objects.equals(this.src, chapter.src)
                && Objects.equals(this.language, chapter.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri, src, language);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Chapter {\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    src: ").append(toIndentedString(src)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
