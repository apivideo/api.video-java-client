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
import video.api.client.api.models.LiveStreamSessionClient;
import video.api.client.api.models.LiveStreamSessionDevice;
import video.api.client.api.models.LiveStreamSessionLocation;
import video.api.client.api.models.LiveStreamSessionReferrer;
import video.api.client.api.models.LiveStreamSessionSession;
import video.api.client.api.models.VideoSessionOs;
import java.io.Serializable;

/**
 * LiveStreamSession
 */

public class LiveStreamSession implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_SESSION = "session";
    @SerializedName(SERIALIZED_NAME_SESSION)
    private LiveStreamSessionSession session;

    public static final String SERIALIZED_NAME_LOCATION = "location";
    @SerializedName(SERIALIZED_NAME_LOCATION)
    private LiveStreamSessionLocation location;

    public static final String SERIALIZED_NAME_REFERRER = "referrer";
    @SerializedName(SERIALIZED_NAME_REFERRER)
    private LiveStreamSessionReferrer referrer;

    public static final String SERIALIZED_NAME_DEVICE = "device";
    @SerializedName(SERIALIZED_NAME_DEVICE)
    private LiveStreamSessionDevice device;

    public static final String SERIALIZED_NAME_OS = "os";
    @SerializedName(SERIALIZED_NAME_OS)
    private VideoSessionOs os;

    public static final String SERIALIZED_NAME_CLIENT = "client";
    @SerializedName(SERIALIZED_NAME_CLIENT)
    private LiveStreamSessionClient client;

    public LiveStreamSession session(LiveStreamSessionSession session) {
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

    public LiveStreamSessionSession getSession() {
        return session;
    }

    public void setSession(LiveStreamSessionSession session) {
        this.session = session;
    }

    public LiveStreamSession location(LiveStreamSessionLocation location) {
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

    public LiveStreamSessionLocation getLocation() {
        return location;
    }

    public void setLocation(LiveStreamSessionLocation location) {
        this.location = location;
    }

    public LiveStreamSession referrer(LiveStreamSessionReferrer referrer) {
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

    public LiveStreamSessionReferrer getReferrer() {
        return referrer;
    }

    public void setReferrer(LiveStreamSessionReferrer referrer) {
        this.referrer = referrer;
    }

    public LiveStreamSession device(LiveStreamSessionDevice device) {
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

    public LiveStreamSessionDevice getDevice() {
        return device;
    }

    public void setDevice(LiveStreamSessionDevice device) {
        this.device = device;
    }

    public LiveStreamSession os(VideoSessionOs os) {
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

    public LiveStreamSession client(LiveStreamSessionClient client) {
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

    public LiveStreamSessionClient getClient() {
        return client;
    }

    public void setClient(LiveStreamSessionClient client) {
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
        LiveStreamSession liveStreamSession = (LiveStreamSession) o;
        return Objects.equals(this.session, liveStreamSession.session)
                && Objects.equals(this.location, liveStreamSession.location)
                && Objects.equals(this.referrer, liveStreamSession.referrer)
                && Objects.equals(this.device, liveStreamSession.device)
                && Objects.equals(this.os, liveStreamSession.os)
                && Objects.equals(this.client, liveStreamSession.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(session, location, referrer, device, os, client);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveStreamSession {\n");
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
