# RoleApi

All URIs are relative to *https://demo.heclouds.com/baasapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findRoleAllowRegUsingGET**](RoleApi.md#findRoleAllowRegUsingGET) | **GET** /v1.0/roles/allowReg | 查询允许注册的角色
[**findRoleNameListUsingGET**](RoleApi.md#findRoleNameListUsingGET) | **GET** /v1.0/roles/offSpringRole | 查询当前用户所能创建的角色


<a name="findRoleAllowRegUsingGET"></a>
# **findRoleAllowRegUsingGET**
> List&lt;RoleNameListResponse&gt; findRoleAllowRegUsingGET(appToken)

查询允许注册的角色

查询允许注册的角色

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String appToken = "appToken_example"; // String | appToken
try {
    List<RoleNameListResponse> result = apiInstance.findRoleAllowRegUsingGET(appToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#findRoleAllowRegUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appToken** | **String**| appToken |

### Return type

[**List&lt;RoleNameListResponse&gt;**](RoleNameListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="findRoleNameListUsingGET"></a>
# **findRoleNameListUsingGET**
> List&lt;RoleNameListResponse&gt; findRoleNameListUsingGET(sessionToken)

查询当前用户所能创建的角色

查询当前用户所能创建的角色

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String sessionToken = "sessionToken_example"; // String | session-token
try {
    List<RoleNameListResponse> result = apiInstance.findRoleNameListUsingGET(sessionToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#findRoleNameListUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionToken** | **String**| session-token |

### Return type

[**List&lt;RoleNameListResponse&gt;**](RoleNameListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

