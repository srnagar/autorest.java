package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The ContainersDeleteHeaders model.
 */
@Fluent
public final class ContainersDeleteHeaders {
    /*
     * The x-ms-version property.
     */
    @JsonProperty(value = "x-ms-version")
    private String xMsVersion;

    /*
     * The x-ms-request-id property.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /*
     * The x-ms-client-request-id property.
     */
    @JsonProperty(value = "x-ms-client-request-id")
    private String xMsClientRequestId;

    /*
     * The Date property.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /**
     * Get the xMsVersion property: The x-ms-version property.
     * 
     * @return the xMsVersion value.
     */
    public String getXMsVersion() {
        return this.xMsVersion;
    }

    /**
     * Set the xMsVersion property: The x-ms-version property.
     * 
     * @param xMsVersion the xMsVersion value to set.
     * @return the ContainersDeleteHeaders object itself.
     */
    public ContainersDeleteHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the xMsRequestId property: The x-ms-request-id property.
     * 
     * @return the xMsRequestId value.
     */
    public String getXMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set the xMsRequestId property: The x-ms-request-id property.
     * 
     * @param xMsRequestId the xMsRequestId value to set.
     * @return the ContainersDeleteHeaders object itself.
     */
    public ContainersDeleteHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the xMsClientRequestId property: The x-ms-client-request-id
     * property.
     * 
     * @return the xMsClientRequestId value.
     */
    public String getXMsClientRequestId() {
        return this.xMsClientRequestId;
    }

    /**
     * Set the xMsClientRequestId property: The x-ms-client-request-id
     * property.
     * 
     * @param xMsClientRequestId the xMsClientRequestId value to set.
     * @return the ContainersDeleteHeaders object itself.
     */
    public ContainersDeleteHeaders setXMsClientRequestId(String xMsClientRequestId) {
        this.xMsClientRequestId = xMsClientRequestId;
        return this;
    }

    /**
     * Get the dateProperty property: The Date property.
     * 
     * @return the dateProperty value.
     */
    public OffsetDateTime getDateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.getDateTime();
    }

    /**
     * Set the dateProperty property: The Date property.
     * 
     * @param dateProperty the dateProperty value to set.
     * @return the ContainersDeleteHeaders object itself.
     */
    public ContainersDeleteHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

    public void validate() {
    }
}
