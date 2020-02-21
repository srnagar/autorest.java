package com.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for AccountKind.
 */
public enum AccountKind {
    /**
     * Enum value Storage.
     */
    STORAGE("Storage"),

    /**
     * Enum value BlobStorage.
     */
    BLOB_STORAGE("BlobStorage"),

    /**
     * Enum value StorageV2.
     */
    STORAGE_V2("StorageV2");

    /**
     * The actual serialized value for a AccountKind instance.
     */
    private final String value;

    AccountKind(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AccountKind instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed AccountKind object, or null if unable to parse.
     */
    @JsonCreator
    public static AccountKind fromString(String value) {
        AccountKind[] items = AccountKind.values();
        for (AccountKind item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
