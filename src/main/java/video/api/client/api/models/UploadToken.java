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
 * UploadToken
 */

public class UploadToken implements Serializable, DeepObject {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_TOKEN = "token";
    @SerializedName(SERIALIZED_NAME_TOKEN)
    private String token;

    public static final String SERIALIZED_NAME_TTL = "ttl";
    @SerializedName(SERIALIZED_NAME_TTL)
    private Integer ttl;

    public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private OffsetDateTime createdAt;

    public static final String SERIALIZED_NAME_EXPIRES_AT = "expiresAt";
    @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
    private OffsetDateTime expiresAt;

    public UploadToken token(String token) {
        this.token = token;
        return this;
    }

    /**
     * The unique identifier for the token you will use to authenticate an upload.
     * 
     * @return token
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "to1tcmSFHeYY5KzyhOqVKMKb", value = "The unique identifier for the token you will use to authenticate an upload.")

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public UploadToken ttl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * Time-to-live - how long the upload token is valid for. minimum: 0 maximum: 2147483647
     * 
     * @return ttl
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Time-to-live - how long the upload token is valid for.")

    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public UploadToken createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * When the token was created, displayed in ISO-8601 format.
     * 
     * @return createdAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "2019-12-16T08:25:51Z", value = "When the token was created, displayed in ISO-8601 format.")

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public UploadToken expiresAt(OffsetDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * When the token expires, displayed in ISO-8601 format.
     * 
     * @return expiresAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "2019-12-16T09:25:51Z", value = "When the token expires, displayed in ISO-8601 format.")

    public OffsetDateTime getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(OffsetDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadToken uploadToken = (UploadToken) o;
        return Objects.equals(this.token, uploadToken.token) && Objects.equals(this.ttl, uploadToken.ttl)
                && Objects.equals(this.createdAt, uploadToken.createdAt)
                && Objects.equals(this.expiresAt, uploadToken.expiresAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, ttl, createdAt, expiresAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadToken {\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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
