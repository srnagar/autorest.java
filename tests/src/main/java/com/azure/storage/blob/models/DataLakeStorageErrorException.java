package com.azure.storage.blob.models;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpResponse;

/**
 * Exception thrown for an invalid response with DataLakeStorageError information.
 */
public final class DataLakeStorageErrorException extends HttpResponseException {
    /**
     * Initializes a new instance of the DataLakeStorageErrorException class.
     * 
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     */
    public DataLakeStorageErrorException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the DataLakeStorageErrorException class.
     * 
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     * @param value the deserialized response value.
     */
    public DataLakeStorageErrorException(String message, HttpResponse response, DataLakeStorageError value) {
        super(message, response, value);
    }

    @Override
    public DataLakeStorageError getValue() {
        return (DataLakeStorageError) super.getValue();
    }
}
