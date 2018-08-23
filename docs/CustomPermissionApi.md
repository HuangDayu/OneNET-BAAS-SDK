# CustomPermissionApi

All URIs are relative to *https://demo.heclouds.com/baasapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findCustomPermissionByUserUsingGET**](CustomPermissionApi.md#findCustomPermissionByUserUsingGET) | **GET** /v1.0/extraPermissions/user | 查询当前用户拥有的自定义权限
[**findCustomPermissionUsingGET**](CustomPermissionApi.md#findCustomPermissionUsingGET) | **GET** /v1.0/extraPermissions | 查询自定义权限


<a name="findCustomPermissionByUserUsingGET"></a>
# **findCustomPermissionByUserUsingGET**
> List&lt;CustomPermission&gt; findCustomPermissionByUserUsingGET(sessionToken)

查询当前用户拥有的自定义权限

查询当前用户拥有的自定义权限

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.CustomPermissionApi;


CustomPermissionApi apiInstance = new CustomPermissionApi();
String sessionToken = "sessionToken_example"; // String | session-token
try {
    List<CustomPermission> result = apiInstance.findCustomPermissionByUserUsingGET(sessionToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomPermissionApi#findCustomPermissionByUserUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionToken** | **String**| session-token |

### Return type

[**List&lt;CustomPermission&gt;**](CustomPermission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="findCustomPermissionUsingGET"></a>
# **findCustomPermissionUsingGET**
> PageInfoCustomPermission findCustomPermissionUsingGET(sessionToken, customPermissionId, customPermissionName, pageNum, pageSize)

查询自定义权限

查询自定义权限

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.CustomPermissionApi;


CustomPermissionApi apiInstance = new CustomPermissionApi();
String sessionToken = "sessionToken_example"; // String | session-token
String customPermissionId = "customPermissionId_example"; // String | 自定义权限的id（不支持模糊查询）
String customPermissionName = "customPermissionName_example"; // String | 自定义权限名
String pageNum = "pageNum_example"; // String | 页数
String pageSize = "pageSize_example"; // String | 每页条数
try {
    PageInfoCustomPermission result = apiInstance.findCustomPermissionUsingGET(sessionToken, customPermissionId, customPermissionName, pageNum, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomPermissionApi#findCustomPermissionUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionToken** | **String**| session-token |
 **customPermissionId** | **String**| 自定义权限的id（不支持模糊查询） | [optional]
 **customPermissionName** | **String**| 自定义权限名 | [optional]
 **pageNum** | **String**| 页数 | [optional]
 **pageSize** | **String**| 每页条数 | [optional]

### Return type

[**PageInfoCustomPermission**](PageInfoCustomPermission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

