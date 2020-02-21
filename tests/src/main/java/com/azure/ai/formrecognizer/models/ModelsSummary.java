package com.azure.ai.formrecognizer.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The ModelsSummary model.
 */
@Fluent
public final class ModelsSummary {
    /*
     * Current count of trained custom models.
     */
    @JsonProperty(value = "count", required = true)
    private int count;

    /*
     * Max number of models that can be trained for this subscription.
     */
    @JsonProperty(value = "limit", required = true)
    private int limit;

    /*
     * Date and time (UTC) when the summary was last updated.
     */
    @JsonProperty(value = "lastUpdatedDateTime", required = true)
    private OffsetDateTime lastUpdatedDateTime;

    /**
     * Get the count property: Current count of trained custom models.
     * 
     * @return the count value.
     */
    public int getCount() {
        return this.count;
    }

    /**
     * Set the count property: Current count of trained custom models.
     * 
     * @param count the count value to set.
     * @return the ModelsSummary object itself.
     */
    public ModelsSummary setCount(int count) {
        this.count = count;
        return this;
    }

    /**
     * Get the limit property: Max number of models that can be trained for
     * this subscription.
     * 
     * @return the limit value.
     */
    public int getLimit() {
        return this.limit;
    }

    /**
     * Set the limit property: Max number of models that can be trained for
     * this subscription.
     * 
     * @param limit the limit value to set.
     * @return the ModelsSummary object itself.
     */
    public ModelsSummary setLimit(int limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the lastUpdatedDateTime property: Date and time (UTC) when the
     * summary was last updated.
     * 
     * @return the lastUpdatedDateTime value.
     */
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * Set the lastUpdatedDateTime property: Date and time (UTC) when the
     * summary was last updated.
     * 
     * @param lastUpdatedDateTime the lastUpdatedDateTime value to set.
     * @return the ModelsSummary object itself.
     */
    public ModelsSummary setLastUpdatedDateTime(OffsetDateTime lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
        return this;
    }

    public void validate() {
        if (getLastUpdatedDateTime() == null) {
            throw new IllegalArgumentException("Missing required property lastUpdatedDateTime in model ModelsSummary");
        }
    }
}
