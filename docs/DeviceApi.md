# DeviceApi

All URIs are relative to *https://demo.heclouds.com/baasapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDeviceUsingPOST**](DeviceApi.md#addDeviceUsingPOST) | **POST** /v1.0/devices | 导入单个设备
[**addDevicesUsingPOST**](DeviceApi.md#addDevicesUsingPOST) | **POST** /v1.0/devices/import | 批量导入设备
[**assignDevicesUsingPUT**](DeviceApi.md#assignDevicesUsingPUT) | **PUT** /v1.0/devices/assign | 分配设备
[**deleteDevicesUsingDELETE**](DeviceApi.md#deleteDevicesUsingDELETE) | **DELETE** /v1.0/devices/{deviceId} | 删除设备
[**disableDevicesByIdUsingPUT**](DeviceApi.md#disableDevicesByIdUsingPUT) | **PUT** /v1.0/devices/disable/{deviceId} | 停用设备
[**enableDevicesByIdUsingPUT**](DeviceApi.md#enableDevicesByIdUsingPUT) | **PUT** /v1.0/devices/enable/{deviceId} | 启用设备
[**getDevicesByIdUsingGET**](DeviceApi.md#getDevicesByIdUsingGET) | **GET** /v1.0/devices/info/{deviceId} | 查询设备信息
[**getDevicesListUsingGET**](DeviceApi.md#getDevicesListUsingGET) | **GET** /v1.0/devices | 查询设备列表
[**updateDevicesUsingPUT**](DeviceApi.md#updateDevicesUsingPUT) | **PUT** /v1.0/devices/info/{deviceId} | 编辑设备


<a name="addDeviceUsingPOST"></a>
# **addDeviceUsingPOST**
> DeviceSingleImportResponse addDeviceUsingPOST(addDevice, sessionToken)

导入单个设备

导入单个设备

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceApi;


DeviceApi apiInstance = new DeviceApi();
AddDevice addDevice = new AddDevice(); // AddDevice | addDevice
String sessionToken = "sessionToken_example"; // String | session-token
try {
    DeviceSingleImportResponse result = apiInstance.addDeviceUsingPOST(addDevice, sessionToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceApi#addDeviceUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addDevice** | [**AddDevice**](AddDevice.md)| addDevice |
 **sessionToken** | **String**| session-token |

### Return type

[**DeviceSingleImportResponse**](DeviceSingleImportResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="addDevicesUsingPOST"></a>
# **addDevicesUsingPOST**
> DeviceImportResponse addDevicesUsingPOST(deviceImport, sessionToken)

批量导入设备

批量导入设备

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceApi;


DeviceApi apiInstance = new DeviceApi();
DeviceImport deviceImport = new DeviceImport(); // DeviceImport | deviceImport
String sessionToken = "sessionToken_example"; // String | session-token
try {
    DeviceImportResponse result = apiInstance.addDevicesUsingPOST(deviceImport, sessionToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceApi#addDevicesUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceImport** | [**DeviceImport**](DeviceImport.md)| deviceImport |
 **sessionToken** | **String**| session-token |

### Return type

[**DeviceImportResponse**](DeviceImportResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="assignDevicesUsingPUT"></a>
# **assignDevicesUsingPUT**
> assignDevicesUsingPUT(assignDevice, sessionToken)

分配设备

分配设备

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceApi;


DeviceApi apiInstance = new DeviceApi();
AssignDevice assignDevice = new AssignDevice(); // AssignDevice | assignDevice
String sessionToken = "sessionToken_example"; // String | session-token
try {
    apiInstance.assignDevicesUsingPUT(assignDevice, sessionToken);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceApi#assignDevicesUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assignDevice** | [**AssignDevice**](AssignDevice.md)| assignDevice |
 **sessionToken** | **String**| session-token |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteDevicesUsingDELETE"></a>
# **deleteDevicesUsingDELETE**
> deleteDevicesUsingDELETE(deviceId, sessionToken)

删除设备

删除设备

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceApi;


DeviceApi apiInstance = new DeviceApi();
String deviceId = "deviceId_example"; // String | deviceId
String sessionToken = "sessionToken_example"; // String | session-token
try {
    apiInstance.deleteDevicesUsingDELETE(deviceId, sessionToken);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceApi#deleteDevicesUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| deviceId |
 **sessionToken** | **String**| session-token |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="disableDevicesByIdUsingPUT"></a>
# **disableDevicesByIdUsingPUT**
> disableDevicesByIdUsingPUT(deviceId, sessionToken)

停用设备

停用设备

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceApi;


DeviceApi apiInstance = new DeviceApi();
String deviceId = "deviceId_example"; // String | deviceId
String sessionToken = "sessionToken_example"; // String | session-token
try {
    apiInstance.disableDevicesByIdUsingPUT(deviceId, sessionToken);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceApi#disableDevicesByIdUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| deviceId |
 **sessionToken** | **String**| session-token |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="enableDevicesByIdUsingPUT"></a>
# **enableDevicesByIdUsingPUT**
> enableDevicesByIdUsingPUT(deviceId, sessionToken)

启用设备

启用设备

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceApi;


DeviceApi apiInstance = new DeviceApi();
String deviceId = "deviceId_example"; // String | deviceId
String sessionToken = "sessionToken_example"; // String | session-token
try {
    apiInstance.enableDevicesByIdUsingPUT(deviceId, sessionToken);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceApi#enableDevicesByIdUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| deviceId |
 **sessionToken** | **String**| session-token |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getDevicesByIdUsingGET"></a>
# **getDevicesByIdUsingGET**
> Devices getDevicesByIdUsingGET(deviceId, sessionToken)

查询设备信息

查询设备信息

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceApi;


DeviceApi apiInstance = new DeviceApi();
String deviceId = "deviceId_example"; // String | deviceId
String sessionToken = "sessionToken_example"; // String | session-token
try {
    Devices result = apiInstance.getDevicesByIdUsingGET(deviceId, sessionToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceApi#getDevicesByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| deviceId |
 **sessionToken** | **String**| session-token |

### Return type

[**Devices**](Devices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getDevicesListUsingGET"></a>
# **getDevicesListUsingGET**
> PageInfoDevicesDTO getDevicesListUsingGET(sessionToken, deviceName, deviceStatus, deviceGroupId, deviceOwner, beginTime, endTime, pageNum, pageSize)

查询设备列表

查询设备列表

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceApi;


DeviceApi apiInstance = new DeviceApi();
String sessionToken = "sessionToken_example"; // String | session-token
String deviceName = "deviceName_example"; // String | 设备名
String deviceStatus = "deviceStatus_example"; // String | 设备状态
String deviceGroupId = "deviceGroupId_example"; // String | 设备分组
String deviceOwner = "deviceOwner_example"; // String | 设备所有者loginName
String beginTime = "beginTime_example"; // String | 起始时间限制
String endTime = "endTime_example"; // String | 结束时间限制
String pageNum = "pageNum_example"; // String | 页数
String pageSize = "pageSize_example"; // String | 每页条数
try {
    PageInfoDevicesDTO result = apiInstance.getDevicesListUsingGET(sessionToken, deviceName, deviceStatus, deviceGroupId, deviceOwner, beginTime, endTime, pageNum, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceApi#getDevicesListUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionToken** | **String**| session-token |
 **deviceName** | **String**| 设备名 | [optional]
 **deviceStatus** | **String**| 设备状态 | [optional]
 **deviceGroupId** | **String**| 设备分组 | [optional]
 **deviceOwner** | **String**| 设备所有者loginName | [optional]
 **beginTime** | **String**| 起始时间限制 | [optional]
 **endTime** | **String**| 结束时间限制 | [optional]
 **pageNum** | **String**| 页数 | [optional]
 **pageSize** | **String**| 每页条数 | [optional]

### Return type

[**PageInfoDevicesDTO**](PageInfoDevicesDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateDevicesUsingPUT"></a>
# **updateDevicesUsingPUT**
> updateDevicesUsingPUT(deviceId, updateDevice, sessionToken)

编辑设备

编辑设备

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DeviceApi;


DeviceApi apiInstance = new DeviceApi();
String deviceId = "deviceId_example"; // String | deviceId
UpdateDevice updateDevice = new UpdateDevice(); // UpdateDevice | updateDevice
String sessionToken = "sessionToken_example"; // String | session-token
try {
    apiInstance.updateDevicesUsingPUT(deviceId, updateDevice, sessionToken);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceApi#updateDevicesUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| deviceId |
 **updateDevice** | [**UpdateDevice**](UpdateDevice.md)| updateDevice |
 **sessionToken** | **String**| session-token |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

