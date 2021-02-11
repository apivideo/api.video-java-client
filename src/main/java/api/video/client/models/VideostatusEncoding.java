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

package api.video.client.models;

import java.util.Objects;
import java.util.Arrays;
import api.video.client.models.Quality;
import api.video.client.models.VideostatusEncodingMetadata;
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
import java.io.Serializable;

/**
 * VideostatusEncoding
 */

public class VideostatusEncoding implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_PLAYABLE = "playable";
    @SerializedName(SERIALIZED_NAME_PLAYABLE)
    private Boolean playable;

    public static final String SERIALIZED_NAME_QUALITIES = "qualities";
    @SerializedName(SERIALIZED_NAME_QUALITIES)
    private List<Quality> qualities = null;

    public static final String SERIALIZED_NAME_METADATA = "metadata";
    @SerializedName(SERIALIZED_NAME_METADATA)
    private VideostatusEncodingMetadata metadata;

    public VideostatusEncoding playable(Boolean playable) {
        this.playable = playable;
        return this;
    }

    /**
     * Whether the video is playable or not.
     * 
     * @return playable
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "true", value = "Whether the video is playable or not.")

    public Boolean getPlayable() {
        return playable;
    }

    public void setPlayable(Boolean playable) {
        this.playable = playable;
    }

    public VideostatusEncoding qualities(List<Quality> qualities) {
        this.qualities = qualities;
        return this;
    }

    public VideostatusEncoding addQualitiesItem(Quality qualitiesItem) {
        if (this.qualities == null) {
            this.qualities = new ArrayList<>();
        }
        this.qualities.add(qualitiesItem);
        return this;
    }

    /**
     * Available qualities the video can be viewed in.
     * 
     * @return qualities
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Available qualities the video can be viewed in.")

    public List<Quality> getQualities() {
        return qualities;
    }

    public void setQualities(List<Quality> qualities) {
        this.qualities = qualities;
    }

    public VideostatusEncoding metadata(VideostatusEncodingMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get metadata
     * 
     * @return metadata
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public VideostatusEncodingMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(VideostatusEncodingMetadata metadata) {
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
        VideostatusEncoding videostatusEncoding = (VideostatusEncoding) o;
        return Objects.equals(this.playable, videostatusEncoding.playable)
                && Objects.equals(this.qualities, videostatusEncoding.qualities)
                && Objects.equals(this.metadata, videostatusEncoding.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playable, qualities, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideostatusEncoding {\n");
        sb.append("    playable: ").append(toIndentedString(playable)).append("\n");
        sb.append("    qualities: ").append(toIndentedString(qualities)).append("\n");
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
