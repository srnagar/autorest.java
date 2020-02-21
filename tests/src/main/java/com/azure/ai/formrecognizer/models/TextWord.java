package com.azure.ai.formrecognizer.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The TextWord model.
 */
@Fluent
public final class TextWord {
    /*
     * The text content of the word.
     */
    @JsonProperty(value = "text", required = true)
    private String text;

    /*
     * Quadrangle bounding box, with coordinates specified relative to the
     * top-left of the original image. The eight numbers represent the four
     * points, clockwise from the top-left corner relative to the text
     * orientation. For image, the (x, y) coordinates are measured in pixels.
     * For PDF, the (x, y) coordinates are measured in inches.
     */
    @JsonProperty(value = "boundingBox", required = true)
    private List<Float> boundingBox;

    /*
     * Confidence value.
     */
    @JsonProperty(value = "confidence")
    private Float confidence;

    /**
     * Get the text property: The text content of the word.
     * 
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Set the text property: The text content of the word.
     * 
     * @param text the text value to set.
     * @return the TextWord object itself.
     */
    public TextWord setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the boundingBox property: Quadrangle bounding box, with coordinates
     * specified relative to the top-left of the original image. The eight
     * numbers represent the four points, clockwise from the top-left corner
     * relative to the text orientation. For image, the (x, y) coordinates are
     * measured in pixels. For PDF, the (x, y) coordinates are measured in
     * inches.
     * 
     * @return the boundingBox value.
     */
    public List<Float> getBoundingBox() {
        return this.boundingBox;
    }

    /**
     * Set the boundingBox property: Quadrangle bounding box, with coordinates
     * specified relative to the top-left of the original image. The eight
     * numbers represent the four points, clockwise from the top-left corner
     * relative to the text orientation. For image, the (x, y) coordinates are
     * measured in pixels. For PDF, the (x, y) coordinates are measured in
     * inches.
     * 
     * @param boundingBox the boundingBox value to set.
     * @return the TextWord object itself.
     */
    public TextWord setBoundingBox(List<Float> boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    /**
     * Get the confidence property: Confidence value.
     * 
     * @return the confidence value.
     */
    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * Set the confidence property: Confidence value.
     * 
     * @param confidence the confidence value to set.
     * @return the TextWord object itself.
     */
    public TextWord setConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    public void validate() {
        if (getText() == null) {
            throw new IllegalArgumentException("Missing required property text in model TextWord");
        }
        if (getBoundingBox() == null) {
            throw new IllegalArgumentException("Missing required property boundingBox in model TextWord");
        }
    }
}
