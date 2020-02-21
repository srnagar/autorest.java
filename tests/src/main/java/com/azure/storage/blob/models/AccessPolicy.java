package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The AccessPolicy model.
 */
@Fluent
public final class AccessPolicy {
    /*
     * the date-time the policy is active
     */
    @JsonProperty(value = "Start")
    private OffsetDateTime start;

    /*
     * the date-time the policy expires
     */
    @JsonProperty(value = "Expiry")
    private OffsetDateTime expiry;

    /*
     * the permissions for the acl policy
     */
    @JsonProperty(value = "Permission")
    private String permission;

    /**
     * Get the start property: the date-time the policy is active.
     * 
     * @return the start value.
     */
    public OffsetDateTime getStart() {
        return this.start;
    }

    /**
     * Set the start property: the date-time the policy is active.
     * 
     * @param start the start value to set.
     * @return the AccessPolicy object itself.
     */
    public AccessPolicy setStart(OffsetDateTime start) {
        this.start = start;
        return this;
    }

    /**
     * Get the expiry property: the date-time the policy expires.
     * 
     * @return the expiry value.
     */
    public OffsetDateTime getExpiry() {
        return this.expiry;
    }

    /**
     * Set the expiry property: the date-time the policy expires.
     * 
     * @param expiry the expiry value to set.
     * @return the AccessPolicy object itself.
     */
    public AccessPolicy setExpiry(OffsetDateTime expiry) {
        this.expiry = expiry;
        return this;
    }

    /**
     * Get the permission property: the permissions for the acl policy.
     * 
     * @return the permission value.
     */
    public String getPermission() {
        return this.permission;
    }

    /**
     * Set the permission property: the permissions for the acl policy.
     * 
     * @param permission the permission value to set.
     * @return the AccessPolicy object itself.
     */
    public AccessPolicy setPermission(String permission) {
        this.permission = permission;
        return this;
    }

    public void validate() {
    }
}
