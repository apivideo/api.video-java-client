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
 * PlayerSessionEvent
 */

public class PlayerSessionEvent implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private String type;

    public static final String SERIALIZED_NAME_EMITTED_AT = "emittedAt";
    @SerializedName(SERIALIZED_NAME_EMITTED_AT)
    private OffsetDateTime emittedAt;

    public static final String SERIALIZED_NAME_AT = "at";
    @SerializedName(SERIALIZED_NAME_AT)
    private Integer at;

    public static final String SERIALIZED_NAME_FROM = "from";
    @SerializedName(SERIALIZED_NAME_FROM)
    private Integer from;

    public static final String SERIALIZED_NAME_TO = "to";
    @SerializedName(SERIALIZED_NAME_TO)
    private Integer to;

    public PlayerSessionEvent type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Possible values are: ready, play, pause, resume, seek.backward, seek.forward, end
     * 
     * @return type
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "play", value = "Possible values are: ready, play, pause, resume, seek.backward, seek.forward, end")

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PlayerSessionEvent emittedAt(OffsetDateTime emittedAt) {
        this.emittedAt = emittedAt;
        return this;
    }

    /**
     * When an event occurred, presented in ISO-8601 format.
     * 
     * @return emittedAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "2019-06-24T11:45:01.109Z", value = "When an event occurred, presented in ISO-8601 format.")

    public OffsetDateTime getEmittedAt() {
        return emittedAt;
    }

    public void setEmittedAt(OffsetDateTime emittedAt) {
        this.emittedAt = emittedAt;
    }

    public PlayerSessionEvent at(Integer at) {
        this.at = at;
        return this;
    }

    /**
     * Get at
     * 
     * @return at
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getAt() {
        return at;
    }

    public void setAt(Integer at) {
        this.at = at;
    }

    public PlayerSessionEvent from(Integer from) {
        this.from = from;
        return this;
    }

    /**
     * Get from
     * 
     * @return from
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public PlayerSessionEvent to(Integer to) {
        this.to = to;
        return this;
    }

    /**
     * Get to
     * 
     * @return to
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getTo() {
        return to;
    }

    public void setTo(Integer to) {
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
        PlayerSessionEvent playerSessionEvent = (PlayerSessionEvent) o;
        return Objects.equals(this.type, playerSessionEvent.type)
                && Objects.equals(this.emittedAt, playerSessionEvent.emittedAt)
                && Objects.equals(this.at, playerSessionEvent.at) && Objects.equals(this.from, playerSessionEvent.from)
                && Objects.equals(this.to, playerSessionEvent.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, emittedAt, at, from, to);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlayerSessionEvent {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    emittedAt: ").append(toIndentedString(emittedAt)).append("\n");
        sb.append("    at: ").append(toIndentedString(at)).append("\n");
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
