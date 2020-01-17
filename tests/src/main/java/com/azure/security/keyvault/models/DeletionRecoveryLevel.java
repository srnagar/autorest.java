package com.azure.security.keyvault.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for DeletionRecoveryLevel.
 */
public final class DeletionRecoveryLevel extends ExpandableStringEnum<DeletionRecoveryLevel> {
    /**
     * Static value Purgeable for DeletionRecoveryLevel.
     */
    public static final DeletionRecoveryLevel PURGEABLE = fromString("Purgeable");

    /**
     * Static value Recoverable+Purgeable for DeletionRecoveryLevel.
     */
    public static final DeletionRecoveryLevel RECOVERABLE_PURGEABLE = fromString("Recoverable+Purgeable");

    /**
     * Static value Recoverable for DeletionRecoveryLevel.
     */
    public static final DeletionRecoveryLevel RECOVERABLE = fromString("Recoverable");

    /**
     * Static value Recoverable+ProtectedSubscription for DeletionRecoveryLevel.
     */
    public static final DeletionRecoveryLevel RECOVERABLE_PROTECTED_SUBSCRIPTION = fromString("Recoverable+ProtectedSubscription");

    /**
     * Creates or finds a DeletionRecoveryLevel from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DeletionRecoveryLevel.
     */
    @JsonCreator
    public static DeletionRecoveryLevel fromString(String name) {
        return fromString(name, DeletionRecoveryLevel.class);
    }

    /**
     * @return known DeletionRecoveryLevel values.
     */
    public static Collection<DeletionRecoveryLevel> values() {
        return values(DeletionRecoveryLevel.class);
    }
}
