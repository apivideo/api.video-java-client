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
 * TooManyRequests
 */

public class TooManyRequests implements Serializable, DeepObject {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private String type;

    public static final String SERIALIZED_NAME_TITLE = "title";
    @SerializedName(SERIALIZED_NAME_TITLE)
    private String title;

    public static final String SERIALIZED_NAME_STATUS = "status";
    @SerializedName(SERIALIZED_NAME_STATUS)
    private Integer status;

    public TooManyRequests type(String type) {
        this.type = type;
        return this;
    }

    /**
     * A link to the error documentation.
     * 
     * @return type
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "A link to the error documentation.")

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TooManyRequests title(String title) {
        this.title = title;
        return this;
    }

    /**
     * A description of the error that occurred.
     * 
     * @return title
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "A description of the error that occurred.")

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TooManyRequests status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * The HTTP status code.
     * 
     * @return status
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The HTTP status code.")

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TooManyRequests tooManyRequests = (TooManyRequests) o;
        return Objects.equals(this.type, tooManyRequests.type) && Objects.equals(this.title, tooManyRequests.title)
                && Objects.equals(this.status, tooManyRequests.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, title, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TooManyRequests {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
