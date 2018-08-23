# DeviceDelegationApi

All URIs are relative to *https://demo.heclouds.com/baasapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDeviceDelegationsUsingPOST**](DeviceDelegationApi.md#addDeviceDelegationsUsingPOST) | **POST** /v1.0/devices/delegations | 新增设备转授
[**deleteDeviceDelegationsUsingDELETE**](DeviceDelegationApi.md#deleteDeviceDelegationsUsingDELETE) | **DELETE** /v1.0/devices/delegations/{delegateId} | 收回设备转授
[**getDeviceDelegateOthersUsingGET**](DeviceDelegationApi.md#getDeviceDelegateOthersUsingGET) | **GET** /v1.0/devices/delegations/delegateOthers | 查询转授出去的设备列表
[**getDeviceDelegateSelfUsingGET**](DeviceDelegationApi.md#getDeviceDelegateSelfUsingGET) | **GET** /v1.0/devices/delegations/delegateSelf | 查询转授给自己的设备列表
[**getDeviceDelegationsByIdUsingGET**](DeviceDelegationApi.md#getDeviceDelegationsByIdUsingGET) | **GET** /v1.0/devices/delegations/{delegateId} | 查询设备转授
[**getDeviceDelegationsListUsingGET**](DeviceDelegationApi.md#getDeviceDelegationsListUsingGET) | **GET** /v1.0/devices/delegations | 查询设备转授列表(仅超管可用)


<a name="addDeviceDelegationsUsingPOST"></a>
# **addDeviceDelegationsUsingPOST**
> DelegateIdResponse addDeviceDelegationsUsingPOST(request, sessionToken)

新增设备转授

新增设备转授

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceDelegationApi;


DeviceDelegationApi apiInstance = new DeviceDelegationApi();
AddDeviceDelegations request = new AddDeviceDelegations(); // AddDeviceDelegations | request
String sessionToken = "sessionToken_example"; // String | session-token
try {
    DelegateIdResponse result = apiInstance.addDeviceDelegationsUsingPOST(request, sessionToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceDelegationApi#addDeviceDelegationsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**AddDeviceDelegations**](AddDeviceDelegations.md)| request |
 **sessionToken** | **String**| session-token |

### Return type

[**DelegateIdResponse**](DelegateIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteDeviceDelegationsUsingDELETE"></a>
# **deleteDeviceDelegationsUsingDELETE**
> deleteDeviceDelegationsUsingDELETE(delegateId, sessionToken)

收回设备转授

收回设备转授

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceDelegationApi;


DeviceDelegationApi apiInstance = new DeviceDelegationApi();
Integer delegateId = 56; // Integer | delegateId
String sessionToken = "sessionToken_example"; // String | session-token
try {
    apiInstance.deleteDeviceDelegationsUsingDELETE(delegateId, sessionToken);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceDelegationApi#deleteDeviceDelegationsUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delegateId** | **Integer**| delegateId |
 **sessionToken** | **String**| session-token |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getDeviceDelegateOthersUsingGET"></a>
# **getDeviceDelegateOthersUsingGET**
> PageInfoDeviceDelegationsDTO getDeviceDelegateOthersUsingGET(sessionToken, deviceId, toUserLoginName, toUserUserName, startDate, endDate, pageNum, pageSize)

查询转授出去的设备列表

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceDelegationApi;


DeviceDelegationApi apiInstance = new DeviceDelegationApi();
String sessionToken = "sessionToken_example"; // String | session-token
String deviceId = "deviceId_example"; // String | 设备ID
String toUserLoginName = "toUserLoginName_example"; // String | 被转授人loginName
String toUserUserName = "toUserUserName_example"; // String | 被转授人userName
String startDate = "startDate_example"; // String | 开始日期
String endDate = "endDate_example"; // String | 截止日期
String pageNum = "pageNum_example"; // String | 页数
String pageSize = "pageSize_example"; // String | 每页条数
try {
    PageInfoDeviceDelegationsDTO result = apiInstance.getDeviceDelegateOthersUsingGET(sessionToken, deviceId, toUserLoginName, toUserUserName, startDate, endDate, pageNum, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceDelegationApi#getDeviceDelegateOthersUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionToken** | **String**| session-token |
 **deviceId** | **String**| 设备ID | [optional]
 **toUserLoginName** | **String**| 被转授人loginName | [optional]
 **toUserUserName** | **String**| 被转授人userName | [optional]
 **startDate** | **String**| 开始日期 | [optional]
 **endDate** | **String**| 截止日期 | [optional]
 **pageNum** | **String**| 页数 | [optional]
 **pageSize** | **String**| 每页条数 | [optional]

### Return type

[**PageInfoDeviceDelegationsDTO**](PageInfoDeviceDelegationsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getDeviceDelegateSelfUsingGET"></a>
# **getDeviceDelegateSelfUsingGET**
> PageInfoDeviceDelegationsDTO getDeviceDelegateSelfUsingGET(sessionToken, deviceId, fromUserLoginName, fromUserUserName, startDate, endDate, pageNum, pageSize)

查询转授给自己的设备列表

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceDelegationApi;


DeviceDelegationApi apiInstance = new DeviceDelegationApi();
String sessionToken = "sessionToken_example"; // String | session-token
String deviceId = "deviceId_example"; // String | 设备ID
String fromUserLoginName = "fromUserLoginName_example"; // String | 转授人loginName
String fromUserUserName = "fromUserUserName_example"; // String | 转授人userName
String startDate = "startDate_example"; // String | 开始日期
String endDate = "endDate_example"; // String | 截止日期
String pageNum = "pageNum_example"; // String | 页数
String pageSize = "pageSize_example"; // String | 每页条数
try {
    PageInfoDeviceDelegationsDTO result = apiInstance.getDeviceDelegateSelfUsingGET(sessionToken, deviceId, fromUserLoginName, fromUserUserName, startDate, endDate, pageNum, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceDelegationApi#getDeviceDelegateSelfUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionToken** | **String**| session-token |
 **deviceId** | **String**| 设备ID | [optional]
 **fromUserLoginName** | **String**| 转授人loginName | [optional]
 **fromUserUserName** | **String**| 转授人userName | [optional]
 **startDate** | **String**| 开始日期 | [optional]
 **endDate** | **String**| 截止日期 | [optional]
 **pageNum** | **String**| 页数 | [optional]
 **pageSize** | **String**| 每页条数 | [optional]

### Return type

[**PageInfoDeviceDelegationsDTO**](PageInfoDeviceDelegationsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getDeviceDelegationsByIdUsingGET"></a>
# **getDeviceDelegationsByIdUsingGET**
> DeviceDelegationsResponse getDeviceDelegationsByIdUsingGET(delegateId, sessionToken)

查询设备转授

查询设备转授

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceDelegationApi;


DeviceDelegationApi apiInstance = new DeviceDelegationApi();
Integer delegateId = 56; // Integer | delegateId
String sessionToken = "sessionToken_example"; // String | session-token
try {
    DeviceDelegationsResponse result = apiInstance.getDeviceDelegationsByIdUsingGET(delegateId, sessionToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceDelegationApi#getDeviceDelegationsByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delegateId** | **Integer**| delegateId |
 **sessionToken** | **String**| session-token |

### Return type

[**DeviceDelegationsResponse**](DeviceDelegationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getDeviceDelegationsListUsingGET"></a>
# **getDeviceDelegationsListUsingGET**
> PageInfoDeviceDelegationsDTO getDeviceDelegationsListUsingGET(sessionToken, deviceId, fromUserLoginName, toUserLoginName, startDate, endDate, pageNum, pageSize)

查询设备转授列表(仅超管可用)

查询设备转授列表(仅超管可用)

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceDelegationApi;


DeviceDelegationApi apiInstance = new DeviceDelegationApi();
String sessionToken = "sessionToken_example"; // String | session-token
String deviceId = "deviceId_example"; // String | 设备ID
String fromUserLoginName = "fromUserLoginName_example"; // String | 转授人
String toUserLoginName = "toUserLoginName_example"; // String | 被转授人
String startDate = "startDate_example"; // String | 开始日期
String endDate = "endDate_example"; // String | 截止日期
String pageNum = "pageNum_example"; // String | 页数
String pageSize = "pageSize_example"; // String | 每页条数
try {
    PageInfoDeviceDelegationsDTO result = apiInstance.getDeviceDelegationsListUsingGET(sessionToken, deviceId, fromUserLoginName, toUserLoginName, startDate, endDate, pageNum, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceDelegationApi#getDeviceDelegationsListUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionToken** | **String**| session-token |
 **deviceId** | **String**| 设备ID | [optional]
 **fromUserLoginName** | **String**| 转授人 | [optional]
 **toUserLoginName** | **String**| 被转授人 | [optional]
 **startDate** | **String**| 开始日期 | [optional]
 **endDate** | **String**| 截止日期 | [optional]
 **pageNum** | **String**| 页数 | [optional]
 **pageSize** | **String**| 每页条数 | [optional]

### Return type

[**PageInfoDeviceDelegationsDTO**](PageInfoDeviceDelegationsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

