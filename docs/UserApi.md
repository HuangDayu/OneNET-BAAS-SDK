# UserApi

All URIs are relative to *https://demo.heclouds.com/baasapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUserByUserIdUsingDELETE**](UserApi.md#deleteUserByUserIdUsingDELETE) | **DELETE** /v1.0/users/child/{userId} | 删除子用户
[**disableUserUsingPUT**](UserApi.md#disableUserUsingPUT) | **PUT** /v1.0/users/{userId}/disable | 停用子用户
[**enableUserUsingPUT**](UserApi.md#enableUserUsingPUT) | **PUT** /v1.0/users/{userId}/enable | 启用子用户
[**getUserByUserIdUsingGET**](UserApi.md#getUserByUserIdUsingGET) | **GET** /v1.0/users/{userId} | 查询单个用户
[**getUsersUsingGET**](UserApi.md#getUsersUsingGET) | **GET** /v1.0/users | 查询用户列表
[**insertUserUsingPOST**](UserApi.md#insertUserUsingPOST) | **POST** /v1.0/users | 增加用户
[**queryChildInfoUsingGET**](UserApi.md#queryChildInfoUsingGET) | **GET** /v1.0/users/{userId}/childQuery | 查询子用户列表
[**registerUserUsingPOST**](UserApi.md#registerUserUsingPOST) | **POST** /v1.0/register | 注册用户
[**resetPasswordUsingPUT**](UserApi.md#resetPasswordUsingPUT) | **PUT** /v1.0/users/{userId}/resetPassword | 重置子用户密码
[**updatePasswordUsingPUT**](UserApi.md#updatePasswordUsingPUT) | **PUT** /v1.0/users/updatePassword | 修改密码
[**updateUserUsingPUT**](UserApi.md#updateUserUsingPUT) | **PUT** /v1.0/users/child/{userId} | 编辑子用户


<a name="deleteUserByUserIdUsingDELETE"></a>
# **deleteUserByUserIdUsingDELETE**
> deleteUserByUserIdUsingDELETE(userId, sessionToken)

删除子用户

删除子用户

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | userId
String sessionToken = "sessionToken_example"; // String | session-token
try {
    apiInstance.deleteUserByUserIdUsingDELETE(userId, sessionToken);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUserByUserIdUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| userId |
 **sessionToken** | **String**| session-token |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="disableUserUsingPUT"></a>
# **disableUserUsingPUT**
> disableUserUsingPUT(userId, sessionToken)

停用子用户

停用子用户

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | userId
String sessionToken = "sessionToken_example"; // String | session-token
try {
    apiInstance.disableUserUsingPUT(userId, sessionToken);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#disableUserUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| userId |
 **sessionToken** | **String**| session-token |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="enableUserUsingPUT"></a>
# **enableUserUsingPUT**
> enableUserUsingPUT(userId, sessionToken)

启用子用户

启用子用户

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | userId
String sessionToken = "sessionToken_example"; // String | session-token
try {
    apiInstance.enableUserUsingPUT(userId, sessionToken);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#enableUserUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| userId |
 **sessionToken** | **String**| session-token |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUserByUserIdUsingGET"></a>
# **getUserByUserIdUsingGET**
> UserDTO getUserByUserIdUsingGET(userId, sessionToken)

查询单个用户

查询单个用户

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | userId
String sessionToken = "sessionToken_example"; // String | session-token
try {
    UserDTO result = apiInstance.getUserByUserIdUsingGET(userId, sessionToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserByUserIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| userId |
 **sessionToken** | **String**| session-token |

### Return type

[**UserDTO**](UserDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUsersUsingGET"></a>
# **getUsersUsingGET**
> PageInfoUserDTO getUsersUsingGET(sessionToken, loginName, status, email, mobile, roleId, pageNum, pageSize)

查询用户列表

查询用户列表

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.UserApi;


UserApi apiInstance = new UserApi();
String sessionToken = "sessionToken_example"; // String | session-token
String loginName = "loginName_example"; // String | 登录名
String status = "status_example"; // String | 状态
String email = "email_example"; // String | 邮箱
String mobile = "mobile_example"; // String | 手机
String roleId = "roleId_example"; // String | 角色Id
String pageNum = "pageNum_example"; // String | 页数
String pageSize = "pageSize_example"; // String | 每页条数
try {
    PageInfoUserDTO result = apiInstance.getUsersUsingGET(sessionToken, loginName, status, email, mobile, roleId, pageNum, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUsersUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionToken** | **String**| session-token |
 **loginName** | **String**| 登录名 | [optional]
 **status** | **String**| 状态 | [optional]
 **email** | **String**| 邮箱 | [optional]
 **mobile** | **String**| 手机 | [optional]
 **roleId** | **String**| 角色Id | [optional]
 **pageNum** | **String**| 页数 | [optional]
 **pageSize** | **String**| 每页条数 | [optional]

### Return type

[**PageInfoUserDTO**](PageInfoUserDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="insertUserUsingPOST"></a>
# **insertUserUsingPOST**
> UserIdResponse insertUserUsingPOST(addUserRequest, sessionToken)

增加用户

增加用户

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.UserApi;


UserApi apiInstance = new UserApi();
AddUserRequest addUserRequest = new AddUserRequest(); // AddUserRequest | addUserRequest
String sessionToken = "sessionToken_example"; // String | session-token
try {
    UserIdResponse result = apiInstance.insertUserUsingPOST(addUserRequest, sessionToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#insertUserUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addUserRequest** | [**AddUserRequest**](AddUserRequest.md)| addUserRequest |
 **sessionToken** | **String**| session-token |

### Return type

[**UserIdResponse**](UserIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="queryChildInfoUsingGET"></a>
# **queryChildInfoUsingGET**
> PageInfoUserDTO queryChildInfoUsingGET(userId, sessionToken, pageNum, pageSize)

查询子用户列表

查询子用户列表

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | userId
String sessionToken = "sessionToken_example"; // String | session-token
String pageNum = "pageNum_example"; // String | 页数
String pageSize = "pageSize_example"; // String | 每页条数
try {
    PageInfoUserDTO result = apiInstance.queryChildInfoUsingGET(userId, sessionToken, pageNum, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#queryChildInfoUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| userId |
 **sessionToken** | **String**| session-token |
 **pageNum** | **String**| 页数 | [optional]
 **pageSize** | **String**| 每页条数 | [optional]

### Return type

[**PageInfoUserDTO**](PageInfoUserDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="registerUserUsingPOST"></a>
# **registerUserUsingPOST**
> UserIdResponse registerUserUsingPOST(registerUserRequest, appToken)

注册用户

注册用户

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.UserApi;


UserApi apiInstance = new UserApi();
RegisterUserRequest registerUserRequest = new RegisterUserRequest(); // RegisterUserRequest | registerUserRequest
String appToken = "appToken_example"; // String | appToken
try {
    UserIdResponse result = apiInstance.registerUserUsingPOST(registerUserRequest, appToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#registerUserUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registerUserRequest** | [**RegisterUserRequest**](RegisterUserRequest.md)| registerUserRequest |
 **appToken** | **String**| appToken |

### Return type

[**UserIdResponse**](UserIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="resetPasswordUsingPUT"></a>
# **resetPasswordUsingPUT**
> resetPasswordUsingPUT(userId, sessionToken)

重置子用户密码

重置子用户密码

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | userId
String sessionToken = "sessionToken_example"; // String | session-token
try {
    apiInstance.resetPasswordUsingPUT(userId, sessionToken);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#resetPasswordUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| userId |
 **sessionToken** | **String**| session-token |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updatePasswordUsingPUT"></a>
# **updatePasswordUsingPUT**
> updatePasswordUsingPUT(password, sessionToken)

修改密码

修改密码

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.UserApi;


UserApi apiInstance = new UserApi();
Password password = new Password(); // Password | password
String sessionToken = "sessionToken_example"; // String | session-token
try {
    apiInstance.updatePasswordUsingPUT(password, sessionToken);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#updatePasswordUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **password** | [**Password**](Password.md)| password |
 **sessionToken** | **String**| session-token |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateUserUsingPUT"></a>
# **updateUserUsingPUT**
> updateUserUsingPUT(updateUserRequest, userId, sessionToken)

编辑子用户

编辑子用户

### Example
```java
// Import classes:
//import com.chinamobile.iot.baas.sdk.ApiException;
//import com.chinamobile.iot.baas.sdk.api.UserApi;


UserApi apiInstance = new UserApi();
UpdateUserRequest updateUserRequest = new UpdateUserRequest(); // UpdateUserRequest | updateUserRequest
Integer userId = 56; // Integer | userId
String sessionToken = "sessionToken_example"; // String | session-token
try {
    apiInstance.updateUserUsingPUT(updateUserRequest, userId, sessionToken);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#updateUserUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateUserRequest** | [**UpdateUserRequest**](UpdateUserRequest.md)| updateUserRequest |
 **userId** | **Integer**| userId |
 **sessionToken** | **String**| session-token |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

