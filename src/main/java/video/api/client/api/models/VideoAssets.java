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
import java.net.URI;
import java.io.Serializable;

/**
 * Collection of details about the video object that you can use to work with the video object.
 */
@ApiModel(description = "Collection of details about the video object that you can use to work with the video object.")

public class VideoAssets implements Serializable {
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

    public static final String SERIALIZED_NAME_MP4 = "mp4";
    @SerializedName(SERIALIZED_NAME_MP4)
    private URI mp4;

    public VideoAssets hls(URI hls) {
        this.hls = hls;
        return this;
    }

    /**
     * This is the manifest URL. For HTTP Live Streaming (HLS), when a HLS video stream is initiated, the first file to
     * download is the manifest. This file has the extension M3U8, and provides the video player with information about
     * the various bitrates available for streaming.
     * 
     * @return hls
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "This is the manifest URL. For HTTP Live Streaming (HLS), when a HLS video stream is initiated, the first file to download is the manifest. This file has the extension M3U8, and provides the video player with information about the various bitrates available for streaming.")

    public URI getHls() {
        return hls;
    }

    public void setHls(URI hls) {
        this.hls = hls;
    }

    public VideoAssets iframe(String iframe) {
        this.iframe = iframe;
        return this;
    }

    /**
     * Code to use video from a third party website
     * 
     * @return iframe
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "<iframe src=\"//embed.api.video/c188ed58-3403-46a2-b91b-44603d10b2c9?token=831a9bd9-9f50-464c-a369-8e9d914371ae\" width=\"100%\" height=\"100%\" frameborder=\"0\" scrolling=\"no\" allowfullscreen=\"\"></iframe>", value = "Code to use video from a third party website")

    public String getIframe() {
        return iframe;
    }

    public void setIframe(String iframe) {
        this.iframe = iframe;
    }

    public VideoAssets player(URI player) {
        this.player = player;
        return this;
    }

    /**
     * Raw url of the player.
     * 
     * @return player
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "https://embed.api.video/1b9d6ae8-8f57-4b6d-8552-d636926b4f5f?token=831a9bd9-9f50-464c-a369-8e9d914371ae", value = "Raw url of the player.")

    public URI getPlayer() {
        return player;
    }

    public void setPlayer(URI player) {
        this.player = player;
    }

    public VideoAssets thumbnail(URI thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    /**
     * Poster of the video.
     * 
     * @return thumbnail
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "https://cdn.api.video/stream/831a9bd9-9f50-464c-a369-8e9d914371ae/thumbnail.jpg", value = "Poster of the video.")

    public URI getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(URI thumbnail) {
        this.thumbnail = thumbnail;
    }

    public VideoAssets mp4(URI mp4) {
        this.mp4 = mp4;
        return this;
    }

    /**
     * Available only if mp4Support is enabled. Raw mp4 url.
     * 
     * @return mp4
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "https://cdn.api.video/vod/vi4k0jvEUuaTdRAEjQ4Jfrgz/token/8fd70443-d9f0-45d2-b01c-12c8cfc707c9/mp4/720/source.mp4", value = "Available only if mp4Support is enabled. Raw mp4 url.")

    public URI getMp4() {
        return mp4;
    }

    public void setMp4(URI mp4) {
        this.mp4 = mp4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoAssets videoAssets = (VideoAssets) o;
        return Objects.equals(this.hls, videoAssets.hls) && Objects.equals(this.iframe, videoAssets.iframe)
                && Objects.equals(this.player, videoAssets.player)
                && Objects.equals(this.thumbnail, videoAssets.thumbnail) && Objects.equals(this.mp4, videoAssets.mp4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hls, iframe, player, thumbnail, mp4);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoAssets {\n");
        sb.append("    hls: ").append(toIndentedString(hls)).append("\n");
        sb.append("    iframe: ").append(toIndentedString(iframe)).append("\n");
        sb.append("    player: ").append(toIndentedString(player)).append("\n");
        sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
        sb.append("    mp4: ").append(toIndentedString(mp4)).append("\n");
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
