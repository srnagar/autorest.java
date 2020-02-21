package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DataLakeStorageError model.
 */
@Fluent
public final class DataLakeStorageError {
    /*
     * The service error response object.
     */
    @JsonProperty(value = "error")
    private DataLakeStorageError error;

    /**
     * Get the error property: The service error response object.
     * 
     * @return the error value.
     */
    public DataLakeStorageError getError() {
        return this.error;
    }

    /**
     * Set the error property: The service error response object.
     * 
     * @param error the error value to set.
     * @return the DataLakeStorageError object itself.
     */
    public DataLakeStorageError setError(DataLakeStorageError error) {
        this.error = error;
        return this;
    }

    public void validate() {
        if (getError() != null) {
            getError().validate();
        }
    }
}
