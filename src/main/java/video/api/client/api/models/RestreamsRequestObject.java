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
 * Adding restream destinations is optional. However, if you set a restream destination, you must provide all attributes
 * for each destination.
 */
@ApiModel(description = "Adding restream destinations is optional. However, if you set a restream destination, you must provide all attributes for each destination.")

public class RestreamsRequestObject implements Serializable, DeepObject {
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

    public RestreamsRequestObject name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Use this parameter to define a name for the restream destination.
     * 
     * @return name
     **/
    @ApiModelProperty(example = "My restream server", required = true, value = "Use this parameter to define a name for the restream destination.")

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RestreamsRequestObject serverUrl(String serverUrl) {
        this.serverUrl = serverUrl;
        return this;
    }

    /**
     * Use this parameter to set the &#x60;RTMPS&#x60; or &#x60;RTMP&#x60; server URL of the restream destination.
     * 
     * @return serverUrl
     **/
    @ApiModelProperty(example = "rtmp://my.broadcast.example.com/app", required = true, value = "Use this parameter to set the `RTMPS` or `RTMP` server URL of the restream destination.")

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public RestreamsRequestObject streamKey(String streamKey) {
        this.streamKey = streamKey;
        return this;
    }

    /**
     * Use this parameter to provide the unique key of the live stream that you want to restream.
     * 
     * @return streamKey
     **/
    @ApiModelProperty(example = "dw-dew8-q6w9-k67w-1ws8", required = true, value = "Use this parameter to provide the unique key of the live stream that you want to restream.")

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
        RestreamsRequestObject restreamsRequestObject = (RestreamsRequestObject) o;
        return Objects.equals(this.name, restreamsRequestObject.name)
                && Objects.equals(this.serverUrl, restreamsRequestObject.serverUrl)
                && Objects.equals(this.streamKey, restreamsRequestObject.streamKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, serverUrl, streamKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestreamsRequestObject {\n");
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
