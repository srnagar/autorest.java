package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The BlobsDownloadHeaders model.
 */
@Fluent
public final class BlobsDownloadHeaders {
    /*
     * The x-ms-lease-status property.
     */
    @JsonProperty(value = "x-ms-lease-status")
    private LeaseStatusType xMsLeaseStatus;

    /*
     * The Content-Range property.
     */
    @JsonProperty(value = "Content-Range")
    private String contentRange;

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
     * The x-ms-blob-type property.
     */
    @JsonProperty(value = "x-ms-blob-type")
    private BlobType xMsBlobType;

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
     * The x-ms-content-crc64 property.
     */
    @JsonProperty(value = "x-ms-content-crc64")
    private byte[] xMsContentCrc64;

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
     * The x-ms-blob-content-md5 property.
     */
    @JsonProperty(value = "x-ms-blob-content-md5")
    private byte[] xMsBlobContentMd5;

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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setXMsLeaseStatus(LeaseStatusType xMsLeaseStatus) {
        this.xMsLeaseStatus = xMsLeaseStatus;
        return this;
    }

    /**
     * Get the contentRange property: The Content-Range property.
     * 
     * @return the contentRange value.
     */
    public String getContentRange() {
        return this.contentRange;
    }

    /**
     * Set the contentRange property: The Content-Range property.
     * 
     * @param contentRange the contentRange value to set.
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setContentRange(String contentRange) {
        this.contentRange = contentRange;
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setXMsLeaseState(LeaseStateType xMsLeaseState) {
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setLastModified(OffsetDateTime lastModified) {
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setXMsEncryptionKeySha256(String xMsEncryptionKeySha256) {
        this.xMsEncryptionKeySha256 = xMsEncryptionKeySha256;
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setXMsBlobType(BlobType xMsBlobType) {
        this.xMsBlobType = xMsBlobType;
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setContentEncoding(String contentEncoding) {
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setXMsCopyStatusDescription(String xMsCopyStatusDescription) {
        this.xMsCopyStatusDescription = xMsCopyStatusDescription;
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setXMsLeaseDuration(LeaseDurationType xMsLeaseDuration) {
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setContentLength(Long contentLength) {
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setXMsRequestId(String xMsRequestId) {
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setContentType(String contentType) {
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setXMsVersion(String xMsVersion) {
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setXMsCopyId(String xMsCopyId) {
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setXMsCopySource(String xMsCopySource) {
        this.xMsCopySource = xMsCopySource;
        return this;
    }

    /**
     * Get the xMsContentCrc64 property: The x-ms-content-crc64 property.
     * 
     * @return the xMsContentCrc64 value.
     */
    public byte[] getXMsContentCrc64() {
        return CoreUtils.clone(this.xMsContentCrc64);
    }

    /**
     * Set the xMsContentCrc64 property: The x-ms-content-crc64 property.
     * 
     * @param xMsContentCrc64 the xMsContentCrc64 value to set.
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setXMsContentCrc64(byte[] xMsContentCrc64) {
        this.xMsContentCrc64 = CoreUtils.clone(xMsContentCrc64);
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setXMsBlobSequenceNumber(Long xMsBlobSequenceNumber) {
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setXMsCopyProgress(String xMsCopyProgress) {
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setXMsBlobCommittedBlockCount(Integer xMsBlobCommittedBlockCount) {
        this.xMsBlobCommittedBlockCount = xMsBlobCommittedBlockCount;
        return this;
    }

    /**
     * Get the xMsBlobContentMd5 property: The x-ms-blob-content-md5 property.
     * 
     * @return the xMsBlobContentMd5 value.
     */
    public byte[] getXMsBlobContentMd5() {
        return CoreUtils.clone(this.xMsBlobContentMd5);
    }

    /**
     * Set the xMsBlobContentMd5 property: The x-ms-blob-content-md5 property.
     * 
     * @param xMsBlobContentMd5 the xMsBlobContentMd5 value to set.
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setXMsBlobContentMd5(byte[] xMsBlobContentMd5) {
        this.xMsBlobContentMd5 = CoreUtils.clone(xMsBlobContentMd5);
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setXMsMeta(String xMsMeta) {
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setDateProperty(OffsetDateTime dateProperty) {
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setContentMD5(byte[] contentMD5) {
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setXMsCopyCompletionTime(OffsetDateTime xMsCopyCompletionTime) {
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setAcceptRanges(String acceptRanges) {
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setXMsServerEncrypted(Boolean xMsServerEncrypted) {
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setCacheControl(String cacheControl) {
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setETag(String eTag) {
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setContentDisposition(String contentDisposition) {
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setXMsCopyStatus(CopyStatusType xMsCopyStatus) {
        this.xMsCopyStatus = xMsCopyStatus;
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setContentLanguage(String contentLanguage) {
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setXMsClientRequestId(String xMsClientRequestId) {
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
     * @return the BlobsDownloadHeaders object itself.
     */
    public BlobsDownloadHeaders setXMsEncryptionScope(String xMsEncryptionScope) {
        this.xMsEncryptionScope = xMsEncryptionScope;
        return this;
    }

    public void validate() {
    }
}
