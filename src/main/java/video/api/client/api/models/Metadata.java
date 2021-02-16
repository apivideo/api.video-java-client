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
 * Metadata
 */

public class Metadata implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_KEY = "key";
    @SerializedName(SERIALIZED_NAME_KEY)
    private String key;

    public static final String SERIALIZED_NAME_VALUE = "value";
    @SerializedName(SERIALIZED_NAME_VALUE)
    private String value;

    public Metadata(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public Metadata key(String key) {
        this.key = key;
        return this;
    }

    /**
     * The constant that defines the data set.
     * 
     * @return key
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "Color", value = "The constant that defines the data set.")

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Metadata value(String value) {
        this.value = value;
        return this;
    }

    /**
     * A variable which belongs to the data set.
     * 
     * @return value
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "Green", value = "A variable which belongs to the data set.")

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Metadata metadata = (Metadata) o;
        return Objects.equals(this.key, metadata.key) && Objects.equals(this.value, metadata.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Metadata {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
