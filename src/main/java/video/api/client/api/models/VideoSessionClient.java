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
 * What kind of browser the viewer is using for the video session.
 */
@ApiModel(description = "What kind of browser the viewer is using for the video session.")

public class VideoSessionClient implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_VERSION = "version";
    @SerializedName(SERIALIZED_NAME_VERSION)
    private String version;

    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private String type;

    public VideoSessionClient name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the browser used to view the video session.
     * 
     * @return name
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "Firefox", value = "The name of the browser used to view the video session.")

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VideoSessionClient version(String version) {
        this.version = version;
        return this;
    }

    /**
     * The version of the browser used to view the video session.
     * 
     * @return version
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "67.0", value = "The version of the browser used to view the video session.")

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public VideoSessionClient type(String type) {
        this.type = type;
        return this;
    }

    /**
     * The type of client used to view the video session.
     * 
     * @return type
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "browser", value = "The type of client used to view the video session.")

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoSessionClient videoSessionClient = (VideoSessionClient) o;
        return Objects.equals(this.name, videoSessionClient.name)
                && Objects.equals(this.version, videoSessionClient.version)
                && Objects.equals(this.type, videoSessionClient.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, version, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoSessionClient {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
