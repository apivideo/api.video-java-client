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
 * AccessToken
 */

public class AccessToken implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
    @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
    private String accessToken;

    public static final String SERIALIZED_NAME_TOKEN_TYPE = "token_type";
    @SerializedName(SERIALIZED_NAME_TOKEN_TYPE)
    private String tokenType = "bearer";

    public static final String SERIALIZED_NAME_REFRESH_TOKEN = "refresh_token";
    @SerializedName(SERIALIZED_NAME_REFRESH_TOKEN)
    private String refreshToken;

    public static final String SERIALIZED_NAME_EXPIRES_IN = "expires_in";
    @SerializedName(SERIALIZED_NAME_EXPIRES_IN)
    private Integer expiresIn;

    public AccessToken accessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * The access token containing security credentials allowing you to acccess the API. The token lasts for one hour.
     * 
     * @return accessToken
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjUyZWM4NWUyMjFkODZjOWI0NDQ5NzBhMjQwMzUyOWQ4MDQyNGQ3ZmJjYjFlYWM2MjVlM2VkMjI2YWRlNTcxMDY2NDUyZDc0NjdhN2E4NjI0In0.eyJhdWQiOiJsaWJjYXN0IiwianRpIjoiNTJlYzg1ZTIyMWQ4NmM5YjQ0NDk3MGEyNDAzNTI5ZDgwNDI0ZDdmYmNiMWVhYzYyNWUzZWQyMjZhZGU1NzEwNjY0NTJkNzQ2N2E3YTg2MjQiLCJpYXQiOjE1MjUyNzYxNDcsIm5iZiI6MTUyNTI3NjE0NywiZXhwIjoxNTI1Mjc5NzQ3LCJzdWIiOiJ1c01vbml0b3IiLCJzY29wZXMiOlsibW9uaXRvci5saWJjYXN0LmNvbSJdLCJjb250ZXh0Ijp7InVzZXIiOiJ1c01vbml0b3IiLCJwcm9qZWN0IjoicHJNb25pdG9yIiwibWVtYmVyIjoibWVNb25pdG9yIn19.rUvishDNyJLNlI4W5VmguNecm5KD2uZgPkKJQbaqw-cJbSrVxkSbiKYtk_E3cz3WT7-IS2yFTsYN3uIo5Rbit8_HftweyEp2bdBRI8yjR6oZZ1sNJJXswISN1i2kk4r-aaxu7Xxf_LtsjOMUj_YZsvcc2nqBXPKjHbJCJryx3DDJaIcymOqao7nhQaCCQyrQooAXNTYs4E9fWN1dC_x2O-zok5TuG-xhEW-umwxfSUMWNgSTkz38ACceQ0PCJSgB3jqjDH4MwC7B3ppEPZuK5E6JhKeyRlalswRyYq3UQPnVeMTam7YQHsuTgbehF6WySW8i44o7V_MCe9hjPdp-WA", value = "The access token containing security credentials allowing you to acccess the API. The token lasts for one hour.")

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public AccessToken tokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    /**
     * The type of token you have.
     * 
     * @return tokenType
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The type of token you have.")

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public AccessToken refreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * A token you can use to get the next access token when your current access token expires.
     * 
     * @return refreshToken
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "def50200a28d88fb9aaa921be78eeb5604b071101a334899a7d5fc7492cf8ea752962ddc8961fe5c126101d4ecacd980396eb2fd494995b812dffcb98256c4277f790d1f658fc2d2e34f350740544e5232d69d68d34c648271d706c5e7049adac0b1832d0fdf71809715cc7e97fa63f65966deadb501a55ff469b0fd23a637cb6acbe9d9b8594a17f09efc2efeed82984764a0065d5e29c950c7b081a61ba2aaa192be3085c400ee37eac50fa9320ce2cfe8916c8165418d23e9f91b6a5c8515e1d74ee193a5a1ca01954fbff27361c20184240be2359e0afbed0bf1c762cf872450b5e8b5d4704f4fd9583e4470adc98409dd42965709712806bd9019378a72eea0b4912ce684ffd833db5806ab84174f905db2a75380071d004615c944bb8f8c4045cce7234c2be9a2330522cf7f067b8e58f57cffb6edb4b7ef91313e12bcde47e5e76ceee7fa52990132288f345d33ed917ae4fd54b7284f8964d898e97e1ee3bc4157f75d7fee63976e4be66ac1ec32ef74afa533f0eb593523f226cbec57d196ac8962", value = "A token you can use to get the next access token when your current access token expires.")

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public AccessToken expiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    /**
     * Lists the time in seconds when your access token expires. It lasts for one hour.
     * 
     * @return expiresIn
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Lists the time in seconds when your access token expires. It lasts for one hour.")

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccessToken accessToken = (AccessToken) o;
        return Objects.equals(this.accessToken, accessToken.accessToken)
                && Objects.equals(this.tokenType, accessToken.tokenType)
                && Objects.equals(this.refreshToken, accessToken.refreshToken)
                && Objects.equals(this.expiresIn, accessToken.expiresIn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessToken, tokenType, refreshToken, expiresIn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessToken {\n");
        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
        sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
        sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
        sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
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
