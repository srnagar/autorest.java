package com.azure.ai.formrecognizer.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The TextLine model.
 */
@Fluent
public final class TextLine {
    /*
     * The text content of the line.
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
     * Language code
     */
    @JsonProperty(value = "language")
    private Language language;

    /*
     * List of words in the text line.
     */
    @JsonProperty(value = "words", required = true)
    private List<TextWord> words;

    /**
     * Get the text property: The text content of the line.
     * 
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Set the text property: The text content of the line.
     * 
     * @param text the text value to set.
     * @return the TextLine object itself.
     */
    public TextLine setText(String text) {
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
     * @return the TextLine object itself.
     */
    public TextLine setBoundingBox(List<Float> boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    /**
     * Get the language property: Language code.
     * 
     * @return the language value.
     */
    public Language getLanguage() {
        return this.language;
    }

    /**
     * Set the language property: Language code.
     * 
     * @param language the language value to set.
     * @return the TextLine object itself.
     */
    public TextLine setLanguage(Language language) {
        this.language = language;
        return this;
    }

    /**
     * Get the words property: List of words in the text line.
     * 
     * @return the words value.
     */
    public List<TextWord> getWords() {
        return this.words;
    }

    /**
     * Set the words property: List of words in the text line.
     * 
     * @param words the words value to set.
     * @return the TextLine object itself.
     */
    public TextLine setWords(List<TextWord> words) {
        this.words = words;
        return this;
    }

    public void validate() {
        if (getText() == null) {
            throw new IllegalArgumentException("Missing required property text in model TextLine");
        }
        if (getBoundingBox() == null) {
            throw new IllegalArgumentException("Missing required property boundingBox in model TextLine");
        }
        if (getWords() == null) {
            throw new IllegalArgumentException("Missing required property words in model TextLine");
        } else {
            getWords().forEach(e -> e.validate());
        }
    }
}
