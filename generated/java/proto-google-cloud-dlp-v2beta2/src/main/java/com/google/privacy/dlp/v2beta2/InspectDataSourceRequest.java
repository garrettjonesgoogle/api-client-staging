// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta2/dlp.proto

package com.google.privacy.dlp.v2beta2;

/**
 * <pre>
 * Request for scheduling a scan of a data subset from a Google Platform data
 * repository.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2beta2.InspectDataSourceRequest}
 */
public  final class InspectDataSourceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2beta2.InspectDataSourceRequest)
    InspectDataSourceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InspectDataSourceRequest.newBuilder() to construct.
  private InspectDataSourceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InspectDataSourceRequest() {
    parent_ = "";
    jobId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InspectDataSourceRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            parent_ = s;
            break;
          }
          case 18: {
            com.google.privacy.dlp.v2beta2.InspectJobConfig.Builder subBuilder = null;
            if (jobConfig_ != null) {
              subBuilder = jobConfig_.toBuilder();
            }
            jobConfig_ = input.readMessage(com.google.privacy.dlp.v2beta2.InspectJobConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(jobConfig_);
              jobConfig_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            jobId_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_InspectDataSourceRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_InspectDataSourceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2beta2.InspectDataSourceRequest.class, com.google.privacy.dlp.v2beta2.InspectDataSourceRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * The parent resource name, for example projects/my-project-id.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The parent resource name, for example projects/my-project-id.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JOB_CONFIG_FIELD_NUMBER = 2;
  private com.google.privacy.dlp.v2beta2.InspectJobConfig jobConfig_;
  /**
   * <pre>
   * A configuration for the job.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.InspectJobConfig job_config = 2;</code>
   */
  public boolean hasJobConfig() {
    return jobConfig_ != null;
  }
  /**
   * <pre>
   * A configuration for the job.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.InspectJobConfig job_config = 2;</code>
   */
  public com.google.privacy.dlp.v2beta2.InspectJobConfig getJobConfig() {
    return jobConfig_ == null ? com.google.privacy.dlp.v2beta2.InspectJobConfig.getDefaultInstance() : jobConfig_;
  }
  /**
   * <pre>
   * A configuration for the job.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.InspectJobConfig job_config = 2;</code>
   */
  public com.google.privacy.dlp.v2beta2.InspectJobConfigOrBuilder getJobConfigOrBuilder() {
    return getJobConfig();
  }

  public static final int JOB_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object jobId_;
  /**
   * <pre>
   * Optional job ID to use for the created job. If not provided, a job ID will
   * automatically be generated. Must be unique within the project. The job ID
   * can contain uppercase and lowercase letters, numbers, and hyphens; that is,
   * it must match the regular expression: `[a-zA-Z&#92;&#92;d-]+`. The maximum length
   * is 100 characters. Can be empty to allow the system to generate one.
   * </pre>
   *
   * <code>string job_id = 3;</code>
   */
  public java.lang.String getJobId() {
    java.lang.Object ref = jobId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jobId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional job ID to use for the created job. If not provided, a job ID will
   * automatically be generated. Must be unique within the project. The job ID
   * can contain uppercase and lowercase letters, numbers, and hyphens; that is,
   * it must match the regular expression: `[a-zA-Z&#92;&#92;d-]+`. The maximum length
   * is 100 characters. Can be empty to allow the system to generate one.
   * </pre>
   *
   * <code>string job_id = 3;</code>
   */
  public com.google.protobuf.ByteString
      getJobIdBytes() {
    java.lang.Object ref = jobId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jobId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (jobConfig_ != null) {
      output.writeMessage(2, getJobConfig());
    }
    if (!getJobIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, jobId_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (jobConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getJobConfig());
    }
    if (!getJobIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, jobId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.privacy.dlp.v2beta2.InspectDataSourceRequest)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2beta2.InspectDataSourceRequest other = (com.google.privacy.dlp.v2beta2.InspectDataSourceRequest) obj;

    boolean result = true;
    result = result && getParent()
        .equals(other.getParent());
    result = result && (hasJobConfig() == other.hasJobConfig());
    if (hasJobConfig()) {
      result = result && getJobConfig()
          .equals(other.getJobConfig());
    }
    result = result && getJobId()
        .equals(other.getJobId());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasJobConfig()) {
      hash = (37 * hash) + JOB_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getJobConfig().hashCode();
    }
    hash = (37 * hash) + JOB_ID_FIELD_NUMBER;
    hash = (53 * hash) + getJobId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2beta2.InspectDataSourceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.InspectDataSourceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.InspectDataSourceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.InspectDataSourceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.InspectDataSourceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.InspectDataSourceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.InspectDataSourceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.InspectDataSourceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.InspectDataSourceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.InspectDataSourceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.InspectDataSourceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.InspectDataSourceRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.privacy.dlp.v2beta2.InspectDataSourceRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request for scheduling a scan of a data subset from a Google Platform data
   * repository.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2beta2.InspectDataSourceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2beta2.InspectDataSourceRequest)
      com.google.privacy.dlp.v2beta2.InspectDataSourceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_InspectDataSourceRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_InspectDataSourceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2beta2.InspectDataSourceRequest.class, com.google.privacy.dlp.v2beta2.InspectDataSourceRequest.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2beta2.InspectDataSourceRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (jobConfigBuilder_ == null) {
        jobConfig_ = null;
      } else {
        jobConfig_ = null;
        jobConfigBuilder_ = null;
      }
      jobId_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_InspectDataSourceRequest_descriptor;
    }

    public com.google.privacy.dlp.v2beta2.InspectDataSourceRequest getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2beta2.InspectDataSourceRequest.getDefaultInstance();
    }

    public com.google.privacy.dlp.v2beta2.InspectDataSourceRequest build() {
      com.google.privacy.dlp.v2beta2.InspectDataSourceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.privacy.dlp.v2beta2.InspectDataSourceRequest buildPartial() {
      com.google.privacy.dlp.v2beta2.InspectDataSourceRequest result = new com.google.privacy.dlp.v2beta2.InspectDataSourceRequest(this);
      result.parent_ = parent_;
      if (jobConfigBuilder_ == null) {
        result.jobConfig_ = jobConfig_;
      } else {
        result.jobConfig_ = jobConfigBuilder_.build();
      }
      result.jobId_ = jobId_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.privacy.dlp.v2beta2.InspectDataSourceRequest) {
        return mergeFrom((com.google.privacy.dlp.v2beta2.InspectDataSourceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2beta2.InspectDataSourceRequest other) {
      if (other == com.google.privacy.dlp.v2beta2.InspectDataSourceRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasJobConfig()) {
        mergeJobConfig(other.getJobConfig());
      }
      if (!other.getJobId().isEmpty()) {
        jobId_ = other.jobId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.privacy.dlp.v2beta2.InspectDataSourceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2beta2.InspectDataSourceRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * The parent resource name, for example projects/my-project-id.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The parent resource name, for example projects/my-project-id.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The parent resource name, for example projects/my-project-id.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The parent resource name, for example projects/my-project-id.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The parent resource name, for example projects/my-project-id.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.privacy.dlp.v2beta2.InspectJobConfig jobConfig_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.InspectJobConfig, com.google.privacy.dlp.v2beta2.InspectJobConfig.Builder, com.google.privacy.dlp.v2beta2.InspectJobConfigOrBuilder> jobConfigBuilder_;
    /**
     * <pre>
     * A configuration for the job.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.InspectJobConfig job_config = 2;</code>
     */
    public boolean hasJobConfig() {
      return jobConfigBuilder_ != null || jobConfig_ != null;
    }
    /**
     * <pre>
     * A configuration for the job.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.InspectJobConfig job_config = 2;</code>
     */
    public com.google.privacy.dlp.v2beta2.InspectJobConfig getJobConfig() {
      if (jobConfigBuilder_ == null) {
        return jobConfig_ == null ? com.google.privacy.dlp.v2beta2.InspectJobConfig.getDefaultInstance() : jobConfig_;
      } else {
        return jobConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * A configuration for the job.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.InspectJobConfig job_config = 2;</code>
     */
    public Builder setJobConfig(com.google.privacy.dlp.v2beta2.InspectJobConfig value) {
      if (jobConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        jobConfig_ = value;
        onChanged();
      } else {
        jobConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * A configuration for the job.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.InspectJobConfig job_config = 2;</code>
     */
    public Builder setJobConfig(
        com.google.privacy.dlp.v2beta2.InspectJobConfig.Builder builderForValue) {
      if (jobConfigBuilder_ == null) {
        jobConfig_ = builderForValue.build();
        onChanged();
      } else {
        jobConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * A configuration for the job.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.InspectJobConfig job_config = 2;</code>
     */
    public Builder mergeJobConfig(com.google.privacy.dlp.v2beta2.InspectJobConfig value) {
      if (jobConfigBuilder_ == null) {
        if (jobConfig_ != null) {
          jobConfig_ =
            com.google.privacy.dlp.v2beta2.InspectJobConfig.newBuilder(jobConfig_).mergeFrom(value).buildPartial();
        } else {
          jobConfig_ = value;
        }
        onChanged();
      } else {
        jobConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * A configuration for the job.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.InspectJobConfig job_config = 2;</code>
     */
    public Builder clearJobConfig() {
      if (jobConfigBuilder_ == null) {
        jobConfig_ = null;
        onChanged();
      } else {
        jobConfig_ = null;
        jobConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * A configuration for the job.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.InspectJobConfig job_config = 2;</code>
     */
    public com.google.privacy.dlp.v2beta2.InspectJobConfig.Builder getJobConfigBuilder() {
      
      onChanged();
      return getJobConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * A configuration for the job.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.InspectJobConfig job_config = 2;</code>
     */
    public com.google.privacy.dlp.v2beta2.InspectJobConfigOrBuilder getJobConfigOrBuilder() {
      if (jobConfigBuilder_ != null) {
        return jobConfigBuilder_.getMessageOrBuilder();
      } else {
        return jobConfig_ == null ?
            com.google.privacy.dlp.v2beta2.InspectJobConfig.getDefaultInstance() : jobConfig_;
      }
    }
    /**
     * <pre>
     * A configuration for the job.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.InspectJobConfig job_config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.InspectJobConfig, com.google.privacy.dlp.v2beta2.InspectJobConfig.Builder, com.google.privacy.dlp.v2beta2.InspectJobConfigOrBuilder> 
        getJobConfigFieldBuilder() {
      if (jobConfigBuilder_ == null) {
        jobConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2beta2.InspectJobConfig, com.google.privacy.dlp.v2beta2.InspectJobConfig.Builder, com.google.privacy.dlp.v2beta2.InspectJobConfigOrBuilder>(
                getJobConfig(),
                getParentForChildren(),
                isClean());
        jobConfig_ = null;
      }
      return jobConfigBuilder_;
    }

    private java.lang.Object jobId_ = "";
    /**
     * <pre>
     * Optional job ID to use for the created job. If not provided, a job ID will
     * automatically be generated. Must be unique within the project. The job ID
     * can contain uppercase and lowercase letters, numbers, and hyphens; that is,
     * it must match the regular expression: `[a-zA-Z&#92;&#92;d-]+`. The maximum length
     * is 100 characters. Can be empty to allow the system to generate one.
     * </pre>
     *
     * <code>string job_id = 3;</code>
     */
    public java.lang.String getJobId() {
      java.lang.Object ref = jobId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jobId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional job ID to use for the created job. If not provided, a job ID will
     * automatically be generated. Must be unique within the project. The job ID
     * can contain uppercase and lowercase letters, numbers, and hyphens; that is,
     * it must match the regular expression: `[a-zA-Z&#92;&#92;d-]+`. The maximum length
     * is 100 characters. Can be empty to allow the system to generate one.
     * </pre>
     *
     * <code>string job_id = 3;</code>
     */
    public com.google.protobuf.ByteString
        getJobIdBytes() {
      java.lang.Object ref = jobId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jobId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional job ID to use for the created job. If not provided, a job ID will
     * automatically be generated. Must be unique within the project. The job ID
     * can contain uppercase and lowercase letters, numbers, and hyphens; that is,
     * it must match the regular expression: `[a-zA-Z&#92;&#92;d-]+`. The maximum length
     * is 100 characters. Can be empty to allow the system to generate one.
     * </pre>
     *
     * <code>string job_id = 3;</code>
     */
    public Builder setJobId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      jobId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional job ID to use for the created job. If not provided, a job ID will
     * automatically be generated. Must be unique within the project. The job ID
     * can contain uppercase and lowercase letters, numbers, and hyphens; that is,
     * it must match the regular expression: `[a-zA-Z&#92;&#92;d-]+`. The maximum length
     * is 100 characters. Can be empty to allow the system to generate one.
     * </pre>
     *
     * <code>string job_id = 3;</code>
     */
    public Builder clearJobId() {
      
      jobId_ = getDefaultInstance().getJobId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional job ID to use for the created job. If not provided, a job ID will
     * automatically be generated. Must be unique within the project. The job ID
     * can contain uppercase and lowercase letters, numbers, and hyphens; that is,
     * it must match the regular expression: `[a-zA-Z&#92;&#92;d-]+`. The maximum length
     * is 100 characters. Can be empty to allow the system to generate one.
     * </pre>
     *
     * <code>string job_id = 3;</code>
     */
    public Builder setJobIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      jobId_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2beta2.InspectDataSourceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2beta2.InspectDataSourceRequest)
  private static final com.google.privacy.dlp.v2beta2.InspectDataSourceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2beta2.InspectDataSourceRequest();
  }

  public static com.google.privacy.dlp.v2beta2.InspectDataSourceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InspectDataSourceRequest>
      PARSER = new com.google.protobuf.AbstractParser<InspectDataSourceRequest>() {
    public InspectDataSourceRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new InspectDataSourceRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InspectDataSourceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InspectDataSourceRequest> getParserForType() {
    return PARSER;
  }

  public com.google.privacy.dlp.v2beta2.InspectDataSourceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

