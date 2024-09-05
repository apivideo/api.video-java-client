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
 * AnalyticsMetricsBreakdownResponseData
 */

public class AnalyticsMetricsBreakdownResponseData implements Serializable, DeepObject {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DIMENSION_VALUE = "dimensionValue";
    @SerializedName(SERIALIZED_NAME_DIMENSION_VALUE)
    private String dimensionValue;

    public static final String SERIALIZED_NAME_METRIC_VALUE = "metricValue";
    @SerializedName(SERIALIZED_NAME_METRIC_VALUE)
    private Float metricValue;

    public AnalyticsMetricsBreakdownResponseData dimensionValue(String dimensionValue) {
        this.dimensionValue = dimensionValue;
        return this;
    }

    /**
     * Returns a specific value for the dimension you selected, based on the data. For example if you select
     * &#x60;continent&#x60; as a dimension, then &#x60;dimensionValue&#x60; returns values like &#x60;EU&#x60; or
     * \&quot;AZ\&quot;.
     * 
     * @return dimensionValue
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Returns a specific value for the dimension you selected, based on the data. For example if you select `continent` as a dimension, then `dimensionValue` returns values like `EU` or \"AZ\".")

    public String getDimensionValue() {
        return dimensionValue;
    }

    public void setDimensionValue(String dimensionValue) {
        this.dimensionValue = dimensionValue;
    }

    public AnalyticsMetricsBreakdownResponseData metricValue(Float metricValue) {
        this.metricValue = metricValue;
        return this;
    }

    /**
     * Returns the data for a specific dimension value.
     * 
     * @return metricValue
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Returns the data for a specific dimension value.")

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
        AnalyticsMetricsBreakdownResponseData analyticsMetricsBreakdownResponseData = (AnalyticsMetricsBreakdownResponseData) o;
        return Objects.equals(this.dimensionValue, analyticsMetricsBreakdownResponseData.dimensionValue)
                && Objects.equals(this.metricValue, analyticsMetricsBreakdownResponseData.metricValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dimensionValue, metricValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnalyticsMetricsBreakdownResponseData {\n");
        sb.append("    dimensionValue: ").append(toIndentedString(dimensionValue)).append("\n");
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
