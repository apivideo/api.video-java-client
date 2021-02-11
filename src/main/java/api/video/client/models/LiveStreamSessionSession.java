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
 * LiveStreamSessionSession
 */

public class LiveStreamSessionSession implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_SESSION_ID = "sessionId";
    @SerializedName(SERIALIZED_NAME_SESSION_ID)
    private String sessionId;

    public static final String SERIALIZED_NAME_LOADED_AT = "loadedAt";
    @SerializedName(SERIALIZED_NAME_LOADED_AT)
    private OffsetDateTime loadedAt;

    public static final String SERIALIZED_NAME_ENDED_AT = "endedAt";
    @SerializedName(SERIALIZED_NAME_ENDED_AT)
    private OffsetDateTime endedAt;

    public LiveStreamSessionSession sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * A unique identifier for your session. You can use this to track what happens during a specific session.
     * 
     * @return sessionId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "A unique identifier for your session. You can use this to track what happens during a specific session.")

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public LiveStreamSessionSession loadedAt(OffsetDateTime loadedAt) {
        this.loadedAt = loadedAt;
        return this;
    }

    /**
     * When the session started, with the date and time presented in ISO-8601 format.
     * 
     * @return loadedAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "2019-06-24T11:45:01.109Z", value = "When the session started, with the date and time presented in ISO-8601 format.")

    public OffsetDateTime getLoadedAt() {
        return loadedAt;
    }

    public void setLoadedAt(OffsetDateTime loadedAt) {
        this.loadedAt = loadedAt;
    }

    public LiveStreamSessionSession endedAt(OffsetDateTime endedAt) {
        this.endedAt = endedAt;
        return this;
    }

    /**
     * When the session ended, with the date and time presented in ISO-8601 format.
     * 
     * @return endedAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "2019-06-24T12:45:01.109Z", value = "When the session ended, with the date and time presented in ISO-8601 format.")

    public OffsetDateTime getEndedAt() {
        return endedAt;
    }

    public void setEndedAt(OffsetDateTime endedAt) {
        this.endedAt = endedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LiveStreamSessionSession liveStreamSessionSession = (LiveStreamSessionSession) o;
        return Objects.equals(this.sessionId, liveStreamSessionSession.sessionId)
                && Objects.equals(this.loadedAt, liveStreamSessionSession.loadedAt)
                && Objects.equals(this.endedAt, liveStreamSessionSession.endedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionId, loadedAt, endedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveStreamSessionSession {\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    loadedAt: ").append(toIndentedString(loadedAt)).append("\n");
        sb.append("    endedAt: ").append(toIndentedString(endedAt)).append("\n");
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
