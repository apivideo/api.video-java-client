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
 * TokenCreatePayload
 */

public class TokenCreatePayload implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_TTL = "ttl";
    @SerializedName(SERIALIZED_NAME_TTL)
    private Integer ttl = 0;

    public TokenCreatePayload ttl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * Time in seconds that the token will be active. A value of 0 means that the token has no exipration date. The
     * default is to have no expiration. minimum: 0 maximum: 2147483647
     * 
     * @return ttl
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Time in seconds that the token will be active. A value of 0 means that the token has no exipration date. The default is to have no expiration.")

    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TokenCreatePayload tokenCreatePayload = (TokenCreatePayload) o;
        return Objects.equals(this.ttl, tokenCreatePayload.ttl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ttl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TokenCreatePayload {\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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
