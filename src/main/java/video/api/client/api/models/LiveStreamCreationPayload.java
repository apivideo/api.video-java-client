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
import java.util.ArrayList;
import java.util.List;
import video.api.client.api.models.RestreamsRequestObject;
import java.io.Serializable;

/**
 * LiveStreamCreationPayload
 */

public class LiveStreamCreationPayload implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_PUBLIC = "public";
    @SerializedName(SERIALIZED_NAME_PUBLIC)
    private Boolean _public;

    public static final String SERIALIZED_NAME_PLAYER_ID = "playerId";
    @SerializedName(SERIALIZED_NAME_PLAYER_ID)
    private String playerId;

    public static final String SERIALIZED_NAME_RESTREAMS = "restreams";
    @SerializedName(SERIALIZED_NAME_RESTREAMS)
    private List<RestreamsRequestObject> restreams = null;

    public LiveStreamCreationPayload name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Add a name for your live stream here.
     * 
     * @return name
     **/
    @ApiModelProperty(example = "My Live Stream Video", required = true, value = "Add a name for your live stream here.")

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LiveStreamCreationPayload _public(Boolean _public) {
        this._public = _public;
        return this;
    }

    /**
     * Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will
     * require a unique token for each view. Learn more about the Private Video feature
     * [here](https://docs.api.video/delivery/video-privacy-access-management).
     * 
     * @return _public
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view. Learn more about the Private Video feature [here](https://docs.api.video/delivery/video-privacy-access-management).")

    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    public LiveStreamCreationPayload playerId(String playerId) {
        this.playerId = playerId;
        return this;
    }

    /**
     * The unique identifier for the player.
     * 
     * @return playerId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "pl4f4ferf5erfr5zed4fsdd", value = "The unique identifier for the player.")

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public LiveStreamCreationPayload restreams(List<RestreamsRequestObject> restreams) {
        this.restreams = restreams;
        return this;
    }

    public LiveStreamCreationPayload addRestreamsItem(RestreamsRequestObject restreamsItem) {
        if (this.restreams == null) {
            this.restreams = new ArrayList<>();
        }
        this.restreams.add(restreamsItem);
        return this;
    }

    /**
     * Use this parameter to add, edit, or remove &#x60;RTMPS&#x60; or &#x60;RTMP&#x60; services where you want to
     * restream a live stream. The list can only contain up to 5 destinations.
     * 
     * @return restreams
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Use this parameter to add, edit, or remove `RTMPS` or `RTMP` services where you want to restream a live stream. The list can only contain up to 5 destinations.")

    public List<RestreamsRequestObject> getRestreams() {
        return restreams;
    }

    public void setRestreams(List<RestreamsRequestObject> restreams) {
        this.restreams = restreams;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LiveStreamCreationPayload liveStreamCreationPayload = (LiveStreamCreationPayload) o;
        return Objects.equals(this.name, liveStreamCreationPayload.name)
                && Objects.equals(this._public, liveStreamCreationPayload._public)
                && Objects.equals(this.playerId, liveStreamCreationPayload.playerId)
                && Objects.equals(this.restreams, liveStreamCreationPayload.restreams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, _public, playerId, restreams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveStreamCreationPayload {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
        sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
        sb.append("    restreams: ").append(toIndentedString(restreams)).append("\n");
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
