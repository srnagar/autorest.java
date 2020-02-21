package com.azure.ai.anomalydetector.models;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpResponse;

/**
 * Exception thrown for an invalid response with APIError information.
 */
public final class APIErrorException extends HttpResponseException {
    /**
     * Initializes a new instance of the APIErrorException class.
     * 
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     */
    public APIErrorException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the APIErrorException class.
     * 
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     * @param value the deserialized response value.
     */
    public APIErrorException(String message, HttpResponse response, APIError value) {
        super(message, response, value);
    }

    @Override
    public APIError getValue() {
        return (APIError) super.getValue();
    }
}
