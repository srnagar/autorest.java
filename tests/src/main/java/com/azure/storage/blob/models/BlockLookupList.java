package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The BlockLookupList model.
 */
@Fluent
public final class BlockLookupList {
    /*
     * The Committed property.
     */
    @JsonProperty(value = "Committed")
    private List<String> committed;

    /*
     * The Uncommitted property.
     */
    @JsonProperty(value = "Uncommitted")
    private List<String> uncommitted;

    /*
     * The Latest property.
     */
    @JsonProperty(value = "Latest")
    private List<String> latest;

    /**
     * Get the committed property: The Committed property.
     * 
     * @return the committed value.
     */
    public List<String> getCommitted() {
        return this.committed;
    }

    /**
     * Set the committed property: The Committed property.
     * 
     * @param committed the committed value to set.
     * @return the BlockLookupList object itself.
     */
    public BlockLookupList setCommitted(List<String> committed) {
        this.committed = committed;
        return this;
    }

    /**
     * Get the uncommitted property: The Uncommitted property.
     * 
     * @return the uncommitted value.
     */
    public List<String> getUncommitted() {
        return this.uncommitted;
    }

    /**
     * Set the uncommitted property: The Uncommitted property.
     * 
     * @param uncommitted the uncommitted value to set.
     * @return the BlockLookupList object itself.
     */
    public BlockLookupList setUncommitted(List<String> uncommitted) {
        this.uncommitted = uncommitted;
        return this;
    }

    /**
     * Get the latest property: The Latest property.
     * 
     * @return the latest value.
     */
    public List<String> getLatest() {
        return this.latest;
    }

    /**
     * Set the latest property: The Latest property.
     * 
     * @param latest the latest value to set.
     * @return the BlockLookupList object itself.
     */
    public BlockLookupList setLatest(List<String> latest) {
        this.latest = latest;
        return this;
    }

    public void validate() {
    }
}
