package com.azure.security.keyvault.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for JsonWebKeyCurveName.
 */
public final class JsonWebKeyCurveName extends ExpandableStringEnum<JsonWebKeyCurveName> {
    /**
     * Static value P-256 for JsonWebKeyCurveName.
     */
    public static final JsonWebKeyCurveName P_256 = fromString("P-256");

    /**
     * Static value P-384 for JsonWebKeyCurveName.
     */
    public static final JsonWebKeyCurveName P_384 = fromString("P-384");

    /**
     * Static value P-521 for JsonWebKeyCurveName.
     */
    public static final JsonWebKeyCurveName P_521 = fromString("P-521");

    /**
     * Static value P-256K for JsonWebKeyCurveName.
     */
    public static final JsonWebKeyCurveName P_256K = fromString("P-256K");

    /**
     * Creates or finds a JsonWebKeyCurveName from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding JsonWebKeyCurveName.
     */
    @JsonCreator
    public static JsonWebKeyCurveName fromString(String name) {
        return fromString(name, JsonWebKeyCurveName.class);
    }

    /**
     * @return known JsonWebKeyCurveName values.
     */
    public static Collection<JsonWebKeyCurveName> values() {
        return values(JsonWebKeyCurveName.class);
    }
}
