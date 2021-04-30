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
import java.math.BigDecimal;
import java.io.Serializable;

/**
 * VideoStatusEncodingMetadata
 */

public class VideoStatusEncodingMetadata implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_WIDTH = "width";
    @SerializedName(SERIALIZED_NAME_WIDTH)
    private Integer width;

    public static final String SERIALIZED_NAME_HEIGHT = "height";
    @SerializedName(SERIALIZED_NAME_HEIGHT)
    private Integer height;

    public static final String SERIALIZED_NAME_BITRATE = "bitrate";
    @SerializedName(SERIALIZED_NAME_BITRATE)
    private BigDecimal bitrate;

    public static final String SERIALIZED_NAME_DURATION = "duration";
    @SerializedName(SERIALIZED_NAME_DURATION)
    private Integer duration;

    public static final String SERIALIZED_NAME_FRAMERATE = "framerate";
    @SerializedName(SERIALIZED_NAME_FRAMERATE)
    private Integer framerate;

    public static final String SERIALIZED_NAME_SAMPLERATE = "samplerate";
    @SerializedName(SERIALIZED_NAME_SAMPLERATE)
    private Integer samplerate;

    public static final String SERIALIZED_NAME_VIDEO_CODEC = "videoCodec";
    @SerializedName(SERIALIZED_NAME_VIDEO_CODEC)
    private String videoCodec;

    public static final String SERIALIZED_NAME_AUDIO_CODEC = "audioCodec";
    @SerializedName(SERIALIZED_NAME_AUDIO_CODEC)
    private String audioCodec;

    public static final String SERIALIZED_NAME_ASPECT_RATIO = "aspectRatio";
    @SerializedName(SERIALIZED_NAME_ASPECT_RATIO)
    private String aspectRatio;

    public VideoStatusEncodingMetadata width(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * The width of the video in pixels.
     * 
     * @return width
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The width of the video in pixels.")

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public VideoStatusEncodingMetadata height(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * The height of the video in pixels.
     * 
     * @return height
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The height of the video in pixels.")

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public VideoStatusEncodingMetadata bitrate(BigDecimal bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * The number of bits processed per second.
     * 
     * @return bitrate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The number of bits processed per second.")

    public BigDecimal getBitrate() {
        return bitrate;
    }

    public void setBitrate(BigDecimal bitrate) {
        this.bitrate = bitrate;
    }

    public VideoStatusEncodingMetadata duration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * The length of the video.
     * 
     * @return duration
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The length of the video.")

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public VideoStatusEncodingMetadata framerate(Integer framerate) {
        this.framerate = framerate;
        return this;
    }

    /**
     * The frequency with which consecutive images or frames appear on a display. Shown in this API as frames per second
     * (fps).
     * 
     * @return framerate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "60", value = "The frequency with which consecutive images or frames appear on a display. Shown in this API as frames per second (fps).")

    public Integer getFramerate() {
        return framerate;
    }

    public void setFramerate(Integer framerate) {
        this.framerate = framerate;
    }

    public VideoStatusEncodingMetadata samplerate(Integer samplerate) {
        this.samplerate = samplerate;
        return this;
    }

    /**
     * How many samples per second a digital audio system uses to record an audio signal. The higher the rate, the
     * higher the frequencies that can be recorded. They are presented in this API using hertz.
     * 
     * @return samplerate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "48000", value = "How many samples per second a digital audio system uses to record an audio signal. The higher the rate, the higher the frequencies that can be recorded. They are presented in this API using hertz.")

    public Integer getSamplerate() {
        return samplerate;
    }

    public void setSamplerate(Integer samplerate) {
        this.samplerate = samplerate;
    }

    public VideoStatusEncodingMetadata videoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
        return this;
    }

    /**
     * The method used to compress and decompress digital video. API Video supports all codecs in the libavcodec
     * library.
     * 
     * @return videoCodec
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The method used to compress and decompress digital video. API Video supports all codecs in the libavcodec library. ")

    public String getVideoCodec() {
        return videoCodec;
    }

    public void setVideoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
    }

    public VideoStatusEncodingMetadata audioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
        return this;
    }

    /**
     * The method used to compress and decompress digital audio for your video.
     * 
     * @return audioCodec
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The method used to compress and decompress digital audio for your video.")

    public String getAudioCodec() {
        return audioCodec;
    }

    public void setAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
    }

    public VideoStatusEncodingMetadata aspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
        return this;
    }

    /**
     * Get aspectRatio
     * 
     * @return aspectRatio
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoStatusEncodingMetadata videoStatusEncodingMetadata = (VideoStatusEncodingMetadata) o;
        return Objects.equals(this.width, videoStatusEncodingMetadata.width)
                && Objects.equals(this.height, videoStatusEncodingMetadata.height)
                && Objects.equals(this.bitrate, videoStatusEncodingMetadata.bitrate)
                && Objects.equals(this.duration, videoStatusEncodingMetadata.duration)
                && Objects.equals(this.framerate, videoStatusEncodingMetadata.framerate)
                && Objects.equals(this.samplerate, videoStatusEncodingMetadata.samplerate)
                && Objects.equals(this.videoCodec, videoStatusEncodingMetadata.videoCodec)
                && Objects.equals(this.audioCodec, videoStatusEncodingMetadata.audioCodec)
                && Objects.equals(this.aspectRatio, videoStatusEncodingMetadata.aspectRatio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, bitrate, duration, framerate, samplerate, videoCodec, audioCodec,
                aspectRatio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoStatusEncodingMetadata {\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    framerate: ").append(toIndentedString(framerate)).append("\n");
        sb.append("    samplerate: ").append(toIndentedString(samplerate)).append("\n");
        sb.append("    videoCodec: ").append(toIndentedString(videoCodec)).append("\n");
        sb.append("    audioCodec: ").append(toIndentedString(audioCodec)).append("\n");
        sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
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
