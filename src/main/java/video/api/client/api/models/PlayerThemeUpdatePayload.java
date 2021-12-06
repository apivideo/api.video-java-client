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
 * PlayerThemeUpdatePayload
 */

public class PlayerThemeUpdatePayload implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_TEXT = "text";
    @SerializedName(SERIALIZED_NAME_TEXT)
    private String text;

    public static final String SERIALIZED_NAME_LINK = "link";
    @SerializedName(SERIALIZED_NAME_LINK)
    private String link;

    public static final String SERIALIZED_NAME_LINK_HOVER = "linkHover";
    @SerializedName(SERIALIZED_NAME_LINK_HOVER)
    private String linkHover;

    public static final String SERIALIZED_NAME_TRACK_PLAYED = "trackPlayed";
    @SerializedName(SERIALIZED_NAME_TRACK_PLAYED)
    private String trackPlayed;

    public static final String SERIALIZED_NAME_TRACK_UNPLAYED = "trackUnplayed";
    @SerializedName(SERIALIZED_NAME_TRACK_UNPLAYED)
    private String trackUnplayed;

    public static final String SERIALIZED_NAME_TRACK_BACKGROUND = "trackBackground";
    @SerializedName(SERIALIZED_NAME_TRACK_BACKGROUND)
    private String trackBackground;

    public static final String SERIALIZED_NAME_BACKGROUND_TOP = "backgroundTop";
    @SerializedName(SERIALIZED_NAME_BACKGROUND_TOP)
    private String backgroundTop;

    public static final String SERIALIZED_NAME_BACKGROUND_BOTTOM = "backgroundBottom";
    @SerializedName(SERIALIZED_NAME_BACKGROUND_BOTTOM)
    private String backgroundBottom;

    public static final String SERIALIZED_NAME_BACKGROUND_TEXT = "backgroundText";
    @SerializedName(SERIALIZED_NAME_BACKGROUND_TEXT)
    private String backgroundText;

    public static final String SERIALIZED_NAME_ENABLE_API = "enableApi";
    @SerializedName(SERIALIZED_NAME_ENABLE_API)
    private Boolean enableApi;

    public static final String SERIALIZED_NAME_ENABLE_CONTROLS = "enableControls";
    @SerializedName(SERIALIZED_NAME_ENABLE_CONTROLS)
    private Boolean enableControls;

    public static final String SERIALIZED_NAME_FORCE_AUTOPLAY = "forceAutoplay";
    @SerializedName(SERIALIZED_NAME_FORCE_AUTOPLAY)
    private Boolean forceAutoplay;

    public static final String SERIALIZED_NAME_HIDE_TITLE = "hideTitle";
    @SerializedName(SERIALIZED_NAME_HIDE_TITLE)
    private Boolean hideTitle;

    public static final String SERIALIZED_NAME_FORCE_LOOP = "forceLoop";
    @SerializedName(SERIALIZED_NAME_FORCE_LOOP)
    private Boolean forceLoop;

    public PlayerThemeUpdatePayload name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Add a name for your player theme here.
     * 
     * @return name
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Add a name for your player theme here.")

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerThemeUpdatePayload text(String text) {
        this.text = text;
        return this;
    }

    /**
     * RGBA color for timer text. Default: rgba(255, 255, 255, 1)
     * 
     * @return text
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "RGBA color for timer text. Default: rgba(255, 255, 255, 1)")

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public PlayerThemeUpdatePayload link(String link) {
        this.link = link;
        return this;
    }

    /**
     * RGBA color for all controls. Default: rgba(255, 255, 255, 1)
     * 
     * @return link
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "RGBA color for all controls. Default: rgba(255, 255, 255, 1)")

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public PlayerThemeUpdatePayload linkHover(String linkHover) {
        this.linkHover = linkHover;
        return this;
    }

    /**
     * RGBA color for all controls when hovered. Default: rgba(255, 255, 255, 1)
     * 
     * @return linkHover
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "RGBA color for all controls when hovered. Default: rgba(255, 255, 255, 1)")

    public String getLinkHover() {
        return linkHover;
    }

    public void setLinkHover(String linkHover) {
        this.linkHover = linkHover;
    }

    public PlayerThemeUpdatePayload trackPlayed(String trackPlayed) {
        this.trackPlayed = trackPlayed;
        return this;
    }

    /**
     * RGBA color playback bar: played content. Default: rgba(88, 131, 255, .95)
     * 
     * @return trackPlayed
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "RGBA color playback bar: played content. Default: rgba(88, 131, 255, .95)")

    public String getTrackPlayed() {
        return trackPlayed;
    }

    public void setTrackPlayed(String trackPlayed) {
        this.trackPlayed = trackPlayed;
    }

    public PlayerThemeUpdatePayload trackUnplayed(String trackUnplayed) {
        this.trackUnplayed = trackUnplayed;
        return this;
    }

    /**
     * RGBA color playback bar: downloaded but unplayed (buffered) content. Default: rgba(255, 255, 255, .35)
     * 
     * @return trackUnplayed
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "RGBA color playback bar: downloaded but unplayed (buffered) content. Default: rgba(255, 255, 255, .35)")

    public String getTrackUnplayed() {
        return trackUnplayed;
    }

    public void setTrackUnplayed(String trackUnplayed) {
        this.trackUnplayed = trackUnplayed;
    }

    public PlayerThemeUpdatePayload trackBackground(String trackBackground) {
        this.trackBackground = trackBackground;
        return this;
    }

    /**
     * RGBA color playback bar: background. Default: rgba(255, 255, 255, .2)
     * 
     * @return trackBackground
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "RGBA color playback bar: background. Default: rgba(255, 255, 255, .2)")

    public String getTrackBackground() {
        return trackBackground;
    }

    public void setTrackBackground(String trackBackground) {
        this.trackBackground = trackBackground;
    }

    public PlayerThemeUpdatePayload backgroundTop(String backgroundTop) {
        this.backgroundTop = backgroundTop;
        return this;
    }

    /**
     * RGBA color: top 50% of background. Default: rgba(0, 0, 0, .7)
     * 
     * @return backgroundTop
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "RGBA color: top 50% of background. Default: rgba(0, 0, 0, .7)")

    public String getBackgroundTop() {
        return backgroundTop;
    }

    public void setBackgroundTop(String backgroundTop) {
        this.backgroundTop = backgroundTop;
    }

    public PlayerThemeUpdatePayload backgroundBottom(String backgroundBottom) {
        this.backgroundBottom = backgroundBottom;
        return this;
    }

    /**
     * RGBA color: bottom 50% of background. Default: rgba(0, 0, 0, .7)
     * 
     * @return backgroundBottom
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "RGBA color: bottom 50% of background. Default: rgba(0, 0, 0, .7)")

    public String getBackgroundBottom() {
        return backgroundBottom;
    }

    public void setBackgroundBottom(String backgroundBottom) {
        this.backgroundBottom = backgroundBottom;
    }

    public PlayerThemeUpdatePayload backgroundText(String backgroundText) {
        this.backgroundText = backgroundText;
        return this;
    }

    /**
     * RGBA color for title text. Default: rgba(255, 255, 255, 1)
     * 
     * @return backgroundText
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "RGBA color for title text. Default: rgba(255, 255, 255, 1)")

    public String getBackgroundText() {
        return backgroundText;
    }

    public void setBackgroundText(String backgroundText) {
        this.backgroundText = backgroundText;
    }

    public PlayerThemeUpdatePayload enableApi(Boolean enableApi) {
        this.enableApi = enableApi;
        return this;
    }

    /**
     * enable/disable player SDK access. Default: true
     * 
     * @return enableApi
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "enable/disable player SDK access. Default: true")

    public Boolean getEnableApi() {
        return enableApi;
    }

    public void setEnableApi(Boolean enableApi) {
        this.enableApi = enableApi;
    }

    public PlayerThemeUpdatePayload enableControls(Boolean enableControls) {
        this.enableControls = enableControls;
        return this;
    }

    /**
     * enable/disable player controls. Default: true
     * 
     * @return enableControls
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "enable/disable player controls. Default: true")

    public Boolean getEnableControls() {
        return enableControls;
    }

    public void setEnableControls(Boolean enableControls) {
        this.enableControls = enableControls;
    }

    public PlayerThemeUpdatePayload forceAutoplay(Boolean forceAutoplay) {
        this.forceAutoplay = forceAutoplay;
        return this;
    }

    /**
     * enable/disable player autoplay. Default: false
     * 
     * @return forceAutoplay
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "enable/disable player autoplay. Default: false")

    public Boolean getForceAutoplay() {
        return forceAutoplay;
    }

    public void setForceAutoplay(Boolean forceAutoplay) {
        this.forceAutoplay = forceAutoplay;
    }

    public PlayerThemeUpdatePayload hideTitle(Boolean hideTitle) {
        this.hideTitle = hideTitle;
        return this;
    }

    /**
     * enable/disable title. Default: false
     * 
     * @return hideTitle
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "enable/disable title. Default: false")

    public Boolean getHideTitle() {
        return hideTitle;
    }

    public void setHideTitle(Boolean hideTitle) {
        this.hideTitle = hideTitle;
    }

    public PlayerThemeUpdatePayload forceLoop(Boolean forceLoop) {
        this.forceLoop = forceLoop;
        return this;
    }

    /**
     * enable/disable looping. Default: false
     * 
     * @return forceLoop
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "enable/disable looping. Default: false")

    public Boolean getForceLoop() {
        return forceLoop;
    }

    public void setForceLoop(Boolean forceLoop) {
        this.forceLoop = forceLoop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlayerThemeUpdatePayload playerThemeUpdatePayload = (PlayerThemeUpdatePayload) o;
        return Objects.equals(this.name, playerThemeUpdatePayload.name)
                && Objects.equals(this.text, playerThemeUpdatePayload.text)
                && Objects.equals(this.link, playerThemeUpdatePayload.link)
                && Objects.equals(this.linkHover, playerThemeUpdatePayload.linkHover)
                && Objects.equals(this.trackPlayed, playerThemeUpdatePayload.trackPlayed)
                && Objects.equals(this.trackUnplayed, playerThemeUpdatePayload.trackUnplayed)
                && Objects.equals(this.trackBackground, playerThemeUpdatePayload.trackBackground)
                && Objects.equals(this.backgroundTop, playerThemeUpdatePayload.backgroundTop)
                && Objects.equals(this.backgroundBottom, playerThemeUpdatePayload.backgroundBottom)
                && Objects.equals(this.backgroundText, playerThemeUpdatePayload.backgroundText)
                && Objects.equals(this.enableApi, playerThemeUpdatePayload.enableApi)
                && Objects.equals(this.enableControls, playerThemeUpdatePayload.enableControls)
                && Objects.equals(this.forceAutoplay, playerThemeUpdatePayload.forceAutoplay)
                && Objects.equals(this.hideTitle, playerThemeUpdatePayload.hideTitle)
                && Objects.equals(this.forceLoop, playerThemeUpdatePayload.forceLoop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, text, link, linkHover, trackPlayed, trackUnplayed, trackBackground, backgroundTop,
                backgroundBottom, backgroundText, enableApi, enableControls, forceAutoplay, hideTitle, forceLoop);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlayerThemeUpdatePayload {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    linkHover: ").append(toIndentedString(linkHover)).append("\n");
        sb.append("    trackPlayed: ").append(toIndentedString(trackPlayed)).append("\n");
        sb.append("    trackUnplayed: ").append(toIndentedString(trackUnplayed)).append("\n");
        sb.append("    trackBackground: ").append(toIndentedString(trackBackground)).append("\n");
        sb.append("    backgroundTop: ").append(toIndentedString(backgroundTop)).append("\n");
        sb.append("    backgroundBottom: ").append(toIndentedString(backgroundBottom)).append("\n");
        sb.append("    backgroundText: ").append(toIndentedString(backgroundText)).append("\n");
        sb.append("    enableApi: ").append(toIndentedString(enableApi)).append("\n");
        sb.append("    enableControls: ").append(toIndentedString(enableControls)).append("\n");
        sb.append("    forceAutoplay: ").append(toIndentedString(forceAutoplay)).append("\n");
        sb.append("    hideTitle: ").append(toIndentedString(hideTitle)).append("\n");
        sb.append("    forceLoop: ").append(toIndentedString(forceLoop)).append("\n");
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
