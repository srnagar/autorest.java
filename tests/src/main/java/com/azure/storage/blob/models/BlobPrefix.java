package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The BlobPrefix model.
 */
@Fluent
public final class BlobPrefix {
    /*
     * The Name property.
     */
    @JsonProperty(value = "Name", required = true)
    private String name;

    /**
     * Get the name property: The Name property.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The Name property.
     * 
     * @param name the name value to set.
     * @return the BlobPrefix object itself.
     */
    public BlobPrefix setName(String name) {
        this.name = name;
        return this;
    }

    public void validate() {
        if (getName() == null) {
            throw new IllegalArgumentException("Missing required property name in model BlobPrefix");
        }
    }
}
