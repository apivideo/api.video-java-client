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
import java.math.BigDecimal;
import java.io.Serializable;

/**
 * Deprecated
 */
@ApiModel(description = "Deprecated")

public class AccountQuota implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_QUOTA_USED = "quotaUsed";
    @SerializedName(SERIALIZED_NAME_QUOTA_USED)
    private BigDecimal quotaUsed;

    public static final String SERIALIZED_NAME_QUOTA_REMAINING = "quotaRemaining";
    @SerializedName(SERIALIZED_NAME_QUOTA_REMAINING)
    private BigDecimal quotaRemaining;

    public static final String SERIALIZED_NAME_QUOTA_TOTAL = "quotaTotal";
    @SerializedName(SERIALIZED_NAME_QUOTA_TOTAL)
    private BigDecimal quotaTotal;

    public AccountQuota quotaUsed(BigDecimal quotaUsed) {
        this.quotaUsed = quotaUsed;
        return this;
    }

    /**
     * Deprecated
     * 
     * @return quotaUsed
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Deprecated")

    public BigDecimal getQuotaUsed() {
        return quotaUsed;
    }

    public void setQuotaUsed(BigDecimal quotaUsed) {
        this.quotaUsed = quotaUsed;
    }

    public AccountQuota quotaRemaining(BigDecimal quotaRemaining) {
        this.quotaRemaining = quotaRemaining;
        return this;
    }

    /**
     * Deprecated
     * 
     * @return quotaRemaining
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Deprecated")

    public BigDecimal getQuotaRemaining() {
        return quotaRemaining;
    }

    public void setQuotaRemaining(BigDecimal quotaRemaining) {
        this.quotaRemaining = quotaRemaining;
    }

    public AccountQuota quotaTotal(BigDecimal quotaTotal) {
        this.quotaTotal = quotaTotal;
        return this;
    }

    /**
     * Deprecated
     * 
     * @return quotaTotal
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Deprecated")

    public BigDecimal getQuotaTotal() {
        return quotaTotal;
    }

    public void setQuotaTotal(BigDecimal quotaTotal) {
        this.quotaTotal = quotaTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountQuota accountQuota = (AccountQuota) o;
        return Objects.equals(this.quotaUsed, accountQuota.quotaUsed)
                && Objects.equals(this.quotaRemaining, accountQuota.quotaRemaining)
                && Objects.equals(this.quotaTotal, accountQuota.quotaTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotaUsed, quotaRemaining, quotaTotal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountQuota {\n");
        sb.append("    quotaUsed: ").append(toIndentedString(quotaUsed)).append("\n");
        sb.append("    quotaRemaining: ").append(toIndentedString(quotaRemaining)).append("\n");
        sb.append("    quotaTotal: ").append(toIndentedString(quotaTotal)).append("\n");
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
