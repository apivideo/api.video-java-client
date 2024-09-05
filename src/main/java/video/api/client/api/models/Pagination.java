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
import java.util.ArrayList;
import java.util.List;
import video.api.client.api.models.PaginationLink;
import java.io.Serializable;

/**
 * Pagination
 */

public class Pagination implements Serializable, DeepObject {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ITEMS_TOTAL = "itemsTotal";
    @SerializedName(SERIALIZED_NAME_ITEMS_TOTAL)
    private Integer itemsTotal;

    public static final String SERIALIZED_NAME_PAGES_TOTAL = "pagesTotal";
    @SerializedName(SERIALIZED_NAME_PAGES_TOTAL)
    private Integer pagesTotal;

    public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
    @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
    private Integer pageSize;

    public static final String SERIALIZED_NAME_CURRENT_PAGE = "currentPage";
    @SerializedName(SERIALIZED_NAME_CURRENT_PAGE)
    private Integer currentPage;

    public static final String SERIALIZED_NAME_CURRENT_PAGE_ITEMS = "currentPageItems";
    @SerializedName(SERIALIZED_NAME_CURRENT_PAGE_ITEMS)
    private Integer currentPageItems;

    public static final String SERIALIZED_NAME_LINKS = "links";
    @SerializedName(SERIALIZED_NAME_LINKS)
    private List<PaginationLink> links = new ArrayList<>();

    /**
     * Total number of items that exist.
     * 
     * @return itemsTotal
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Total number of items that exist.")

    public Integer getItemsTotal() {
        return itemsTotal;
    }

    /**
     * Number of items listed in the current page.
     * 
     * @return pagesTotal
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Number of items listed in the current page.")

    public Integer getPagesTotal() {
        return pagesTotal;
    }

    /**
     * Maximum number of item per page.
     * 
     * @return pageSize
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Maximum number of item per page.")

    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * The current page index.
     * 
     * @return currentPage
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The current page index.")

    public Integer getCurrentPage() {
        return currentPage;
    }

    /**
     * The number of items on the current page.
     * 
     * @return currentPageItems
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The number of items on the current page.")

    public Integer getCurrentPageItems() {
        return currentPageItems;
    }

    public Pagination links(List<PaginationLink> links) {
        this.links = links;
        return this;
    }

    public Pagination addLinksItem(PaginationLink linksItem) {
        this.links.add(linksItem);
        return this;
    }

    /**
     * Get links
     * 
     * @return links
     **/
    @ApiModelProperty(required = true, value = "")

    public List<PaginationLink> getLinks() {
        return links;
    }

    public void setLinks(List<PaginationLink> links) {
        this.links = links;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pagination pagination = (Pagination) o;
        return Objects.equals(this.itemsTotal, pagination.itemsTotal)
                && Objects.equals(this.pagesTotal, pagination.pagesTotal)
                && Objects.equals(this.pageSize, pagination.pageSize)
                && Objects.equals(this.currentPage, pagination.currentPage)
                && Objects.equals(this.currentPageItems, pagination.currentPageItems)
                && Objects.equals(this.links, pagination.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemsTotal, pagesTotal, pageSize, currentPage, currentPageItems, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Pagination {\n");
        sb.append("    itemsTotal: ").append(toIndentedString(itemsTotal)).append("\n");
        sb.append("    pagesTotal: ").append(toIndentedString(pagesTotal)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
        sb.append("    currentPageItems: ").append(toIndentedString(currentPageItems)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
