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
import video.api.client.api.models.AnalyticsAggregatedMetricsResponseContext;
import java.io.Serializable;

/**
 * AnalyticsAggregatedMetricsResponse
 */

public class AnalyticsAggregatedMetricsResponse implements Serializable, DeepObject {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CONTEXT = "context";
    @SerializedName(SERIALIZED_NAME_CONTEXT)
    private AnalyticsAggregatedMetricsResponseContext context;

    public static final String SERIALIZED_NAME_DATA = "data";
    @SerializedName(SERIALIZED_NAME_DATA)
    private Float data;

    public AnalyticsAggregatedMetricsResponse context(AnalyticsAggregatedMetricsResponseContext context) {
        this.context = context;
        return this;
    }

    /**
     * Get context
     * 
     * @return context
     **/
    @ApiModelProperty(required = true, value = "")

    public AnalyticsAggregatedMetricsResponseContext getContext() {
        return context;
    }

    public void setContext(AnalyticsAggregatedMetricsResponseContext context) {
        this.context = context;
    }

    public AnalyticsAggregatedMetricsResponse data(Float data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     * 
     * @return data
     **/
    @ApiModelProperty(example = "356.2", required = true, value = "")

    public Float getData() {
        return data;
    }

    public void setData(Float data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnalyticsAggregatedMetricsResponse analyticsAggregatedMetricsResponse = (AnalyticsAggregatedMetricsResponse) o;
        return Objects.equals(this.context, analyticsAggregatedMetricsResponse.context)
                && Objects.equals(this.data, analyticsAggregatedMetricsResponse.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(context, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnalyticsAggregatedMetricsResponse {\n");
        sb.append("    context: ").append(toIndentedString(context)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
