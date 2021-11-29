/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/resourcemanager/v3/tag_values.proto

package com.google.cloud.resourcemanager.v3;

public final class TagValuesProto {
  private TagValuesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_TagValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_TagValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_ListTagValuesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_ListTagValuesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_ListTagValuesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_ListTagValuesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_GetTagValueRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_GetTagValueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_CreateTagValueRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_CreateTagValueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_CreateTagValueMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_CreateTagValueMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_UpdateTagValueRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_UpdateTagValueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_UpdateTagValueMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_UpdateTagValueMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_DeleteTagValueRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_DeleteTagValueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_DeleteTagValueMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_DeleteTagValueMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "0google/cloud/resourcemanager/v3/tag_values.proto\022\037google.cloud.resourcemanager"
          + ".v3\032\034google/api/annotations.proto\032\027googl"
          + "e/api/client.proto\032\037google/api/field_beh"
          + "avior.proto\032\031google/api/resource.proto\032\036"
          + "google/iam/v1/iam_policy.proto\032\032google/iam/v1/policy.proto\032#google/longrunning/operations.proto\032"
          + " google/protobuf/field_mask.proto\032\037google/protobuf/timestamp.proto\"\322\002\n"
          + "\010TagValue\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\005\022\023\n"
          + "\006parent\030\002 \001(\tB\003\340A\005\022\032\n\n"
          + "short_name\030\003 \001(\tB\006\340A\002\340A\005\022\034\n"
          + "\017namespaced_name\030\004 \001(\tB\003\340A\003\022\030\n"
          + "\013description\030\005 \001(\tB\003\340A\001\0224\n"
          + "\013create_time\030\006 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n"
          + "\013update_time\030\007"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\021\n"
          + "\004etag\030\010 \001(\tB\003\340A\001:K\352AH\n"
          + ",cloudresourcemanager.googleapis.com/TagValue\022\025tagValues/{tag_value}R\001\001\"b\n"
          + "\024ListTagValuesRequest\022\031\n"
          + "\006parent\030\001 \001(\tB\t\340A\002\372A\003\022\001*\022\026\n"
          + "\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\n"
          + "page_token\030\003 \001(\tB\003\340A\001\"o\n"
          + "\025ListTagValuesResponse\022=\n\n"
          + "tag_values\030\001 \003(\0132).google.cloud.resourcemanager.v3.TagValue\022\027\n"
          + "\017next_page_token\030\002 \001(\t\"X\n"
          + "\022GetTagValueRequest\022B\n"
          + "\004name\030\001 \001(\tB4\340A\002\372A.\n"
          + ",cloudresourcemanager.googleapis.com/TagValue\"v\n"
          + "\025CreateTagValueRequest\022A\n"
          + "\ttag_value\030\001"
          + " \001(\0132).google.cloud.resourcemanager.v3.TagValueB\003\340A\002\022\032\n\r"
          + "validate_only\030\002 \001(\010B\003\340A\001\"\030\n"
          + "\026CreateTagValueMetadata\"\254\001\n"
          + "\025UpdateTagValueRequest\022A\n"
          + "\ttag_value\030\001"
          + " \001(\0132).google.cloud.resourcemanager.v3.TagValueB\003\340A\002\0224\n"
          + "\013update_mask\030\002"
          + " \001(\0132\032.google.protobuf.FieldMaskB\003\340A\001\022\032\n\r"
          + "validate_only\030\003 \001(\010B\003\340A\001\"\030\n"
          + "\026UpdateTagValueMetadata\"\212\001\n"
          + "\025DeleteTagValueRequest\022B\n"
          + "\004name\030\001 \001(\tB4\340A\002\372A.\n"
          + ",cloudresourcemanager.googleapis.com/TagValue\022\032\n\r"
          + "validate_only\030\002 \001(\010B\003\340A\001\022\021\n"
          + "\004etag\030\003 \001(\tB\003\340A\001\"\030\n"
          + "\026DeleteTagValueMetadata2\377\013\n"
          + "\tTagValues\022\236\001\n\r"
          + "ListTagValues\0225.google.cloud.resourcemanager.v3.ListTagValuesRequest\0326.google.cloud.resourcemanager.v3.ListTagValuesResponse\"\036\202\323\344\223\002\017\022\r"
          + "/v3/tagValues\332A\006parent\022\224\001\n"
          + "\013GetTagValue\0223.google.cloud.resourcemanager.v3.GetTagValueReq"
          + "uest\032).google.cloud.resourcemanager.v3.TagValue\"%\202\323\344\223\002\030\022\026/v3/{name=tagValues/*}\332A\004name\022\272\001\n"
          + "\016CreateTagValue\0226.google.cloud.resourcemanager.v3.CreateTagValueRequest\032\035.google.longrunning.Operation\"Q\202\323\344\223\002\032\"\r"
          + "/v3/tagValues:\ttag_value\332A\ttag_value\312A\"\n"
          + "\010TagValue\022\026CreateTagValueMetadata\022\331\001\n"
          + "\016UpdateTagValue\0226.google.cloud.resourcema"
          + "nager.v3.UpdateTagValueRequest\032\035.google.longrunning.Operation\"p\202\323\344\223\002-2"
          + " /v3/{tag_value.name=tagValues/*}:\ttag_value\332A\025tag_value,update_mask\312A\"\n"
          + "\010TagValue\022\026UpdateTagValueMetadata\022\263\001\n"
          + "\016DeleteTagValue\0226.google.cloud.resourcemanager.v3.DeleteTagVa"
          + "lueRequest\032\035.google.longrunning.Operation\"J\202\323\344\223\002\030*\026/v3/{name=tagValues/*}\332A\004name\312A\"\n"
          + "\010TagValue\022\026DeleteTagValueMetadata\022\210\001\n"
          + "\014GetIamPolicy\022\".google.iam.v1.GetIamPol"
          + "icyRequest\032\025.google.iam.v1.Policy\"=\202\323\344\223\002,\"\'/v3/{resource=tagValues/*}:getIamPolicy:\001*\332A\010resource\022\217\001\n"
          + "\014SetIamPolicy\022\".google.iam.v1.SetIamPolicyRequest\032\025.google.i"
          + "am.v1.Policy\"D\202\323\344\223\002,\"\'/v3/{resource=tagValues/*}:setIamPolicy:\001*\332A\017resource,policy\022\272\001\n"
          + "\022TestIamPermissions\022(.google.iam.v1.TestIamPermissionsRequest\032).google.iam"
          + ".v1.TestIamPermissionsResponse\"O\202\323\344\223\0022\"-"
          + "/v3/{resource=tagValues/*}:testIamPermis"
          + "sions:\001*\332A\024resource,permissions\032\220\001\312A#clo"
          + "udresourcemanager.googleapis.com\322Aghttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/cloud-platform.read-onlyB\360\001\n"
          + "#com.google.cloud.resourcemanager.v3B\016TagValuesProtoP\001ZNgo"
          + "ogle.golang.org/genproto/googleapis/clou"
          + "d/resourcemanager/v3;resourcemanager\252\002\037G"
          + "oogle.Cloud.ResourceManager.V3\312\002\037Google\\"
          + "Cloud\\ResourceManager\\V3\352\002\"Google::Cloud::ResourceManager::V3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.iam.v1.IamPolicyProto.getDescriptor(),
              com.google.iam.v1.PolicyProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_resourcemanager_v3_TagValue_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_resourcemanager_v3_TagValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_TagValue_descriptor,
            new java.lang.String[] {
              "Name",
              "Parent",
              "ShortName",
              "NamespacedName",
              "Description",
              "CreateTime",
              "UpdateTime",
              "Etag",
            });
    internal_static_google_cloud_resourcemanager_v3_ListTagValuesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_resourcemanager_v3_ListTagValuesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_ListTagValuesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_resourcemanager_v3_ListTagValuesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_resourcemanager_v3_ListTagValuesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_ListTagValuesResponse_descriptor,
            new java.lang.String[] {
              "TagValues", "NextPageToken",
            });
    internal_static_google_cloud_resourcemanager_v3_GetTagValueRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_resourcemanager_v3_GetTagValueRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_GetTagValueRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_resourcemanager_v3_CreateTagValueRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_resourcemanager_v3_CreateTagValueRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_CreateTagValueRequest_descriptor,
            new java.lang.String[] {
              "TagValue", "ValidateOnly",
            });
    internal_static_google_cloud_resourcemanager_v3_CreateTagValueMetadata_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_resourcemanager_v3_CreateTagValueMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_CreateTagValueMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_resourcemanager_v3_UpdateTagValueRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_resourcemanager_v3_UpdateTagValueRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_UpdateTagValueRequest_descriptor,
            new java.lang.String[] {
              "TagValue", "UpdateMask", "ValidateOnly",
            });
    internal_static_google_cloud_resourcemanager_v3_UpdateTagValueMetadata_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_resourcemanager_v3_UpdateTagValueMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_UpdateTagValueMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_resourcemanager_v3_DeleteTagValueRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_resourcemanager_v3_DeleteTagValueRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_DeleteTagValueRequest_descriptor,
            new java.lang.String[] {
              "Name", "ValidateOnly", "Etag",
            });
    internal_static_google_cloud_resourcemanager_v3_DeleteTagValueMetadata_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_resourcemanager_v3_DeleteTagValueMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_DeleteTagValueMetadata_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
