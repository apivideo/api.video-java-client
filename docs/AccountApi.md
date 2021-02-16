# AccountApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get**](AccountApi.md#get) | **GET** /account | Show account


<a name="get"></a>
# **get**
> Account get()

Show account

Deprecated. Authenticate and get a token, then you can use the bearer token here to retrieve details about your account.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.AccountApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", ApiVideoClient.Environment.SANDBOX);

    AccountApi apiInstance = client.account();
    

    try {
      Account result = apiInstance.get();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#get");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getMessage());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type


[**Account**](Account.md)

### Authorization

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Not Found |  -  |

