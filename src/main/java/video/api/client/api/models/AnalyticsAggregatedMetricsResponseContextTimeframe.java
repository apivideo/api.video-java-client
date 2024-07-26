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
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * Returns the starting and ending date-times of the period you want analytics for.
 */
@ApiModel(description = "Returns the starting and ending date-times of the period you want analytics for.")

public class AnalyticsAggregatedMetricsResponseContextTimeframe implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_FROM = "from";
    @SerializedName(SERIALIZED_NAME_FROM)
    private OffsetDateTime from;

    public static final String SERIALIZED_NAME_TO = "to";
    @SerializedName(SERIALIZED_NAME_TO)
    private OffsetDateTime to;

    public AnalyticsAggregatedMetricsResponseContextTimeframe from(OffsetDateTime from) {
        this.from = from;
        return this;
    }

    /**
     * Returns the starting date-time of the period you want analytics for in ATOM date-time format.
     * 
     * @return from
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "2024-05-28T11:15:07Z", value = "Returns the starting date-time of the period you want analytics for in ATOM date-time format.")

    public OffsetDateTime getFrom() {
        return from;
    }

    public void setFrom(OffsetDateTime from) {
        this.from = from;
    }

    public AnalyticsAggregatedMetricsResponseContextTimeframe to(OffsetDateTime to) {
        this.to = to;
        return this;
    }

    /**
     * Returns the starting date-time of the period you want analytics for in ATOM date-time format.
     * 
     * @return to
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "2024-05-29T11:15:07Z", value = "Returns the starting date-time of the period you want analytics for in ATOM date-time format.")

    public OffsetDateTime getTo() {
        return to;
    }

    public void setTo(OffsetDateTime to) {
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnalyticsAggregatedMetricsResponseContextTimeframe analyticsAggregatedMetricsResponseContextTimeframe = (AnalyticsAggregatedMetricsResponseContextTimeframe) o;
        return Objects.equals(this.from, analyticsAggregatedMetricsResponseContextTimeframe.from)
                && Objects.equals(this.to, analyticsAggregatedMetricsResponseContextTimeframe.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnalyticsAggregatedMetricsResponseContextTimeframe {\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
