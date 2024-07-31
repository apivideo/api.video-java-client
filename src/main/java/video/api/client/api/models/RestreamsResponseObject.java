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
 * RestreamsResponseObject
 */

public class RestreamsResponseObject implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_SERVER_URL = "serverUrl";
    @SerializedName(SERIALIZED_NAME_SERVER_URL)
    private String serverUrl;

    public static final String SERIALIZED_NAME_STREAM_KEY = "streamKey";
    @SerializedName(SERIALIZED_NAME_STREAM_KEY)
    private String streamKey;

    public RestreamsResponseObject name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns the name of a restream destination.
     * 
     * @return name
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "My restream server", value = "Returns the name of a restream destination.")

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RestreamsResponseObject serverUrl(String serverUrl) {
        this.serverUrl = serverUrl;
        return this;
    }

    /**
     * Returns the server URL of a restream destination.
     * 
     * @return serverUrl
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "rtmp://my.broadcast.example.com/app", value = "Returns the server URL of a restream destination.")

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public RestreamsResponseObject streamKey(String streamKey) {
        this.streamKey = streamKey;
        return this;
    }

    /**
     * Returns the unique key of the live stream that is set up for restreaming.
     * 
     * @return streamKey
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "dw-dew8-q6w9-k67w-1ws8", value = "Returns the unique key of the live stream that is set up for restreaming.")

    public String getStreamKey() {
        return streamKey;
    }

    public void setStreamKey(String streamKey) {
        this.streamKey = streamKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestreamsResponseObject restreamsResponseObject = (RestreamsResponseObject) o;
        return Objects.equals(this.name, restreamsResponseObject.name)
                && Objects.equals(this.serverUrl, restreamsResponseObject.serverUrl)
                && Objects.equals(this.streamKey, restreamsResponseObject.streamKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, serverUrl, streamKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestreamsResponseObject {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    serverUrl: ").append(toIndentedString(serverUrl)).append("\n");
        sb.append("    streamKey: ").append(toIndentedString(streamKey)).append("\n");
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
