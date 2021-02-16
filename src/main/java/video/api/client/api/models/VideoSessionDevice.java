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
import java.io.Serializable;

/**
 * What type of device the user is on when in the video session.
 */
@ApiModel(description = "What type of device the user is on when in the video session.")

public class VideoSessionDevice implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private String type;

    public static final String SERIALIZED_NAME_VENDOR = "vendor";
    @SerializedName(SERIALIZED_NAME_VENDOR)
    private String vendor;

    public static final String SERIALIZED_NAME_MODEL = "model";
    @SerializedName(SERIALIZED_NAME_MODEL)
    private String model;

    public VideoSessionDevice type(String type) {
        this.type = type;
        return this;
    }

    /**
     * What the type is like desktop, laptop, mobile.
     * 
     * @return type
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "desktop", value = "What the type is like desktop, laptop, mobile.")

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public VideoSessionDevice vendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * If known, what the brand of the device is, like Apple, Dell, etc.
     * 
     * @return vendor
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "Dell", value = "If known, what the brand of the device is, like Apple, Dell, etc.")

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public VideoSessionDevice model(String model) {
        this.model = model;
        return this;
    }

    /**
     * The specific model of the device, if known.
     * 
     * @return model
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "unknown", value = "The specific model of the device, if known.")

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoSessionDevice videoSessionDevice = (VideoSessionDevice) o;
        return Objects.equals(this.type, videoSessionDevice.type)
                && Objects.equals(this.vendor, videoSessionDevice.vendor)
                && Objects.equals(this.model, videoSessionDevice.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, vendor, model);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoSessionDevice {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
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
