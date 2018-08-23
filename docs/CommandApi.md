# CommandApi

All URIs are relative to *https://demo.heclouds.com/baasapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCommandStatusByCmdUuidUsingGET**](CommandApi.md#getCommandStatusByCmdUuidUsingGET) | **GET** /v1.0/devices/commands/send/{cmdUuid} | 查询命令状态
[**getCommandStatusListUsingGET**](CommandApi.md#getCommandStatusListUsingGET) | **GET** /v1.0/devices/commands/send | 查询命令状态列表
[**sendCommandsUsingPOST**](CommandApi.md#sendCommandsUsingPOST) | **POST** /v1.0/devices/commands/send | 发送命令


<a name="getCommandStatusByCmdUuidUsingGET"></a>
# **getCommandStatusByCmdUuidUsingGET**
> CommandStatus getCommandStatusByCmdUuidUsingGET(cmdUuid, sessionToken)

查询命令状态

查询命令状态

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.CommandApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmdUuid** | **String**| cmdUuid |
 **sessionToken** | **String**| session-token |

### Return type

[**CommandStatus**](CommandStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getCommandStatusListUsingGET"></a>
# **getCommandStatusListUsingGET**
> PageInfoCommandStatus getCommandStatusListUsingGET(sessionToken, commandName, deviceId, deviceName, status, pageNum, pageSize)

查询命令状态列表

查询命令状态列表

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.CommandApi;


CommandApi apiInstance = new CommandApi();
String sessionToken = "sessionToken_example"; // String | session-token
String commandName = "commandName_example"; // String | 命令名称
String deviceId = "deviceId_example"; // String | 设备ID
String deviceName = "deviceName_example"; // String | 设备名称
String status = "status_example"; // String | 命令状态
String pageNum = "pageNum_example"; // String | 页数
String pageSize = "pageSize_example"; // String | 每页条数
try {
    PageInfoCommandStatus result = apiInstance.getCommandStatusListUsingGET(sessionToken, commandName, deviceId, deviceName, status, pageNum, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommandApi#getCommandStatusListUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionToken** | **String**| session-token |
 **commandName** | **String**| 命令名称 | [optional]
 **deviceId** | **String**| 设备ID | [optional]
 **deviceName** | **String**| 设备名称 | [optional]
 **status** | **String**| 命令状态 | [optional]
 **pageNum** | **String**| 页数 | [optional]
 **pageSize** | **String**| 每页条数 | [optional]

### Return type

[**PageInfoCommandStatus**](PageInfoCommandStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="sendCommandsUsingPOST"></a>
# **sendCommandsUsingPOST**
> CommandResult sendCommandsUsingPOST(sendCommandRequest, sessionToken)

发送命令

发送命令

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.CommandApi;


CommandApi apiInstance = new CommandApi();
SendCommandRequest sendCommandRequest = new SendCommandRequest(); // SendCommandRequest | sendCommandRequest
String sessionToken = "sessionToken_example"; // String | session-token
try {
    CommandResult result = apiInstance.sendCommandsUsingPOST(sendCommandRequest, sessionToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommandApi#sendCommandsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sendCommandRequest** | [**SendCommandRequest**](SendCommandRequest.md)| sendCommandRequest |
 **sessionToken** | **String**| session-token |

### Return type

[**CommandResult**](CommandResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

