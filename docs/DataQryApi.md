# DataQryApi

All URIs are relative to *https://demo.heclouds.com/baasapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addExternalDataUsingPOST**](DataQryApi.md#addExternalDataUsingPOST) | **POST** /v1.0/externalData | 添加外部数据
[**deleteExternalDataBySQLUsingDELETE**](DataQryApi.md#deleteExternalDataBySQLUsingDELETE) | **DELETE** /v1.0/deleteExternalData | 根据sql删除外部数据
[**deleteExternalDataUsingDELETE**](DataQryApi.md#deleteExternalDataUsingDELETE) | **DELETE** /v1.0/externalData | 删除外部数据
[**findDeviceAlarmUsingPOST**](DataQryApi.md#findDeviceAlarmUsingPOST) | **POST** /v1.0/devices/queryAlarms | 查询告警数据
[**findDeviceDataUsingPOST**](DataQryApi.md#findDeviceDataUsingPOST) | **POST** /v1.0/devices/queryData | 查询全局设备数据
[**findExternalDataByIdUsingGET**](DataQryApi.md#findExternalDataByIdUsingGET) | **GET** /v1.0/externalData | 根据id查询某一条外部数据
[**findExternalDataUsingPOST**](DataQryApi.md#findExternalDataUsingPOST) | **POST** /v1.0/queryExternalData | 查询外部数据
[**findStatTaskDataUsingPOST**](DataQryApi.md#findStatTaskDataUsingPOST) | **POST** /v1.0/queryStatTaskData | 查询离线统计数据
[**findStatisticsDataUsingPOST**](DataQryApi.md#findStatisticsDataUsingPOST) | **POST** /v1.0/devices/queryStats | 查询统计数据
[**findTableConfigUsingGET**](DataQryApi.md#findTableConfigUsingGET) | **GET** /v1.0/queryTableConfig | 查询表配置信息
[**updateExternalDataByIdUsingPUT**](DataQryApi.md#updateExternalDataByIdUsingPUT) | **PUT** /v1.0/externalData | 修改外部数据
[**updateExternalDataUsingPUT**](DataQryApi.md#updateExternalDataUsingPUT) | **PUT** /v1.0/updateExternalData | 根据sql修改外部数据


<a name="addExternalDataUsingPOST"></a>
# **addExternalDataUsingPOST**
> ExternalDataIdResponse addExternalDataUsingPOST(addExternalData, sessionToken)

添加外部数据

添加外部数据

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DataQryApi;


DataQryApi apiInstance = new DataQryApi();
AddExternalData addExternalData = new AddExternalData(); // AddExternalData | addExternalData
String sessionToken = "sessionToken_example"; // String | session-token
try {
    ExternalDataIdResponse result = apiInstance.addExternalDataUsingPOST(addExternalData, sessionToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataQryApi#addExternalDataUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addExternalData** | [**AddExternalData**](AddExternalData.md)| addExternalData |
 **sessionToken** | **String**| session-token |

### Return type

[**ExternalDataIdResponse**](ExternalDataIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteExternalDataBySQLUsingDELETE"></a>
# **deleteExternalDataBySQLUsingDELETE**
> deleteExternalDataBySQLUsingDELETE(mongoDataRequest, sessionToken)

根据sql删除外部数据

根据sql删除外部数据

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DataQryApi;


DataQryApi apiInstance = new DataQryApi();
MongoDataRequest mongoDataRequest = new MongoDataRequest(); // MongoDataRequest | mongoDataRequest
String sessionToken = "sessionToken_example"; // String | session-token
try {
    apiInstance.deleteExternalDataBySQLUsingDELETE(mongoDataRequest, sessionToken);
} catch (ApiException e) {
    System.err.println("Exception when calling DataQryApi#deleteExternalDataBySQLUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mongoDataRequest** | [**MongoDataRequest**](MongoDataRequest.md)| mongoDataRequest |
 **sessionToken** | **String**| session-token |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteExternalDataUsingDELETE"></a>
# **deleteExternalDataUsingDELETE**
> deleteExternalDataUsingDELETE(sessionToken, externalDataName, recordId)

删除外部数据

删除外部数据

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DataQryApi;


DataQryApi apiInstance = new DataQryApi();
String sessionToken = "sessionToken_example"; // String | session-token
String externalDataName = "externalDataName_example"; // String | 外部数据名
String recordId = "recordId_example"; // String | 外部数据id
try {
    apiInstance.deleteExternalDataUsingDELETE(sessionToken, externalDataName, recordId);
} catch (ApiException e) {
    System.err.println("Exception when calling DataQryApi#deleteExternalDataUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionToken** | **String**| session-token |
 **externalDataName** | **String**| 外部数据名 |
 **recordId** | **String**| 外部数据id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="findDeviceAlarmUsingPOST"></a>
# **findDeviceAlarmUsingPOST**
> List&lt;JSONObject&gt; findDeviceAlarmUsingPOST(findMongoDataRequest, sessionToken)

查询告警数据

查询告警数据

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DataQryApi;


DataQryApi apiInstance = new DataQryApi();
FindMongoDataRequest findMongoDataRequest = new FindMongoDataRequest(); // FindMongoDataRequest | findMongoDataRequest
String sessionToken = "sessionToken_example"; // String | session-token
try {
    List<JSONObject> result = apiInstance.findDeviceAlarmUsingPOST(findMongoDataRequest, sessionToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataQryApi#findDeviceAlarmUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **findMongoDataRequest** | [**FindMongoDataRequest**](FindMongoDataRequest.md)| findMongoDataRequest |
 **sessionToken** | **String**| session-token |

### Return type

[**List&lt;JSONObject&gt;**](JSONObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="findDeviceDataUsingPOST"></a>
# **findDeviceDataUsingPOST**
> List&lt;JSONObject&gt; findDeviceDataUsingPOST(mongoDataRequest, sessionToken)

查询全局设备数据

查询全局设备数据

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DataQryApi;


DataQryApi apiInstance = new DataQryApi();
FindMongoDataWithDeviceIdRequest mongoDataRequest = new FindMongoDataWithDeviceIdRequest(); // FindMongoDataWithDeviceIdRequest | mongoDataRequest
String sessionToken = "sessionToken_example"; // String | session-token
try {
    List<JSONObject> result = apiInstance.findDeviceDataUsingPOST(mongoDataRequest, sessionToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataQryApi#findDeviceDataUsingPOST");
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

<a name="findExternalDataByIdUsingGET"></a>
# **findExternalDataByIdUsingGET**
> Object findExternalDataByIdUsingGET(sessionToken, id, externalDataName)

根据id查询某一条外部数据

根据id查询某一条外部数据

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DataQryApi;


DataQryApi apiInstance = new DataQryApi();
String sessionToken = "sessionToken_example"; // String | session-token
String id = "id_example"; // String | 外部数据id
String externalDataName = "externalDataName_example"; // String | 外部数据名
try {
    Object result = apiInstance.findExternalDataByIdUsingGET(sessionToken, id, externalDataName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataQryApi#findExternalDataByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionToken** | **String**| session-token |
 **id** | **String**| 外部数据id |
 **externalDataName** | **String**| 外部数据名 |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="findExternalDataUsingPOST"></a>
# **findExternalDataUsingPOST**
> List&lt;JSONObject&gt; findExternalDataUsingPOST(findMongoDataRequest, sessionToken)

查询外部数据

查询外部数据

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DataQryApi;


DataQryApi apiInstance = new DataQryApi();
FindMongoDataRequest findMongoDataRequest = new FindMongoDataRequest(); // FindMongoDataRequest | findMongoDataRequest
String sessionToken = "sessionToken_example"; // String | session-token
try {
    List<JSONObject> result = apiInstance.findExternalDataUsingPOST(findMongoDataRequest, sessionToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataQryApi#findExternalDataUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **findMongoDataRequest** | [**FindMongoDataRequest**](FindMongoDataRequest.md)| findMongoDataRequest |
 **sessionToken** | **String**| session-token |

### Return type

[**List&lt;JSONObject&gt;**](JSONObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="findStatTaskDataUsingPOST"></a>
# **findStatTaskDataUsingPOST**
> List&lt;JSONObject&gt; findStatTaskDataUsingPOST(findMongoDataRequest, sessionToken)

查询离线统计数据

查询离线统计数据

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DataQryApi;


DataQryApi apiInstance = new DataQryApi();
FindMongoDataRequest findMongoDataRequest = new FindMongoDataRequest(); // FindMongoDataRequest | findMongoDataRequest
String sessionToken = "sessionToken_example"; // String | session-token
try {
    List<JSONObject> result = apiInstance.findStatTaskDataUsingPOST(findMongoDataRequest, sessionToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataQryApi#findStatTaskDataUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **findMongoDataRequest** | [**FindMongoDataRequest**](FindMongoDataRequest.md)| findMongoDataRequest |
 **sessionToken** | **String**| session-token |

### Return type

[**List&lt;JSONObject&gt;**](JSONObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="findStatisticsDataUsingPOST"></a>
# **findStatisticsDataUsingPOST**
> List&lt;JSONObject&gt; findStatisticsDataUsingPOST(findMongoDataRequest, sessionToken)

查询统计数据

查询统计数据

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DataQryApi;


DataQryApi apiInstance = new DataQryApi();
FindMongoDataRequest findMongoDataRequest = new FindMongoDataRequest(); // FindMongoDataRequest | findMongoDataRequest
String sessionToken = "sessionToken_example"; // String | session-token
try {
    List<JSONObject> result = apiInstance.findStatisticsDataUsingPOST(findMongoDataRequest, sessionToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataQryApi#findStatisticsDataUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **findMongoDataRequest** | [**FindMongoDataRequest**](FindMongoDataRequest.md)| findMongoDataRequest |
 **sessionToken** | **String**| session-token |

### Return type

[**List&lt;JSONObject&gt;**](JSONObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="findTableConfigUsingGET"></a>
# **findTableConfigUsingGET**
> Map&lt;String, List&gt; findTableConfigUsingGET(sessionToken, tableType, tableName)

查询表配置信息

查询表配置信息，返回格式：{   \&quot;tableName\&quot;: [     {       \&quot;field_desc\&quot;: \&quot;求均值\&quot;,       \&quot;field_type\&quot;: \&quot;6\&quot;,       \&quot;field_name\&quot;: \&quot;avgZ\&quot;        ......    }    ......  ] }其中field_type，1：String；2：int；3：Float；4：Boolean；5：Long；6：Double；7：Date

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DataQryApi;


DataQryApi apiInstance = new DataQryApi();
String sessionToken = "sessionToken_example"; // String | session-token
Integer tableType = 56; // Integer | 表类型,2：转换数据；3：实时统计数据；4：告警数据；5：离线统计数据；6：外部数据；7：档案数据；
String tableName = "tableName_example"; // String | 表名
try {
    Map<String, List> result = apiInstance.findTableConfigUsingGET(sessionToken, tableType, tableName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataQryApi#findTableConfigUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionToken** | **String**| session-token |
 **tableType** | **Integer**| 表类型,2：转换数据；3：实时统计数据；4：告警数据；5：离线统计数据；6：外部数据；7：档案数据； |
 **tableName** | **String**| 表名 | [optional]

### Return type

[**Map&lt;String, List&gt;**](List.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateExternalDataByIdUsingPUT"></a>
# **updateExternalDataByIdUsingPUT**
> updateExternalDataByIdUsingPUT(updateExternalData, sessionToken)

修改外部数据

修改外部数据

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DataQryApi;


DataQryApi apiInstance = new DataQryApi();
UpdateExternalData updateExternalData = new UpdateExternalData(); // UpdateExternalData | updateExternalData
String sessionToken = "sessionToken_example"; // String | session-token
try {
    apiInstance.updateExternalDataByIdUsingPUT(updateExternalData, sessionToken);
} catch (ApiException e) {
    System.err.println("Exception when calling DataQryApi#updateExternalDataByIdUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateExternalData** | [**UpdateExternalData**](UpdateExternalData.md)| updateExternalData |
 **sessionToken** | **String**| session-token |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateExternalDataUsingPUT"></a>
# **updateExternalDataUsingPUT**
> updateExternalDataUsingPUT(mongoDataRequest, sessionToken)

根据sql修改外部数据

根据sql修改外部数据

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.DataQryApi;


DataQryApi apiInstance = new DataQryApi();
MongoDataRequest mongoDataRequest = new MongoDataRequest(); // MongoDataRequest | mongoDataRequest
String sessionToken = "sessionToken_example"; // String | session-token
try {
    apiInstance.updateExternalDataUsingPUT(mongoDataRequest, sessionToken);
} catch (ApiException e) {
    System.err.println("Exception when calling DataQryApi#updateExternalDataUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mongoDataRequest** | [**MongoDataRequest**](MongoDataRequest.md)| mongoDataRequest |
 **sessionToken** | **String**| session-token |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

