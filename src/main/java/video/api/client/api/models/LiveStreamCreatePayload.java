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
import java.io.Serializable;

/**
 * LiveStreamCreatePayload
 */

public class LiveStreamCreatePayload implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_RECORD = "record";
    @SerializedName(SERIALIZED_NAME_RECORD)
    private Boolean record = false;

    public static final String SERIALIZED_NAME_PUBLIC = "public";
    @SerializedName(SERIALIZED_NAME_PUBLIC)
    private Boolean _public;

    public static final String SERIALIZED_NAME_PLAYER_ID = "playerId";
    @SerializedName(SERIALIZED_NAME_PLAYER_ID)
    private String playerId;

    public LiveStreamCreatePayload name(String name) {
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

    public LiveStreamCreatePayload record(Boolean record) {
        this.record = record;
        return this;
    }

    /**
     * Whether you are recording or not. True for record, false for not record.
     * 
     * @return record
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "true", value = "Whether you are recording or not. True for record, false for not record.")

    public Boolean getRecord() {
        return record;
    }

    public void setRecord(Boolean record) {
        this.record = record;
    }

    public LiveStreamCreatePayload _public(Boolean _public) {
        this._public = _public;
        return this;
    }

    /**
     * BETA FEATURE Please limit all public &#x3D; false (\&quot;private\&quot;) livestreams to 3,000 users. Whether
     * your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a
     * unique token for each view.
     * 
     * @return _public
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "BETA FEATURE Please limit all public = false (\"private\") livestreams to 3,000 users. Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view.")

    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    public LiveStreamCreatePayload playerId(String playerId) {
        this.playerId = playerId;
        return this;
    }

    /**
     * The unique identifier for the player. Player IDs begin with \&quot;pl.\&quot;
     * 
     * @return playerId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "pl4f4ferf5erfr5zed4fsdd", value = "The unique identifier for the player. Player IDs begin with \"pl.\"")

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LiveStreamCreatePayload liveStreamCreatePayload = (LiveStreamCreatePayload) o;
        return Objects.equals(this.name, liveStreamCreatePayload.name)
                && Objects.equals(this.record, liveStreamCreatePayload.record)
                && Objects.equals(this._public, liveStreamCreatePayload._public)
                && Objects.equals(this.playerId, liveStreamCreatePayload.playerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, record, _public, playerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveStreamCreatePayload {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    record: ").append(toIndentedString(record)).append("\n");
        sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
        sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
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
