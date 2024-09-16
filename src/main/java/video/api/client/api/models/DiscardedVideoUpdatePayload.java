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
 * DiscardedVideoUpdatePayload
 */

public class DiscardedVideoUpdatePayload implements Serializable, DeepObject {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DISCARDED = "discarded";
    @SerializedName(SERIALIZED_NAME_DISCARDED)
    private Boolean discarded;

    public DiscardedVideoUpdatePayload discarded(Boolean discarded) {
        this.discarded = discarded;
        return this;
    }

    /**
     * Use this parameter to restore a discarded video when you have the Video Restore feature enabled. This parameter
     * only accepts &#x60;false&#x60; as a value!
     * 
     * @return discarded
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Use this parameter to restore a discarded video when you have the Video Restore feature enabled. This parameter only accepts `false` as a value!")

    public Boolean getDiscarded() {
        return discarded;
    }

    public void setDiscarded(Boolean discarded) {
        this.discarded = discarded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiscardedVideoUpdatePayload discardedVideoUpdatePayload = (DiscardedVideoUpdatePayload) o;
        return Objects.equals(this.discarded, discardedVideoUpdatePayload.discarded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discarded);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiscardedVideoUpdatePayload {\n");
        sb.append("    discarded: ").append(toIndentedString(discarded)).append("\n");
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
