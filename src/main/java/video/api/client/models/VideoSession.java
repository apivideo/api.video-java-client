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
import video.api.client.models.VideoSessionClient;
import video.api.client.models.VideoSessionDevice;
import video.api.client.models.VideoSessionLocation;
import video.api.client.models.VideoSessionOs;
import video.api.client.models.VideoSessionReferrer;
import video.api.client.models.VideoSessionSession;
import java.io.Serializable;

/**
 * VideoSession
 */

public class VideoSession implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_SESSION = "session";
    @SerializedName(SERIALIZED_NAME_SESSION)
    private VideoSessionSession session;

    public static final String SERIALIZED_NAME_LOCATION = "location";
    @SerializedName(SERIALIZED_NAME_LOCATION)
    private VideoSessionLocation location;

    public static final String SERIALIZED_NAME_REFERRER = "referrer";
    @SerializedName(SERIALIZED_NAME_REFERRER)
    private VideoSessionReferrer referrer;

    public static final String SERIALIZED_NAME_DEVICE = "device";
    @SerializedName(SERIALIZED_NAME_DEVICE)
    private VideoSessionDevice device;

    public static final String SERIALIZED_NAME_OS = "os";
    @SerializedName(SERIALIZED_NAME_OS)
    private VideoSessionOs os;

    public static final String SERIALIZED_NAME_CLIENT = "client";
    @SerializedName(SERIALIZED_NAME_CLIENT)
    private VideoSessionClient client;

    public VideoSession session(VideoSessionSession session) {
        this.session = session;
        return this;
    }

    /**
     * Get session
     * 
     * @return session
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public VideoSessionSession getSession() {
        return session;
    }

    public void setSession(VideoSessionSession session) {
        this.session = session;
    }

    public VideoSession location(VideoSessionLocation location) {
        this.location = location;
        return this;
    }

    /**
     * Get location
     * 
     * @return location
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public VideoSessionLocation getLocation() {
        return location;
    }

    public void setLocation(VideoSessionLocation location) {
        this.location = location;
    }

    public VideoSession referrer(VideoSessionReferrer referrer) {
        this.referrer = referrer;
        return this;
    }

    /**
     * Get referrer
     * 
     * @return referrer
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public VideoSessionReferrer getReferrer() {
        return referrer;
    }

    public void setReferrer(VideoSessionReferrer referrer) {
        this.referrer = referrer;
    }

    public VideoSession device(VideoSessionDevice device) {
        this.device = device;
        return this;
    }

    /**
     * Get device
     * 
     * @return device
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public VideoSessionDevice getDevice() {
        return device;
    }

    public void setDevice(VideoSessionDevice device) {
        this.device = device;
    }

    public VideoSession os(VideoSessionOs os) {
        this.os = os;
        return this;
    }

    /**
     * Get os
     * 
     * @return os
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public VideoSessionOs getOs() {
        return os;
    }

    public void setOs(VideoSessionOs os) {
        this.os = os;
    }

    public VideoSession client(VideoSessionClient client) {
        this.client = client;
        return this;
    }

    /**
     * Get client
     * 
     * @return client
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public VideoSessionClient getClient() {
        return client;
    }

    public void setClient(VideoSessionClient client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoSession videoSession = (VideoSession) o;
        return Objects.equals(this.session, videoSession.session)
                && Objects.equals(this.location, videoSession.location)
                && Objects.equals(this.referrer, videoSession.referrer)
                && Objects.equals(this.device, videoSession.device) && Objects.equals(this.os, videoSession.os)
                && Objects.equals(this.client, videoSession.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(session, location, referrer, device, os, client);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoSession {\n");
        sb.append("    session: ").append(toIndentedString(session)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    referrer: ").append(toIndentedString(referrer)).append("\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    client: ").append(toIndentedString(client)).append("\n");
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
