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
import api.video.client.models.AccountQuota;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Account
 */

public class Account implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_QUOTA = "quota";
    @SerializedName(SERIALIZED_NAME_QUOTA)
    private AccountQuota quota;

    public static final String SERIALIZED_NAME_FEATURES = "features";
    @SerializedName(SERIALIZED_NAME_FEATURES)
    private List<String> features = null;

    public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
    @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
    private String environment;

    public Account quota(AccountQuota quota) {
        this.quota = quota;
        return this;
    }

    /**
     * Get quota
     * 
     * @return quota
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public AccountQuota getQuota() {
        return quota;
    }

    public void setQuota(AccountQuota quota) {
        this.quota = quota;
    }

    public Account features(List<String> features) {
        this.features = features;
        return this;
    }

    public Account addFeaturesItem(String featuresItem) {
        if (this.features == null) {
            this.features = new ArrayList<>();
        }
        this.features.add(featuresItem);
        return this;
    }

    /**
     * Deprecated. What features are enabled for your account. Choices include: app.dynamic_metadata - the ability to
     * dynamically tag videos to better segment and understand your audiences, app.event_log - the ability to create and
     * retrieve a log detailing how your videos were interacted with, player.white_label - the ability to customise your
     * player, stats.player_events - the ability to see statistics about how your player is being used,
     * transcode.mp4_support - the ability to reformat content into mp4 using the H264 codec.
     * 
     * @return features
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "[\"app.dynamic_metadata, app.event_log\"]", value = "Deprecated. What features are enabled for your account. Choices include: app.dynamic_metadata - the ability to dynamically tag videos to better segment and understand your audiences, app.event_log - the ability to create and retrieve a log detailing how your videos were interacted with, player.white_label - the ability to customise your player, stats.player_events - the ability to see statistics about how your player is being used, transcode.mp4_support - the ability to reformat content into mp4 using the H264 codec.")

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public Account environment(String environment) {
        this.environment = environment;
        return this;
    }

    /**
     * Deprecated. Whether you are using your production or sandbox API key will impact what environment is displayed
     * here, as well as stats and features information. If you use your sandbox key, the environment is
     * \&quot;sandbox.\&quot; If you use your production key, the environment is \&quot;production.\&quot;
     * 
     * @return environment
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Deprecated. Whether you are using your production or sandbox API key will impact what environment is displayed here, as well as stats and features information. If you use your sandbox key, the environment is \"sandbox.\" If you use your production key, the environment is \"production.\"")

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(this.quota, account.quota) && Objects.equals(this.features, account.features)
                && Objects.equals(this.environment, account.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quota, features, environment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Account {\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    features: ").append(toIndentedString(features)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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
