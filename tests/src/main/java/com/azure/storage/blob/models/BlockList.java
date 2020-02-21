package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The BlockList model.
 */
@Fluent
public final class BlockList {
    /*
     * The CommittedBlocks property.
     */
    @JsonProperty(value = "CommittedBlocks")
    private List<Block> committedBlocks;

    /*
     * The UncommittedBlocks property.
     */
    @JsonProperty(value = "UncommittedBlocks")
    private List<Block> uncommittedBlocks;

    /**
     * Get the committedBlocks property: The CommittedBlocks property.
     * 
     * @return the committedBlocks value.
     */
    public List<Block> getCommittedBlocks() {
        return this.committedBlocks;
    }

    /**
     * Set the committedBlocks property: The CommittedBlocks property.
     * 
     * @param committedBlocks the committedBlocks value to set.
     * @return the BlockList object itself.
     */
    public BlockList setCommittedBlocks(List<Block> committedBlocks) {
        this.committedBlocks = committedBlocks;
        return this;
    }

    /**
     * Get the uncommittedBlocks property: The UncommittedBlocks property.
     * 
     * @return the uncommittedBlocks value.
     */
    public List<Block> getUncommittedBlocks() {
        return this.uncommittedBlocks;
    }

    /**
     * Set the uncommittedBlocks property: The UncommittedBlocks property.
     * 
     * @param uncommittedBlocks the uncommittedBlocks value to set.
     * @return the BlockList object itself.
     */
    public BlockList setUncommittedBlocks(List<Block> uncommittedBlocks) {
        this.uncommittedBlocks = uncommittedBlocks;
        return this;
    }

    public void validate() {
        if (getCommittedBlocks() != null) {
            getCommittedBlocks().forEach(e -> e.validate());
        }
        if (getUncommittedBlocks() != null) {
            getUncommittedBlocks().forEach(e -> e.validate());
        }
    }
}
