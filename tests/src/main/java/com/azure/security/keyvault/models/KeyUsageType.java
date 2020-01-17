package com.azure.security.keyvault.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for KeyUsageType.
 */
public final class KeyUsageType extends ExpandableStringEnum<KeyUsageType> {
    /**
     * Static value digitalSignature for KeyUsageType.
     */
    public static final KeyUsageType DIGITAL_SIGNATURE = fromString("digitalSignature");

    /**
     * Static value nonRepudiation for KeyUsageType.
     */
    public static final KeyUsageType NON_REPUDIATION = fromString("nonRepudiation");

    /**
     * Static value keyEncipherment for KeyUsageType.
     */
    public static final KeyUsageType KEY_ENCIPHERMENT = fromString("keyEncipherment");

    /**
     * Static value dataEncipherment for KeyUsageType.
     */
    public static final KeyUsageType DATA_ENCIPHERMENT = fromString("dataEncipherment");

    /**
     * Static value keyAgreement for KeyUsageType.
     */
    public static final KeyUsageType KEY_AGREEMENT = fromString("keyAgreement");

    /**
     * Static value keyCertSign for KeyUsageType.
     */
    public static final KeyUsageType KEY_CERT_SIGN = fromString("keyCertSign");

    /**
     * Static value cRLSign for KeyUsageType.
     */
    public static final KeyUsageType C_RLSIGN = fromString("cRLSign");

    /**
     * Static value encipherOnly for KeyUsageType.
     */
    public static final KeyUsageType ENCIPHER_ONLY = fromString("encipherOnly");

    /**
     * Static value decipherOnly for KeyUsageType.
     */
    public static final KeyUsageType DECIPHER_ONLY = fromString("decipherOnly");

    /**
     * Creates or finds a KeyUsageType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding KeyUsageType.
     */
    @JsonCreator
    public static KeyUsageType fromString(String name) {
        return fromString(name, KeyUsageType.class);
    }

    /**
     * @return known KeyUsageType values.
     */
    public static Collection<KeyUsageType> values() {
        return values(KeyUsageType.class);
    }
}
