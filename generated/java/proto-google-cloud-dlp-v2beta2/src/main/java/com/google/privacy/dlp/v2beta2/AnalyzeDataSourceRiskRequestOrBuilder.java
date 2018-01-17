// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta2/dlp.proto

package com.google.privacy.dlp.v2beta2;

public interface AnalyzeDataSourceRiskRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The parent resource name, for example projects/my-project-id.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The parent resource name, for example projects/my-project-id.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Configuration for this risk analysis job.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig job_config = 2;</code>
   */
  boolean hasJobConfig();
  /**
   * <pre>
   * Configuration for this risk analysis job.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig job_config = 2;</code>
   */
  com.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig getJobConfig();
  /**
   * <pre>
   * Configuration for this risk analysis job.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.RiskAnalysisJobConfig job_config = 2;</code>
   */
  com.google.privacy.dlp.v2beta2.RiskAnalysisJobConfigOrBuilder getJobConfigOrBuilder();
}