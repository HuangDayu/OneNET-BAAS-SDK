# DeviceLogApi

All URIs are relative to *https://demo.heclouds.com/baasapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDeviceLogsListUsingGET**](DeviceLogApi.md#getDeviceLogsListUsingGET) | **GET** /v1.0/devices/logs | 查询设备日志列表


<a name="getDeviceLogsListUsingGET"></a>
# **getDeviceLogsListUsingGET**
> PageInfoDeviceLogs getDeviceLogsListUsingGET(sessionToken, deviceId, deviceName, logType, beginDate, endDate, userName, operator, pageNum, pageSize)

查询设备日志列表

查询设备日志列表

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceLogApi;


DeviceLogApi apiInstance = new DeviceLogApi();
String sessionToken = "sessionToken_example"; // String | session-token
String deviceId = "deviceId_example"; // String | 设备ID
String deviceName = "deviceName_example"; // String | 设备名称
String logType = "logType_example"; // String | 日志类型
String beginDate = "beginDate_example"; // String | 开始日期
String endDate = "endDate_example"; // String | 结束日期
String userName = "userName_example"; // String | 用户名
String operator = "operator_example"; // String | 操作人
String pageNum = "pageNum_example"; // String | 页数
String pageSize = "pageSize_example"; // String | 每页条数
try {
    PageInfoDeviceLogs result = apiInstance.getDeviceLogsListUsingGET(sessionToken, deviceId, deviceName, logType, beginDate, endDate, userName, operator, pageNum, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceLogApi#getDeviceLogsListUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionToken** | **String**| session-token |
 **deviceId** | **String**| 设备ID | [optional]
 **deviceName** | **String**| 设备名称 | [optional]
 **logType** | **String**| 日志类型 | [optional]
 **beginDate** | **String**| 开始日期 | [optional]
 **endDate** | **String**| 结束日期 | [optional]
 **userName** | **String**| 用户名 | [optional]
 **operator** | **String**| 操作人 | [optional]
 **pageNum** | **String**| 页数 | [optional]
 **pageSize** | **String**| 每页条数 | [optional]

### Return type

[**PageInfoDeviceLogs**](PageInfoDeviceLogs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

