package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The BlobMetadata model.
 */
@Fluent
public final class BlobMetadata {
    /*
     * The Encrypted property.
     */
    @JsonProperty(value = "Encrypted")
    private String encrypted;

    /*
     * Dictionary of <string>
     */
    @JsonProperty(value = "")
    private Map<String, String> additionalProperties;

    /**
     * Get the encrypted property: The Encrypted property.
     * 
     * @return the encrypted value.
     */
    public String getEncrypted() {
        return this.encrypted;
    }

    /**
     * Set the encrypted property: The Encrypted property.
     * 
     * @param encrypted the encrypted value to set.
     * @return the BlobMetadata object itself.
     */
    public BlobMetadata setEncrypted(String encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * Get the additionalProperties property: Dictionary of &lt;string&gt;.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, String> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Dictionary of &lt;string&gt;.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the BlobMetadata object itself.
     */
    public BlobMetadata setAdditionalProperties(Map<String, String> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    public void validate() {
    }
}
