# AdvancedAuthenticationApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](AdvancedAuthenticationApi.md#authenticate) | **POST** /auth/api-key | Get Bearer Token
[**refresh**](AdvancedAuthenticationApi.md#refresh) | **POST** /auth/refresh | Refresh Bearer Token


<a name="authenticate"></a>
# **authenticate**
> AccessToken authenticate(authenticatePayload)
> okhttp3.Call authenticateAsync(authenticatePayload, callback)
> ApiResponse<AccessToken> authenticateWithHttpInfo(authenticatePayload)

Get Bearer Token

Returns a bearer token that can be used to authenticate other endpoint.  You can find the tutorial on using the disposable bearer token [here](https://docs.api.video/reference/disposable-bearer-token-authentication).

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.AdvancedAuthenticationApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient();
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient(Environment.SANDBOX);

    AdvancedAuthenticationApi apiInstance = client.advancedAuthentication();
    
    AuthenticatePayload authenticatePayload = new AuthenticatePayload(); // 
    authenticatePayload.setApiKey("null"); // Your account API key. You can use your sandbox API key, or you can use your production API key.


    try {
      AccessToken result = apiInstance.authenticate(authenticatePayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvancedAuthenticationApi#authenticate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getMessage());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
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
> okhttp3.Call refreshAsync(refreshTokenPayload, callback)
> ApiResponse<AccessToken> refreshWithHttpInfo(refreshTokenPayload)

Refresh Bearer Token

Accepts the old bearer token and returns a new bearer token that can be used to authenticate other endpoint.  You can find the tutorial on using the disposable bearer token [here](https://docs.api.video/reference/disposable-bearer-token-authentication).

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.AdvancedAuthenticationApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient();
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient(Environment.SANDBOX);

    AdvancedAuthenticationApi apiInstance = client.advancedAuthentication();
    
    RefreshTokenPayload refreshTokenPayload = new RefreshTokenPayload(); // 
    refreshTokenPayload.setRefreshToken("null"); // The refresh token is either the first refresh token you received when you authenticated with the auth/api-key endpoint, or it&#39;s the refresh token from the last time you used the auth/refresh endpoint. Place this in the body of your request to obtain a new access token (which is valid for an hour) and a new refresh token.



    try {
      AccessToken result = apiInstance.refresh(refreshTokenPayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvancedAuthenticationApi#refresh");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getMessage());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
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

