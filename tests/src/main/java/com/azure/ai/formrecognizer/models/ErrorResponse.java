package com.azure.ai.formrecognizer.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ErrorResponse model.
 */
@Fluent
public final class ErrorResponse {
    /*
     * The error property.
     */
    @JsonProperty(value = "error", required = true)
    private ErrorInformation error;

    /**
     * Get the error property: The error property.
     * 
     * @return the error value.
     */
    public ErrorInformation getError() {
        return this.error;
    }

    /**
     * Set the error property: The error property.
     * 
     * @param error the error value to set.
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse setError(ErrorInformation error) {
        this.error = error;
        return this;
    }

    public void validate() {
        if (getError() == null) {
            throw new IllegalArgumentException("Missing required property error in model ErrorResponse");
        } else {
            getError().validate();
        }
    }
}
