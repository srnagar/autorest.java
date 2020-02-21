package com.azure.storage.blob.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for PremiumPageBlobAccessTier.
 */
public final class PremiumPageBlobAccessTier extends ExpandableStringEnum<PremiumPageBlobAccessTier> {
    /**
     * Static value P4 for PremiumPageBlobAccessTier.
     */
    public static final PremiumPageBlobAccessTier P4 = fromString("P4");

    /**
     * Static value P6 for PremiumPageBlobAccessTier.
     */
    public static final PremiumPageBlobAccessTier P6 = fromString("P6");

    /**
     * Static value P10 for PremiumPageBlobAccessTier.
     */
    public static final PremiumPageBlobAccessTier P10 = fromString("P10");

    /**
     * Static value P15 for PremiumPageBlobAccessTier.
     */
    public static final PremiumPageBlobAccessTier P15 = fromString("P15");

    /**
     * Static value P20 for PremiumPageBlobAccessTier.
     */
    public static final PremiumPageBlobAccessTier P20 = fromString("P20");

    /**
     * Static value P30 for PremiumPageBlobAccessTier.
     */
    public static final PremiumPageBlobAccessTier P30 = fromString("P30");

    /**
     * Static value P40 for PremiumPageBlobAccessTier.
     */
    public static final PremiumPageBlobAccessTier P40 = fromString("P40");

    /**
     * Static value P50 for PremiumPageBlobAccessTier.
     */
    public static final PremiumPageBlobAccessTier P50 = fromString("P50");

    /**
     * Static value P60 for PremiumPageBlobAccessTier.
     */
    public static final PremiumPageBlobAccessTier P60 = fromString("P60");

    /**
     * Static value P70 for PremiumPageBlobAccessTier.
     */
    public static final PremiumPageBlobAccessTier P70 = fromString("P70");

    /**
     * Static value P80 for PremiumPageBlobAccessTier.
     */
    public static final PremiumPageBlobAccessTier P80 = fromString("P80");

    /**
     * Creates or finds a PremiumPageBlobAccessTier from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PremiumPageBlobAccessTier.
     */
    @JsonCreator
    public static PremiumPageBlobAccessTier fromString(String name) {
        return fromString(name, PremiumPageBlobAccessTier.class);
    }

    /**
     * @return known PremiumPageBlobAccessTier values.
     */
    public static Collection<PremiumPageBlobAccessTier> values() {
        return values(PremiumPageBlobAccessTier.class);
    }
}
