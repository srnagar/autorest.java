package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Metrics model.
 */
@Fluent
public final class Metrics {
    /*
     * The version of Storage Analytics to configure.
     */
    @JsonProperty(value = "Version")
    private String version;

    /*
     * Indicates whether metrics are enabled for the Blob service.
     */
    @JsonProperty(value = "Enabled", required = true)
    private boolean enabled;

    /*
     * Indicates whether metrics should generate summary statistics for called
     * API operations.
     */
    @JsonProperty(value = "IncludeAPIs")
    private Boolean includeAPIs;

    /*
     * the retention policy which determines how long the associated data
     * should persist
     */
    @JsonProperty(value = "RetentionPolicy")
    private RetentionPolicy retentionPolicy;

    /**
     * Get the version property: The version of Storage Analytics to configure.
     * 
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of Storage Analytics to configure.
     * 
     * @param version the version value to set.
     * @return the Metrics object itself.
     */
    public Metrics setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the enabled property: Indicates whether metrics are enabled for the
     * Blob service.
     * 
     * @return the enabled value.
     */
    public boolean isEnabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether metrics are enabled for the
     * Blob service.
     * 
     * @param enabled the enabled value to set.
     * @return the Metrics object itself.
     */
    public Metrics setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the includeAPIs property: Indicates whether metrics should generate
     * summary statistics for called API operations.
     * 
     * @return the includeAPIs value.
     */
    public Boolean isIncludeAPIs() {
        return this.includeAPIs;
    }

    /**
     * Set the includeAPIs property: Indicates whether metrics should generate
     * summary statistics for called API operations.
     * 
     * @param includeAPIs the includeAPIs value to set.
     * @return the Metrics object itself.
     */
    public Metrics setIncludeAPIs(Boolean includeAPIs) {
        this.includeAPIs = includeAPIs;
        return this;
    }

    /**
     * Get the retentionPolicy property: the retention policy which determines
     * how long the associated data should persist.
     * 
     * @return the retentionPolicy value.
     */
    public RetentionPolicy getRetentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set the retentionPolicy property: the retention policy which determines
     * how long the associated data should persist.
     * 
     * @param retentionPolicy the retentionPolicy value to set.
     * @return the Metrics object itself.
     */
    public Metrics setRetentionPolicy(RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    public void validate() {
        if (getRetentionPolicy() != null) {
            getRetentionPolicy().validate();
        }
    }
}
