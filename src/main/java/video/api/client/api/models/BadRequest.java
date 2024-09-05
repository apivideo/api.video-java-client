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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import video.api.client.api.models.AdditionalBadRequestErrors;
import java.io.Serializable;

/**
 * BadRequest
 */

public class BadRequest implements Serializable, DeepObject {
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

    public static final String SERIALIZED_NAME_PROBLEMS = "problems";
    @SerializedName(SERIALIZED_NAME_PROBLEMS)
    private Set<AdditionalBadRequestErrors> problems = null;

    public BadRequest type(String type) {
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

    public BadRequest title(String title) {
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

    public BadRequest name(String name) {
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

    public BadRequest status(Integer status) {
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

    public BadRequest problems(Set<AdditionalBadRequestErrors> problems) {
        this.problems = problems;
        return this;
    }

    public BadRequest addProblemsItem(AdditionalBadRequestErrors problemsItem) {
        if (this.problems == null) {
            this.problems = new LinkedHashSet<>();
        }
        this.problems.add(problemsItem);
        return this;
    }

    /**
     * Returns any additional problems in the request in an array of objects.
     * 
     * @return problems
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Returns any additional problems in the request in an array of objects.")

    public Set<AdditionalBadRequestErrors> getProblems() {
        return problems;
    }

    public void setProblems(Set<AdditionalBadRequestErrors> problems) {
        this.problems = problems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BadRequest badRequest = (BadRequest) o;
        return Objects.equals(this.type, badRequest.type) && Objects.equals(this.title, badRequest.title)
                && Objects.equals(this.name, badRequest.name) && Objects.equals(this.status, badRequest.status)
                && Objects.equals(this.problems, badRequest.problems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, title, name, status, problems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BadRequest {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    problems: ").append(toIndentedString(problems)).append("\n");
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
