package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The ContainerProperties model.
 */
@Fluent
public final class ContainerProperties {
    /*
     * The Last-Modified property.
     */
    @JsonProperty(value = "Last-Modified", required = true)
    private DateTimeRfc1123 lastModified;

    /*
     * The Etag property.
     */
    @JsonProperty(value = "Etag", required = true)
    private String etag;

    /*
     * The LeaseStatus property.
     */
    @JsonProperty(value = "LeaseStatus")
    private LeaseStatusType leaseStatus;

    /*
     * The LeaseState property.
     */
    @JsonProperty(value = "LeaseState")
    private LeaseStateType leaseState;

    /*
     * The LeaseDuration property.
     */
    @JsonProperty(value = "LeaseDuration")
    private LeaseDurationType leaseDuration;

    /*
     * The PublicAccess property.
     */
    @JsonProperty(value = "PublicAccess")
    private PublicAccessType publicAccess;

    /*
     * The HasImmutabilityPolicy property.
     */
    @JsonProperty(value = "HasImmutabilityPolicy")
    private Boolean hasImmutabilityPolicy;

    /*
     * The HasLegalHold property.
     */
    @JsonProperty(value = "HasLegalHold")
    private Boolean hasLegalHold;

    /*
     * The DefaultEncryptionScope property.
     */
    @JsonProperty(value = "DefaultEncryptionScope")
    private String defaultEncryptionScope;

    /*
     * The DenyEncryptionScopeOverride property.
     */
    @JsonProperty(value = "DenyEncryptionScopeOverride")
    private Boolean preventEncryptionScopeOverride;

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
     * @return the ContainerProperties object itself.
     */
    public ContainerProperties setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the etag property: The Etag property.
     * 
     * @return the etag value.
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Set the etag property: The Etag property.
     * 
     * @param etag the etag value to set.
     * @return the ContainerProperties object itself.
     */
    public ContainerProperties setEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the leaseStatus property: The LeaseStatus property.
     * 
     * @return the leaseStatus value.
     */
    public LeaseStatusType getLeaseStatus() {
        return this.leaseStatus;
    }

    /**
     * Set the leaseStatus property: The LeaseStatus property.
     * 
     * @param leaseStatus the leaseStatus value to set.
     * @return the ContainerProperties object itself.
     */
    public ContainerProperties setLeaseStatus(LeaseStatusType leaseStatus) {
        this.leaseStatus = leaseStatus;
        return this;
    }

    /**
     * Get the leaseState property: The LeaseState property.
     * 
     * @return the leaseState value.
     */
    public LeaseStateType getLeaseState() {
        return this.leaseState;
    }

    /**
     * Set the leaseState property: The LeaseState property.
     * 
     * @param leaseState the leaseState value to set.
     * @return the ContainerProperties object itself.
     */
    public ContainerProperties setLeaseState(LeaseStateType leaseState) {
        this.leaseState = leaseState;
        return this;
    }

    /**
     * Get the leaseDuration property: The LeaseDuration property.
     * 
     * @return the leaseDuration value.
     */
    public LeaseDurationType getLeaseDuration() {
        return this.leaseDuration;
    }

    /**
     * Set the leaseDuration property: The LeaseDuration property.
     * 
     * @param leaseDuration the leaseDuration value to set.
     * @return the ContainerProperties object itself.
     */
    public ContainerProperties setLeaseDuration(LeaseDurationType leaseDuration) {
        this.leaseDuration = leaseDuration;
        return this;
    }

    /**
     * Get the publicAccess property: The PublicAccess property.
     * 
     * @return the publicAccess value.
     */
    public PublicAccessType getPublicAccess() {
        return this.publicAccess;
    }

    /**
     * Set the publicAccess property: The PublicAccess property.
     * 
     * @param publicAccess the publicAccess value to set.
     * @return the ContainerProperties object itself.
     */
    public ContainerProperties setPublicAccess(PublicAccessType publicAccess) {
        this.publicAccess = publicAccess;
        return this;
    }

    /**
     * Get the hasImmutabilityPolicy property: The HasImmutabilityPolicy
     * property.
     * 
     * @return the hasImmutabilityPolicy value.
     */
    public Boolean isHasImmutabilityPolicy() {
        return this.hasImmutabilityPolicy;
    }

    /**
     * Set the hasImmutabilityPolicy property: The HasImmutabilityPolicy
     * property.
     * 
     * @param hasImmutabilityPolicy the hasImmutabilityPolicy value to set.
     * @return the ContainerProperties object itself.
     */
    public ContainerProperties setHasImmutabilityPolicy(Boolean hasImmutabilityPolicy) {
        this.hasImmutabilityPolicy = hasImmutabilityPolicy;
        return this;
    }

    /**
     * Get the hasLegalHold property: The HasLegalHold property.
     * 
     * @return the hasLegalHold value.
     */
    public Boolean isHasLegalHold() {
        return this.hasLegalHold;
    }

    /**
     * Set the hasLegalHold property: The HasLegalHold property.
     * 
     * @param hasLegalHold the hasLegalHold value to set.
     * @return the ContainerProperties object itself.
     */
    public ContainerProperties setHasLegalHold(Boolean hasLegalHold) {
        this.hasLegalHold = hasLegalHold;
        return this;
    }

    /**
     * Get the defaultEncryptionScope property: The DefaultEncryptionScope
     * property.
     * 
     * @return the defaultEncryptionScope value.
     */
    public String getDefaultEncryptionScope() {
        return this.defaultEncryptionScope;
    }

    /**
     * Set the defaultEncryptionScope property: The DefaultEncryptionScope
     * property.
     * 
     * @param defaultEncryptionScope the defaultEncryptionScope value to set.
     * @return the ContainerProperties object itself.
     */
    public ContainerProperties setDefaultEncryptionScope(String defaultEncryptionScope) {
        this.defaultEncryptionScope = defaultEncryptionScope;
        return this;
    }

    /**
     * Get the preventEncryptionScopeOverride property: The
     * DenyEncryptionScopeOverride property.
     * 
     * @return the preventEncryptionScopeOverride value.
     */
    public Boolean isPreventEncryptionScopeOverride() {
        return this.preventEncryptionScopeOverride;
    }

    /**
     * Set the preventEncryptionScopeOverride property: The
     * DenyEncryptionScopeOverride property.
     * 
     * @param preventEncryptionScopeOverride the preventEncryptionScopeOverride
     * value to set.
     * @return the ContainerProperties object itself.
     */
    public ContainerProperties setPreventEncryptionScopeOverride(Boolean preventEncryptionScopeOverride) {
        this.preventEncryptionScopeOverride = preventEncryptionScopeOverride;
        return this;
    }

    public void validate() {
        if (getLastModified() == null) {
            throw new IllegalArgumentException("Missing required property lastModified in model ContainerProperties");
        }
        if (getEtag() == null) {
            throw new IllegalArgumentException("Missing required property etag in model ContainerProperties");
        }
    }
}
