// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta1/dlp.proto

package com.google.privacy.dlp.v2beta1;

public interface LocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2beta1.Location)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Zero-based byte offsets within a content item.
   * </pre>
   *
   * <code>optional .google.privacy.dlp.v2beta1.Range byte_range = 1;</code>
   */
  boolean hasByteRange();
  /**
   * <pre>
   * Zero-based byte offsets within a content item.
   * </pre>
   *
   * <code>optional .google.privacy.dlp.v2beta1.Range byte_range = 1;</code>
   */
  com.google.privacy.dlp.v2beta1.Range getByteRange();
  /**
   * <pre>
   * Zero-based byte offsets within a content item.
   * </pre>
   *
   * <code>optional .google.privacy.dlp.v2beta1.Range byte_range = 1;</code>
   */
  com.google.privacy.dlp.v2beta1.RangeOrBuilder getByteRangeOrBuilder();

  /**
   * <pre>
   * Character offsets within a content item, included when content type
   * is a text. Default charset assumed to be UTF-8.
   * </pre>
   *
   * <code>optional .google.privacy.dlp.v2beta1.Range codepoint_range = 2;</code>
   */
  boolean hasCodepointRange();
  /**
   * <pre>
   * Character offsets within a content item, included when content type
   * is a text. Default charset assumed to be UTF-8.
   * </pre>
   *
   * <code>optional .google.privacy.dlp.v2beta1.Range codepoint_range = 2;</code>
   */
  com.google.privacy.dlp.v2beta1.Range getCodepointRange();
  /**
   * <pre>
   * Character offsets within a content item, included when content type
   * is a text. Default charset assumed to be UTF-8.
   * </pre>
   *
   * <code>optional .google.privacy.dlp.v2beta1.Range codepoint_range = 2;</code>
   */
  com.google.privacy.dlp.v2beta1.RangeOrBuilder getCodepointRangeOrBuilder();

  /**
   * <pre>
   * Location within an image's pixels.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.ImageLocation image_boxes = 3;</code>
   */
  java.util.List<com.google.privacy.dlp.v2beta1.ImageLocation> 
      getImageBoxesList();
  /**
   * <pre>
   * Location within an image's pixels.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.ImageLocation image_boxes = 3;</code>
   */
  com.google.privacy.dlp.v2beta1.ImageLocation getImageBoxes(int index);
  /**
   * <pre>
   * Location within an image's pixels.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.ImageLocation image_boxes = 3;</code>
   */
  int getImageBoxesCount();
  /**
   * <pre>
   * Location within an image's pixels.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.ImageLocation image_boxes = 3;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2beta1.ImageLocationOrBuilder> 
      getImageBoxesOrBuilderList();
  /**
   * <pre>
   * Location within an image's pixels.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.ImageLocation image_boxes = 3;</code>
   */
  com.google.privacy.dlp.v2beta1.ImageLocationOrBuilder getImageBoxesOrBuilder(
      int index);

  /**
   * <pre>
   * Key of the finding.
   * </pre>
   *
   * <code>optional .google.privacy.dlp.v2beta1.RecordKey record_key = 4;</code>
   */
  boolean hasRecordKey();
  /**
   * <pre>
   * Key of the finding.
   * </pre>
   *
   * <code>optional .google.privacy.dlp.v2beta1.RecordKey record_key = 4;</code>
   */
  com.google.privacy.dlp.v2beta1.RecordKey getRecordKey();
  /**
   * <pre>
   * Key of the finding.
   * </pre>
   *
   * <code>optional .google.privacy.dlp.v2beta1.RecordKey record_key = 4;</code>
   */
  com.google.privacy.dlp.v2beta1.RecordKeyOrBuilder getRecordKeyOrBuilder();

  /**
   * <pre>
   * Field id of the field containing the finding.
   * </pre>
   *
   * <code>optional .google.privacy.dlp.v2beta1.FieldId field_id = 5;</code>
   */
  boolean hasFieldId();
  /**
   * <pre>
   * Field id of the field containing the finding.
   * </pre>
   *
   * <code>optional .google.privacy.dlp.v2beta1.FieldId field_id = 5;</code>
   */
  com.google.privacy.dlp.v2beta1.FieldId getFieldId();
  /**
   * <pre>
   * Field id of the field containing the finding.
   * </pre>
   *
   * <code>optional .google.privacy.dlp.v2beta1.FieldId field_id = 5;</code>
   */
  com.google.privacy.dlp.v2beta1.FieldIdOrBuilder getFieldIdOrBuilder();
}