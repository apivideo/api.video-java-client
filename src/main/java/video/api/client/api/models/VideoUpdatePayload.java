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
import java.io.Serializable;

/**
 * VideoUpdatePayload
 */

public class VideoUpdatePayload implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_PLAYER_ID = "playerId";
    @SerializedName(SERIALIZED_NAME_PLAYER_ID)
    private String playerId;

    public static final String SERIALIZED_NAME_TITLE = "title";
    @SerializedName(SERIALIZED_NAME_TITLE)
    private String title;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_PUBLIC = "public";
    @SerializedName(SERIALIZED_NAME_PUBLIC)
    private Boolean _public;

    public static final String SERIALIZED_NAME_PANORAMIC = "panoramic";
    @SerializedName(SERIALIZED_NAME_PANORAMIC)
    private Boolean panoramic;

    public static final String SERIALIZED_NAME_MP4_SUPPORT = "mp4Support";
    @SerializedName(SERIALIZED_NAME_MP4_SUPPORT)
    private Boolean mp4Support;

    public static final String SERIALIZED_NAME_TAGS = "tags";
    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<String> tags = null;

    public static final String SERIALIZED_NAME_METADATA = "metadata";
    @SerializedName(SERIALIZED_NAME_METADATA)
    private List<Metadata> metadata = null;

    public VideoUpdatePayload playerId(String playerId) {
        this.playerId = playerId;
        return this;
    }

    /**
     * The unique ID for the player you want to associate with your video.
     * 
     * @return playerId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "pl4k0jvEUuaTdRAEjQ4Jfrgz", value = "The unique ID for the player you want to associate with your video.")

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public VideoUpdatePayload title(String title) {
        this.title = title;
        return this;
    }

    /**
     * The title you want to use for your video.
     * 
     * @return title
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The title you want to use for your video.")

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public VideoUpdatePayload description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A brief description of the video.
     * 
     * @return description
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "A film about good books.", value = "A brief description of the video.")

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VideoUpdatePayload _public(Boolean _public) {
        this._public = _public;
        return this;
    }

    /**
     * Whether the video is publicly available or not. False means it is set to private. Default is true. Tutorials on
     * [private videos](https://api.video/blog/endpoints/private-videos).
     * 
     * @return _public
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "true", value = "Whether the video is publicly available or not. False means it is set to private. Default is true. Tutorials on [private videos](https://api.video/blog/endpoints/private-videos).")

    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    public VideoUpdatePayload panoramic(Boolean panoramic) {
        this.panoramic = panoramic;
        return this;
    }

    /**
     * Whether the video is a 360 degree or immersive video.
     * 
     * @return panoramic
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "false", value = "Whether the video is a 360 degree or immersive video.")

    public Boolean getPanoramic() {
        return panoramic;
    }

    public void setPanoramic(Boolean panoramic) {
        this.panoramic = panoramic;
    }

    public VideoUpdatePayload mp4Support(Boolean mp4Support) {
        this.mp4Support = mp4Support;
        return this;
    }

    /**
     * Whether the player supports the mp4 format.
     * 
     * @return mp4Support
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "true", value = "Whether the player supports the mp4 format.")

    public Boolean getMp4Support() {
        return mp4Support;
    }

    public void setMp4Support(Boolean mp4Support) {
        this.mp4Support = mp4Support;
    }

    public VideoUpdatePayload tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public VideoUpdatePayload addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * A list of terms or words you want to tag the video with. Make sure the list includes all the tags you want as
     * whatever you send in this list will overwrite the existing list for the video.
     * 
     * @return tags
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "[\"maths\", \"string theory\", \"video\"]", value = "A list of terms or words you want to tag the video with. Make sure the list includes all the tags you want as whatever you send in this list will overwrite the existing list for the video.")

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public VideoUpdatePayload metadata(List<Metadata> metadata) {
        this.metadata = metadata;
        return this;
    }

    public VideoUpdatePayload addMetadataItem(Metadata metadataItem) {
        if (this.metadata == null) {
            this.metadata = new ArrayList<>();
        }
        this.metadata.add(metadataItem);
        return this;
    }

    /**
     * A list (array) of dictionaries where each dictionary contains a key value pair that describes the video. As with
     * tags, you must send the complete list of metadata you want as whatever you send here will overwrite the existing
     * metadata for the video. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to
     * define a key that allows any value pair.
     * 
     * @return metadata
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "A list (array) of dictionaries where each dictionary contains a key value pair that describes the video. As with tags, you must send the complete list of metadata you want as whatever you send here will overwrite the existing metadata for the video. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair.")

    public List<Metadata> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<Metadata> metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoUpdatePayload videoUpdatePayload = (VideoUpdatePayload) o;
        return Objects.equals(this.playerId, videoUpdatePayload.playerId)
                && Objects.equals(this.title, videoUpdatePayload.title)
                && Objects.equals(this.description, videoUpdatePayload.description)
                && Objects.equals(this._public, videoUpdatePayload._public)
                && Objects.equals(this.panoramic, videoUpdatePayload.panoramic)
                && Objects.equals(this.mp4Support, videoUpdatePayload.mp4Support)
                && Objects.equals(this.tags, videoUpdatePayload.tags)
                && Objects.equals(this.metadata, videoUpdatePayload.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId, title, description, _public, panoramic, mp4Support, tags, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoUpdatePayload {\n");
        sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
        sb.append("    panoramic: ").append(toIndentedString(panoramic)).append("\n");
        sb.append("    mp4Support: ").append(toIndentedString(mp4Support)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
