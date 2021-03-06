// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/appengine.proto

package com.google.appengine.v1;

public interface UpdateServiceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.UpdateServiceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the resource to update. Example: `apps/myapp/services/default`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the resource to update. Example: `apps/myapp/services/default`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * A Service resource containing the updated service. Only fields set in the
   * field mask will be updated.
   * </pre>
   *
   * <code>.google.appengine.v1.Service service = 2;</code>
   */
  boolean hasService();
  /**
   * <pre>
   * A Service resource containing the updated service. Only fields set in the
   * field mask will be updated.
   * </pre>
   *
   * <code>.google.appengine.v1.Service service = 2;</code>
   */
  com.google.appengine.v1.Service getService();
  /**
   * <pre>
   * A Service resource containing the updated service. Only fields set in the
   * field mask will be updated.
   * </pre>
   *
   * <code>.google.appengine.v1.Service service = 2;</code>
   */
  com.google.appengine.v1.ServiceOrBuilder getServiceOrBuilder();

  /**
   * <pre>
   * Standard field mask for the set of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Standard field mask for the set of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Standard field mask for the set of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Set to `true` to gradually shift traffic from one version to another
   * single version. By default, traffic is shifted immediately.
   * For gradual traffic migration, the target version
   * must be located within instances that are configured for both
   * [warmup requests](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#inboundservicetype)
   * and
   * [automatic scaling](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#automaticscaling).
   * You must specify the
   * [`shardBy`](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services#shardby)
   * field in the Service resource. Gradual traffic migration is not
   * supported in the App Engine flexible environment. For examples, see
   * [Migrating and Splitting Traffic](https://cloud.google.com/appengine/docs/admin-api/migrating-splitting-traffic).
   * </pre>
   *
   * <code>bool migrate_traffic = 4;</code>
   */
  boolean getMigrateTraffic();
}
