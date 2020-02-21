package com.azure.ai.anomalydetector.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The APIError model.
 */
@Fluent
public final class APIError {
    /*
     * The error code.
     */
    @JsonProperty(value = "code")
    private AnomalyDetectorErrorCodes code;

    /*
     * A message explaining the error reported by the service.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the code property: The error code.
     * 
     * @return the code value.
     */
    public AnomalyDetectorErrorCodes getCode() {
        return this.code;
    }

    /**
     * Set the code property: The error code.
     * 
     * @param code the code value to set.
     * @return the APIError object itself.
     */
    public APIError setCode(AnomalyDetectorErrorCodes code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: A message explaining the error reported by the
     * service.
     * 
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: A message explaining the error reported by the
     * service.
     * 
     * @param message the message value to set.
     * @return the APIError object itself.
     */
    public APIError setMessage(String message) {
        this.message = message;
        return this;
    }

    public void validate() {
    }
}
