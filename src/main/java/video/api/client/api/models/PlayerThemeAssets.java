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
 * PlayerThemeAssets
 */

public class PlayerThemeAssets implements Serializable, DeepObject {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_LOGO = "logo";
    @SerializedName(SERIALIZED_NAME_LOGO)
    private String logo;

    public static final String SERIALIZED_NAME_LINK = "link";
    @SerializedName(SERIALIZED_NAME_LINK)
    private String link;

    public PlayerThemeAssets logo(String logo) {
        this.logo = logo;
        return this;
    }

    /**
     * The name of the file containing the logo you want to use.
     * 
     * @return logo
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "mylogo.jpg", value = "The name of the file containing the logo you want to use.")

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public PlayerThemeAssets link(String link) {
        this.link = link;
        return this;
    }

    /**
     * The path to the file containing your logo.
     * 
     * @return link
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "path/to/my/logo/mylogo.jpg", value = "The path to the file containing your logo.")

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlayerThemeAssets playerThemeAssets = (PlayerThemeAssets) o;
        return Objects.equals(this.logo, playerThemeAssets.logo) && Objects.equals(this.link, playerThemeAssets.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logo, link);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlayerThemeAssets {\n");
        sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
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
