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
 * Caption
 */

public class Caption implements Serializable, DeepObject {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_URI = "uri";
    @SerializedName(SERIALIZED_NAME_URI)
    private String uri;

    public static final String SERIALIZED_NAME_SRC = "src";
    @SerializedName(SERIALIZED_NAME_SRC)
    private String src;

    public static final String SERIALIZED_NAME_SRCLANG = "srclang";
    @SerializedName(SERIALIZED_NAME_SRCLANG)
    private String srclang;

    public static final String SERIALIZED_NAME_LANGUAGE_NAME = "languageName";
    @SerializedName(SERIALIZED_NAME_LANGUAGE_NAME)
    private String languageName;

    public static final String SERIALIZED_NAME_DEFAULT = "default";
    @SerializedName(SERIALIZED_NAME_DEFAULT)
    private Boolean _default = false;

    public Caption uri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * The unique resource identifier of the uploaded caption.
     * 
     * @return uri
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "/videos/vi1111DinStg3oBbN79GklWS/captions/sr-Cyrl", value = "The unique resource identifier of the uploaded caption.")

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Caption src(String src) {
        this.src = src;
        return this;
    }

    /**
     * A direct URL to the uploaded caption file.
     * 
     * @return src
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "https://cdn.api.video/vod/vi1111DinStg3oBbN79GklWS/captions/sr-Cyrl.vtt", value = "A direct URL to the uploaded caption file.")

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public Caption srclang(String srclang) {
        this.srclang = srclang;
        return this;
    }

    /**
     * Indicates the language of the uploaded caption file using IETF language tags.
     * 
     * @return srclang
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "sr-Cyrl", value = "Indicates the language of the uploaded caption file using IETF language tags.")

    public String getSrclang() {
        return srclang;
    }

    public void setSrclang(String srclang) {
        this.srclang = srclang;
    }

    public Caption languageName(String languageName) {
        this.languageName = languageName;
        return this;
    }

    /**
     * Returns the native name of the caption language in UTF-8 encoding.
     * 
     * @return languageName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "српски (ћирилица)", value = "Returns the native name of the caption language in UTF-8 encoding.")

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public Caption _default(Boolean _default) {
        this._default = _default;
        return this;
    }

    /**
     * Whether you will have subtitles or not. True for yes you will have subtitles, false for no you will not have
     * subtitles.
     * 
     * @return _default
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "false", value = "Whether you will have subtitles or not. True for yes you will have subtitles, false for no you will not have subtitles.")

    public Boolean getDefault() {
        return _default;
    }

    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Caption caption = (Caption) o;
        return Objects.equals(this.uri, caption.uri) && Objects.equals(this.src, caption.src)
                && Objects.equals(this.srclang, caption.srclang)
                && Objects.equals(this.languageName, caption.languageName)
                && Objects.equals(this._default, caption._default);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri, src, srclang, languageName, _default);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Caption {\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    src: ").append(toIndentedString(src)).append("\n");
        sb.append("    srclang: ").append(toIndentedString(srclang)).append("\n");
        sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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
