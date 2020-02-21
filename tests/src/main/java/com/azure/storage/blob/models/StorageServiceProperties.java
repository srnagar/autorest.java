package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The StorageServiceProperties model.
 */
@Fluent
public final class StorageServiceProperties {
    /*
     * Azure Analytics Logging settings.
     */
    @JsonProperty(value = "Logging")
    private Logging logging;

    /*
     * a summary of request statistics grouped by API in hour or minute
     * aggregates for blobs
     */
    @JsonProperty(value = "HourMetrics")
    private Metrics hourMetrics;

    /*
     * a summary of request statistics grouped by API in hour or minute
     * aggregates for blobs
     */
    @JsonProperty(value = "MinuteMetrics")
    private Metrics minuteMetrics;

    /*
     * The set of CORS rules.
     */
    @JsonProperty(value = "Cors")
    private List<CorsRule> cors;

    /*
     * The default version to use for requests to the Blob service if an
     * incoming request's version is not specified. Possible values include
     * version 2008-10-27 and all more recent versions
     */
    @JsonProperty(value = "DefaultServiceVersion")
    private String defaultServiceVersion;

    /*
     * the retention policy which determines how long the associated data
     * should persist
     */
    @JsonProperty(value = "DeleteRetentionPolicy")
    private RetentionPolicy deleteRetentionPolicy;

    /*
     * The properties that enable an account to host a static website
     */
    @JsonProperty(value = "StaticWebsite")
    private StaticWebsite staticWebsite;

    /**
     * Get the logging property: Azure Analytics Logging settings.
     * 
     * @return the logging value.
     */
    public Logging getLogging() {
        return this.logging;
    }

    /**
     * Set the logging property: Azure Analytics Logging settings.
     * 
     * @param logging the logging value to set.
     * @return the StorageServiceProperties object itself.
     */
    public StorageServiceProperties setLogging(Logging logging) {
        this.logging = logging;
        return this;
    }

    /**
     * Get the hourMetrics property: a summary of request statistics grouped by
     * API in hour or minute aggregates for blobs.
     * 
     * @return the hourMetrics value.
     */
    public Metrics getHourMetrics() {
        return this.hourMetrics;
    }

    /**
     * Set the hourMetrics property: a summary of request statistics grouped by
     * API in hour or minute aggregates for blobs.
     * 
     * @param hourMetrics the hourMetrics value to set.
     * @return the StorageServiceProperties object itself.
     */
    public StorageServiceProperties setHourMetrics(Metrics hourMetrics) {
        this.hourMetrics = hourMetrics;
        return this;
    }

    /**
     * Get the minuteMetrics property: a summary of request statistics grouped
     * by API in hour or minute aggregates for blobs.
     * 
     * @return the minuteMetrics value.
     */
    public Metrics getMinuteMetrics() {
        return this.minuteMetrics;
    }

    /**
     * Set the minuteMetrics property: a summary of request statistics grouped
     * by API in hour or minute aggregates for blobs.
     * 
     * @param minuteMetrics the minuteMetrics value to set.
     * @return the StorageServiceProperties object itself.
     */
    public StorageServiceProperties setMinuteMetrics(Metrics minuteMetrics) {
        this.minuteMetrics = minuteMetrics;
        return this;
    }

    /**
     * Get the cors property: The set of CORS rules.
     * 
     * @return the cors value.
     */
    public List<CorsRule> getCors() {
        return this.cors;
    }

    /**
     * Set the cors property: The set of CORS rules.
     * 
     * @param cors the cors value to set.
     * @return the StorageServiceProperties object itself.
     */
    public StorageServiceProperties setCors(List<CorsRule> cors) {
        this.cors = cors;
        return this;
    }

    /**
     * Get the defaultServiceVersion property: The default version to use for
     * requests to the Blob service if an incoming request's version is not
     * specified. Possible values include version 2008-10-27 and all more
     * recent versions.
     * 
     * @return the defaultServiceVersion value.
     */
    public String getDefaultServiceVersion() {
        return this.defaultServiceVersion;
    }

    /**
     * Set the defaultServiceVersion property: The default version to use for
     * requests to the Blob service if an incoming request's version is not
     * specified. Possible values include version 2008-10-27 and all more
     * recent versions.
     * 
     * @param defaultServiceVersion the defaultServiceVersion value to set.
     * @return the StorageServiceProperties object itself.
     */
    public StorageServiceProperties setDefaultServiceVersion(String defaultServiceVersion) {
        this.defaultServiceVersion = defaultServiceVersion;
        return this;
    }

    /**
     * Get the deleteRetentionPolicy property: the retention policy which
     * determines how long the associated data should persist.
     * 
     * @return the deleteRetentionPolicy value.
     */
    public RetentionPolicy getDeleteRetentionPolicy() {
        return this.deleteRetentionPolicy;
    }

    /**
     * Set the deleteRetentionPolicy property: the retention policy which
     * determines how long the associated data should persist.
     * 
     * @param deleteRetentionPolicy the deleteRetentionPolicy value to set.
     * @return the StorageServiceProperties object itself.
     */
    public StorageServiceProperties setDeleteRetentionPolicy(RetentionPolicy deleteRetentionPolicy) {
        this.deleteRetentionPolicy = deleteRetentionPolicy;
        return this;
    }

    /**
     * Get the staticWebsite property: The properties that enable an account to
     * host a static website.
     * 
     * @return the staticWebsite value.
     */
    public StaticWebsite getStaticWebsite() {
        return this.staticWebsite;
    }

    /**
     * Set the staticWebsite property: The properties that enable an account to
     * host a static website.
     * 
     * @param staticWebsite the staticWebsite value to set.
     * @return the StorageServiceProperties object itself.
     */
    public StorageServiceProperties setStaticWebsite(StaticWebsite staticWebsite) {
        this.staticWebsite = staticWebsite;
        return this;
    }

    public void validate() {
        if (getLogging() != null) {
            getLogging().validate();
        }
        if (getHourMetrics() != null) {
            getHourMetrics().validate();
        }
        if (getMinuteMetrics() != null) {
            getMinuteMetrics().validate();
        }
        if (getCors() != null) {
            getCors().forEach(e -> e.validate());
        }
        if (getDeleteRetentionPolicy() != null) {
            getDeleteRetentionPolicy().validate();
        }
        if (getStaticWebsite() != null) {
            getStaticWebsite().validate();
        }
    }
}
