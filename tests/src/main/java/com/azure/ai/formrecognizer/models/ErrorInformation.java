package com.azure.ai.formrecognizer.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ErrorInformation model.
 */
@Fluent
public final class ErrorInformation {
    /*
     * The code property.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /*
     * The message property.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /**
     * Get the code property: The code property.
     * 
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Set the code property: The code property.
     * 
     * @param code the code value to set.
     * @return the ErrorInformation object itself.
     */
    public ErrorInformation setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: The message property.
     * 
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: The message property.
     * 
     * @param message the message value to set.
     * @return the ErrorInformation object itself.
     */
    public ErrorInformation setMessage(String message) {
        this.message = message;
        return this;
    }

    public void validate() {
        if (getCode() == null) {
            throw new IllegalArgumentException("Missing required property code in model ErrorInformation");
        }
        if (getMessage() == null) {
            throw new IllegalArgumentException("Missing required property message in model ErrorInformation");
        }
    }
}
