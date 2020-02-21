package com.azure.ai.formrecognizer.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The TrainCustomModelAsyncHeaders model.
 */
@Fluent
public final class TrainCustomModelAsyncHeaders {
    /*
     * The Location property.
     */
    @JsonProperty(value = "Location")
    private String location;

    /**
     * Get the location property: The Location property.
     * 
     * @return the location value.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The Location property.
     * 
     * @param location the location value to set.
     * @return the TrainCustomModelAsyncHeaders object itself.
     */
    public TrainCustomModelAsyncHeaders setLocation(String location) {
        this.location = location;
        return this;
    }

    public void validate() {
    }
}
