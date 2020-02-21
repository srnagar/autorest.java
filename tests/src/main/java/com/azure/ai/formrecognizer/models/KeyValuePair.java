package com.azure.ai.formrecognizer.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The KeyValuePair model.
 */
@Fluent
public final class KeyValuePair {
    /*
     * A user defined label for the key/value pair entry.
     */
    @JsonProperty(value = "label")
    private String label;

    /*
     * Information about the extracted key or value in a key-value pair.
     */
    @JsonProperty(value = "key", required = true)
    private KeyValueElement key;

    /*
     * Information about the extracted key or value in a key-value pair.
     */
    @JsonProperty(value = "value", required = true)
    private KeyValueElement value;

    /*
     * Confidence value.
     */
    @JsonProperty(value = "confidence", required = true)
    private float confidence;

    /**
     * Get the label property: A user defined label for the key/value pair
     * entry.
     * 
     * @return the label value.
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Set the label property: A user defined label for the key/value pair
     * entry.
     * 
     * @param label the label value to set.
     * @return the KeyValuePair object itself.
     */
    public KeyValuePair setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the key property: Information about the extracted key or value in a
     * key-value pair.
     * 
     * @return the key value.
     */
    public KeyValueElement getKey() {
        return this.key;
    }

    /**
     * Set the key property: Information about the extracted key or value in a
     * key-value pair.
     * 
     * @param key the key value to set.
     * @return the KeyValuePair object itself.
     */
    public KeyValuePair setKey(KeyValueElement key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value property: Information about the extracted key or value in
     * a key-value pair.
     * 
     * @return the value value.
     */
    public KeyValueElement getValue() {
        return this.value;
    }

    /**
     * Set the value property: Information about the extracted key or value in
     * a key-value pair.
     * 
     * @param value the value value to set.
     * @return the KeyValuePair object itself.
     */
    public KeyValuePair setValue(KeyValueElement value) {
        this.value = value;
        return this;
    }

    /**
     * Get the confidence property: Confidence value.
     * 
     * @return the confidence value.
     */
    public float getConfidence() {
        return this.confidence;
    }

    /**
     * Set the confidence property: Confidence value.
     * 
     * @param confidence the confidence value to set.
     * @return the KeyValuePair object itself.
     */
    public KeyValuePair setConfidence(float confidence) {
        this.confidence = confidence;
        return this;
    }

    public void validate() {
        if (getKey() == null) {
            throw new IllegalArgumentException("Missing required property key in model KeyValuePair");
        } else {
            getKey().validate();
        }
        if (getValue() == null) {
            throw new IllegalArgumentException("Missing required property value in model KeyValuePair");
        } else {
            getValue().validate();
        }
    }
}
