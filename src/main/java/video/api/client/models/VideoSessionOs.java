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
 * The operating system the viewer is on.
 */
@ApiModel(description = "The operating system the viewer is on.")

public class VideoSessionOs implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_SHORTNAME = "shortname";
    @SerializedName(SERIALIZED_NAME_SHORTNAME)
    private String shortname;

    public static final String SERIALIZED_NAME_VERSION = "version";
    @SerializedName(SERIALIZED_NAME_VERSION)
    private String version;

    public VideoSessionOs name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the operating system.
     * 
     * @return name
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "Microsoft Windows", value = "The name of the operating system.")

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VideoSessionOs shortname(String shortname) {
        this.shortname = shortname;
        return this;
    }

    /**
     * The nickname for the operating system, often representing the version.
     * 
     * @return shortname
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "W10", value = "The nickname for the operating system, often representing the version.")

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public VideoSessionOs version(String version) {
        this.version = version;
        return this;
    }

    /**
     * The version of the operating system.
     * 
     * @return version
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "Windows 10", value = "The version of the operating system.")

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoSessionOs videoSessionOs = (VideoSessionOs) o;
        return Objects.equals(this.name, videoSessionOs.name)
                && Objects.equals(this.shortname, videoSessionOs.shortname)
                && Objects.equals(this.version, videoSessionOs.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, shortname, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoSessionOs {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    shortname: ").append(toIndentedString(shortname)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
