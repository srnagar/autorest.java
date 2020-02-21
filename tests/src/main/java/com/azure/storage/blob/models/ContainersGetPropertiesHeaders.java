package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The ContainersGetPropertiesHeaders model.
 */
@Fluent
public final class ContainersGetPropertiesHeaders {
    /*
     * The x-ms-lease-status property.
     */
    @JsonProperty(value = "x-ms-lease-status")
    private LeaseStatusType xMsLeaseStatus;

    /*
     * The x-ms-version property.
     */
    @JsonProperty(value = "x-ms-version")
    private String xMsVersion;

    /*
     * The x-ms-lease-state property.
     */
    @JsonProperty(value = "x-ms-lease-state")
    private LeaseStateType xMsLeaseState;

    /*
     * The x-ms-deny-encryption-scope-override property.
     */
    @JsonProperty(value = "x-ms-deny-encryption-scope-override")
    private Boolean xMsDenyEncryptionScopeOverride;

    /*
     * The Last-Modified property.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /*
     * The x-ms-meta property.
     */
    @JsonProperty(value = "x-ms-meta")
    private String xMsMeta;

    /*
     * The Date property.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /*
     * The x-ms-has-legal-hold property.
     */
    @JsonProperty(value = "x-ms-has-legal-hold")
    private Boolean xMsHasLegalHold;

    /*
     * The x-ms-default-encryption-scope property.
     */
    @JsonProperty(value = "x-ms-default-encryption-scope")
    private String xMsDefaultEncryptionScope;

    /*
     * The ETag property.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * The x-ms-has-immutability-policy property.
     */
    @JsonProperty(value = "x-ms-has-immutability-policy")
    private Boolean xMsHasImmutabilityPolicy;

    /*
     * The x-ms-lease-duration property.
     */
    @JsonProperty(value = "x-ms-lease-duration")
    private LeaseDurationType xMsLeaseDuration;

    /*
     * The x-ms-blob-public-access property.
     */
    @JsonProperty(value = "x-ms-blob-public-access")
    private PublicAccessType xMsBlobPublicAccess;

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

    /**
     * Get the xMsLeaseStatus property: The x-ms-lease-status property.
     * 
     * @return the xMsLeaseStatus value.
     */
    public LeaseStatusType getXMsLeaseStatus() {
        return this.xMsLeaseStatus;
    }

    /**
     * Set the xMsLeaseStatus property: The x-ms-lease-status property.
     * 
     * @param xMsLeaseStatus the xMsLeaseStatus value to set.
     * @return the ContainersGetPropertiesHeaders object itself.
     */
    public ContainersGetPropertiesHeaders setXMsLeaseStatus(LeaseStatusType xMsLeaseStatus) {
        this.xMsLeaseStatus = xMsLeaseStatus;
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
     * @return the ContainersGetPropertiesHeaders object itself.
     */
    public ContainersGetPropertiesHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the xMsLeaseState property: The x-ms-lease-state property.
     * 
     * @return the xMsLeaseState value.
     */
    public LeaseStateType getXMsLeaseState() {
        return this.xMsLeaseState;
    }

    /**
     * Set the xMsLeaseState property: The x-ms-lease-state property.
     * 
     * @param xMsLeaseState the xMsLeaseState value to set.
     * @return the ContainersGetPropertiesHeaders object itself.
     */
    public ContainersGetPropertiesHeaders setXMsLeaseState(LeaseStateType xMsLeaseState) {
        this.xMsLeaseState = xMsLeaseState;
        return this;
    }

    /**
     * Get the xMsDenyEncryptionScopeOverride property: The
     * x-ms-deny-encryption-scope-override property.
     * 
     * @return the xMsDenyEncryptionScopeOverride value.
     */
    public Boolean isXMsDenyEncryptionScopeOverride() {
        return this.xMsDenyEncryptionScopeOverride;
    }

    /**
     * Set the xMsDenyEncryptionScopeOverride property: The
     * x-ms-deny-encryption-scope-override property.
     * 
     * @param xMsDenyEncryptionScopeOverride the xMsDenyEncryptionScopeOverride
     * value to set.
     * @return the ContainersGetPropertiesHeaders object itself.
     */
    public ContainersGetPropertiesHeaders setXMsDenyEncryptionScopeOverride(Boolean xMsDenyEncryptionScopeOverride) {
        this.xMsDenyEncryptionScopeOverride = xMsDenyEncryptionScopeOverride;
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
     * @return the ContainersGetPropertiesHeaders object itself.
     */
    public ContainersGetPropertiesHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the xMsMeta property: The x-ms-meta property.
     * 
     * @return the xMsMeta value.
     */
    public String getXMsMeta() {
        return this.xMsMeta;
    }

    /**
     * Set the xMsMeta property: The x-ms-meta property.
     * 
     * @param xMsMeta the xMsMeta value to set.
     * @return the ContainersGetPropertiesHeaders object itself.
     */
    public ContainersGetPropertiesHeaders setXMsMeta(String xMsMeta) {
        this.xMsMeta = xMsMeta;
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
     * @return the ContainersGetPropertiesHeaders object itself.
     */
    public ContainersGetPropertiesHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

    /**
     * Get the xMsHasLegalHold property: The x-ms-has-legal-hold property.
     * 
     * @return the xMsHasLegalHold value.
     */
    public Boolean isXMsHasLegalHold() {
        return this.xMsHasLegalHold;
    }

    /**
     * Set the xMsHasLegalHold property: The x-ms-has-legal-hold property.
     * 
     * @param xMsHasLegalHold the xMsHasLegalHold value to set.
     * @return the ContainersGetPropertiesHeaders object itself.
     */
    public ContainersGetPropertiesHeaders setXMsHasLegalHold(Boolean xMsHasLegalHold) {
        this.xMsHasLegalHold = xMsHasLegalHold;
        return this;
    }

    /**
     * Get the xMsDefaultEncryptionScope property: The
     * x-ms-default-encryption-scope property.
     * 
     * @return the xMsDefaultEncryptionScope value.
     */
    public String getXMsDefaultEncryptionScope() {
        return this.xMsDefaultEncryptionScope;
    }

    /**
     * Set the xMsDefaultEncryptionScope property: The
     * x-ms-default-encryption-scope property.
     * 
     * @param xMsDefaultEncryptionScope the xMsDefaultEncryptionScope value to
     * set.
     * @return the ContainersGetPropertiesHeaders object itself.
     */
    public ContainersGetPropertiesHeaders setXMsDefaultEncryptionScope(String xMsDefaultEncryptionScope) {
        this.xMsDefaultEncryptionScope = xMsDefaultEncryptionScope;
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
     * @return the ContainersGetPropertiesHeaders object itself.
     */
    public ContainersGetPropertiesHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the xMsHasImmutabilityPolicy property: The
     * x-ms-has-immutability-policy property.
     * 
     * @return the xMsHasImmutabilityPolicy value.
     */
    public Boolean isXMsHasImmutabilityPolicy() {
        return this.xMsHasImmutabilityPolicy;
    }

    /**
     * Set the xMsHasImmutabilityPolicy property: The
     * x-ms-has-immutability-policy property.
     * 
     * @param xMsHasImmutabilityPolicy the xMsHasImmutabilityPolicy value to
     * set.
     * @return the ContainersGetPropertiesHeaders object itself.
     */
    public ContainersGetPropertiesHeaders setXMsHasImmutabilityPolicy(Boolean xMsHasImmutabilityPolicy) {
        this.xMsHasImmutabilityPolicy = xMsHasImmutabilityPolicy;
        return this;
    }

    /**
     * Get the xMsLeaseDuration property: The x-ms-lease-duration property.
     * 
     * @return the xMsLeaseDuration value.
     */
    public LeaseDurationType getXMsLeaseDuration() {
        return this.xMsLeaseDuration;
    }

    /**
     * Set the xMsLeaseDuration property: The x-ms-lease-duration property.
     * 
     * @param xMsLeaseDuration the xMsLeaseDuration value to set.
     * @return the ContainersGetPropertiesHeaders object itself.
     */
    public ContainersGetPropertiesHeaders setXMsLeaseDuration(LeaseDurationType xMsLeaseDuration) {
        this.xMsLeaseDuration = xMsLeaseDuration;
        return this;
    }

    /**
     * Get the xMsBlobPublicAccess property: The x-ms-blob-public-access
     * property.
     * 
     * @return the xMsBlobPublicAccess value.
     */
    public PublicAccessType getXMsBlobPublicAccess() {
        return this.xMsBlobPublicAccess;
    }

    /**
     * Set the xMsBlobPublicAccess property: The x-ms-blob-public-access
     * property.
     * 
     * @param xMsBlobPublicAccess the xMsBlobPublicAccess value to set.
     * @return the ContainersGetPropertiesHeaders object itself.
     */
    public ContainersGetPropertiesHeaders setXMsBlobPublicAccess(PublicAccessType xMsBlobPublicAccess) {
        this.xMsBlobPublicAccess = xMsBlobPublicAccess;
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
     * @return the ContainersGetPropertiesHeaders object itself.
     */
    public ContainersGetPropertiesHeaders setXMsRequestId(String xMsRequestId) {
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
     * @return the ContainersGetPropertiesHeaders object itself.
     */
    public ContainersGetPropertiesHeaders setXMsClientRequestId(String xMsClientRequestId) {
        this.xMsClientRequestId = xMsClientRequestId;
        return this;
    }

    public void validate() {
    }
}
