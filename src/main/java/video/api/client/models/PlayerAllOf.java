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
import java.time.OffsetDateTime;
import video.api.client.models.PlayerAllOfAssets;
import java.io.Serializable;

/**
 * PlayerAllOf
 */

public class PlayerAllOf implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_PLAYER_ID = "playerId";
    @SerializedName(SERIALIZED_NAME_PLAYER_ID)
    private String playerId;

    public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private OffsetDateTime createdAt;

    public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    private OffsetDateTime updatedAt;

    public static final String SERIALIZED_NAME_SHAPE_MARGIN = "shapeMargin";
    @SerializedName(SERIALIZED_NAME_SHAPE_MARGIN)
    private Integer shapeMargin;

    public static final String SERIALIZED_NAME_SHAPE_RADIUS = "shapeRadius";
    @SerializedName(SERIALIZED_NAME_SHAPE_RADIUS)
    private Integer shapeRadius;

    public static final String SERIALIZED_NAME_SHAPE_ASPECT = "shapeAspect";
    @SerializedName(SERIALIZED_NAME_SHAPE_ASPECT)
    private String shapeAspect;

    public static final String SERIALIZED_NAME_SHAPE_BACKGROUND_TOP = "shapeBackgroundTop";
    @SerializedName(SERIALIZED_NAME_SHAPE_BACKGROUND_TOP)
    private String shapeBackgroundTop;

    public static final String SERIALIZED_NAME_SHAPE_BACKGROUND_BOTTOM = "shapeBackgroundBottom";
    @SerializedName(SERIALIZED_NAME_SHAPE_BACKGROUND_BOTTOM)
    private String shapeBackgroundBottom;

    public static final String SERIALIZED_NAME_LINK_ACTIVE = "linkActive";
    @SerializedName(SERIALIZED_NAME_LINK_ACTIVE)
    private String linkActive;

    public static final String SERIALIZED_NAME_ASSETS = "assets";
    @SerializedName(SERIALIZED_NAME_ASSETS)
    private PlayerAllOfAssets assets;

    public PlayerAllOf playerId(String playerId) {
        this.playerId = playerId;
        return this;
    }

    /**
     * Get playerId
     * 
     * @return playerId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "pl45KFKdlddgk654dspkze", value = "")

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public PlayerAllOf createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * When the player was created, presented in ISO-8601 format.
     * 
     * @return createdAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "2020-01-31T10:17:47Z", value = "When the player was created, presented in ISO-8601 format.")

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public PlayerAllOf updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * When the player was last updated, presented in ISO-8601 format.
     * 
     * @return updatedAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "2020-01-31T10:18:47Z", value = "When the player was last updated, presented in ISO-8601 format.")

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public PlayerAllOf shapeMargin(Integer shapeMargin) {
        this.shapeMargin = shapeMargin;
        return this;
    }

    /**
     * Deprecated
     * 
     * @return shapeMargin
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Deprecated")

    public Integer getShapeMargin() {
        return shapeMargin;
    }

    public void setShapeMargin(Integer shapeMargin) {
        this.shapeMargin = shapeMargin;
    }

    public PlayerAllOf shapeRadius(Integer shapeRadius) {
        this.shapeRadius = shapeRadius;
        return this;
    }

    /**
     * Deprecated
     * 
     * @return shapeRadius
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Deprecated")

    public Integer getShapeRadius() {
        return shapeRadius;
    }

    public void setShapeRadius(Integer shapeRadius) {
        this.shapeRadius = shapeRadius;
    }

    public PlayerAllOf shapeAspect(String shapeAspect) {
        this.shapeAspect = shapeAspect;
        return this;
    }

    /**
     * Deprecated
     * 
     * @return shapeAspect
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Deprecated")

    public String getShapeAspect() {
        return shapeAspect;
    }

    public void setShapeAspect(String shapeAspect) {
        this.shapeAspect = shapeAspect;
    }

    public PlayerAllOf shapeBackgroundTop(String shapeBackgroundTop) {
        this.shapeBackgroundTop = shapeBackgroundTop;
        return this;
    }

    /**
     * Deprecated
     * 
     * @return shapeBackgroundTop
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Deprecated")

    public String getShapeBackgroundTop() {
        return shapeBackgroundTop;
    }

    public void setShapeBackgroundTop(String shapeBackgroundTop) {
        this.shapeBackgroundTop = shapeBackgroundTop;
    }

    public PlayerAllOf shapeBackgroundBottom(String shapeBackgroundBottom) {
        this.shapeBackgroundBottom = shapeBackgroundBottom;
        return this;
    }

    /**
     * Deprecated
     * 
     * @return shapeBackgroundBottom
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Deprecated")

    public String getShapeBackgroundBottom() {
        return shapeBackgroundBottom;
    }

    public void setShapeBackgroundBottom(String shapeBackgroundBottom) {
        this.shapeBackgroundBottom = shapeBackgroundBottom;
    }

    public PlayerAllOf linkActive(String linkActive) {
        this.linkActive = linkActive;
        return this;
    }

    /**
     * Deprecated
     * 
     * @return linkActive
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Deprecated")

    public String getLinkActive() {
        return linkActive;
    }

    public void setLinkActive(String linkActive) {
        this.linkActive = linkActive;
    }

    public PlayerAllOf assets(PlayerAllOfAssets assets) {
        this.assets = assets;
        return this;
    }

    /**
     * Get assets
     * 
     * @return assets
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public PlayerAllOfAssets getAssets() {
        return assets;
    }

    public void setAssets(PlayerAllOfAssets assets) {
        this.assets = assets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlayerAllOf playerAllOf = (PlayerAllOf) o;
        return Objects.equals(this.playerId, playerAllOf.playerId)
                && Objects.equals(this.createdAt, playerAllOf.createdAt)
                && Objects.equals(this.updatedAt, playerAllOf.updatedAt)
                && Objects.equals(this.shapeMargin, playerAllOf.shapeMargin)
                && Objects.equals(this.shapeRadius, playerAllOf.shapeRadius)
                && Objects.equals(this.shapeAspect, playerAllOf.shapeAspect)
                && Objects.equals(this.shapeBackgroundTop, playerAllOf.shapeBackgroundTop)
                && Objects.equals(this.shapeBackgroundBottom, playerAllOf.shapeBackgroundBottom)
                && Objects.equals(this.linkActive, playerAllOf.linkActive)
                && Objects.equals(this.assets, playerAllOf.assets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId, createdAt, updatedAt, shapeMargin, shapeRadius, shapeAspect, shapeBackgroundTop,
                shapeBackgroundBottom, linkActive, assets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlayerAllOf {\n");
        sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    shapeMargin: ").append(toIndentedString(shapeMargin)).append("\n");
        sb.append("    shapeRadius: ").append(toIndentedString(shapeRadius)).append("\n");
        sb.append("    shapeAspect: ").append(toIndentedString(shapeAspect)).append("\n");
        sb.append("    shapeBackgroundTop: ").append(toIndentedString(shapeBackgroundTop)).append("\n");
        sb.append("    shapeBackgroundBottom: ").append(toIndentedString(shapeBackgroundBottom)).append("\n");
        sb.append("    linkActive: ").append(toIndentedString(linkActive)).append("\n");
        sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
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
