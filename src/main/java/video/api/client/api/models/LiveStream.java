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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import video.api.client.api.models.LiveStreamAssets;
import video.api.client.api.models.RestreamsResponseObject;
import java.io.Serializable;

/**
 * LiveStream
 */

public class LiveStream implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_LIVE_STREAM_ID = "liveStreamId";
    @SerializedName(SERIALIZED_NAME_LIVE_STREAM_ID)
    private String liveStreamId;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_STREAM_KEY = "streamKey";
    @SerializedName(SERIALIZED_NAME_STREAM_KEY)
    private String streamKey;

    public static final String SERIALIZED_NAME_PUBLIC = "public";
    @SerializedName(SERIALIZED_NAME_PUBLIC)
    private Boolean _public;

    public static final String SERIALIZED_NAME_ASSETS = "assets";
    @SerializedName(SERIALIZED_NAME_ASSETS)
    private LiveStreamAssets assets;

    public static final String SERIALIZED_NAME_PLAYER_ID = "playerId";
    @SerializedName(SERIALIZED_NAME_PLAYER_ID)
    private String playerId;

    public static final String SERIALIZED_NAME_BROADCASTING = "broadcasting";
    @SerializedName(SERIALIZED_NAME_BROADCASTING)
    private Boolean broadcasting;

    public static final String SERIALIZED_NAME_RESTREAMS = "restreams";
    @SerializedName(SERIALIZED_NAME_RESTREAMS)
    private List<RestreamsResponseObject> restreams = new ArrayList<>();

    public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private OffsetDateTime createdAt;

    public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    private OffsetDateTime updatedAt;

    public LiveStream liveStreamId(String liveStreamId) {
        this.liveStreamId = liveStreamId;
        return this;
    }

    /**
     * The unique identifier for the live stream. Live stream IDs begin with \&quot;li.\&quot;
     * 
     * @return liveStreamId
     **/
    @ApiModelProperty(example = "li400mYKSgQ6xs7taUeSaEKr", required = true, value = "The unique identifier for the live stream. Live stream IDs begin with \"li.\"")

    public String getLiveStreamId() {
        return liveStreamId;
    }

    public void setLiveStreamId(String liveStreamId) {
        this.liveStreamId = liveStreamId;
    }

    public LiveStream name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of your live stream.
     * 
     * @return name
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "My Live Stream", value = "The name of your live stream.")

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LiveStream streamKey(String streamKey) {
        this.streamKey = streamKey;
        return this;
    }

    /**
     * The unique, private stream key that you use to begin streaming.
     * 
     * @return streamKey
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "dw-dew8-q6w9-k67w-1ws8", value = "The unique, private stream key that you use to begin streaming.")

    public String getStreamKey() {
        return streamKey;
    }

    public void setStreamKey(String streamKey) {
        this.streamKey = streamKey;
    }

    public LiveStream _public(Boolean _public) {
        this._public = _public;
        return this;
    }

    /**
     * Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will
     * require a unique token for each view. Learn more about the Private Video feature
     * [here](https://docs.api.video/delivery-analytics/video-privacy-access-management).
     * 
     * @return _public
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "true", value = "Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view. Learn more about the Private Video feature [here](https://docs.api.video/delivery-analytics/video-privacy-access-management).")

    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    public LiveStream assets(LiveStreamAssets assets) {
        this.assets = assets;
        return this;
    }

    /**
     * Get assets
     * 
     * @return assets
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public LiveStreamAssets getAssets() {
        return assets;
    }

    public void setAssets(LiveStreamAssets assets) {
        this.assets = assets;
    }

    public LiveStream playerId(String playerId) {
        this.playerId = playerId;
        return this;
    }

    /**
     * The unique identifier for the player.
     * 
     * @return playerId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "pl45d5vFFGrfdsdsd156dGhh", value = "The unique identifier for the player.")

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public LiveStream broadcasting(Boolean broadcasting) {
        this.broadcasting = broadcasting;
        return this;
    }

    /**
     * Whether or not you are broadcasting the live video you recorded for others to see. True means you are
     * broadcasting to viewers, false means you are not.
     * 
     * @return broadcasting
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "true", value = "Whether or not you are broadcasting the live video you recorded for others to see. True means you are broadcasting to viewers, false means you are not.")

    public Boolean getBroadcasting() {
        return broadcasting;
    }

    public void setBroadcasting(Boolean broadcasting) {
        this.broadcasting = broadcasting;
    }

    public LiveStream restreams(List<RestreamsResponseObject> restreams) {
        this.restreams = restreams;
        return this;
    }

    public LiveStream addRestreamsItem(RestreamsResponseObject restreamsItem) {
        this.restreams.add(restreamsItem);
        return this;
    }

    /**
     * Returns the list of RTMP restream destinations.
     * 
     * @return restreams
     **/
    @ApiModelProperty(required = true, value = "Returns the list of RTMP restream destinations.")

    public List<RestreamsResponseObject> getRestreams() {
        return restreams;
    }

    public void setRestreams(List<RestreamsResponseObject> restreams) {
        this.restreams = restreams;
    }

    public LiveStream createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * When the player was created, presented in ISO-8601 format.
     * 
     * @return createdAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "2020-01-31T10:17:47Z", value = "When the player was created, presented in ISO-8601 format.")

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LiveStream updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * When the player was last updated, presented in ISO-8601 format.
     * 
     * @return updatedAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "2020-01-31T10:18:47Z", value = "When the player was last updated, presented in ISO-8601 format.")

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LiveStream liveStream = (LiveStream) o;
        return Objects.equals(this.liveStreamId, liveStream.liveStreamId) && Objects.equals(this.name, liveStream.name)
                && Objects.equals(this.streamKey, liveStream.streamKey)
                && Objects.equals(this._public, liveStream._public) && Objects.equals(this.assets, liveStream.assets)
                && Objects.equals(this.playerId, liveStream.playerId)
                && Objects.equals(this.broadcasting, liveStream.broadcasting)
                && Objects.equals(this.restreams, liveStream.restreams)
                && Objects.equals(this.createdAt, liveStream.createdAt)
                && Objects.equals(this.updatedAt, liveStream.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(liveStreamId, name, streamKey, _public, assets, playerId, broadcasting, restreams,
                createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveStream {\n");
        sb.append("    liveStreamId: ").append(toIndentedString(liveStreamId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    streamKey: ").append(toIndentedString(streamKey)).append("\n");
        sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
        sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
        sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
        sb.append("    broadcasting: ").append(toIndentedString(broadcasting)).append("\n");
        sb.append("    restreams: ").append(toIndentedString(restreams)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
