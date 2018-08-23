# SqlTemplateApi

All URIs are relative to *https://demo.heclouds.com/baasapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findTemplateByIdUsingGET**](SqlTemplateApi.md#findTemplateByIdUsingGET) | **GET** /v1.0/sqlTemplates/{sqlTemplateId} | 查询指定sql模版
[**getTemplatesUsingGET**](SqlTemplateApi.md#getTemplatesUsingGET) | **GET** /v1.0/sqlTemplates | 查询sql模版列表


<a name="findTemplateByIdUsingGET"></a>
# **findTemplateByIdUsingGET**
> SqlTemplate findTemplateByIdUsingGET(sqlTemplateId, sessionToken)

查询指定sql模版

查询指定sql模版

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.SqlTemplateApi;


SqlTemplateApi apiInstance = new SqlTemplateApi();
Integer sqlTemplateId = 56; // Integer | sqlTemplateId
String sessionToken = "sessionToken_example"; // String | session-token
try {
    SqlTemplate result = apiInstance.findTemplateByIdUsingGET(sqlTemplateId, sessionToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SqlTemplateApi#findTemplateByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sqlTemplateId** | **Integer**| sqlTemplateId |
 **sessionToken** | **String**| session-token |

### Return type

[**SqlTemplate**](SqlTemplate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getTemplatesUsingGET"></a>
# **getTemplatesUsingGET**
> PageInfoSqlTemplate getTemplatesUsingGET(sessionToken, sqlType, sqlTemplateType, sqlTemplateName, sqlDataTypes, pageNum, pageSize)

查询sql模版列表

查询sql模版列表

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.SqlTemplateApi;


SqlTemplateApi apiInstance = new SqlTemplateApi();
String sessionToken = "sessionToken_example"; // String | session-token
String sqlType = "sqlType_example"; // String | 模板sql类型:（0：查询；1：新增；2：修改；3：删除）
String sqlTemplateType = "sqlTemplateType_example"; // String | 模板类型（1：默认模板；2：自定义模板）
String sqlTemplateName = "sqlTemplateName_example"; // String | 模板名（模糊查询）
String sqlDataTypes = "sqlDataTypes_example"; // String | 模板数据类型，多个用逗号隔开(2：转换数据；3：实时统计数据；4：告警数据；5：离线统计数据；6：外部数据；7：档案数据；8：档案和转换数据；9：统计数据、告警数据和外部数据)
String pageNum = "pageNum_example"; // String | 当前页
String pageSize = "pageSize_example"; // String | 每页多少条
try {
    PageInfoSqlTemplate result = apiInstance.getTemplatesUsingGET(sessionToken, sqlType, sqlTemplateType, sqlTemplateName, sqlDataTypes, pageNum, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SqlTemplateApi#getTemplatesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionToken** | **String**| session-token |
 **sqlType** | **String**| 模板sql类型:（0：查询；1：新增；2：修改；3：删除） | [optional]
 **sqlTemplateType** | **String**| 模板类型（1：默认模板；2：自定义模板） | [optional]
 **sqlTemplateName** | **String**| 模板名（模糊查询） | [optional]
 **sqlDataTypes** | **String**| 模板数据类型，多个用逗号隔开(2：转换数据；3：实时统计数据；4：告警数据；5：离线统计数据；6：外部数据；7：档案数据；8：档案和转换数据；9：统计数据、告警数据和外部数据) | [optional]
 **pageNum** | **String**| 当前页 | [optional]
 **pageSize** | **String**| 每页多少条 | [optional]

### Return type

[**PageInfoSqlTemplate**](PageInfoSqlTemplate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

