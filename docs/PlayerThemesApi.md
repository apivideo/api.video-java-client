# PlayerThemesApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](PlayerThemesApi.md#delete) | **DELETE** /players/{playerId} | Delete a player
[**deleteLogo**](PlayerThemesApi.md#deleteLogo) | **DELETE** /players/{playerId}/logo | Delete logo
[**list**](PlayerThemesApi.md#list) | **GET** /players | List all player themes
[**get**](PlayerThemesApi.md#get) | **GET** /players/{playerId} | Show a player
[**update**](PlayerThemesApi.md#update) | **PATCH** /players/{playerId} | Update a player
[**create**](PlayerThemesApi.md#create) | **POST** /players | Create a player
[**uploadLogo**](PlayerThemesApi.md#uploadLogo) | **POST** /players/{playerId}/logo | Upload a logo


<a name="delete"></a>
# **delete**
> delete(playerId)

Delete a player

Delete a player if you no longer need it. You can delete any player that you have the player ID for.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.PlayerThemesApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", Environment.SANDBOX);

    PlayerThemesApi apiInstance = client.playerThemes();
    
    String playerId = "pl45d5vFFGrfdsdsd156dGhh"; // The unique identifier for the player you want to delete.

    try {
      apiInstance.delete(playerId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerThemesApi#delete");
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
 **playerId** | **String**| The unique identifier for the player you want to delete. |

### Return type


null (empty response body)

### Authorization

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**404** | Not Found |  -  |

<a name="deleteLogo"></a>
# **deleteLogo**
> deleteLogo(playerId)

Delete logo

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.PlayerThemesApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", Environment.SANDBOX);

    PlayerThemesApi apiInstance = client.playerThemes();
    
    String playerId = "pl14Db6oMJRH6SRVoOwORacK"; // The unique identifier for the player.

    try {
      apiInstance.deleteLogo(playerId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerThemesApi#deleteLogo");
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
 **playerId** | **String**| The unique identifier for the player. |

### Return type


null (empty response body)

### Authorization

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**404** | Not Found |  -  |

<a name="list"></a>
# **list**
> PlayerThemesListResponse list().sortBy(sortBy).sortOrder(sortOrder).currentPage(currentPage).pageSize(pageSize).execute();

List all player themes

Retrieve a list of all the player themes you created, as well as details about each one. Tutorials that use the [player endpoint](https://api.video/blog/endpoints/player).

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.PlayerThemesApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", Environment.SANDBOX);

    PlayerThemesApi apiInstance = client.playerThemes();
    
    String sortBy = "name"; // createdAt is the time the player was created. updatedAt is the time the player was last updated. The time is presented in ISO-8601 format.
    String sortOrder = "asc"; // Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones.
    Integer currentPage = 1; // Choose the number of search results to return per page. Minimum value: 1
    Integer pageSize = 25; // Results per page. Allowed values 1-100, default is 25.

    try {
      Page<PlayerTheme> result = apiInstance.list()
            .sortBy(sortBy)
            .sortOrder(sortOrder)
            .currentPage(currentPage)
            .pageSize(pageSize)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerThemesApi#list");
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
 **sortBy** | **String**| createdAt is the time the player was created. updatedAt is the time the player was last updated. The time is presented in ISO-8601 format. | [optional] [enum: name, createdAt, updatedAt]
 **sortOrder** | **String**| Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. | [optional] [enum: asc, desc]
 **currentPage** | **Integer**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1]
 **pageSize** | **Integer**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25]

### Return type

[**Page**](pagination.md)<[**PlayerTheme**](PlayerTheme.md)>


### Authorization

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="get"></a>
# **get**
> PlayerTheme get(playerId)

Show a player

Use a player ID to retrieve details about the player and display it for viewers.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.PlayerThemesApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", Environment.SANDBOX);

    PlayerThemesApi apiInstance = client.playerThemes();
    
    String playerId = "pl45d5vFFGrfdsdsd156dGhh"; // The unique identifier for the player you want to retrieve. 

    try {
      PlayerTheme result = apiInstance.get(playerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerThemesApi#get");
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
 **playerId** | **String**| The unique identifier for the player you want to retrieve.  |

### Return type


[**PlayerTheme**](PlayerTheme.md)

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

<a name="update"></a>
# **update**
> PlayerTheme update(playerId, playerThemeUpdatePayload)

Update a player

Use a player ID to update specific details for a player. NOTE: It may take up to 10 min before the new player configuration is available from our CDN.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.PlayerThemesApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", Environment.SANDBOX);

    PlayerThemesApi apiInstance = client.playerThemes();
    
    String playerId = "pl45d5vFFGrfdsdsd156dGhh"; // The unique identifier for the player.
    PlayerThemeUpdatePayload playerThemeUpdatePayload = new PlayerThemeUpdatePayload(); // 
    playerThemeUpdatePayload.setName(""null""); // Add a name for your player theme here.
    playerThemeUpdatePayload.setText(""null""); // RGBA color for timer text. Default: rgba(255, 255, 255, 1)
    playerThemeUpdatePayload.setLink(""null""); // RGBA color for all controls. Default: rgba(255, 255, 255, 1)
    playerThemeUpdatePayload.setLinkHover(""null""); // RGBA color for all controls when hovered. Default: rgba(255, 255, 255, 1)
    playerThemeUpdatePayload.setLinkActive(""null""); // RGBA color for the play button when hovered.
    playerThemeUpdatePayload.setTrackPlayed(""null""); // RGBA color playback bar: played content. Default: rgba(88, 131, 255, .95)
    playerThemeUpdatePayload.setTrackUnplayed(""null""); // RGBA color playback bar: downloaded but unplayed (buffered) content. Default: rgba(255, 255, 255, .35)
    playerThemeUpdatePayload.setTrackBackground(""null""); // RGBA color playback bar: background. Default: rgba(255, 255, 255, .2)
    playerThemeUpdatePayload.setBackgroundTop(""null""); // RGBA color: top 50% of background. Default: rgba(0, 0, 0, .7)
    playerThemeUpdatePayload.setBackgroundBottom(""null""); // RGBA color: bottom 50% of background. Default: rgba(0, 0, 0, .7)
    playerThemeUpdatePayload.setBackgroundText(""null""); // RGBA color for title text. Default: rgba(255, 255, 255, 1)
    playerThemeUpdatePayload.setEnableApi(); // enable/disable player SDK access. Default: true
    playerThemeUpdatePayload.setEnableControls(); // enable/disable player controls. Default: true
    playerThemeUpdatePayload.setForceAutoplay(); // enable/disable player autoplay. Default: false
    playerThemeUpdatePayload.setHideTitle(); // enable/disable title. Default: false
    playerThemeUpdatePayload.setForceLoop(); // enable/disable looping. Default: false


    try {
      PlayerTheme result = apiInstance.update(playerId, playerThemeUpdatePayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerThemesApi#update");
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
 **playerId** | **String**| The unique identifier for the player. |
 **playerThemeUpdatePayload** | [**PlayerThemeUpdatePayload**](PlayerThemeUpdatePayload.md)|  |

### Return type


[**PlayerTheme**](PlayerTheme.md)

### Authorization

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Not Found |  -  |

<a name="create"></a>
# **create**
> PlayerTheme create(playerThemeCreationPayload)

Create a player

Create a player for your video, and customise it.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.PlayerThemesApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", Environment.SANDBOX);

    PlayerThemesApi apiInstance = client.playerThemes();
    
    PlayerThemeCreationPayload playerThemeCreationPayload = new PlayerThemeCreationPayload(); // 
    playerThemeCreationPayload.setName(""null""); // Add a name for your player theme here.
    playerThemeCreationPayload.setText(""null""); // RGBA color for timer text. Default: rgba(255, 255, 255, 1)
    playerThemeCreationPayload.setLink(""null""); // RGBA color for all controls. Default: rgba(255, 255, 255, 1)
    playerThemeCreationPayload.setLinkHover(""null""); // RGBA color for all controls when hovered. Default: rgba(255, 255, 255, 1)
    playerThemeCreationPayload.setLinkActive(""null""); // RGBA color for the play button when hovered.
    playerThemeCreationPayload.setTrackPlayed(""null""); // RGBA color playback bar: played content. Default: rgba(88, 131, 255, .95)
    playerThemeCreationPayload.setTrackUnplayed(""null""); // RGBA color playback bar: downloaded but unplayed (buffered) content. Default: rgba(255, 255, 255, .35)
    playerThemeCreationPayload.setTrackBackground(""null""); // RGBA color playback bar: background. Default: rgba(255, 255, 255, .2)
    playerThemeCreationPayload.setBackgroundTop(""null""); // RGBA color: top 50% of background. Default: rgba(0, 0, 0, .7)
    playerThemeCreationPayload.setBackgroundBottom(""null""); // RGBA color: bottom 50% of background. Default: rgba(0, 0, 0, .7)
    playerThemeCreationPayload.setBackgroundText(""null""); // RGBA color for title text. Default: rgba(255, 255, 255, 1)
    playerThemeCreationPayload.setEnableApi(); // enable/disable player SDK access. Default: true
    playerThemeCreationPayload.setEnableControls(); // enable/disable player controls. Default: true
    playerThemeCreationPayload.setForceAutoplay(); // enable/disable player autoplay. Default: false
    playerThemeCreationPayload.setHideTitle(); // enable/disable title. Default: false
    playerThemeCreationPayload.setForceLoop(); // enable/disable looping. Default: false


    try {
      PlayerTheme result = apiInstance.create(playerThemeCreationPayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerThemesApi#create");
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
 **playerThemeCreationPayload** | [**PlayerThemeCreationPayload**](PlayerThemeCreationPayload.md)|  |

### Return type


[**PlayerTheme**](PlayerTheme.md)

### Authorization

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

<a name="uploadLogo"></a>
# **uploadLogo**
> PlayerTheme uploadLogo(playerId, file, link)

Upload a logo

The uploaded image maximum size should be 200x100 and its weight should be 100KB.  It will be scaled down to 30px height and converted to PNG to be displayed in the player.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.PlayerThemesApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", Environment.SANDBOX);

    PlayerThemesApi apiInstance = client.playerThemes();
    
    String playerId = "pl14Db6oMJRH6SRVoOwORacK"; // The unique identifier for the player.
    File file = new File("/path/to/file"); // The name of the file you want to use for your logo.
    String link = "link_example"; // A public link that you want to advertise in your player. For example, you could add a link to your company. When a viewer clicks on your logo, they will be taken to this address.

    try {
      PlayerTheme result = apiInstance.uploadLogo(playerId, file, link);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerThemesApi#uploadLogo");
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
 **playerId** | **String**| The unique identifier for the player. |
 **file** | **File**| The name of the file you want to use for your logo. |
 **link** | **String**| A public link that you want to advertise in your player. For example, you could add a link to your company. When a viewer clicks on your logo, they will be taken to this address. | [optional]

### Return type


[**PlayerTheme**](PlayerTheme.md)

### Authorization

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |

