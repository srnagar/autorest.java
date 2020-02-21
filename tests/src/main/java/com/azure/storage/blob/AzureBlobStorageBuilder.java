package com.azure.storage.blob;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.storage.blob.models.PathRenameMode;

/**
 * A builder for creating a new instance of the AzureBlobStorage type.
 */
@ServiceClientBuilder(serviceClients = AzureBlobStorage.class)
public final class AzureBlobStorageBuilder {
    /*
     * The URL of the service account, container, or blob that is the targe of the desired operation.
     */
    private String url;

    /**
     * Sets The URL of the service account, container, or blob that is the targe of the desired operation.
     * 
     * @param url the url value.
     * @return the AzureBlobStorageBuilder.
     */
    public AzureBlobStorageBuilder url(String url) {
        this.url = url;
        return this;
    }

    /*
     * Specifies the version of the operation to use for this request.
     */
    private String version;

    /**
     * Sets Specifies the version of the operation to use for this request.
     * 
     * @param version the version value.
     * @return the AzureBlobStorageBuilder.
     */
    public AzureBlobStorageBuilder version(String version) {
        this.version = version;
        return this;
    }

    /*
     * Determines the behavior of the rename operation
     */
    private PathRenameMode pathRenameMode;

    /**
     * Sets Determines the behavior of the rename operation.
     * 
     * @param pathRenameMode the pathRenameMode value.
     * @return the AzureBlobStorageBuilder.
     */
    public AzureBlobStorageBuilder pathRenameMode(PathRenameMode pathRenameMode) {
        this.pathRenameMode = pathRenameMode;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     * 
     * @param pipeline the pipeline value.
     * @return the AzureBlobStorageBuilder.
     */
    public AzureBlobStorageBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Builds an instance of AzureBlobStorage with the provided parameters.
     * 
     * @return an instance of AzureBlobStorage.
     */
    public AzureBlobStorage build() {
        if (pipeline == null) {
            this.pipeline = new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build();
        }
        AzureBlobStorage client = new AzureBlobStorage(pipeline);
        client.setUrl(this.url);
        client.setVersion(this.version);
        client.setPathRenameMode(this.pathRenameMode);
        return client;
    }
}
