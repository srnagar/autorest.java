package com.azure.storage.blob;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.storage.blob.models.PathRenameMode;

/**
 * Initializes a new instance of the AzureBlobStorage type.
 */
public final class AzureBlobStorage {
    /**
     * The URL of the service account, container, or blob that is the targe of the desired operation.
     */
    private String url;

    /**
     * Gets The URL of the service account, container, or blob that is the targe of the desired operation.
     * 
     * @return the url value.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Sets The URL of the service account, container, or blob that is the targe of the desired operation.
     * 
     * @param url the url value.
     * @return the service client itself.
     */
    AzureBlobStorage setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Specifies the version of the operation to use for this request.
     */
    private String version;

    /**
     * Gets Specifies the version of the operation to use for this request.
     * 
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Sets Specifies the version of the operation to use for this request.
     * 
     * @param version the version value.
     * @return the service client itself.
     */
    AzureBlobStorage setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Determines the behavior of the rename operation.
     */
    private PathRenameMode pathRenameMode;

    /**
     * Gets Determines the behavior of the rename operation.
     * 
     * @return the pathRenameMode value.
     */
    public PathRenameMode getPathRenameMode() {
        return this.pathRenameMode;
    }

    /**
     * Sets Determines the behavior of the rename operation.
     * 
     * @param pathRenameMode the pathRenameMode value.
     * @return the service client itself.
     */
    AzureBlobStorage setPathRenameMode(PathRenameMode pathRenameMode) {
        this.pathRenameMode = pathRenameMode;
        return this;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The Services object to access its operations.
     */
    private Services services;

    /**
     * Gets the Services object to access its operations.
     * 
     * @return the Services object.
     */
    public Services services() {
        return this.services;
    }

    /**
     * The Containers object to access its operations.
     */
    private Containers containers;

    /**
     * Gets the Containers object to access its operations.
     * 
     * @return the Containers object.
     */
    public Containers containers() {
        return this.containers;
    }

    /**
     * The Directorys object to access its operations.
     */
    private Directorys directorys;

    /**
     * Gets the Directorys object to access its operations.
     * 
     * @return the Directorys object.
     */
    public Directorys directorys() {
        return this.directorys;
    }

    /**
     * The Blobs object to access its operations.
     */
    private Blobs blobs;

    /**
     * Gets the Blobs object to access its operations.
     * 
     * @return the Blobs object.
     */
    public Blobs blobs() {
        return this.blobs;
    }

    /**
     * The PageBlobs object to access its operations.
     */
    private PageBlobs pageBlobs;

    /**
     * Gets the PageBlobs object to access its operations.
     * 
     * @return the PageBlobs object.
     */
    public PageBlobs pageBlobs() {
        return this.pageBlobs;
    }

    /**
     * The AppendBlobs object to access its operations.
     */
    private AppendBlobs appendBlobs;

    /**
     * Gets the AppendBlobs object to access its operations.
     * 
     * @return the AppendBlobs object.
     */
    public AppendBlobs appendBlobs() {
        return this.appendBlobs;
    }

    /**
     * The BlockBlobs object to access its operations.
     */
    private BlockBlobs blockBlobs;

    /**
     * Gets the BlockBlobs object to access its operations.
     * 
     * @return the BlockBlobs object.
     */
    public BlockBlobs blockBlobs() {
        return this.blockBlobs;
    }

    /**
     * Initializes an instance of AzureBlobStorage client.
     */
    public AzureBlobStorage() {
        new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build();
    }

    /**
     * Initializes an instance of AzureBlobStorage client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public AzureBlobStorage(HttpPipeline httpPipeline) {
        this.httpPipeline = httpPipeline;
        this.services = new Services(this);
        this.containers = new Containers(this);
        this.directorys = new Directorys(this);
        this.blobs = new Blobs(this);
        this.pageBlobs = new PageBlobs(this);
        this.appendBlobs = new AppendBlobs(this);
        this.blockBlobs = new BlockBlobs(this);
    }
}
