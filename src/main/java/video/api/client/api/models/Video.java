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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import video.api.client.api.models.Metadata;
import video.api.client.api.models.VideoAssets;
import video.api.client.api.models.VideoSource;
import java.io.Serializable;

/**
 * Video
 */

public class Video implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_VIDEO_ID = "videoId";
    @SerializedName(SERIALIZED_NAME_VIDEO_ID)
    private String videoId;

    public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private OffsetDateTime createdAt;

    public static final String SERIALIZED_NAME_TITLE = "title";
    @SerializedName(SERIALIZED_NAME_TITLE)
    private String title;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_PUBLISHED_AT = "publishedAt";
    @SerializedName(SERIALIZED_NAME_PUBLISHED_AT)
    private String publishedAt;

    public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    private OffsetDateTime updatedAt;

    public static final String SERIALIZED_NAME_TAGS = "tags";
    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<Object> tags = null;

    public static final String SERIALIZED_NAME_METADATA = "metadata";
    @SerializedName(SERIALIZED_NAME_METADATA)
    private List<Metadata> metadata = null;

    public static final String SERIALIZED_NAME_SOURCE = "source";
    @SerializedName(SERIALIZED_NAME_SOURCE)
    private VideoSource source;

    public static final String SERIALIZED_NAME_ASSETS = "assets";
    @SerializedName(SERIALIZED_NAME_ASSETS)
    private VideoAssets assets;

    public static final String SERIALIZED_NAME_PLAYER_ID = "playerId";
    @SerializedName(SERIALIZED_NAME_PLAYER_ID)
    private String playerId;

    public static final String SERIALIZED_NAME_PUBLIC = "public";
    @SerializedName(SERIALIZED_NAME_PUBLIC)
    private Boolean _public;

    public static final String SERIALIZED_NAME_PANORAMIC = "panoramic";
    @SerializedName(SERIALIZED_NAME_PANORAMIC)
    private Boolean panoramic;

    public static final String SERIALIZED_NAME_MP4_SUPPORT = "mp4Support";
    @SerializedName(SERIALIZED_NAME_MP4_SUPPORT)
    private Boolean mp4Support;

    public Video videoId(String videoId) {
        this.videoId = videoId;
        return this;
    }

    /**
     * The unique identifier of the video object.
     * 
     * @return videoId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "vi4k0jvEUuaTdRAEjQ4Prklg", value = "The unique identifier of the video object.")

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public Video createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * When an webhook was created, presented in ISO-8601 format.
     * 
     * @return createdAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "2019-06-24T11:45:01.109Z", value = "When an webhook was created, presented in ISO-8601 format.")

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Video title(String title) {
        this.title = title;
        return this;
    }

    /**
     * The title of the video content.
     * 
     * @return title
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "Maths video", value = "The title of the video content. ")

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Video description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A description for the video content.
     * 
     * @return description
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "An amazing video explaining string theory.", value = "A description for the video content. ")

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Video publishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }

    /**
     * The date and time the API created the video. Date and time are provided using ISO-8601 UTC format.
     * 
     * @return publishedAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "2019-12-16T08:25:51+00:00", value = "The date and time the API created the video. Date and time are provided using ISO-8601 UTC format.")

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Video updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The date and time the video was updated. Date and time are provided using ISO-8601 UTC format.
     * 
     * @return updatedAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "2019-12-16T08:25:51+00:10", value = "The date and time the video was updated. Date and time are provided using ISO-8601 UTC format.")

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Video tags(List<Object> tags) {
        this.tags = tags;
        return this;
    }

    public Video addTagsItem(Object tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * One array of tags (each tag is a string) in order to categorize a video. Tags may include spaces.
     * 
     * @return tags
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "\"tags\": [\"maths\", \"string theory\", \"video\"]", value = "One array of tags (each tag is a string) in order to categorize a video. Tags may include spaces.  ")

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public Video metadata(List<Metadata> metadata) {
        this.metadata = metadata;
        return this;
    }

    public Video addMetadataItem(Metadata metadataItem) {
        if (this.metadata == null) {
            this.metadata = new ArrayList<>();
        }
        this.metadata.add(metadataItem);
        return this;
    }

    /**
     * Metadata you can use to categorise and filter videos. Metadata is a list of dictionaries, where each dictionary
     * represents a key value pair for categorising a video.
     * 
     * @return metadata
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "[{\"key\":\"Author\", \"value\":\"John Doe\"}, {\"key\":\"Format\", \"value\":\"Tutorial\"}]", value = "Metadata you can use to categorise and filter videos. Metadata is a list of dictionaries, where each dictionary represents a key value pair for categorising a video.  ")

    public List<Metadata> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<Metadata> metadata) {
        this.metadata = metadata;
    }

    public Video source(VideoSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get source
     * 
     * @return source
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public VideoSource getSource() {
        return source;
    }

    public void setSource(VideoSource source) {
        this.source = source;
    }

    public Video assets(VideoAssets assets) {
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

    public VideoAssets getAssets() {
        return assets;
    }

    public void setAssets(VideoAssets assets) {
        this.assets = assets;
    }

    public Video playerId(String playerId) {
        this.playerId = playerId;
        return this;
    }

    /**
     * The id of the player that will be applied on the video.
     * 
     * @return playerId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "pl45KFKdlddgk654dspkze", value = "The id of the player that will be applied on the video. ")

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public Video _public(Boolean _public) {
        this._public = _public;
        return this;
    }

    /**
     * Defines if the content is publicly reachable or if a unique token is needed for each play session.
     * 
     * @return _public
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "false", value = "Defines if the content is publicly reachable or if a unique token is needed for each play session. ")

    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    public Video panoramic(Boolean panoramic) {
        this.panoramic = panoramic;
        return this;
    }

    /**
     * Defines if video is panoramic.
     * 
     * @return panoramic
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "false", value = "Defines if video is panoramic. ")

    public Boolean getPanoramic() {
        return panoramic;
    }

    public void setPanoramic(Boolean panoramic) {
        this.panoramic = panoramic;
    }

    public Video mp4Support(Boolean mp4Support) {
        this.mp4Support = mp4Support;
        return this;
    }

    /**
     * This lets you know whether mp4 is supported. If enabled, an mp4 URL will be provided in the response for the
     * video.
     * 
     * @return mp4Support
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "true", value = "This lets you know whether mp4 is supported. If enabled, an mp4 URL will be provided in the response for the video. ")

    public Boolean getMp4Support() {
        return mp4Support;
    }

    public void setMp4Support(Boolean mp4Support) {
        this.mp4Support = mp4Support;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Video video = (Video) o;
        return Objects.equals(this.videoId, video.videoId) && Objects.equals(this.createdAt, video.createdAt)
                && Objects.equals(this.title, video.title) && Objects.equals(this.description, video.description)
                && Objects.equals(this.publishedAt, video.publishedAt)
                && Objects.equals(this.updatedAt, video.updatedAt) && Objects.equals(this.tags, video.tags)
                && Objects.equals(this.metadata, video.metadata) && Objects.equals(this.source, video.source)
                && Objects.equals(this.assets, video.assets) && Objects.equals(this.playerId, video.playerId)
                && Objects.equals(this._public, video._public) && Objects.equals(this.panoramic, video.panoramic)
                && Objects.equals(this.mp4Support, video.mp4Support);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoId, createdAt, title, description, publishedAt, updatedAt, tags, metadata, source,
                assets, playerId, _public, panoramic, mp4Support);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Video {\n");
        sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
        sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
        sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
        sb.append("    panoramic: ").append(toIndentedString(panoramic)).append("\n");
        sb.append("    mp4Support: ").append(toIndentedString(mp4Support)).append("\n");
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
