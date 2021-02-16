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
 * The location of the viewer of the live stream.
 */
@ApiModel(description = "The location of the viewer of the live stream.")

public class LiveStreamSessionLocation implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_COUNTRY = "country";
    @SerializedName(SERIALIZED_NAME_COUNTRY)
    private String country;

    public static final String SERIALIZED_NAME_CITY = "city";
    @SerializedName(SERIALIZED_NAME_CITY)
    private String city;

    public LiveStreamSessionLocation country(String country) {
        this.country = country;
        return this;
    }

    /**
     * The country of the viewer of the live stream.
     * 
     * @return country
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "France", value = "The country of the viewer of the live stream.")

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LiveStreamSessionLocation city(String city) {
        this.city = city;
        return this;
    }

    /**
     * The city of the viewer of the live stream.
     * 
     * @return city
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "Paris", value = "The city of the viewer of the live stream.")

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LiveStreamSessionLocation liveStreamSessionLocation = (LiveStreamSessionLocation) o;
        return Objects.equals(this.country, liveStreamSessionLocation.country)
                && Objects.equals(this.city, liveStreamSessionLocation.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveStreamSessionLocation {\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
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
