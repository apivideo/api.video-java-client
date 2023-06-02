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
import video.api.client.api.models.Metadata;
import video.api.client.api.models.VideoClip;
import video.api.client.api.models.VideoWatermark;
import java.io.Serializable;

/**
 * VideoCreationPayload
 */

public class VideoCreationPayload implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_TITLE = "title";
    @SerializedName(SERIALIZED_NAME_TITLE)
    private String title;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_SOURCE = "source";
    @SerializedName(SERIALIZED_NAME_SOURCE)
    private String source;

    public static final String SERIALIZED_NAME_PUBLIC = "public";
    @SerializedName(SERIALIZED_NAME_PUBLIC)
    private Boolean _public = true;

    public static final String SERIALIZED_NAME_PANORAMIC = "panoramic";
    @SerializedName(SERIALIZED_NAME_PANORAMIC)
    private Boolean panoramic = false;

    public static final String SERIALIZED_NAME_MP4_SUPPORT = "mp4Support";
    @SerializedName(SERIALIZED_NAME_MP4_SUPPORT)
    private Boolean mp4Support = true;

    public static final String SERIALIZED_NAME_PLAYER_ID = "playerId";
    @SerializedName(SERIALIZED_NAME_PLAYER_ID)
    private String playerId;

    public static final String SERIALIZED_NAME_TAGS = "tags";
    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<String> tags = null;

    public static final String SERIALIZED_NAME_METADATA = "metadata";
    @SerializedName(SERIALIZED_NAME_METADATA)
    private List<Metadata> metadata = null;

    public static final String SERIALIZED_NAME_CLIP = "clip";
    @SerializedName(SERIALIZED_NAME_CLIP)
    private VideoClip clip;

    public static final String SERIALIZED_NAME_WATERMARK = "watermark";
    @SerializedName(SERIALIZED_NAME_WATERMARK)
    private VideoWatermark watermark;

    public VideoCreationPayload title(String title) {
        this.title = title;
        return this;
    }

    /**
     * The title of your new video.
     * 
     * @return title
     **/
    @ApiModelProperty(example = "Maths video", required = true, value = "The title of your new video.")

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public VideoCreationPayload description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A brief description of your video.
     * 
     * @return description
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "A video about string theory.", value = "A brief description of your video.")

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VideoCreationPayload source(String source) {
        this.source = source;
        return this;
    }

    /**
     * You can either add a video already on the web, by entering the URL of the video, or you can also enter the
     * &#x60;videoId&#x60; of one of the videos you already have on your api.video acccount, and this will generate a
     * copy of your video. Creating a copy of a video can be especially useful if you want to keep your original video
     * and trim or apply a watermark onto the copy you would create.
     * 
     * @return source
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "https://www.myvideo.url.com/video.mp4 OR vi4k0jvEUuaTdRAEjQ4JfOyl", value = "You can either add a video already on the web, by entering the URL of the video, or you can also enter the `videoId` of one of the videos you already have on your api.video acccount, and this will generate a copy of your video. Creating a copy of a video can be especially useful if you want to keep your original video and trim or apply a watermark onto the copy you would create.")

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public VideoCreationPayload _public(Boolean _public) {
        this._public = _public;
        return this;
    }

    /**
     * Default: True. If set to &#x60;false&#x60; the video will become private. More information on private videos can
     * be found [here](https://docs.api.video/docs/private-videos)
     * 
     * @return _public
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "true", value = "Default: True. If set to `false` the video will become private. More information on private videos can be found [here](https://docs.api.video/docs/private-videos)")

    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    public VideoCreationPayload panoramic(Boolean panoramic) {
        this.panoramic = panoramic;
        return this;
    }

    /**
     * Indicates if your video is a 360/immersive video.
     * 
     * @return panoramic
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "false", value = "Indicates if your video is a 360/immersive video.")

    public Boolean getPanoramic() {
        return panoramic;
    }

    public void setPanoramic(Boolean panoramic) {
        this.panoramic = panoramic;
    }

    public VideoCreationPayload mp4Support(Boolean mp4Support) {
        this.mp4Support = mp4Support;
        return this;
    }

    /**
     * Enables mp4 version in addition to streamed version.
     * 
     * @return mp4Support
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "true", value = "Enables mp4 version in addition to streamed version.")

    public Boolean getMp4Support() {
        return mp4Support;
    }

    public void setMp4Support(Boolean mp4Support) {
        this.mp4Support = mp4Support;
    }

    public VideoCreationPayload playerId(String playerId) {
        this.playerId = playerId;
        return this;
    }

    /**
     * The unique identification number for your video player.
     * 
     * @return playerId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "pl45KFKdlddgk654dspkze", value = "The unique identification number for your video player.")

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public VideoCreationPayload tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public VideoCreationPayload addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * A list of tags you want to use to describe your video.
     * 
     * @return tags
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "[\"maths\", \"string theory\", \"video\"]", value = "A list of tags you want to use to describe your video.")

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public VideoCreationPayload metadata(List<Metadata> metadata) {
        this.metadata = metadata;
        return this;
    }

    public VideoCreationPayload addMetadataItem(Metadata metadataItem) {
        if (this.metadata == null) {
            this.metadata = new ArrayList<>();
        }
        this.metadata.add(metadataItem);
        return this;
    }

    /**
     * A list of key value pairs that you use to provide metadata for your video. These pairs can be made dynamic,
     * allowing you to segment your audience. Read more on [dynamic
     * metadata](https://api.video/blog/endpoints/dynamic-metadata).
     * 
     * @return metadata
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "[{\"key\": \"Author\", \"value\": \"John Doe\"}]", value = "A list of key value pairs that you use to provide metadata for your video. These pairs can be made dynamic, allowing you to segment your audience. Read more on [dynamic metadata](https://api.video/blog/endpoints/dynamic-metadata).")

    public List<Metadata> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<Metadata> metadata) {
        this.metadata = metadata;
    }

    public VideoCreationPayload clip(VideoClip clip) {
        this.clip = clip;
        return this;
    }

    /**
     * Get clip
     * 
     * @return clip
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public VideoClip getClip() {
        return clip;
    }

    public void setClip(VideoClip clip) {
        this.clip = clip;
    }

    public VideoCreationPayload watermark(VideoWatermark watermark) {
        this.watermark = watermark;
        return this;
    }

    /**
     * Get watermark
     * 
     * @return watermark
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public VideoWatermark getWatermark() {
        return watermark;
    }

    public void setWatermark(VideoWatermark watermark) {
        this.watermark = watermark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoCreationPayload videoCreationPayload = (VideoCreationPayload) o;
        return Objects.equals(this.title, videoCreationPayload.title)
                && Objects.equals(this.description, videoCreationPayload.description)
                && Objects.equals(this.source, videoCreationPayload.source)
                && Objects.equals(this._public, videoCreationPayload._public)
                && Objects.equals(this.panoramic, videoCreationPayload.panoramic)
                && Objects.equals(this.mp4Support, videoCreationPayload.mp4Support)
                && Objects.equals(this.playerId, videoCreationPayload.playerId)
                && Objects.equals(this.tags, videoCreationPayload.tags)
                && Objects.equals(this.metadata, videoCreationPayload.metadata)
                && Objects.equals(this.clip, videoCreationPayload.clip)
                && Objects.equals(this.watermark, videoCreationPayload.watermark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, source, _public, panoramic, mp4Support, playerId, tags, metadata, clip,
                watermark);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoCreationPayload {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
        sb.append("    panoramic: ").append(toIndentedString(panoramic)).append("\n");
        sb.append("    mp4Support: ").append(toIndentedString(mp4Support)).append("\n");
        sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    clip: ").append(toIndentedString(clip)).append("\n");
        sb.append("    watermark: ").append(toIndentedString(watermark)).append("\n");
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
