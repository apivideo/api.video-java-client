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
 * AnalyticsMetricsOverTimeResponseData
 */

public class AnalyticsMetricsOverTimeResponseData implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_EMITTED_AT = "emittedAt";
    @SerializedName(SERIALIZED_NAME_EMITTED_AT)
    private String emittedAt;

    public static final String SERIALIZED_NAME_METRIC_VALUE = "metricValue";
    @SerializedName(SERIALIZED_NAME_METRIC_VALUE)
    private Float metricValue;

    public AnalyticsMetricsOverTimeResponseData emittedAt(String emittedAt) {
        this.emittedAt = emittedAt;
        return this;
    }

    /**
     * Returns the timestamp of the event that belongs to a specific metric in ATOM date-time format. For example, if
     * you set &#x60;play&#x60; with an &#x60;hour&#x60; interval in your request, then &#x60;emittedAt&#x60; returns
     * the hourly timestamps of every play event within the timeframe you defined.
     * 
     * @return emittedAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Returns the timestamp of the event that belongs to a specific metric in ATOM date-time format. For example, if you set `play` with an `hour` interval in your request, then `emittedAt` returns the hourly timestamps of every play event within the timeframe you defined.")

    public String getEmittedAt() {
        return emittedAt;
    }

    public void setEmittedAt(String emittedAt) {
        this.emittedAt = emittedAt;
    }

    public AnalyticsMetricsOverTimeResponseData metricValue(Float metricValue) {
        this.metricValue = metricValue;
        return this;
    }

    /**
     * Returns the data for a specific metric value.
     * 
     * @return metricValue
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Returns the data for a specific metric value.")

    public Float getMetricValue() {
        return metricValue;
    }

    public void setMetricValue(Float metricValue) {
        this.metricValue = metricValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnalyticsMetricsOverTimeResponseData analyticsMetricsOverTimeResponseData = (AnalyticsMetricsOverTimeResponseData) o;
        return Objects.equals(this.emittedAt, analyticsMetricsOverTimeResponseData.emittedAt)
                && Objects.equals(this.metricValue, analyticsMetricsOverTimeResponseData.metricValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emittedAt, metricValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnalyticsMetricsOverTimeResponseData {\n");
        sb.append("    emittedAt: ").append(toIndentedString(emittedAt)).append("\n");
        sb.append("    metricValue: ").append(toIndentedString(metricValue)).append("\n");
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
