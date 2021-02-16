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

package video.api.client.models;

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
 * RefreshTokenPayload
 */

public class RefreshTokenPayload implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_REFRESH_TOKEN = "refreshToken";
    @SerializedName(SERIALIZED_NAME_REFRESH_TOKEN)
    private String refreshToken;

    public RefreshTokenPayload refreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * The refresh token is either the first refresh token you received when you authenticated with the auth/api-key
     * endpoint, or it&#39;s the refresh token from the last time you used the auth/refresh endpoint. Place this in the
     * body of your request to obtain a new access token (which is valid for an hour) and a new refresh token.
     * 
     * @return refreshToken
     **/
    @ApiModelProperty(required = true, value = "The refresh token is either the first refresh token you received when you authenticated with the auth/api-key endpoint, or it's the refresh token from the last time you used the auth/refresh endpoint. Place this in the body of your request to obtain a new access token (which is valid for an hour) and a new refresh token. ")

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RefreshTokenPayload refreshTokenPayload = (RefreshTokenPayload) o;
        return Objects.equals(this.refreshToken, refreshTokenPayload.refreshToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refreshToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RefreshTokenPayload {\n");
        sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
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
