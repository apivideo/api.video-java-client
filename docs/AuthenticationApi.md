# AuthenticationApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](AuthenticationApi.md#authenticate) | **POST** /auth/api-key | Authenticate
[**refresh**](AuthenticationApi.md#refresh) | **POST** /auth/refresh | Refresh token


<a name="authenticate"></a>
# **authenticate**
> AccessToken authenticate(authenticatePayload)

Authenticate

To get started, submit your API key in the body of your request. api.video returns an access token that is valid for one hour (3600 seconds). A refresh token is also returned. View a [tutorial](https://api.video/blog/tutorials/authentication-tutorial) on authentication. All tutorials using the [authentication endpoint](https://api.video/blog/endpoints/authenticate)

### Example
```java
//With the api.video API clients, authentication is taken care of with each client created.
// You get to skip this step!
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticatePayload** | [**AuthenticatePayload**](AuthenticatePayload.md)|  |

### Return type


[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="refresh"></a>
# **refresh**
> AccessToken refresh(refreshTokenPayload)

Refresh token

Use the refresh endpoint with the refresh token you received when you first authenticated using the api-key endpoint. Send the refresh token in the body of your request. The api.video API returns a new access token that is valid for one hour (3600 seconds) and a new refresh token.  

### Example
```java
//With the api.video API clients, authentication is taken care of with each client created.
// You get to skip this step!
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refreshTokenPayload** | [**RefreshTokenPayload**](RefreshTokenPayload.md)|  |

### Return type


[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

