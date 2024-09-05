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
import java.net.URI;
import java.io.Serializable;

/**
 * LiveStreamAssets
 */

public class LiveStreamAssets implements Serializable, DeepObject {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_HLS = "hls";
    @SerializedName(SERIALIZED_NAME_HLS)
    private URI hls;

    public static final String SERIALIZED_NAME_IFRAME = "iframe";
    @SerializedName(SERIALIZED_NAME_IFRAME)
    private String iframe;

    public static final String SERIALIZED_NAME_PLAYER = "player";
    @SerializedName(SERIALIZED_NAME_PLAYER)
    private URI player;

    public static final String SERIALIZED_NAME_THUMBNAIL = "thumbnail";
    @SerializedName(SERIALIZED_NAME_THUMBNAIL)
    private URI thumbnail;

    public LiveStreamAssets hls(URI hls) {
        this.hls = hls;
        return this;
    }

    /**
     * The http live streaming (HLS) link for your live video stream.
     * 
     * @return hls
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "https://live.api.video/li4pqNqGUkhKfWcBGpZVLRY5.m3u8", value = "The http live streaming (HLS) link for your live video stream.")

    public URI getHls() {
        return hls;
    }

    public void setHls(URI hls) {
        this.hls = hls;
    }

    public LiveStreamAssets iframe(String iframe) {
        this.iframe = iframe;
        return this;
    }

    /**
     * The embed code for the iframe containing your live video stream.
     * 
     * @return iframe
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "<iframe src=\\\"https://embed.api.video/live/li4pqNqGUkhKfWcBGpZVLRY5\\\" width=\\\"100%\\\" height=\\\"100%\\\" frameborder=\\\"0\\\" scrolling=\\\"no\\\" allowfullscreen=\\\"\\\"></iframe>", value = "The embed code for the iframe containing your live video stream.")

    public String getIframe() {
        return iframe;
    }

    public void setIframe(String iframe) {
        this.iframe = iframe;
    }

    public LiveStreamAssets player(URI player) {
        this.player = player;
        return this;
    }

    /**
     * A link to the video player that is playing your live stream.
     * 
     * @return player
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "https://embed.api.video/live/li400mYKSgQ6xs7taUeSaEKr", value = "A link to the video player that is playing your live stream.")

    public URI getPlayer() {
        return player;
    }

    public void setPlayer(URI player) {
        this.player = player;
    }

    public LiveStreamAssets thumbnail(URI thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    /**
     * A link to the thumbnail for your video.
     * 
     * @return thumbnail
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "https://live.api.video/li400mYKSgQ6xs7taUeSaEKr/thumbnail.jpg", value = "A link to the thumbnail for your video.")

    public URI getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(URI thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LiveStreamAssets liveStreamAssets = (LiveStreamAssets) o;
        return Objects.equals(this.hls, liveStreamAssets.hls) && Objects.equals(this.iframe, liveStreamAssets.iframe)
                && Objects.equals(this.player, liveStreamAssets.player)
                && Objects.equals(this.thumbnail, liveStreamAssets.thumbnail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hls, iframe, player, thumbnail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveStreamAssets {\n");
        sb.append("    hls: ").append(toIndentedString(hls)).append("\n");
        sb.append("    iframe: ").append(toIndentedString(iframe)).append("\n");
        sb.append("    player: ").append(toIndentedString(player)).append("\n");
        sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
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
