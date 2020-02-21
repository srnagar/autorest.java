package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The BlobsGetPropertiesHeaders model.
 */
@Fluent
public final class BlobsGetPropertiesHeaders {
    /*
     * The x-ms-lease-status property.
     */
    @JsonProperty(value = "x-ms-lease-status")
    private LeaseStatusType xMsLeaseStatus;

    /*
     * The x-ms-copy-destination-snapshot property.
     */
    @JsonProperty(value = "x-ms-copy-destination-snapshot")
    private String xMsCopyDestinationSnapshot;

    /*
     * The x-ms-lease-state property.
     */
    @JsonProperty(value = "x-ms-lease-state")
    private LeaseStateType xMsLeaseState;

    /*
     * The Last-Modified property.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /*
     * The x-ms-encryption-key-sha256 property.
     */
    @JsonProperty(value = "x-ms-encryption-key-sha256")
    private String xMsEncryptionKeySha256;

    /*
     * The x-ms-access-tier-change-time property.
     */
    @JsonProperty(value = "x-ms-access-tier-change-time")
    private DateTimeRfc1123 xMsAccessTierChangeTime;

    /*
     * The x-ms-blob-type property.
     */
    @JsonProperty(value = "x-ms-blob-type")
    private BlobType xMsBlobType;

    /*
     * The x-ms-access-tier-inferred property.
     */
    @JsonProperty(value = "x-ms-access-tier-inferred")
    private Boolean xMsAccessTierInferred;

    /*
     * The x-ms-access-tier property.
     */
    @JsonProperty(value = "x-ms-access-tier")
    private String xMsAccessTier;

    /*
     * The Content-Encoding property.
     */
    @JsonProperty(value = "Content-Encoding")
    private String contentEncoding;

    /*
     * The x-ms-copy-status-description property.
     */
    @JsonProperty(value = "x-ms-copy-status-description")
    private String xMsCopyStatusDescription;

    /*
     * The x-ms-creation-time property.
     */
    @JsonProperty(value = "x-ms-creation-time")
    private DateTimeRfc1123 xMsCreationTime;

    /*
     * The x-ms-incremental-copy property.
     */
    @JsonProperty(value = "x-ms-incremental-copy")
    private Boolean xMsIncrementalCopy;

    /*
     * The x-ms-lease-duration property.
     */
    @JsonProperty(value = "x-ms-lease-duration")
    private LeaseDurationType xMsLeaseDuration;

    /*
     * The Content-Length property.
     */
    @JsonProperty(value = "Content-Length")
    private Long contentLength;

    /*
     * The x-ms-request-id property.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /*
     * The Content-Type property.
     */
    @JsonProperty(value = "Content-Type")
    private String contentType;

    /*
     * The x-ms-version property.
     */
    @JsonProperty(value = "x-ms-version")
    private String xMsVersion;

    /*
     * The x-ms-copy-id property.
     */
    @JsonProperty(value = "x-ms-copy-id")
    private String xMsCopyId;

    /*
     * The x-ms-copy-source property.
     */
    @JsonProperty(value = "x-ms-copy-source")
    private String xMsCopySource;

    /*
     * The x-ms-blob-sequence-number property.
     */
    @JsonProperty(value = "x-ms-blob-sequence-number")
    private Long xMsBlobSequenceNumber;

    /*
     * The x-ms-copy-progress property.
     */
    @JsonProperty(value = "x-ms-copy-progress")
    private String xMsCopyProgress;

    /*
     * The x-ms-blob-committed-block-count property.
     */
    @JsonProperty(value = "x-ms-blob-committed-block-count")
    private Integer xMsBlobCommittedBlockCount;

    /*
     * The x-ms-meta property.
     */
    @JsonProperty(value = "x-ms-meta")
    private String xMsMeta;

    /*
     * The Date property.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /*
     * The Content-MD5 property.
     */
    @JsonProperty(value = "Content-MD5")
    private byte[] contentMD5;

    /*
     * The x-ms-copy-completion-time property.
     */
    @JsonProperty(value = "x-ms-copy-completion-time")
    private DateTimeRfc1123 xMsCopyCompletionTime;

    /*
     * The Accept-Ranges property.
     */
    @JsonProperty(value = "Accept-Ranges")
    private String acceptRanges;

    /*
     * The x-ms-server-encrypted property.
     */
    @JsonProperty(value = "x-ms-server-encrypted")
    private Boolean xMsServerEncrypted;

    /*
     * The Cache-Control property.
     */
    @JsonProperty(value = "Cache-Control")
    private String cacheControl;

    /*
     * The ETag property.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * The Content-Disposition property.
     */
    @JsonProperty(value = "Content-Disposition")
    private String contentDisposition;

    /*
     * The x-ms-copy-status property.
     */
    @JsonProperty(value = "x-ms-copy-status")
    private CopyStatusType xMsCopyStatus;

    /*
     * The x-ms-archive-status property.
     */
    @JsonProperty(value = "x-ms-archive-status")
    private String xMsArchiveStatus;

    /*
     * The Content-Language property.
     */
    @JsonProperty(value = "Content-Language")
    private String contentLanguage;

    /*
     * The x-ms-client-request-id property.
     */
    @JsonProperty(value = "x-ms-client-request-id")
    private String xMsClientRequestId;

    /*
     * The x-ms-encryption-scope property.
     */
    @JsonProperty(value = "x-ms-encryption-scope")
    private String xMsEncryptionScope;

    /**
     * Get the xMsLeaseStatus property: The x-ms-lease-status property.
     * 
     * @return the xMsLeaseStatus value.
     */
    public LeaseStatusType getXMsLeaseStatus() {
        return this.xMsLeaseStatus;
    }

    /**
     * Set the xMsLeaseStatus property: The x-ms-lease-status property.
     * 
     * @param xMsLeaseStatus the xMsLeaseStatus value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setXMsLeaseStatus(LeaseStatusType xMsLeaseStatus) {
        this.xMsLeaseStatus = xMsLeaseStatus;
        return this;
    }

    /**
     * Get the xMsCopyDestinationSnapshot property: The
     * x-ms-copy-destination-snapshot property.
     * 
     * @return the xMsCopyDestinationSnapshot value.
     */
    public String getXMsCopyDestinationSnapshot() {
        return this.xMsCopyDestinationSnapshot;
    }

    /**
     * Set the xMsCopyDestinationSnapshot property: The
     * x-ms-copy-destination-snapshot property.
     * 
     * @param xMsCopyDestinationSnapshot the xMsCopyDestinationSnapshot value
     * to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setXMsCopyDestinationSnapshot(String xMsCopyDestinationSnapshot) {
        this.xMsCopyDestinationSnapshot = xMsCopyDestinationSnapshot;
        return this;
    }

    /**
     * Get the xMsLeaseState property: The x-ms-lease-state property.
     * 
     * @return the xMsLeaseState value.
     */
    public LeaseStateType getXMsLeaseState() {
        return this.xMsLeaseState;
    }

    /**
     * Set the xMsLeaseState property: The x-ms-lease-state property.
     * 
     * @param xMsLeaseState the xMsLeaseState value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setXMsLeaseState(LeaseStateType xMsLeaseState) {
        this.xMsLeaseState = xMsLeaseState;
        return this;
    }

    /**
     * Get the lastModified property: The Last-Modified property.
     * 
     * @return the lastModified value.
     */
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: The Last-Modified property.
     * 
     * @param lastModified the lastModified value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the xMsEncryptionKeySha256 property: The x-ms-encryption-key-sha256
     * property.
     * 
     * @return the xMsEncryptionKeySha256 value.
     */
    public String getXMsEncryptionKeySha256() {
        return this.xMsEncryptionKeySha256;
    }

    /**
     * Set the xMsEncryptionKeySha256 property: The x-ms-encryption-key-sha256
     * property.
     * 
     * @param xMsEncryptionKeySha256 the xMsEncryptionKeySha256 value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setXMsEncryptionKeySha256(String xMsEncryptionKeySha256) {
        this.xMsEncryptionKeySha256 = xMsEncryptionKeySha256;
        return this;
    }

    /**
     * Get the xMsAccessTierChangeTime property: The
     * x-ms-access-tier-change-time property.
     * 
     * @return the xMsAccessTierChangeTime value.
     */
    public OffsetDateTime getXMsAccessTierChangeTime() {
        if (this.xMsAccessTierChangeTime == null) {
            return null;
        }
        return this.xMsAccessTierChangeTime.getDateTime();
    }

    /**
     * Set the xMsAccessTierChangeTime property: The
     * x-ms-access-tier-change-time property.
     * 
     * @param xMsAccessTierChangeTime the xMsAccessTierChangeTime value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setXMsAccessTierChangeTime(OffsetDateTime xMsAccessTierChangeTime) {
        if (xMsAccessTierChangeTime == null) {
            this.xMsAccessTierChangeTime = null;
        } else {
            this.xMsAccessTierChangeTime = new DateTimeRfc1123(xMsAccessTierChangeTime);
        }
        return this;
    }

    /**
     * Get the xMsBlobType property: The x-ms-blob-type property.
     * 
     * @return the xMsBlobType value.
     */
    public BlobType getXMsBlobType() {
        return this.xMsBlobType;
    }

    /**
     * Set the xMsBlobType property: The x-ms-blob-type property.
     * 
     * @param xMsBlobType the xMsBlobType value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setXMsBlobType(BlobType xMsBlobType) {
        this.xMsBlobType = xMsBlobType;
        return this;
    }

    /**
     * Get the xMsAccessTierInferred property: The x-ms-access-tier-inferred
     * property.
     * 
     * @return the xMsAccessTierInferred value.
     */
    public Boolean isXMsAccessTierInferred() {
        return this.xMsAccessTierInferred;
    }

    /**
     * Set the xMsAccessTierInferred property: The x-ms-access-tier-inferred
     * property.
     * 
     * @param xMsAccessTierInferred the xMsAccessTierInferred value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setXMsAccessTierInferred(Boolean xMsAccessTierInferred) {
        this.xMsAccessTierInferred = xMsAccessTierInferred;
        return this;
    }

    /**
     * Get the xMsAccessTier property: The x-ms-access-tier property.
     * 
     * @return the xMsAccessTier value.
     */
    public String getXMsAccessTier() {
        return this.xMsAccessTier;
    }

    /**
     * Set the xMsAccessTier property: The x-ms-access-tier property.
     * 
     * @param xMsAccessTier the xMsAccessTier value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setXMsAccessTier(String xMsAccessTier) {
        this.xMsAccessTier = xMsAccessTier;
        return this;
    }

    /**
     * Get the contentEncoding property: The Content-Encoding property.
     * 
     * @return the contentEncoding value.
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * Set the contentEncoding property: The Content-Encoding property.
     * 
     * @param contentEncoding the contentEncoding value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }

    /**
     * Get the xMsCopyStatusDescription property: The
     * x-ms-copy-status-description property.
     * 
     * @return the xMsCopyStatusDescription value.
     */
    public String getXMsCopyStatusDescription() {
        return this.xMsCopyStatusDescription;
    }

    /**
     * Set the xMsCopyStatusDescription property: The
     * x-ms-copy-status-description property.
     * 
     * @param xMsCopyStatusDescription the xMsCopyStatusDescription value to
     * set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setXMsCopyStatusDescription(String xMsCopyStatusDescription) {
        this.xMsCopyStatusDescription = xMsCopyStatusDescription;
        return this;
    }

    /**
     * Get the xMsCreationTime property: The x-ms-creation-time property.
     * 
     * @return the xMsCreationTime value.
     */
    public OffsetDateTime getXMsCreationTime() {
        if (this.xMsCreationTime == null) {
            return null;
        }
        return this.xMsCreationTime.getDateTime();
    }

    /**
     * Set the xMsCreationTime property: The x-ms-creation-time property.
     * 
     * @param xMsCreationTime the xMsCreationTime value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setXMsCreationTime(OffsetDateTime xMsCreationTime) {
        if (xMsCreationTime == null) {
            this.xMsCreationTime = null;
        } else {
            this.xMsCreationTime = new DateTimeRfc1123(xMsCreationTime);
        }
        return this;
    }

    /**
     * Get the xMsIncrementalCopy property: The x-ms-incremental-copy property.
     * 
     * @return the xMsIncrementalCopy value.
     */
    public Boolean isXMsIncrementalCopy() {
        return this.xMsIncrementalCopy;
    }

    /**
     * Set the xMsIncrementalCopy property: The x-ms-incremental-copy property.
     * 
     * @param xMsIncrementalCopy the xMsIncrementalCopy value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setXMsIncrementalCopy(Boolean xMsIncrementalCopy) {
        this.xMsIncrementalCopy = xMsIncrementalCopy;
        return this;
    }

    /**
     * Get the xMsLeaseDuration property: The x-ms-lease-duration property.
     * 
     * @return the xMsLeaseDuration value.
     */
    public LeaseDurationType getXMsLeaseDuration() {
        return this.xMsLeaseDuration;
    }

    /**
     * Set the xMsLeaseDuration property: The x-ms-lease-duration property.
     * 
     * @param xMsLeaseDuration the xMsLeaseDuration value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setXMsLeaseDuration(LeaseDurationType xMsLeaseDuration) {
        this.xMsLeaseDuration = xMsLeaseDuration;
        return this;
    }

    /**
     * Get the contentLength property: The Content-Length property.
     * 
     * @return the contentLength value.
     */
    public Long getContentLength() {
        return this.contentLength;
    }

    /**
     * Set the contentLength property: The Content-Length property.
     * 
     * @param contentLength the contentLength value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setContentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Get the xMsRequestId property: The x-ms-request-id property.
     * 
     * @return the xMsRequestId value.
     */
    public String getXMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set the xMsRequestId property: The x-ms-request-id property.
     * 
     * @param xMsRequestId the xMsRequestId value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the contentType property: The Content-Type property.
     * 
     * @return the contentType value.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The Content-Type property.
     * 
     * @param contentType the contentType value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the xMsVersion property: The x-ms-version property.
     * 
     * @return the xMsVersion value.
     */
    public String getXMsVersion() {
        return this.xMsVersion;
    }

    /**
     * Set the xMsVersion property: The x-ms-version property.
     * 
     * @param xMsVersion the xMsVersion value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the xMsCopyId property: The x-ms-copy-id property.
     * 
     * @return the xMsCopyId value.
     */
    public String getXMsCopyId() {
        return this.xMsCopyId;
    }

    /**
     * Set the xMsCopyId property: The x-ms-copy-id property.
     * 
     * @param xMsCopyId the xMsCopyId value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setXMsCopyId(String xMsCopyId) {
        this.xMsCopyId = xMsCopyId;
        return this;
    }

    /**
     * Get the xMsCopySource property: The x-ms-copy-source property.
     * 
     * @return the xMsCopySource value.
     */
    public String getXMsCopySource() {
        return this.xMsCopySource;
    }

    /**
     * Set the xMsCopySource property: The x-ms-copy-source property.
     * 
     * @param xMsCopySource the xMsCopySource value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setXMsCopySource(String xMsCopySource) {
        this.xMsCopySource = xMsCopySource;
        return this;
    }

    /**
     * Get the xMsBlobSequenceNumber property: The x-ms-blob-sequence-number
     * property.
     * 
     * @return the xMsBlobSequenceNumber value.
     */
    public Long getXMsBlobSequenceNumber() {
        return this.xMsBlobSequenceNumber;
    }

    /**
     * Set the xMsBlobSequenceNumber property: The x-ms-blob-sequence-number
     * property.
     * 
     * @param xMsBlobSequenceNumber the xMsBlobSequenceNumber value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setXMsBlobSequenceNumber(Long xMsBlobSequenceNumber) {
        this.xMsBlobSequenceNumber = xMsBlobSequenceNumber;
        return this;
    }

    /**
     * Get the xMsCopyProgress property: The x-ms-copy-progress property.
     * 
     * @return the xMsCopyProgress value.
     */
    public String getXMsCopyProgress() {
        return this.xMsCopyProgress;
    }

    /**
     * Set the xMsCopyProgress property: The x-ms-copy-progress property.
     * 
     * @param xMsCopyProgress the xMsCopyProgress value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setXMsCopyProgress(String xMsCopyProgress) {
        this.xMsCopyProgress = xMsCopyProgress;
        return this;
    }

    /**
     * Get the xMsBlobCommittedBlockCount property: The
     * x-ms-blob-committed-block-count property.
     * 
     * @return the xMsBlobCommittedBlockCount value.
     */
    public Integer getXMsBlobCommittedBlockCount() {
        return this.xMsBlobCommittedBlockCount;
    }

    /**
     * Set the xMsBlobCommittedBlockCount property: The
     * x-ms-blob-committed-block-count property.
     * 
     * @param xMsBlobCommittedBlockCount the xMsBlobCommittedBlockCount value
     * to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setXMsBlobCommittedBlockCount(Integer xMsBlobCommittedBlockCount) {
        this.xMsBlobCommittedBlockCount = xMsBlobCommittedBlockCount;
        return this;
    }

    /**
     * Get the xMsMeta property: The x-ms-meta property.
     * 
     * @return the xMsMeta value.
     */
    public String getXMsMeta() {
        return this.xMsMeta;
    }

    /**
     * Set the xMsMeta property: The x-ms-meta property.
     * 
     * @param xMsMeta the xMsMeta value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setXMsMeta(String xMsMeta) {
        this.xMsMeta = xMsMeta;
        return this;
    }

    /**
     * Get the dateProperty property: The Date property.
     * 
     * @return the dateProperty value.
     */
    public OffsetDateTime getDateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.getDateTime();
    }

    /**
     * Set the dateProperty property: The Date property.
     * 
     * @param dateProperty the dateProperty value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

    /**
     * Get the contentMD5 property: The Content-MD5 property.
     * 
     * @return the contentMD5 value.
     */
    public byte[] getContentMD5() {
        return CoreUtils.clone(this.contentMD5);
    }

    /**
     * Set the contentMD5 property: The Content-MD5 property.
     * 
     * @param contentMD5 the contentMD5 value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setContentMD5(byte[] contentMD5) {
        this.contentMD5 = CoreUtils.clone(contentMD5);
        return this;
    }

    /**
     * Get the xMsCopyCompletionTime property: The x-ms-copy-completion-time
     * property.
     * 
     * @return the xMsCopyCompletionTime value.
     */
    public OffsetDateTime getXMsCopyCompletionTime() {
        if (this.xMsCopyCompletionTime == null) {
            return null;
        }
        return this.xMsCopyCompletionTime.getDateTime();
    }

    /**
     * Set the xMsCopyCompletionTime property: The x-ms-copy-completion-time
     * property.
     * 
     * @param xMsCopyCompletionTime the xMsCopyCompletionTime value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setXMsCopyCompletionTime(OffsetDateTime xMsCopyCompletionTime) {
        if (xMsCopyCompletionTime == null) {
            this.xMsCopyCompletionTime = null;
        } else {
            this.xMsCopyCompletionTime = new DateTimeRfc1123(xMsCopyCompletionTime);
        }
        return this;
    }

    /**
     * Get the acceptRanges property: The Accept-Ranges property.
     * 
     * @return the acceptRanges value.
     */
    public String getAcceptRanges() {
        return this.acceptRanges;
    }

    /**
     * Set the acceptRanges property: The Accept-Ranges property.
     * 
     * @param acceptRanges the acceptRanges value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setAcceptRanges(String acceptRanges) {
        this.acceptRanges = acceptRanges;
        return this;
    }

    /**
     * Get the xMsServerEncrypted property: The x-ms-server-encrypted property.
     * 
     * @return the xMsServerEncrypted value.
     */
    public Boolean isXMsServerEncrypted() {
        return this.xMsServerEncrypted;
    }

    /**
     * Set the xMsServerEncrypted property: The x-ms-server-encrypted property.
     * 
     * @param xMsServerEncrypted the xMsServerEncrypted value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setXMsServerEncrypted(Boolean xMsServerEncrypted) {
        this.xMsServerEncrypted = xMsServerEncrypted;
        return this;
    }

    /**
     * Get the cacheControl property: The Cache-Control property.
     * 
     * @return the cacheControl value.
     */
    public String getCacheControl() {
        return this.cacheControl;
    }

    /**
     * Set the cacheControl property: The Cache-Control property.
     * 
     * @param cacheControl the cacheControl value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
        return this;
    }

    /**
     * Get the eTag property: The ETag property.
     * 
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag property.
     * 
     * @param eTag the eTag value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the contentDisposition property: The Content-Disposition property.
     * 
     * @return the contentDisposition value.
     */
    public String getContentDisposition() {
        return this.contentDisposition;
    }

    /**
     * Set the contentDisposition property: The Content-Disposition property.
     * 
     * @param contentDisposition the contentDisposition value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /**
     * Get the xMsCopyStatus property: The x-ms-copy-status property.
     * 
     * @return the xMsCopyStatus value.
     */
    public CopyStatusType getXMsCopyStatus() {
        return this.xMsCopyStatus;
    }

    /**
     * Set the xMsCopyStatus property: The x-ms-copy-status property.
     * 
     * @param xMsCopyStatus the xMsCopyStatus value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setXMsCopyStatus(CopyStatusType xMsCopyStatus) {
        this.xMsCopyStatus = xMsCopyStatus;
        return this;
    }

    /**
     * Get the xMsArchiveStatus property: The x-ms-archive-status property.
     * 
     * @return the xMsArchiveStatus value.
     */
    public String getXMsArchiveStatus() {
        return this.xMsArchiveStatus;
    }

    /**
     * Set the xMsArchiveStatus property: The x-ms-archive-status property.
     * 
     * @param xMsArchiveStatus the xMsArchiveStatus value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setXMsArchiveStatus(String xMsArchiveStatus) {
        this.xMsArchiveStatus = xMsArchiveStatus;
        return this;
    }

    /**
     * Get the contentLanguage property: The Content-Language property.
     * 
     * @return the contentLanguage value.
     */
    public String getContentLanguage() {
        return this.contentLanguage;
    }

    /**
     * Set the contentLanguage property: The Content-Language property.
     * 
     * @param contentLanguage the contentLanguage value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
        return this;
    }

    /**
     * Get the xMsClientRequestId property: The x-ms-client-request-id
     * property.
     * 
     * @return the xMsClientRequestId value.
     */
    public String getXMsClientRequestId() {
        return this.xMsClientRequestId;
    }

    /**
     * Set the xMsClientRequestId property: The x-ms-client-request-id
     * property.
     * 
     * @param xMsClientRequestId the xMsClientRequestId value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setXMsClientRequestId(String xMsClientRequestId) {
        this.xMsClientRequestId = xMsClientRequestId;
        return this;
    }

    /**
     * Get the xMsEncryptionScope property: The x-ms-encryption-scope property.
     * 
     * @return the xMsEncryptionScope value.
     */
    public String getXMsEncryptionScope() {
        return this.xMsEncryptionScope;
    }

    /**
     * Set the xMsEncryptionScope property: The x-ms-encryption-scope property.
     * 
     * @param xMsEncryptionScope the xMsEncryptionScope value to set.
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders setXMsEncryptionScope(String xMsEncryptionScope) {
        this.xMsEncryptionScope = xMsEncryptionScope;
        return this;
    }

    public void validate() {
    }
}
