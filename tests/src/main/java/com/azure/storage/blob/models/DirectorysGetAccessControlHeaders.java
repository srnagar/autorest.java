package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The DirectorysGetAccessControlHeaders model.
 */
@Fluent
public final class DirectorysGetAccessControlHeaders {
    /*
     * The x-ms-group property.
     */
    @JsonProperty(value = "x-ms-group")
    private String xMsGroup;

    /*
     * The x-ms-version property.
     */
    @JsonProperty(value = "x-ms-version")
    private String xMsVersion;

    /*
     * The ETag property.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * The x-ms-acl property.
     */
    @JsonProperty(value = "x-ms-acl")
    private String xMsAcl;

    /*
     * The Last-Modified property.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /*
     * The x-ms-permissions property.
     */
    @JsonProperty(value = "x-ms-permissions")
    private String xMsPermissions;

    /*
     * The x-ms-request-id property.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /*
     * The Date property.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /*
     * The x-ms-owner property.
     */
    @JsonProperty(value = "x-ms-owner")
    private String xMsOwner;

    /**
     * Get the xMsGroup property: The x-ms-group property.
     * 
     * @return the xMsGroup value.
     */
    public String getXMsGroup() {
        return this.xMsGroup;
    }

    /**
     * Set the xMsGroup property: The x-ms-group property.
     * 
     * @param xMsGroup the xMsGroup value to set.
     * @return the DirectorysGetAccessControlHeaders object itself.
     */
    public DirectorysGetAccessControlHeaders setXMsGroup(String xMsGroup) {
        this.xMsGroup = xMsGroup;
        return this;
    }

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
     * @return the DirectorysGetAccessControlHeaders object itself.
     */
    public DirectorysGetAccessControlHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the eTag property: The ETag property.
     * 
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag property.
     * 
     * @param eTag the eTag value to set.
     * @return the DirectorysGetAccessControlHeaders object itself.
     */
    public DirectorysGetAccessControlHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the xMsAcl property: The x-ms-acl property.
     * 
     * @return the xMsAcl value.
     */
    public String getXMsAcl() {
        return this.xMsAcl;
    }

    /**
     * Set the xMsAcl property: The x-ms-acl property.
     * 
     * @param xMsAcl the xMsAcl value to set.
     * @return the DirectorysGetAccessControlHeaders object itself.
     */
    public DirectorysGetAccessControlHeaders setXMsAcl(String xMsAcl) {
        this.xMsAcl = xMsAcl;
        return this;
    }

    /**
     * Get the lastModified property: The Last-Modified property.
     * 
     * @return the lastModified value.
     */
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: The Last-Modified property.
     * 
     * @param lastModified the lastModified value to set.
     * @return the DirectorysGetAccessControlHeaders object itself.
     */
    public DirectorysGetAccessControlHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the xMsPermissions property: The x-ms-permissions property.
     * 
     * @return the xMsPermissions value.
     */
    public String getXMsPermissions() {
        return this.xMsPermissions;
    }

    /**
     * Set the xMsPermissions property: The x-ms-permissions property.
     * 
     * @param xMsPermissions the xMsPermissions value to set.
     * @return the DirectorysGetAccessControlHeaders object itself.
     */
    public DirectorysGetAccessControlHeaders setXMsPermissions(String xMsPermissions) {
        this.xMsPermissions = xMsPermissions;
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
     * @return the DirectorysGetAccessControlHeaders object itself.
     */
    public DirectorysGetAccessControlHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
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
     * @return the DirectorysGetAccessControlHeaders object itself.
     */
    public DirectorysGetAccessControlHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

    /**
     * Get the xMsOwner property: The x-ms-owner property.
     * 
     * @return the xMsOwner value.
     */
    public String getXMsOwner() {
        return this.xMsOwner;
    }

    /**
     * Set the xMsOwner property: The x-ms-owner property.
     * 
     * @param xMsOwner the xMsOwner value to set.
     * @return the DirectorysGetAccessControlHeaders object itself.
     */
    public DirectorysGetAccessControlHeaders setXMsOwner(String xMsOwner) {
        this.xMsOwner = xMsOwner;
        return this;
    }

    public void validate() {
    }
}
