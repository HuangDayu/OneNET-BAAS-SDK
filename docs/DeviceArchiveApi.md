# DeviceArchiveApi

All URIs are relative to *https://demo.heclouds.com/baasapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addArchivesUsingPOST**](DeviceArchiveApi.md#addArchivesUsingPOST) | **POST** /v1.0/devices/archives | 新增设备档案
[**deleteArchiveByDeviceIdUsingDELETE**](DeviceArchiveApi.md#deleteArchiveByDeviceIdUsingDELETE) | **DELETE** /v1.0/devices/archivesByDeviceId | 根据设备id删除设备档案
[**deleteArchivesBySQLUsingDELETE**](DeviceArchiveApi.md#deleteArchivesBySQLUsingDELETE) | **DELETE** /v1.0/devices/deleteArchives | 根据sql删除设备档案
[**deleteArchivesUsingDELETE**](DeviceArchiveApi.md#deleteArchivesUsingDELETE) | **DELETE** /v1.0/devices/archives | 删除设备档案
[**findArchivesUsingPOST**](DeviceArchiveApi.md#findArchivesUsingPOST) | **POST** /v1.0/devices/queryArchives | 查询设备档案列表
[**findSingleArchiveByDeviceIdUsingGET**](DeviceArchiveApi.md#findSingleArchiveByDeviceIdUsingGET) | **GET** /v1.0/devices/archivesByDeviceId | 根据设备id查询设备档案
[**findSingleArchiveUsingGET**](DeviceArchiveApi.md#findSingleArchiveUsingGET) | **GET** /v1.0/devices/archives | 查询单个设备档案
[**updateArchiveByIdUsingPUT**](DeviceArchiveApi.md#updateArchiveByIdUsingPUT) | **PUT** /v1.0/devices/archives | 修改设备档案
[**updateArchivesUsingPUT**](DeviceArchiveApi.md#updateArchivesUsingPUT) | **PUT** /v1.0/devices/updateArchives | 根据SQL语句修改设备档案


<a name="addArchivesUsingPOST"></a>
# **addArchivesUsingPOST**
> ArchiveIdResponse addArchivesUsingPOST(addArchive, sessionToken)

新增设备档案

新增设备档案

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceArchiveApi;


DeviceArchiveApi apiInstance = new DeviceArchiveApi();
AddArchive addArchive = new AddArchive(); // AddArchive | addArchive
String sessionToken = "sessionToken_example"; // String | session-token
try {
    ArchiveIdResponse result = apiInstance.addArchivesUsingPOST(addArchive, sessionToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceArchiveApi#addArchivesUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addArchive** | [**AddArchive**](AddArchive.md)| addArchive |
 **sessionToken** | **String**| session-token |

### Return type

[**ArchiveIdResponse**](ArchiveIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteArchiveByDeviceIdUsingDELETE"></a>
# **deleteArchiveByDeviceIdUsingDELETE**
> deleteArchiveByDeviceIdUsingDELETE(sessionToken, archiveName, deviceId)

根据设备id删除设备档案

删除设备档案

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceArchiveApi;


DeviceArchiveApi apiInstance = new DeviceArchiveApi();
String sessionToken = "sessionToken_example"; // String | session-token
String archiveName = "archiveName_example"; // String | 档案类型
String deviceId = "deviceId_example"; // String | 设备ID
try {
    apiInstance.deleteArchiveByDeviceIdUsingDELETE(sessionToken, archiveName, deviceId);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceArchiveApi#deleteArchiveByDeviceIdUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionToken** | **String**| session-token |
 **archiveName** | **String**| 档案类型 |
 **deviceId** | **String**| 设备ID |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteArchivesBySQLUsingDELETE"></a>
# **deleteArchivesBySQLUsingDELETE**
> deleteArchivesBySQLUsingDELETE(findMongoDataRequest, sessionToken)

根据sql删除设备档案

根据sql删除设备档案

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceArchiveApi;


DeviceArchiveApi apiInstance = new DeviceArchiveApi();
MongoDataWithDeviceIdRequest findMongoDataRequest = new MongoDataWithDeviceIdRequest(); // MongoDataWithDeviceIdRequest | findMongoDataRequest
String sessionToken = "sessionToken_example"; // String | session-token
try {
    apiInstance.deleteArchivesBySQLUsingDELETE(findMongoDataRequest, sessionToken);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceArchiveApi#deleteArchivesBySQLUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **findMongoDataRequest** | [**MongoDataWithDeviceIdRequest**](MongoDataWithDeviceIdRequest.md)| findMongoDataRequest |
 **sessionToken** | **String**| session-token |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteArchivesUsingDELETE"></a>
# **deleteArchivesUsingDELETE**
> deleteArchivesUsingDELETE(sessionToken, archiveName, archiveId)

删除设备档案

删除设备档案

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceArchiveApi;


DeviceArchiveApi apiInstance = new DeviceArchiveApi();
String sessionToken = "sessionToken_example"; // String | session-token
String archiveName = "archiveName_example"; // String | 档案类型
String archiveId = "archiveId_example"; // String | 设备档案ID
try {
    apiInstance.deleteArchivesUsingDELETE(sessionToken, archiveName, archiveId);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceArchiveApi#deleteArchivesUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionToken** | **String**| session-token |
 **archiveName** | **String**| 档案类型 | [optional]
 **archiveId** | **String**| 设备档案ID | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="findArchivesUsingPOST"></a>
# **findArchivesUsingPOST**
> List&lt;JSONObject&gt; findArchivesUsingPOST(mongoDataRequest, sessionToken)

查询设备档案列表

查询设备档案列表

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceArchiveApi;


DeviceArchiveApi apiInstance = new DeviceArchiveApi();
FindMongoDataWithDeviceIdRequest mongoDataRequest = new FindMongoDataWithDeviceIdRequest(); // FindMongoDataWithDeviceIdRequest | mongoDataRequest
String sessionToken = "sessionToken_example"; // String | session-token
try {
    List<JSONObject> result = apiInstance.findArchivesUsingPOST(mongoDataRequest, sessionToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceArchiveApi#findArchivesUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mongoDataRequest** | [**FindMongoDataWithDeviceIdRequest**](FindMongoDataWithDeviceIdRequest.md)| mongoDataRequest |
 **sessionToken** | **String**| session-token |

### Return type

[**List&lt;JSONObject&gt;**](JSONObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="findSingleArchiveByDeviceIdUsingGET"></a>
# **findSingleArchiveByDeviceIdUsingGET**
> Object findSingleArchiveByDeviceIdUsingGET(sessionToken, archiveName, deviceId)

根据设备id查询设备档案

根据设备id查询设备档案

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceArchiveApi;


DeviceArchiveApi apiInstance = new DeviceArchiveApi();
String sessionToken = "sessionToken_example"; // String | session-token
String archiveName = "archiveName_example"; // String | 档案类型
String deviceId = "deviceId_example"; // String | 设备ID
try {
    Object result = apiInstance.findSingleArchiveByDeviceIdUsingGET(sessionToken, archiveName, deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceArchiveApi#findSingleArchiveByDeviceIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionToken** | **String**| session-token |
 **archiveName** | **String**| 档案类型 | [optional]
 **deviceId** | **String**| 设备ID | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="findSingleArchiveUsingGET"></a>
# **findSingleArchiveUsingGET**
> Object findSingleArchiveUsingGET(sessionToken, archiveName, archiveId)

查询单个设备档案

查询单个设备档案

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceArchiveApi;


DeviceArchiveApi apiInstance = new DeviceArchiveApi();
String sessionToken = "sessionToken_example"; // String | session-token
String archiveName = "archiveName_example"; // String | 档案类型
String archiveId = "archiveId_example"; // String | 设备档案ID
try {
    Object result = apiInstance.findSingleArchiveUsingGET(sessionToken, archiveName, archiveId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceArchiveApi#findSingleArchiveUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionToken** | **String**| session-token |
 **archiveName** | **String**| 档案类型 | [optional]
 **archiveId** | **String**| 设备档案ID | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateArchiveByIdUsingPUT"></a>
# **updateArchiveByIdUsingPUT**
> updateArchiveByIdUsingPUT(updateArchive, sessionToken)

修改设备档案

修改设备档案

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceArchiveApi;


DeviceArchiveApi apiInstance = new DeviceArchiveApi();
UpdateArchive updateArchive = new UpdateArchive(); // UpdateArchive | updateArchive
String sessionToken = "sessionToken_example"; // String | session-token
try {
    apiInstance.updateArchiveByIdUsingPUT(updateArchive, sessionToken);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceArchiveApi#updateArchiveByIdUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateArchive** | [**UpdateArchive**](UpdateArchive.md)| updateArchive |
 **sessionToken** | **String**| session-token |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateArchivesUsingPUT"></a>
# **updateArchivesUsingPUT**
> updateArchivesUsingPUT(findMongoDataRequest, sessionToken)

根据SQL语句修改设备档案

根据SQL语句修改设备档案

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceArchiveApi;


DeviceArchiveApi apiInstance = new DeviceArchiveApi();
MongoDataWithDeviceIdRequest findMongoDataRequest = new MongoDataWithDeviceIdRequest(); // MongoDataWithDeviceIdRequest | findMongoDataRequest
String sessionToken = "sessionToken_example"; // String | session-token
try {
    apiInstance.updateArchivesUsingPUT(findMongoDataRequest, sessionToken);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceArchiveApi#updateArchivesUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **findMongoDataRequest** | [**MongoDataWithDeviceIdRequest**](MongoDataWithDeviceIdRequest.md)| findMongoDataRequest |
 **sessionToken** | **String**| session-token |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

