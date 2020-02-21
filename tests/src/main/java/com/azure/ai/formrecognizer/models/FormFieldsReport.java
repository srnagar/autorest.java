package com.azure.ai.formrecognizer.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The FormFieldsReport model.
 */
@Fluent
public final class FormFieldsReport {
    /*
     * Training field name.
     */
    @JsonProperty(value = "fieldName", required = true)
    private String fieldName;

    /*
     * Estimated extraction accuracy for this field.
     */
    @JsonProperty(value = "accuracy", required = true)
    private float accuracy;

    /**
     * Get the fieldName property: Training field name.
     * 
     * @return the fieldName value.
     */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * Set the fieldName property: Training field name.
     * 
     * @param fieldName the fieldName value to set.
     * @return the FormFieldsReport object itself.
     */
    public FormFieldsReport setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * Get the accuracy property: Estimated extraction accuracy for this field.
     * 
     * @return the accuracy value.
     */
    public float getAccuracy() {
        return this.accuracy;
    }

    /**
     * Set the accuracy property: Estimated extraction accuracy for this field.
     * 
     * @param accuracy the accuracy value to set.
     * @return the FormFieldsReport object itself.
     */
    public FormFieldsReport setAccuracy(float accuracy) {
        this.accuracy = accuracy;
        return this;
    }

    public void validate() {
        if (getFieldName() == null) {
            throw new IllegalArgumentException("Missing required property fieldName in model FormFieldsReport");
        }
    }
}
