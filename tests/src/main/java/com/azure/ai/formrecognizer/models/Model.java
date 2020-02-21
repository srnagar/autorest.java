package com.azure.ai.formrecognizer.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Model model.
 */
@Fluent
public final class Model {
    /*
     * Basic custom model information.
     */
    @JsonProperty(value = "modelInfo", required = true)
    private ModelInfo modelInfo;

    /*
     * Keys extracted by the custom model.
     */
    @JsonProperty(value = "keys")
    private KeysResult keys;

    /*
     * Custom model training result.
     */
    @JsonProperty(value = "trainResult")
    private TrainResult trainResult;

    /**
     * Get the modelInfo property: Basic custom model information.
     * 
     * @return the modelInfo value.
     */
    public ModelInfo getModelInfo() {
        return this.modelInfo;
    }

    /**
     * Set the modelInfo property: Basic custom model information.
     * 
     * @param modelInfo the modelInfo value to set.
     * @return the Model object itself.
     */
    public Model setModelInfo(ModelInfo modelInfo) {
        this.modelInfo = modelInfo;
        return this;
    }

    /**
     * Get the keys property: Keys extracted by the custom model.
     * 
     * @return the keys value.
     */
    public KeysResult getKeys() {
        return this.keys;
    }

    /**
     * Set the keys property: Keys extracted by the custom model.
     * 
     * @param keys the keys value to set.
     * @return the Model object itself.
     */
    public Model setKeys(KeysResult keys) {
        this.keys = keys;
        return this;
    }

    /**
     * Get the trainResult property: Custom model training result.
     * 
     * @return the trainResult value.
     */
    public TrainResult getTrainResult() {
        return this.trainResult;
    }

    /**
     * Set the trainResult property: Custom model training result.
     * 
     * @param trainResult the trainResult value to set.
     * @return the Model object itself.
     */
    public Model setTrainResult(TrainResult trainResult) {
        this.trainResult = trainResult;
        return this;
    }

    public void validate() {
        if (getModelInfo() == null) {
            throw new IllegalArgumentException("Missing required property modelInfo in model Model");
        } else {
            getModelInfo().validate();
        }
        if (getKeys() != null) {
            getKeys().validate();
        }
        if (getTrainResult() != null) {
            getTrainResult().validate();
        }
    }
}
