package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The PageList model.
 */
@Fluent
public final class PageList {
    /*
     * The PageRange property.
     */
    @JsonProperty(value = "PageRange")
    private List<PageRange> pageRange;

    /*
     * The ClearRange property.
     */
    @JsonProperty(value = "ClearRange")
    private List<ClearRange> clearRange;

    /**
     * Get the pageRange property: The PageRange property.
     * 
     * @return the pageRange value.
     */
    public List<PageRange> getPageRange() {
        return this.pageRange;
    }

    /**
     * Set the pageRange property: The PageRange property.
     * 
     * @param pageRange the pageRange value to set.
     * @return the PageList object itself.
     */
    public PageList setPageRange(List<PageRange> pageRange) {
        this.pageRange = pageRange;
        return this;
    }

    /**
     * Get the clearRange property: The ClearRange property.
     * 
     * @return the clearRange value.
     */
    public List<ClearRange> getClearRange() {
        return this.clearRange;
    }

    /**
     * Set the clearRange property: The ClearRange property.
     * 
     * @param clearRange the clearRange value to set.
     * @return the PageList object itself.
     */
    public PageList setClearRange(List<ClearRange> clearRange) {
        this.clearRange = clearRange;
        return this;
    }

    public void validate() {
        if (getPageRange() != null) {
            getPageRange().forEach(e -> e.validate());
        }
        if (getClearRange() != null) {
            getClearRange().forEach(e -> e.validate());
        }
    }
}
