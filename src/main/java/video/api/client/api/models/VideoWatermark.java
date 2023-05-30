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
import java.io.Serializable;

/**
 * VideoWatermark
 */

public class VideoWatermark implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_TOP = "top";
    @SerializedName(SERIALIZED_NAME_TOP)
    private String top;

    public static final String SERIALIZED_NAME_LEFT = "left";
    @SerializedName(SERIALIZED_NAME_LEFT)
    private String left;

    public static final String SERIALIZED_NAME_BOTTOM = "bottom";
    @SerializedName(SERIALIZED_NAME_BOTTOM)
    private String bottom;

    public static final String SERIALIZED_NAME_RIGHT = "right";
    @SerializedName(SERIALIZED_NAME_RIGHT)
    private String right;

    public static final String SERIALIZED_NAME_WIDTH = "width";
    @SerializedName(SERIALIZED_NAME_WIDTH)
    private String width;

    public static final String SERIALIZED_NAME_HEIGHT = "height";
    @SerializedName(SERIALIZED_NAME_HEIGHT)
    private String height;

    public static final String SERIALIZED_NAME_OPACITY = "opacity";
    @SerializedName(SERIALIZED_NAME_OPACITY)
    private String opacity;

    public VideoWatermark id(String id) {
        this.id = id;
        return this;
    }

    /**
     * id of the watermark
     * 
     * @return id
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "watermark_1BWr2L5MTQwxGkuxKjzh6i", value = "id of the watermark")

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VideoWatermark top(String top) {
        this.top = top;
        return this;
    }

    /**
     * Distance expressed in px or % between the top-border of the video and the watermark-image.
     * 
     * @return top
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "10px", value = "Distance expressed in px or % between the top-border of the video and the watermark-image.")

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public VideoWatermark left(String left) {
        this.left = left;
        return this;
    }

    /**
     * Distance expressed in px or % between the left-border of the video and the watermark-image.
     * 
     * @return left
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "10px", value = "Distance expressed in px or % between the left-border of the video and the watermark-image.")

    public String getLeft() {
        return left;
    }

    public void setLeft(String left) {
        this.left = left;
    }

    public VideoWatermark bottom(String bottom) {
        this.bottom = bottom;
        return this;
    }

    /**
     * Distance expressed in px or % between the bottom-border of the video and the watermark-image.
     * 
     * @return bottom
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "10px", value = "Distance expressed in px or % between the bottom-border of the video and the watermark-image.")

    public String getBottom() {
        return bottom;
    }

    public void setBottom(String bottom) {
        this.bottom = bottom;
    }

    public VideoWatermark right(String right) {
        this.right = right;
        return this;
    }

    /**
     * Distance expressed in px or % between the right-border of the video and the watermark-image.
     * 
     * @return right
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "10px", value = "Distance expressed in px or % between the right-border of the video and the watermark-image.")

    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right;
    }

    public VideoWatermark width(String width) {
        this.width = width;
        return this;
    }

    /**
     * Width of the watermark-image relative to the video if expressed in %. Otherwise a fixed width. NOTE: To keep
     * intrinsic watermark-image width use &#x60;initial&#x60;.
     * 
     * @return width
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "initial", value = "Width of the watermark-image relative to the video if expressed in %. Otherwise a fixed width. NOTE: To keep intrinsic watermark-image width use `initial`.")

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public VideoWatermark height(String height) {
        this.height = height;
        return this;
    }

    /**
     * Height of the watermark-image relative to the video if expressed in %. Otherwise a fixed height. NOTE: To keep
     * intrinsic watermark-image height use &#x60;initial&#x60;.
     * 
     * @return height
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "initial", value = "Height of the watermark-image relative to the video if expressed in %. Otherwise a fixed height. NOTE: To keep intrinsic watermark-image height use `initial`.")

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public VideoWatermark opacity(String opacity) {
        this.opacity = opacity;
        return this;
    }

    /**
     * Opacity expressed in % only to specify the degree of the watermark-image transparency with the video.
     * 
     * @return opacity
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "70%", value = "Opacity expressed in % only to specify the degree of the watermark-image transparency with the video.")

    public String getOpacity() {
        return opacity;
    }

    public void setOpacity(String opacity) {
        this.opacity = opacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoWatermark videoWatermark = (VideoWatermark) o;
        return Objects.equals(this.id, videoWatermark.id) && Objects.equals(this.top, videoWatermark.top)
                && Objects.equals(this.left, videoWatermark.left) && Objects.equals(this.bottom, videoWatermark.bottom)
                && Objects.equals(this.right, videoWatermark.right) && Objects.equals(this.width, videoWatermark.width)
                && Objects.equals(this.height, videoWatermark.height)
                && Objects.equals(this.opacity, videoWatermark.opacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, top, left, bottom, right, width, height, opacity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoWatermark {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    top: ").append(toIndentedString(top)).append("\n");
        sb.append("    left: ").append(toIndentedString(left)).append("\n");
        sb.append("    bottom: ").append(toIndentedString(bottom)).append("\n");
        sb.append("    right: ").append(toIndentedString(right)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    opacity: ").append(toIndentedString(opacity)).append("\n");
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
