package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The StorageError model.
 */
@Fluent
public final class StorageError {
    /*
     * The Message property.
     */
    @JsonProperty(value = "Message")
    private String message;

    /**
     * Get the message property: The Message property.
     * 
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: The Message property.
     * 
     * @param message the message value to set.
     * @return the StorageError object itself.
     */
    public StorageError setMessage(String message) {
        this.message = message;
        return this;
    }

    public void validate() {
    }
}
