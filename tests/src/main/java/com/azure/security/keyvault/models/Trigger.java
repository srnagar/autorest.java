package com.azure.security.keyvault.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Trigger model.
 */
@Fluent
public final class Trigger {
    /*
     * Percentage of lifetime at which to trigger. Value should be between 1
     * and 99.
     */
    @JsonProperty(value = "lifetime_percentage")
    private Integer lifetimePercentage;

    /*
     * Days before expiry to attempt renewal. Value should be between 1 and
     * validity_in_months multiplied by 27. If validity_in_months is 36, then
     * value should be between 1 and 972 (36 * 27).
     */
    @JsonProperty(value = "days_before_expiry")
    private Integer daysBeforeExpiry;

    /**
     * Get the lifetimePercentage property: Percentage of lifetime at which to
     * trigger. Value should be between 1 and 99.
     * 
     * @return the lifetimePercentage value.
     */
    public Integer getLifetimePercentage() {
        return this.lifetimePercentage;
    }

    /**
     * Set the lifetimePercentage property: Percentage of lifetime at which to
     * trigger. Value should be between 1 and 99.
     * 
     * @param lifetimePercentage the lifetimePercentage value to set.
     * @return the Trigger object itself.
     */
    public Trigger setLifetimePercentage(Integer lifetimePercentage) {
        this.lifetimePercentage = lifetimePercentage;
        return this;
    }

    /**
     * Get the daysBeforeExpiry property: Days before expiry to attempt
     * renewal. Value should be between 1 and validity_in_months multiplied by
     * 27. If validity_in_months is 36, then value should be between 1 and 972
     * (36 * 27).
     * 
     * @return the daysBeforeExpiry value.
     */
    public Integer getDaysBeforeExpiry() {
        return this.daysBeforeExpiry;
    }

    /**
     * Set the daysBeforeExpiry property: Days before expiry to attempt
     * renewal. Value should be between 1 and validity_in_months multiplied by
     * 27. If validity_in_months is 36, then value should be between 1 and 972
     * (36 * 27).
     * 
     * @param daysBeforeExpiry the daysBeforeExpiry value to set.
     * @return the Trigger object itself.
     */
    public Trigger setDaysBeforeExpiry(Integer daysBeforeExpiry) {
        this.daysBeforeExpiry = daysBeforeExpiry;
        return this;
    }

    public void validate() {
    }
}
