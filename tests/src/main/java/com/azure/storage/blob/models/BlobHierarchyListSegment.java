package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The BlobHierarchyListSegment model.
 */
@Fluent
public final class BlobHierarchyListSegment {
    /*
     * The BlobPrefixes property.
     */
    @JsonProperty(value = "BlobPrefixes")
    private List<BlobPrefix> blobPrefixes;

    /*
     * The BlobItems property.
     */
    @JsonProperty(value = "BlobItems", required = true)
    private List<BlobItem> blobItems;

    /**
     * Get the blobPrefixes property: The BlobPrefixes property.
     * 
     * @return the blobPrefixes value.
     */
    public List<BlobPrefix> getBlobPrefixes() {
        return this.blobPrefixes;
    }

    /**
     * Set the blobPrefixes property: The BlobPrefixes property.
     * 
     * @param blobPrefixes the blobPrefixes value to set.
     * @return the BlobHierarchyListSegment object itself.
     */
    public BlobHierarchyListSegment setBlobPrefixes(List<BlobPrefix> blobPrefixes) {
        this.blobPrefixes = blobPrefixes;
        return this;
    }

    /**
     * Get the blobItems property: The BlobItems property.
     * 
     * @return the blobItems value.
     */
    public List<BlobItem> getBlobItems() {
        return this.blobItems;
    }

    /**
     * Set the blobItems property: The BlobItems property.
     * 
     * @param blobItems the blobItems value to set.
     * @return the BlobHierarchyListSegment object itself.
     */
    public BlobHierarchyListSegment setBlobItems(List<BlobItem> blobItems) {
        this.blobItems = blobItems;
        return this;
    }

    public void validate() {
        if (getBlobPrefixes() != null) {
            getBlobPrefixes().forEach(e -> e.validate());
        }
        if (getBlobItems() == null) {
            throw new IllegalArgumentException("Missing required property blobItems in model BlobHierarchyListSegment");
        } else {
            getBlobItems().forEach(e -> e.validate());
        }
    }
}
