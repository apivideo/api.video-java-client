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
import java.util.ArrayList;
import java.util.List;
import video.api.client.api.models.LiveStreamSession;
import video.api.client.api.models.Pagination;
import java.io.Serializable;

/**
 * RawStatisticsListLiveStreamAnalyticsResponse
 */

public class RawStatisticsListLiveStreamAnalyticsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DATA = "data";
    @SerializedName(SERIALIZED_NAME_DATA)
    private List<LiveStreamSession> data = null;

    public static final String SERIALIZED_NAME_PAGINATION = "pagination";
    @SerializedName(SERIALIZED_NAME_PAGINATION)
    private Pagination pagination;

    public RawStatisticsListLiveStreamAnalyticsResponse data(List<LiveStreamSession> data) {
        this.data = data;
        return this;
    }

    public RawStatisticsListLiveStreamAnalyticsResponse addDataItem(LiveStreamSession dataItem) {
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

    public List<LiveStreamSession> getData() {
        return data;
    }

    public void setData(List<LiveStreamSession> data) {
        this.data = data;
    }

    public RawStatisticsListLiveStreamAnalyticsResponse pagination(Pagination pagination) {
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
        RawStatisticsListLiveStreamAnalyticsResponse rawStatisticsListLiveStreamAnalyticsResponse = (RawStatisticsListLiveStreamAnalyticsResponse) o;
        return Objects.equals(this.data, rawStatisticsListLiveStreamAnalyticsResponse.data)
                && Objects.equals(this.pagination, rawStatisticsListLiveStreamAnalyticsResponse.pagination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, pagination);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RawStatisticsListLiveStreamAnalyticsResponse {\n");
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
