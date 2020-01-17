package com.azure.security.keyvault.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Error model.
 */
@Immutable
public final class Error {
    /*
     * The error code.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /*
     * The error message.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * The key vault server error.
     */
    @JsonProperty(value = "innererror", access = JsonProperty.Access.WRITE_ONLY)
    private Error innerError;

    /**
     * Get the code property: The error code.
     * 
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message property: The error message.
     * 
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the innerError property: The key vault server error.
     * 
     * @return the innerError value.
     */
    public Error getInnerError() {
        return this.innerError;
    }

    public void validate() {
        if (getInnerError() != null) {
            getInnerError().validate();
        }
    }
}
