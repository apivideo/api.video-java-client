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
import api.video.client.models.Pagination;
import api.video.client.models.VideoSession;
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
 * RawStatisticsListSessionsResponse
 */

public class RawStatisticsListSessionsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DATA = "data";
    @SerializedName(SERIALIZED_NAME_DATA)
    private List<VideoSession> data = null;

    public static final String SERIALIZED_NAME_PAGINATION = "pagination";
    @SerializedName(SERIALIZED_NAME_PAGINATION)
    private Pagination pagination;

    public RawStatisticsListSessionsResponse data(List<VideoSession> data) {
        this.data = data;
        return this;
    }

    public RawStatisticsListSessionsResponse addDataItem(VideoSession dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     * 
     * @return data
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<VideoSession> getData() {
        return data;
    }

    public void setData(List<VideoSession> data) {
        this.data = data;
    }

    public RawStatisticsListSessionsResponse pagination(Pagination pagination) {
        this.pagination = pagination;
        return this;
    }

    /**
     * Get pagination
     * 
     * @return pagination
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RawStatisticsListSessionsResponse rawStatisticsListSessionsResponse = (RawStatisticsListSessionsResponse) o;
        return Objects.equals(this.data, rawStatisticsListSessionsResponse.data)
                && Objects.equals(this.pagination, rawStatisticsListSessionsResponse.pagination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, pagination);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RawStatisticsListSessionsResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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
