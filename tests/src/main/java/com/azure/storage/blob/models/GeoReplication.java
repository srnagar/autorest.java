package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The GeoReplication model.
 */
@Fluent
public final class GeoReplication {
    /*
     * The status of the secondary location
     */
    @JsonProperty(value = "Status", required = true)
    private GeoReplicationStatusType status;

    /*
     * A GMT date/time value, to the second. All primary writes preceding this
     * value are guaranteed to be available for read operations at the
     * secondary. Primary writes after this point in time may or may not be
     * available for reads.
     */
    @JsonProperty(value = "LastSyncTime", required = true)
    private DateTimeRfc1123 lastSyncTime;

    /**
     * Get the status property: The status of the secondary location.
     * 
     * @return the status value.
     */
    public GeoReplicationStatusType getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status of the secondary location.
     * 
     * @param status the status value to set.
     * @return the GeoReplication object itself.
     */
    public GeoReplication setStatus(GeoReplicationStatusType status) {
        this.status = status;
        return this;
    }

    /**
     * Get the lastSyncTime property: A GMT date/time value, to the second. All
     * primary writes preceding this value are guaranteed to be available for
     * read operations at the secondary. Primary writes after this point in
     * time may or may not be available for reads.
     * 
     * @return the lastSyncTime value.
     */
    public OffsetDateTime getLastSyncTime() {
        if (this.lastSyncTime == null) {
            return null;
        }
        return this.lastSyncTime.getDateTime();
    }

    /**
     * Set the lastSyncTime property: A GMT date/time value, to the second. All
     * primary writes preceding this value are guaranteed to be available for
     * read operations at the secondary. Primary writes after this point in
     * time may or may not be available for reads.
     * 
     * @param lastSyncTime the lastSyncTime value to set.
     * @return the GeoReplication object itself.
     */
    public GeoReplication setLastSyncTime(OffsetDateTime lastSyncTime) {
        if (lastSyncTime == null) {
            this.lastSyncTime = null;
        } else {
            this.lastSyncTime = new DateTimeRfc1123(lastSyncTime);
        }
        return this;
    }

    public void validate() {
        if (getStatus() == null) {
            throw new IllegalArgumentException("Missing required property status in model GeoReplication");
        }
        if (getLastSyncTime() == null) {
            throw new IllegalArgumentException("Missing required property lastSyncTime in model GeoReplication");
        }
    }
}
