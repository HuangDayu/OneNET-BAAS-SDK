# DeviceShareApi

All URIs are relative to *https://demo.heclouds.com/baasapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDeviceSharesUsingPOST**](DeviceShareApi.md#addDeviceSharesUsingPOST) | **POST** /v1.0/devices/shares | 新增设备分享信息
[**deleteDeviceSharesUsingDELETE**](DeviceShareApi.md#deleteDeviceSharesUsingDELETE) | **DELETE** /v1.0/devices/shares/{shareId} | 收回设备分享
[**getDeviceShareOthersUsingGET**](DeviceShareApi.md#getDeviceShareOthersUsingGET) | **GET** /v1.0/devices/shares/shareOthers | 查询分享出去的设备列表
[**getDeviceShareSelfUsingGET**](DeviceShareApi.md#getDeviceShareSelfUsingGET) | **GET** /v1.0/devices/shares/shareSelf | 查询分享给自己的设备列表
[**getDeviceSharesByIdUsingGET**](DeviceShareApi.md#getDeviceSharesByIdUsingGET) | **GET** /v1.0/devices/shares/{shareId} | 查询设备分享信息
[**getDeviceSharesListUsingGET**](DeviceShareApi.md#getDeviceSharesListUsingGET) | **GET** /v1.0/devices/shares | 查询设备分享信息列表(仅超管可用)


<a name="addDeviceSharesUsingPOST"></a>
# **addDeviceSharesUsingPOST**
> ShareIdResponse addDeviceSharesUsingPOST(request, sessionToken)

新增设备分享信息

新增设备分享信息

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceShareApi;


DeviceShareApi apiInstance = new DeviceShareApi();
AddDeviceShares request = new AddDeviceShares(); // AddDeviceShares | request
String sessionToken = "sessionToken_example"; // String | session-token
try {
    ShareIdResponse result = apiInstance.addDeviceSharesUsingPOST(request, sessionToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceShareApi#addDeviceSharesUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**AddDeviceShares**](AddDeviceShares.md)| request |
 **sessionToken** | **String**| session-token |

### Return type

[**ShareIdResponse**](ShareIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteDeviceSharesUsingDELETE"></a>
# **deleteDeviceSharesUsingDELETE**
> deleteDeviceSharesUsingDELETE(shareId, sessionToken)

收回设备分享

收回设备分享

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceShareApi;


DeviceShareApi apiInstance = new DeviceShareApi();
Integer shareId = 56; // Integer | shareId
String sessionToken = "sessionToken_example"; // String | session-token
try {
    apiInstance.deleteDeviceSharesUsingDELETE(shareId, sessionToken);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceShareApi#deleteDeviceSharesUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shareId** | **Integer**| shareId |
 **sessionToken** | **String**| session-token |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getDeviceShareOthersUsingGET"></a>
# **getDeviceShareOthersUsingGET**
> PageInfoDeviceSharesDTO getDeviceShareOthersUsingGET(sessionToken, deviceId, toUserLoginName, toUserUserName, startDate, endDate, pageNum, pageSize)

查询分享出去的设备列表

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceShareApi;


DeviceShareApi apiInstance = new DeviceShareApi();
String sessionToken = "sessionToken_example"; // String | session-token
String deviceId = "deviceId_example"; // String | 设备id
String toUserLoginName = "toUserLoginName_example"; // String | 被分享者登录名
String toUserUserName = "toUserUserName_example"; // String | 被分享者用户名
String startDate = "startDate_example"; // String | 开始时间
String endDate = "endDate_example"; // String | 结束时间
String pageNum = "pageNum_example"; // String | 页数
String pageSize = "pageSize_example"; // String | 每页条数
try {
    PageInfoDeviceSharesDTO result = apiInstance.getDeviceShareOthersUsingGET(sessionToken, deviceId, toUserLoginName, toUserUserName, startDate, endDate, pageNum, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceShareApi#getDeviceShareOthersUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionToken** | **String**| session-token |
 **deviceId** | **String**| 设备id | [optional]
 **toUserLoginName** | **String**| 被分享者登录名 | [optional]
 **toUserUserName** | **String**| 被分享者用户名 | [optional]
 **startDate** | **String**| 开始时间 | [optional]
 **endDate** | **String**| 结束时间 | [optional]
 **pageNum** | **String**| 页数 | [optional]
 **pageSize** | **String**| 每页条数 | [optional]

### Return type

[**PageInfoDeviceSharesDTO**](PageInfoDeviceSharesDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getDeviceShareSelfUsingGET"></a>
# **getDeviceShareSelfUsingGET**
> PageInfoDeviceSharesDTO getDeviceShareSelfUsingGET(sessionToken, deviceId, fromUserLoginName, fromUserUserName, startDate, endDate, pageNum, pageSize)

查询分享给自己的设备列表

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceShareApi;


DeviceShareApi apiInstance = new DeviceShareApi();
String sessionToken = "sessionToken_example"; // String | session-token
String deviceId = "deviceId_example"; // String | 设备id
String fromUserLoginName = "fromUserLoginName_example"; // String | 分享者登录名
String fromUserUserName = "fromUserUserName_example"; // String | 分享者用户名
String startDate = "startDate_example"; // String | 开始时间
String endDate = "endDate_example"; // String | 结束时间
String pageNum = "pageNum_example"; // String | 页数
String pageSize = "pageSize_example"; // String | 每页条数
try {
    PageInfoDeviceSharesDTO result = apiInstance.getDeviceShareSelfUsingGET(sessionToken, deviceId, fromUserLoginName, fromUserUserName, startDate, endDate, pageNum, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceShareApi#getDeviceShareSelfUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionToken** | **String**| session-token |
 **deviceId** | **String**| 设备id | [optional]
 **fromUserLoginName** | **String**| 分享者登录名 | [optional]
 **fromUserUserName** | **String**| 分享者用户名 | [optional]
 **startDate** | **String**| 开始时间 | [optional]
 **endDate** | **String**| 结束时间 | [optional]
 **pageNum** | **String**| 页数 | [optional]
 **pageSize** | **String**| 每页条数 | [optional]

### Return type

[**PageInfoDeviceSharesDTO**](PageInfoDeviceSharesDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getDeviceSharesByIdUsingGET"></a>
# **getDeviceSharesByIdUsingGET**
> FindDeviceSharesRsp getDeviceSharesByIdUsingGET(shareId, sessionToken)

查询设备分享信息

查询设备分享信息

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceShareApi;


DeviceShareApi apiInstance = new DeviceShareApi();
Integer shareId = 56; // Integer | shareId
String sessionToken = "sessionToken_example"; // String | session-token
try {
    FindDeviceSharesRsp result = apiInstance.getDeviceSharesByIdUsingGET(shareId, sessionToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceShareApi#getDeviceSharesByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shareId** | **Integer**| shareId |
 **sessionToken** | **String**| session-token |

### Return type

[**FindDeviceSharesRsp**](FindDeviceSharesRsp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getDeviceSharesListUsingGET"></a>
# **getDeviceSharesListUsingGET**
> PageInfoDeviceSharesDTO getDeviceSharesListUsingGET(sessionToken, deviceId, fromUserLoginName, toUserLoginName, startDate, endDate, pageNum, pageSize)

查询设备分享信息列表(仅超管可用)

查询设备分享信息列表(仅超管可用)

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceShareApi;


DeviceShareApi apiInstance = new DeviceShareApi();
String sessionToken = "sessionToken_example"; // String | session-token
String deviceId = "deviceId_example"; // String | 设备ID
String fromUserLoginName = "fromUserLoginName_example"; // String | 分享人
String toUserLoginName = "toUserLoginName_example"; // String | 被分享人
String startDate = "startDate_example"; // String | 开始时间
String endDate = "endDate_example"; // String | 结束时间
String pageNum = "pageNum_example"; // String | 页数
String pageSize = "pageSize_example"; // String | 每页条数
try {
    PageInfoDeviceSharesDTO result = apiInstance.getDeviceSharesListUsingGET(sessionToken, deviceId, fromUserLoginName, toUserLoginName, startDate, endDate, pageNum, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceShareApi#getDeviceSharesListUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionToken** | **String**| session-token |
 **deviceId** | **String**| 设备ID | [optional]
 **fromUserLoginName** | **String**| 分享人 | [optional]
 **toUserLoginName** | **String**| 被分享人 | [optional]
 **startDate** | **String**| 开始时间 | [optional]
 **endDate** | **String**| 结束时间 | [optional]
 **pageNum** | **String**| 页数 | [optional]
 **pageSize** | **String**| 每页条数 | [optional]

### Return type

[**PageInfoDeviceSharesDTO**](PageInfoDeviceSharesDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

