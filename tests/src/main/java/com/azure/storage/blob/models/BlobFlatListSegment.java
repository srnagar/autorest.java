package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The BlobFlatListSegment model.
 */
@Fluent
public final class BlobFlatListSegment {
    /*
     * The BlobItems property.
     */
    @JsonProperty(value = "BlobItems", required = true)
    private List<BlobItem> blobItems;

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
     * @return the BlobFlatListSegment object itself.
     */
    public BlobFlatListSegment setBlobItems(List<BlobItem> blobItems) {
        this.blobItems = blobItems;
        return this;
    }

    public void validate() {
        if (getBlobItems() == null) {
            throw new IllegalArgumentException("Missing required property blobItems in model BlobFlatListSegment");
        } else {
            getBlobItems().forEach(e -> e.validate());
        }
    }
}
