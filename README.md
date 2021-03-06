# baas-sdk

轻应用Baas平台API
- API version: 1.0
  - Build date: 2018-06-07T16:26:37.617+08:00

demo


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>baas-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:baas-sdk:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/baas-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.chinamobile.iot.baas.sdk.*;
import com.chinamobile.iot.baas.sdk.auth.*;
import com.chinamobile.iot.baas.sdk.model.*;
import com.chinamobile.iot.baas.sdk.api.CommandApi;

import java.io.File;
import java.util.*;

public class CommandApiExample {

    public static void main(String[] args) {
        
        CommandApi apiInstance = new CommandApi();
        String cmdUuid = "cmdUuid_example"; // String | cmdUuid
        String sessionToken = "sessionToken_example"; // String | session-token
        try {
            CommandStatus result = apiInstance.getCommandStatusByCmdUuidUsingGET(cmdUuid, sessionToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommandApi#getCommandStatusByCmdUuidUsingGET");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://demo.heclouds.com/baasapi*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CommandApi* | [**getCommandStatusByCmdUuidUsingGET**](docs/CommandApi.md#getCommandStatusByCmdUuidUsingGET) | **GET** /v1.0/devices/commands/send/{cmdUuid} | 查询命令状态
*CommandApi* | [**getCommandStatusListUsingGET**](docs/CommandApi.md#getCommandStatusListUsingGET) | **GET** /v1.0/devices/commands/send | 查询命令状态列表
*CommandApi* | [**sendCommandsUsingPOST**](docs/CommandApi.md#sendCommandsUsingPOST) | **POST** /v1.0/devices/commands/send | 发送命令
*CustomPermissionApi* | [**findCustomPermissionByUserUsingGET**](docs/CustomPermissionApi.md#findCustomPermissionByUserUsingGET) | **GET** /v1.0/extraPermissions/user | 查询当前用户拥有的自定义权限
*CustomPermissionApi* | [**findCustomPermissionUsingGET**](docs/CustomPermissionApi.md#findCustomPermissionUsingGET) | **GET** /v1.0/extraPermissions | 查询自定义权限
*DataQryApi* | [**addExternalDataUsingPOST**](docs/DataQryApi.md#addExternalDataUsingPOST) | **POST** /v1.0/externalData | 添加外部数据
*DataQryApi* | [**deleteExternalDataBySQLUsingDELETE**](docs/DataQryApi.md#deleteExternalDataBySQLUsingDELETE) | **DELETE** /v1.0/deleteExternalData | 根据sql删除外部数据
*DataQryApi* | [**deleteExternalDataUsingDELETE**](docs/DataQryApi.md#deleteExternalDataUsingDELETE) | **DELETE** /v1.0/externalData | 删除外部数据
*DataQryApi* | [**findDeviceAlarmUsingPOST**](docs/DataQryApi.md#findDeviceAlarmUsingPOST) | **POST** /v1.0/devices/queryAlarms | 查询告警数据
*DataQryApi* | [**findDeviceDataUsingPOST**](docs/DataQryApi.md#findDeviceDataUsingPOST) | **POST** /v1.0/devices/queryData | 查询全局设备数据
*DataQryApi* | [**findExternalDataByIdUsingGET**](docs/DataQryApi.md#findExternalDataByIdUsingGET) | **GET** /v1.0/externalData | 根据id查询某一条外部数据
*DataQryApi* | [**findExternalDataUsingPOST**](docs/DataQryApi.md#findExternalDataUsingPOST) | **POST** /v1.0/queryExternalData | 查询外部数据
*DataQryApi* | [**findStatTaskDataUsingPOST**](docs/DataQryApi.md#findStatTaskDataUsingPOST) | **POST** /v1.0/queryStatTaskData | 查询离线统计数据
*DataQryApi* | [**findStatisticsDataUsingPOST**](docs/DataQryApi.md#findStatisticsDataUsingPOST) | **POST** /v1.0/devices/queryStats | 查询统计数据
*DataQryApi* | [**findTableConfigUsingGET**](docs/DataQryApi.md#findTableConfigUsingGET) | **GET** /v1.0/queryTableConfig | 查询表配置信息
*DataQryApi* | [**updateExternalDataByIdUsingPUT**](docs/DataQryApi.md#updateExternalDataByIdUsingPUT) | **PUT** /v1.0/externalData | 修改外部数据
*DataQryApi* | [**updateExternalDataUsingPUT**](docs/DataQryApi.md#updateExternalDataUsingPUT) | **PUT** /v1.0/updateExternalData | 根据sql修改外部数据
*DeviceApi* | [**addDeviceUsingPOST**](docs/DeviceApi.md#addDeviceUsingPOST) | **POST** /v1.0/devices | 导入单个设备
*DeviceApi* | [**addDevicesUsingPOST**](docs/DeviceApi.md#addDevicesUsingPOST) | **POST** /v1.0/devices/import | 批量导入设备
*DeviceApi* | [**assignDevicesUsingPUT**](docs/DeviceApi.md#assignDevicesUsingPUT) | **PUT** /v1.0/devices/assign | 分配设备
*DeviceApi* | [**deleteDevicesUsingDELETE**](docs/DeviceApi.md#deleteDevicesUsingDELETE) | **DELETE** /v1.0/devices/{deviceId} | 删除设备
*DeviceApi* | [**disableDevicesByIdUsingPUT**](docs/DeviceApi.md#disableDevicesByIdUsingPUT) | **PUT** /v1.0/devices/disable/{deviceId} | 停用设备
*DeviceApi* | [**enableDevicesByIdUsingPUT**](docs/DeviceApi.md#enableDevicesByIdUsingPUT) | **PUT** /v1.0/devices/enable/{deviceId} | 启用设备
*DeviceApi* | [**getDevicesByIdUsingGET**](docs/DeviceApi.md#getDevicesByIdUsingGET) | **GET** /v1.0/devices/info/{deviceId} | 查询设备信息
*DeviceApi* | [**getDevicesListUsingGET**](docs/DeviceApi.md#getDevicesListUsingGET) | **GET** /v1.0/devices | 查询设备列表
*DeviceApi* | [**updateDevicesUsingPUT**](docs/DeviceApi.md#updateDevicesUsingPUT) | **PUT** /v1.0/devices/info/{deviceId} | 编辑设备
*DeviceArchiveApi* | [**addArchivesUsingPOST**](docs/DeviceArchiveApi.md#addArchivesUsingPOST) | **POST** /v1.0/devices/archives | 新增设备档案
*DeviceArchiveApi* | [**deleteArchiveByDeviceIdUsingDELETE**](docs/DeviceArchiveApi.md#deleteArchiveByDeviceIdUsingDELETE) | **DELETE** /v1.0/devices/archivesByDeviceId | 根据设备id删除设备档案
*DeviceArchiveApi* | [**deleteArchivesBySQLUsingDELETE**](docs/DeviceArchiveApi.md#deleteArchivesBySQLUsingDELETE) | **DELETE** /v1.0/devices/deleteArchives | 根据sql删除设备档案
*DeviceArchiveApi* | [**deleteArchivesUsingDELETE**](docs/DeviceArchiveApi.md#deleteArchivesUsingDELETE) | **DELETE** /v1.0/devices/archives | 删除设备档案
*DeviceArchiveApi* | [**findArchivesUsingPOST**](docs/DeviceArchiveApi.md#findArchivesUsingPOST) | **POST** /v1.0/devices/queryArchives | 查询设备档案列表
*DeviceArchiveApi* | [**findSingleArchiveByDeviceIdUsingGET**](docs/DeviceArchiveApi.md#findSingleArchiveByDeviceIdUsingGET) | **GET** /v1.0/devices/archivesByDeviceId | 根据设备id查询设备档案
*DeviceArchiveApi* | [**findSingleArchiveUsingGET**](docs/DeviceArchiveApi.md#findSingleArchiveUsingGET) | **GET** /v1.0/devices/archives | 查询单个设备档案
*DeviceArchiveApi* | [**updateArchiveByIdUsingPUT**](docs/DeviceArchiveApi.md#updateArchiveByIdUsingPUT) | **PUT** /v1.0/devices/archives | 修改设备档案
*DeviceArchiveApi* | [**updateArchivesUsingPUT**](docs/DeviceArchiveApi.md#updateArchivesUsingPUT) | **PUT** /v1.0/devices/updateArchives | 根据SQL语句修改设备档案
*DeviceDelegationApi* | [**addDeviceDelegationsUsingPOST**](docs/DeviceDelegationApi.md#addDeviceDelegationsUsingPOST) | **POST** /v1.0/devices/delegations | 新增设备转授
*DeviceDelegationApi* | [**deleteDeviceDelegationsUsingDELETE**](docs/DeviceDelegationApi.md#deleteDeviceDelegationsUsingDELETE) | **DELETE** /v1.0/devices/delegations/{delegateId} | 收回设备转授
*DeviceDelegationApi* | [**getDeviceDelegateOthersUsingGET**](docs/DeviceDelegationApi.md#getDeviceDelegateOthersUsingGET) | **GET** /v1.0/devices/delegations/delegateOthers | 查询转授出去的设备列表
*DeviceDelegationApi* | [**getDeviceDelegateSelfUsingGET**](docs/DeviceDelegationApi.md#getDeviceDelegateSelfUsingGET) | **GET** /v1.0/devices/delegations/delegateSelf | 查询转授给自己的设备列表
*DeviceDelegationApi* | [**getDeviceDelegationsByIdUsingGET**](docs/DeviceDelegationApi.md#getDeviceDelegationsByIdUsingGET) | **GET** /v1.0/devices/delegations/{delegateId} | 查询设备转授
*DeviceDelegationApi* | [**getDeviceDelegationsListUsingGET**](docs/DeviceDelegationApi.md#getDeviceDelegationsListUsingGET) | **GET** /v1.0/devices/delegations | 查询设备转授列表(仅超管可用)
*DeviceLogApi* | [**getDeviceLogsListUsingGET**](docs/DeviceLogApi.md#getDeviceLogsListUsingGET) | **GET** /v1.0/devices/logs | 查询设备日志列表
*DeviceShareApi* | [**addDeviceSharesUsingPOST**](docs/DeviceShareApi.md#addDeviceSharesUsingPOST) | **POST** /v1.0/devices/shares | 新增设备分享信息
*DeviceShareApi* | [**deleteDeviceSharesUsingDELETE**](docs/DeviceShareApi.md#deleteDeviceSharesUsingDELETE) | **DELETE** /v1.0/devices/shares/{shareId} | 收回设备分享
*DeviceShareApi* | [**getDeviceShareOthersUsingGET**](docs/DeviceShareApi.md#getDeviceShareOthersUsingGET) | **GET** /v1.0/devices/shares/shareOthers | 查询分享出去的设备列表
*DeviceShareApi* | [**getDeviceShareSelfUsingGET**](docs/DeviceShareApi.md#getDeviceShareSelfUsingGET) | **GET** /v1.0/devices/shares/shareSelf | 查询分享给自己的设备列表
*DeviceShareApi* | [**getDeviceSharesByIdUsingGET**](docs/DeviceShareApi.md#getDeviceSharesByIdUsingGET) | **GET** /v1.0/devices/shares/{shareId} | 查询设备分享信息
*DeviceShareApi* | [**getDeviceSharesListUsingGET**](docs/DeviceShareApi.md#getDeviceSharesListUsingGET) | **GET** /v1.0/devices/shares | 查询设备分享信息列表(仅超管可用)
*RoleApi* | [**findRoleAllowRegUsingGET**](docs/RoleApi.md#findRoleAllowRegUsingGET) | **GET** /v1.0/roles/allowReg | 查询允许注册的角色
*RoleApi* | [**findRoleNameListUsingGET**](docs/RoleApi.md#findRoleNameListUsingGET) | **GET** /v1.0/roles/offSpringRole | 查询当前用户所能创建的角色
*SqlTemplateApi* | [**findTemplateByIdUsingGET**](docs/SqlTemplateApi.md#findTemplateByIdUsingGET) | **GET** /v1.0/sqlTemplates/{sqlTemplateId} | 查询指定sql模版
*SqlTemplateApi* | [**getTemplatesUsingGET**](docs/SqlTemplateApi.md#getTemplatesUsingGET) | **GET** /v1.0/sqlTemplates | 查询sql模版列表
*UserApi* | [**deleteUserByUserIdUsingDELETE**](docs/UserApi.md#deleteUserByUserIdUsingDELETE) | **DELETE** /v1.0/users/child/{userId} | 删除子用户
*UserApi* | [**disableUserUsingPUT**](docs/UserApi.md#disableUserUsingPUT) | **PUT** /v1.0/users/{userId}/disable | 停用子用户
*UserApi* | [**enableUserUsingPUT**](docs/UserApi.md#enableUserUsingPUT) | **PUT** /v1.0/users/{userId}/enable | 启用子用户
*UserApi* | [**getUserByUserIdUsingGET**](docs/UserApi.md#getUserByUserIdUsingGET) | **GET** /v1.0/users/{userId} | 查询单个用户
*UserApi* | [**getUsersUsingGET**](docs/UserApi.md#getUsersUsingGET) | **GET** /v1.0/users | 查询用户列表
*UserApi* | [**insertUserUsingPOST**](docs/UserApi.md#insertUserUsingPOST) | **POST** /v1.0/users | 增加用户
*UserApi* | [**loginUsingPOST**](docs/UserApi.md#loginUsingPOST) | **POST** /v1.0/login | 用户登录
*UserApi* | [**queryChildInfoUsingGET**](docs/UserApi.md#queryChildInfoUsingGET) | **GET** /v1.0/users/{userId}/childQuery | 查询子用户列表
*UserApi* | [**registerUserUsingPOST**](docs/UserApi.md#registerUserUsingPOST) | **POST** /v1.0/register | 注册用户
*UserApi* | [**resetPasswordUsingPUT**](docs/UserApi.md#resetPasswordUsingPUT) | **PUT** /v1.0/users/{userId}/resetPassword | 重置子用户密码
*UserApi* | [**updatePasswordUsingPUT**](docs/UserApi.md#updatePasswordUsingPUT) | **PUT** /v1.0/users/updatePassword | 修改密码
*UserApi* | [**updateUserUsingPUT**](docs/UserApi.md#updateUserUsingPUT) | **PUT** /v1.0/users/child/{userId} | 编辑子用户


## Documentation for Models

 - [AddArchive](docs/AddArchive.md)
 - [AddDevice](docs/AddDevice.md)
 - [AddDeviceDelegations](docs/AddDeviceDelegations.md)
 - [AddDeviceShares](docs/AddDeviceShares.md)
 - [AddExternalData](docs/AddExternalData.md)
 - [AddUserRequest](docs/AddUserRequest.md)
 - [ArchiveIdResponse](docs/ArchiveIdResponse.md)
 - [AssignDevice](docs/AssignDevice.md)
 - [CommandResult](docs/CommandResult.md)
 - [CommandStatus](docs/CommandStatus.md)
 - [CustomPermission](docs/CustomPermission.md)
 - [DelegateIdResponse](docs/DelegateIdResponse.md)
 - [DeviceDelegationsDTO](docs/DeviceDelegationsDTO.md)
 - [DeviceDelegationsResponse](docs/DeviceDelegationsResponse.md)
 - [DeviceImport](docs/DeviceImport.md)
 - [DeviceImportResponse](docs/DeviceImportResponse.md)
 - [DeviceLogs](docs/DeviceLogs.md)
 - [DeviceShare](docs/DeviceShare.md)
 - [DeviceSharesDTO](docs/DeviceSharesDTO.md)
 - [DeviceSingleImportResponse](docs/DeviceSingleImportResponse.md)
 - [Devices](docs/Devices.md)
 - [DevicesDTO](docs/DevicesDTO.md)
 - [ExternalDataIdResponse](docs/ExternalDataIdResponse.md)
 - [FailedDevices](docs/FailedDevices.md)
 - [FindDeviceSharesRsp](docs/FindDeviceSharesRsp.md)
 - [FindMongoDataRequest](docs/FindMongoDataRequest.md)
 - [FindMongoDataWithDeviceIdRequest](docs/FindMongoDataWithDeviceIdRequest.md)
 - [JSONObject](docs/JSONObject.md)
 - [MongoDataRequest](docs/MongoDataRequest.md)
 - [MongoDataWithDeviceIdRequest](docs/MongoDataWithDeviceIdRequest.md)
 - [PageInfoCommandStatus](docs/PageInfoCommandStatus.md)
 - [PageInfoCustomPermission](docs/PageInfoCustomPermission.md)
 - [PageInfoDeviceDelegationsDTO](docs/PageInfoDeviceDelegationsDTO.md)
 - [PageInfoDeviceLogs](docs/PageInfoDeviceLogs.md)
 - [PageInfoDeviceSharesDTO](docs/PageInfoDeviceSharesDTO.md)
 - [PageInfoDevicesDTO](docs/PageInfoDevicesDTO.md)
 - [PageInfoSqlTemplate](docs/PageInfoSqlTemplate.md)
 - [PageInfoUserDTO](docs/PageInfoUserDTO.md)
 - [Password](docs/Password.md)
 - [RegisterUserRequest](docs/RegisterUserRequest.md)
 - [RoleNameListResponse](docs/RoleNameListResponse.md)
 - [SendCommandRequest](docs/SendCommandRequest.md)
 - [ShareIdResponse](docs/ShareIdResponse.md)
 - [SqlTemplate](docs/SqlTemplate.md)
 - [Type](docs/Type.md)
 - [UpdateArchive](docs/UpdateArchive.md)
 - [UpdateDevice](docs/UpdateDevice.md)
 - [UpdateExternalData](docs/UpdateExternalData.md)
 - [UpdateUserRequest](docs/UpdateUserRequest.md)
 - [UserDTO](docs/UserDTO.md)
 - [UserIdResponse](docs/UserIdResponse.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



