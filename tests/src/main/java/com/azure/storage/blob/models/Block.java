package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Block model.
 */
@Fluent
public final class Block {
    /*
     * The base64 encoded block ID.
     */
    @JsonProperty(value = "Name", required = true)
    private String name;

    /*
     * The block size in bytes.
     */
    @JsonProperty(value = "Size", required = true)
    private int size;

    /**
     * Get the name property: The base64 encoded block ID.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The base64 encoded block ID.
     * 
     * @param name the name value to set.
     * @return the Block object itself.
     */
    public Block setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the size property: The block size in bytes.
     * 
     * @return the size value.
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Set the size property: The block size in bytes.
     * 
     * @param size the size value to set.
     * @return the Block object itself.
     */
    public Block setSize(int size) {
        this.size = size;
        return this;
    }

    public void validate() {
        if (getName() == null) {
            throw new IllegalArgumentException("Missing required property name in model Block");
        }
    }
}
