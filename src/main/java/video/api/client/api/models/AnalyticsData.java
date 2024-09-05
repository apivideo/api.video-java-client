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
 * AnalyticsData
 */

public class AnalyticsData implements Serializable, DeepObject {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_VALUE = "value";
    @SerializedName(SERIALIZED_NAME_VALUE)
    private String value;

    public static final String SERIALIZED_NAME_PLAYS = "plays";
    @SerializedName(SERIALIZED_NAME_PLAYS)
    private Integer plays;

    public AnalyticsData value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Shows a value for the property you have specified for &#x60;dimension&#x60; in your request. For example, if you
     * requested &#x60;dimension&#x3D;videoId&#x60;, each &#x60;value&#x60; field in the response returns a different
     * videoId.
     * 
     * @return value
     **/
    @ApiModelProperty(example = "vi3q7HxhApxRF1c8F8r6VeaI", required = true, value = "Shows a value for the property you have specified for `dimension` in your request. For example, if you requested `dimension=videoId`, each `value` field in the response returns a different videoId.")

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public AnalyticsData plays(Integer plays) {
        this.plays = plays;
        return this;
    }

    /**
     * Shows the number of play events for one specific &#x60;value&#x60;.
     * 
     * @return plays
     **/
    @ApiModelProperty(example = "100", required = true, value = "Shows the number of play events for one specific `value`.")

    public Integer getPlays() {
        return plays;
    }

    public void setPlays(Integer plays) {
        this.plays = plays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnalyticsData analyticsData = (AnalyticsData) o;
        return Objects.equals(this.value, analyticsData.value) && Objects.equals(this.plays, analyticsData.plays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, plays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnalyticsData {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    plays: ").append(toIndentedString(plays)).append("\n");
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
