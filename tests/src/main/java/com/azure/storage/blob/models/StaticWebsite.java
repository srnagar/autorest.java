package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The StaticWebsite model.
 */
@Fluent
public final class StaticWebsite {
    /*
     * Indicates whether this account is hosting a static website
     */
    @JsonProperty(value = "Enabled", required = true)
    private boolean enabled;

    /*
     * The default name of the index page under each directory
     */
    @JsonProperty(value = "IndexDocument")
    private String indexDocument;

    /*
     * The absolute path of the custom 404 page
     */
    @JsonProperty(value = "ErrorDocument404Path")
    private String errorDocument404Path;

    /**
     * Get the enabled property: Indicates whether this account is hosting a
     * static website.
     * 
     * @return the enabled value.
     */
    public boolean isEnabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether this account is hosting a
     * static website.
     * 
     * @param enabled the enabled value to set.
     * @return the StaticWebsite object itself.
     */
    public StaticWebsite setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the indexDocument property: The default name of the index page under
     * each directory.
     * 
     * @return the indexDocument value.
     */
    public String getIndexDocument() {
        return this.indexDocument;
    }

    /**
     * Set the indexDocument property: The default name of the index page under
     * each directory.
     * 
     * @param indexDocument the indexDocument value to set.
     * @return the StaticWebsite object itself.
     */
    public StaticWebsite setIndexDocument(String indexDocument) {
        this.indexDocument = indexDocument;
        return this;
    }

    /**
     * Get the errorDocument404Path property: The absolute path of the custom
     * 404 page.
     * 
     * @return the errorDocument404Path value.
     */
    public String getErrorDocument404Path() {
        return this.errorDocument404Path;
    }

    /**
     * Set the errorDocument404Path property: The absolute path of the custom
     * 404 page.
     * 
     * @param errorDocument404Path the errorDocument404Path value to set.
     * @return the StaticWebsite object itself.
     */
    public StaticWebsite setErrorDocument404Path(String errorDocument404Path) {
        this.errorDocument404Path = errorDocument404Path;
        return this;
    }

    public void validate() {
    }
}
