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
// source: google/cloud/resourcemanager/v3/folders.proto

package com.google.cloud.resourcemanager.v3;

public final class FoldersProto {
  private FoldersProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_Folder_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_Folder_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_GetFolderRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_GetFolderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_ListFoldersRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_ListFoldersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_ListFoldersResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_ListFoldersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_SearchFoldersRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_SearchFoldersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_SearchFoldersResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_SearchFoldersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_CreateFolderRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_CreateFolderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_CreateFolderMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_CreateFolderMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_UpdateFolderRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_UpdateFolderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_UpdateFolderMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_UpdateFolderMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_MoveFolderRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_MoveFolderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_MoveFolderMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_MoveFolderMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_DeleteFolderRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_DeleteFolderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_DeleteFolderMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_DeleteFolderMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_UndeleteFolderRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_UndeleteFolderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_resourcemanager_v3_UndeleteFolderMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_UndeleteFolderMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "-google/cloud/resourcemanager/v3/folders.proto\022\037google.cloud.resourcemanager.v3"
          + "\032\034google/api/annotations.proto\032\027google/a"
          + "pi/client.proto\032\037google/api/field_behavi"
          + "or.proto\032\031google/api/resource.proto\032\036goo"
          + "gle/iam/v1/iam_policy.proto\032\032google/iam/v1/policy.proto\032#google/longrunning/operations.proto\032"
          + " google/protobuf/field_mask.proto\032\037google/protobuf/timestamp.proto\"\306\003\n"
          + "\006Folder\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\003\022\023\n"
          + "\006parent\030\002 \001(\tB\003\340A\002\022\024\n"
          + "\014display_name\030\003 \001(\t\022A\n"
          + "\005state\030\004"
          + " \001(\0162-.google.cloud.resourcemanager.v3.Folder.StateB\003\340A\003\0224\n"
          + "\013create_time\030\005 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n"
          + "\013update_time\030\006 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n"
          + "\013delete_time\030\007"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\021\n"
          + "\004etag\030\010 \001(\tB\003\340A\003\"@\n"
          + "\005State\022\025\n"
          + "\021STATE_UNSPECIFIED\020\000\022\n\n"
          + "\006ACTIVE\020\001\022\024\n"
          + "\020DELETE_REQUESTED\020\002:D\352AA\n"
          + "*cloudresourcemanager.googleapis.com/Folder\022\020folders/{folder}R\001\001\"T\n"
          + "\020GetFolderRequest\022@\n"
          + "\004name\030\001 \001(\tB2\340A\002\372A,\n"
          + "*cloudresourcemanager.googleapis.com/Folder\"{\n"
          + "\022ListFoldersRequest\022\031\n"
          + "\006parent\030\001 \001(\tB\t\340A\002\372A\003\022\001*\022\026\n"
          + "\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\n"
          + "page_token\030\003 \001(\tB\003\340A\001\022\031\n"
          + "\014show_deleted\030\004 \001(\010B\003\340A\001\"h\n"
          + "\023ListFoldersResponse\0228\n"
          + "\007folders\030\001 \003(\0132\'.google.cloud.resourcemanager.v3.Folder\022\027\n"
          + "\017next_page_token\030\002 \001(\t\"[\n"
          + "\024SearchFoldersRequest\022\026\n"
          + "\tpage_size\030\001 \001(\005B\003\340A\001\022\027\n\n"
          + "page_token\030\002 \001(\tB\003\340A\001\022\022\n"
          + "\005query\030\003 \001(\tB\003\340A\001\"j\n"
          + "\025SearchFoldersResponse\0228\n"
          + "\007folders\030\001 \003(\0132\'.google.cloud.resourcemanager.v3.Folder\022\027\n"
          + "\017next_page_token\030\002 \001(\t\"S\n"
          + "\023CreateFolderRequest\022<\n"
          + "\006folder\030\002"
          + " \001(\0132\'.google.cloud.resourcemanager.v3.FolderB\003\340A\002\"<\n"
          + "\024CreateFolderMetadata\022\024\n"
          + "\014display_name\030\001 \001(\t\022\016\n"
          + "\006parent\030\002 \001(\t\"\211\001\n"
          + "\023UpdateFolderRequest\022<\n"
          + "\006folder\030\001"
          + " \001(\0132\'.google.cloud.resourcemanager.v3.FolderB\003\340A\002\0224\n"
          + "\013update_mask\030\002 \001(\0132\032.google.protobuf.FieldMaskB\003\340A\002\"\026\n"
          + "\024UpdateFolderMetadata\"|\n"
          + "\021MoveFolderRequest\022@\n"
          + "\004name\030\001 \001(\tB2\340A\002\372A,\n"
          + "*cloudresourcemanager.googleapis.com/Folder\022%\n"
          + "\022destination_parent\030\002 \001(\tB\t\340A\002\372A\003\022\001*\"]\n"
          + "\022MoveFolderMetadata\022\024\n"
          + "\014display_name\030\001 \001(\t\022\025\n\r"
          + "source_parent\030\002 \001(\t\022\032\n"
          + "\022destination_parent\030\003 \001(\t\"W\n"
          + "\023DeleteFolderRequest\022@\n"
          + "\004name\030\001 \001(\tB2\340A\002\372A,\n"
          + "*cloudresourcemanager.googleapis.com/Folder\"\026\n"
          + "\024DeleteFolderMetadata\"Y\n"
          + "\025UndeleteFolderRequest\022@\n"
          + "\004name\030\001 \001(\tB2\340A\002\372A,\n"
          + "*cloudresourcemanager.googleapis.com/Folder\"\030\n"
          + "\026UndeleteFolderMetadata2\336\017\n"
          + "\007Folders\022\214\001\n"
          + "\tGetFolder\0221.google.cloud.resourcemanager.v3.Get"
          + "FolderRequest\032\'.google.cloud.resourcemanager.v3.Folder\"#\202\323\344\223\002\026\022\024/v3/{name=folders/*}\332A\004name\022\226\001\n"
          + "\013ListFolders\0223.google.cloud.resourcemanager.v3.ListFoldersRequest\0324.google.cloud.resourcemanager.v3.ListFoldersResponse\"\034\202\323\344\223\002\r"
          + "\022\013/v3/folders\332A\006parent\022\242\001\n\r"
          + "SearchFolders\0225.google.cloud.resourcemanager.v3.SearchFoldersRequest\0326."
          + "google.cloud.resourcemanager.v3.SearchFoldersResponse\"\"\202\323\344\223\002\024\022\022/v3/folders:search\332A\005query\022\252\001\n"
          + "\014CreateFolder\0224.google.cloud.resourcemanager.v3.CreateFolderRequest\032\035.google.longrunning.Operation\"E\202\323\344\223\002\025\"\013/v3/folders:\006folder\332A\006folder\312A\036\n"
          + "\006Folder\022\024CreateFolderMetadata\022\306\001\n"
          + "\014UpdateFolder\0224.google.cloud.resourcemanager.v3.Update"
          + "FolderRequest\032\035.google.longrunning.Operation\"a\202\323\344\223\002%2\033/v3/{folder.name=folders/*}:\006folder\332A\022folder,update_mask\312A\036\n"
          + "\006Folder\022\024UpdateFolderMetadata\022\276\001\n\n"
          + "MoveFolder\0222.google.cloud.resourcemanager.v3.MoveFol"
          + "derRequest\032\035.google.longrunning.Operation\"]\202\323\344\223\002\036\"\031/v3/{name=folders/*}:move:\001*\332A\027name,destination_parent\312A\034\n"
          + "\006Folder\022\022MoveFolderMetadata\022\251\001\n"
          + "\014DeleteFolder\0224.google.cloud.resourcemanager.v3.DeleteFolderRequest\032\035.google.longrunning.Operation\"D\202\323\344\223\002\026*\024/v3/{name=folders/*}\332A\004name\312A\036\n"
          + "\006Folder\022\024DeleteFolderMetadata\022\273\001\n"
          + "\016UndeleteFolder\0226.google.cloud.resourcemanager.v"
          + "3.UndeleteFolderRequest\032\035.google.longrun"
          + "ning.Operation\"R\202\323\344\223\002\"\"\035/v3/{name=folders/*}:undelete:\001*\332A\004name\312A"
          + " \n"
          + "\006Folder\022\026UndeleteFolderMetadata\022\206\001\n"
          + "\014GetIamPolicy\022\".google.iam.v1.GetIamPolicyRequest\032\025.google.iam.v1.Policy\";\202\323\344\223\002*\"%/v3/{resource=folders/*}:getIamPolicy:\001*\332A\010resource\022\215\001\n"
          + "\014SetIamPolicy\022\".google.iam.v1.SetIamPolic"
          + "yRequest\032\025.google.iam.v1.Policy\"B\202\323\344\223\002*\"%/v3/{resource=folders/*}:setIamPolicy:\001*\332A\017resource,policy\022\270\001\n"
          + "\022TestIamPermissions\022(.google.iam.v1.TestIamPermissionsReq"
          + "uest\032).google.iam.v1.TestIamPermissionsR"
          + "esponse\"M\202\323\344\223\0020\"+/v3/{resource=folders/*"
          + "}:testIamPermissions:\001*\332A\024resource,permi"
          + "ssions\032\220\001\312A#cloudresourcemanager.googlea"
          + "pis.com\322Aghttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/cloud-platform.read-onlyB\356\001\n"
          + "#com.google.cloud.resourcemanager.v3B\014Folde"
          + "rsProtoP\001ZNgoogle.golang.org/genproto/googleapis/cloud/resourcemanager/v3;resour"
          + "cemanager\252\002\037Google.Cloud.ResourceManager"
          + ".V3\312\002\037Google\\Cloud\\ResourceManager\\V3\352\002\""
          + "Google::Cloud::ResourceManager::V3b\006proto3"
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
    internal_static_google_cloud_resourcemanager_v3_Folder_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_resourcemanager_v3_Folder_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_Folder_descriptor,
            new java.lang.String[] {
              "Name",
              "Parent",
              "DisplayName",
              "State",
              "CreateTime",
              "UpdateTime",
              "DeleteTime",
              "Etag",
            });
    internal_static_google_cloud_resourcemanager_v3_GetFolderRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_resourcemanager_v3_GetFolderRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_GetFolderRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_resourcemanager_v3_ListFoldersRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_resourcemanager_v3_ListFoldersRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_ListFoldersRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "ShowDeleted",
            });
    internal_static_google_cloud_resourcemanager_v3_ListFoldersResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_resourcemanager_v3_ListFoldersResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_ListFoldersResponse_descriptor,
            new java.lang.String[] {
              "Folders", "NextPageToken",
            });
    internal_static_google_cloud_resourcemanager_v3_SearchFoldersRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_resourcemanager_v3_SearchFoldersRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_SearchFoldersRequest_descriptor,
            new java.lang.String[] {
              "PageSize", "PageToken", "Query",
            });
    internal_static_google_cloud_resourcemanager_v3_SearchFoldersResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_resourcemanager_v3_SearchFoldersResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_SearchFoldersResponse_descriptor,
            new java.lang.String[] {
              "Folders", "NextPageToken",
            });
    internal_static_google_cloud_resourcemanager_v3_CreateFolderRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_resourcemanager_v3_CreateFolderRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_CreateFolderRequest_descriptor,
            new java.lang.String[] {
              "Folder",
            });
    internal_static_google_cloud_resourcemanager_v3_CreateFolderMetadata_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_resourcemanager_v3_CreateFolderMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_CreateFolderMetadata_descriptor,
            new java.lang.String[] {
              "DisplayName", "Parent",
            });
    internal_static_google_cloud_resourcemanager_v3_UpdateFolderRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_resourcemanager_v3_UpdateFolderRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_UpdateFolderRequest_descriptor,
            new java.lang.String[] {
              "Folder", "UpdateMask",
            });
    internal_static_google_cloud_resourcemanager_v3_UpdateFolderMetadata_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_resourcemanager_v3_UpdateFolderMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_UpdateFolderMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_resourcemanager_v3_MoveFolderRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_resourcemanager_v3_MoveFolderRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_MoveFolderRequest_descriptor,
            new java.lang.String[] {
              "Name", "DestinationParent",
            });
    internal_static_google_cloud_resourcemanager_v3_MoveFolderMetadata_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_resourcemanager_v3_MoveFolderMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_MoveFolderMetadata_descriptor,
            new java.lang.String[] {
              "DisplayName", "SourceParent", "DestinationParent",
            });
    internal_static_google_cloud_resourcemanager_v3_DeleteFolderRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_resourcemanager_v3_DeleteFolderRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_DeleteFolderRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_resourcemanager_v3_DeleteFolderMetadata_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_resourcemanager_v3_DeleteFolderMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_DeleteFolderMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_resourcemanager_v3_UndeleteFolderRequest_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_resourcemanager_v3_UndeleteFolderRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_UndeleteFolderRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_resourcemanager_v3_UndeleteFolderMetadata_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_resourcemanager_v3_UndeleteFolderMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_resourcemanager_v3_UndeleteFolderMetadata_descriptor,
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
