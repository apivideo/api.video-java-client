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
 * LiveStreamUpdatePayload
 */

public class LiveStreamUpdatePayload implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_PUBLIC = "public";
    @SerializedName(SERIALIZED_NAME_PUBLIC)
    private Boolean _public;

    public static final String SERIALIZED_NAME_RECORD = "record";
    @SerializedName(SERIALIZED_NAME_RECORD)
    private Boolean record;

    public static final String SERIALIZED_NAME_PLAYER_ID = "playerId";
    @SerializedName(SERIALIZED_NAME_PLAYER_ID)
    private String playerId;

    public static final String SERIALIZED_NAME_RESTREAMS = "restreams";
    @SerializedName(SERIALIZED_NAME_RESTREAMS)
    private List<RestreamsRequestObject> restreams = null;

    public LiveStreamUpdatePayload name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name you want to use for your live stream.
     * 
     * @return name
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "My Live Stream Video", value = "The name you want to use for your live stream.")

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LiveStreamUpdatePayload _public(Boolean _public) {
        this._public = _public;
        return this;
    }

    /**
     * Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will
     * require a unique token for each view. Learn more about the Private Video feature
     * [here](https://docs.api.video/docs/private-videos).
     * 
     * @return _public
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view. Learn more about the Private Video feature [here](https://docs.api.video/docs/private-videos).")

    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    public LiveStreamUpdatePayload record(Boolean record) {
        this.record = record;
        return this;
    }

    /**
     * Use this to indicate whether you want the recording on or off. On is true, off is false.
     * 
     * @return record
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "true", value = "Use this to indicate whether you want the recording on or off. On is true, off is false.")

    public Boolean getRecord() {
        return record;
    }

    public void setRecord(Boolean record) {
        this.record = record;
    }

    public LiveStreamUpdatePayload playerId(String playerId) {
        this.playerId = playerId;
        return this;
    }

    /**
     * The unique ID for the player associated with a live stream that you want to update.
     * 
     * @return playerId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "pl45KFKdlddgk654dspkze", value = "The unique ID for the player associated with a live stream that you want to update.")

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public LiveStreamUpdatePayload restreams(List<RestreamsRequestObject> restreams) {
        this.restreams = restreams;
        return this;
    }

    public LiveStreamUpdatePayload addRestreamsItem(RestreamsRequestObject restreamsItem) {
        if (this.restreams == null) {
            this.restreams = new ArrayList<>();
        }
        this.restreams.add(restreamsItem);
        return this;
    }

    /**
     * Use this parameter to add, edit, or remove RTMP services where you want to restream a live stream. The list can
     * only contain up to 5 destinations. This operation updates all restream destinations in the same request. If you
     * do not want to modify an existing restream destination, you need to include it in your request, otherwise it is
     * removed.
     * 
     * @return restreams
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Use this parameter to add, edit, or remove RTMP services where you want to restream a live stream. The list can only contain up to 5 destinations. This operation updates all restream destinations in the same request. If you do not want to modify an existing restream destination, you need to include it in your request, otherwise it is removed.")

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
        LiveStreamUpdatePayload liveStreamUpdatePayload = (LiveStreamUpdatePayload) o;
        return Objects.equals(this.name, liveStreamUpdatePayload.name)
                && Objects.equals(this._public, liveStreamUpdatePayload._public)
                && Objects.equals(this.record, liveStreamUpdatePayload.record)
                && Objects.equals(this.playerId, liveStreamUpdatePayload.playerId)
                && Objects.equals(this.restreams, liveStreamUpdatePayload.restreams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, _public, record, playerId, restreams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveStreamUpdatePayload {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
        sb.append("    record: ").append(toIndentedString(record)).append("\n");
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
