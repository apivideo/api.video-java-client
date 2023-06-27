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
 * Model403ErrorSchema
 */

public class Model403ErrorSchema implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private String type;

    public static final String SERIALIZED_NAME_TITLE = "title";
    @SerializedName(SERIALIZED_NAME_TITLE)
    private String title;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_STATUS = "status";
    @SerializedName(SERIALIZED_NAME_STATUS)
    private Integer status;

    public Model403ErrorSchema type(String type) {
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

    public Model403ErrorSchema title(String title) {
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

    public Model403ErrorSchema name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the parameter that caused the error.
     * 
     * @return name
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The name of the parameter that caused the error.")

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Model403ErrorSchema status(Integer status) {
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
        Model403ErrorSchema _403errorSchema = (Model403ErrorSchema) o;
        return Objects.equals(this.type, _403errorSchema.type) && Objects.equals(this.title, _403errorSchema.title)
                && Objects.equals(this.name, _403errorSchema.name)
                && Objects.equals(this.status, _403errorSchema.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, title, name, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Model403ErrorSchema {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
