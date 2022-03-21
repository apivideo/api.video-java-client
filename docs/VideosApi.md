# VideosApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](VideosApi.md#delete) | **DELETE** /videos/{videoId} | Delete a video
[**get**](VideosApi.md#get) | **GET** /videos/{videoId} | Show a video
[**getStatus**](VideosApi.md#getStatus) | **GET** /videos/{videoId}/status | Show video status
[**list**](VideosApi.md#list) | **GET** /videos | List all videos
[**update**](VideosApi.md#update) | **PATCH** /videos/{videoId} | Update a video
[**pickThumbnail**](VideosApi.md#pickThumbnail) | **PATCH** /videos/{videoId}/thumbnail | Pick a thumbnail
[**uploadWithUploadToken**](VideosApi.md#uploadWithUploadToken) | **POST** /upload | Upload with an upload token
[**create**](VideosApi.md#create) | **POST** /videos | Create a video
[**upload**](VideosApi.md#upload) | **POST** /videos/{videoId}/source | Upload a video
[**uploadThumbnail**](VideosApi.md#uploadThumbnail) | **POST** /videos/{videoId}/thumbnail | Upload a thumbnail


<a name="delete"></a>
# **delete**
> delete(videoId)

Delete a video

If you do not need a video any longer, you can send a request to delete it. All you need is the videoId. Tutorials using [video deletion](https://api.video/blog/endpoints/video-delete).

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.VideosApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", Environment.SANDBOX);

    VideosApi apiInstance = client.videos();
    
    String videoId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // The video ID for the video you want to delete.

    try {
      apiInstance.delete(videoId);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#delete");
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
 **videoId** | **String**| The video ID for the video you want to delete. |

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

<a name="get"></a>
# **get**
> Video get(videoId)

Show a video

This call provides the same JSON information provided on video creation. For private videos, it will generate a unique token url. Use this to retrieve any details you need about a video, or set up a private viewing URL. Tutorials using [video GET](https://api.video/blog/endpoints/video-get).

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.VideosApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", Environment.SANDBOX);

    VideosApi apiInstance = client.videos();
    
    String videoId = "videoId_example"; // The unique identifier for the video you want details about.

    try {
      Video result = apiInstance.get(videoId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#get");
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
 **videoId** | **String**| The unique identifier for the video you want details about. |

### Return type


[**Video**](Video.md)

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

<a name="getStatus"></a>
# **getStatus**
> VideoStatus getStatus(videoId)

Show video status

This API provides upload status &amp; encoding status to determine when the video is uploaded or ready to playback. Once encoding is completed, the response also lists the available stream qualities. Tutorials using [video status](https://api.video/blog/endpoints/video-status).

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.VideosApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", Environment.SANDBOX);

    VideosApi apiInstance = client.videos();
    
    String videoId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // The unique identifier for the video you want the status for.

    try {
      VideoStatus result = apiInstance.getStatus(videoId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#getStatus");
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
 **videoId** | **String**| The unique identifier for the video you want the status for. |

### Return type


[**VideoStatus**](VideoStatus.md)

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

<a name="list"></a>
# **list**
> VideosListResponse list().title(title).tags(tags).metadata(metadata).description(description).liveStreamId(liveStreamId).sortBy(sortBy).sortOrder(sortOrder).currentPage(currentPage).pageSize(pageSize).execute();

List all videos

Requests to this endpoint return a list of your videos (with all their details). With no parameters added to this query, the API returns all videos. You can filter what videos the API returns using the parameters described below.  We have [several tutorials](https://api.video/blog/endpoints/video-list) that demonstrate this endpoint.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.VideosApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", Environment.SANDBOX);

    VideosApi apiInstance = client.videos();
    
    String title = "My Video.mp4"; // The title of a specific video you want to find. The search will match exactly to what term you provide and return any videos that contain the same term as part of their titles.
    List<String> tags = Arrays.asList(); // A tag is a category you create and apply to videos. You can search for videos with particular tags by listing one or more here. Only videos that have all the tags you list will be returned.
    Map<String, String> metadata = new HashMap(); // Videos can be tagged with metadata tags in key:value pairs. You can search for videos with specific key value pairs using this parameter. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair.
    String description = "New Zealand"; // If you described a video with a term or sentence, you can add it here to return videos containing this string.
    String liveStreamId = "li400mYKSgQ6xs7taUeSaEKr"; // If you know the ID for a live stream, you can retrieve the stream by adding the ID for it here.
    String sortBy = "publishedAt"; // Allowed: publishedAt, title. You can search by the time videos were published at, or by title.
    String sortOrder = "asc"; // Allowed: asc, desc. asc is ascending and sorts from A to Z. desc is descending and sorts from Z to A.
    Integer currentPage = 1; // Choose the number of search results to return per page. Minimum value: 1
    Integer pageSize = 25; // Results per page. Allowed values 1-100, default is 25.

    try {
      Page<Video> result = apiInstance.list()
            .title(title)
            .tags(tags)
            .metadata(metadata)
            .description(description)
            .liveStreamId(liveStreamId)
            .sortBy(sortBy)
            .sortOrder(sortOrder)
            .currentPage(currentPage)
            .pageSize(pageSize)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#list");
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
 **title** | **String**| The title of a specific video you want to find. The search will match exactly to what term you provide and return any videos that contain the same term as part of their titles. | [optional]
 **tags** | [**List&lt;String&gt;**](String.md)| A tag is a category you create and apply to videos. You can search for videos with particular tags by listing one or more here. Only videos that have all the tags you list will be returned. | [optional]
 **metadata** | [**Map&lt;String, String&gt;**](String.md)| Videos can be tagged with metadata tags in key:value pairs. You can search for videos with specific key value pairs using this parameter. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair. | [optional]
 **description** | **String**| If you described a video with a term or sentence, you can add it here to return videos containing this string. | [optional]
 **liveStreamId** | **String**| If you know the ID for a live stream, you can retrieve the stream by adding the ID for it here. | [optional]
 **sortBy** | **String**| Allowed: publishedAt, title. You can search by the time videos were published at, or by title. | [optional]
 **sortOrder** | **String**| Allowed: asc, desc. asc is ascending and sorts from A to Z. desc is descending and sorts from Z to A. | [optional]
 **currentPage** | **Integer**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1]
 **pageSize** | **Integer**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25]

### Return type

[**Page**](pagination.md)<[**Video**](Video.md)>


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

<a name="update"></a>
# **update**
> Video update(videoId, videoUpdatePayload)

Update a video

Use this endpoint to update the parameters associated with your video. The video you are updating is determined by the video ID you provide in the path. For each parameter you want to update, include the update in the request body. NOTE: If you are updating an array, you must provide the entire array as what you provide here overwrites what is in the system rather than appending to it. Tutorials using [video update](https://api.video/blog/endpoints/video-update).

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.VideosApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", Environment.SANDBOX);

    VideosApi apiInstance = client.videos();
    
    String videoId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // The video ID for the video you want to delete.
    VideoUpdatePayload videoUpdatePayload = new VideoUpdatePayload(); // 
    videoUpdatePayload.setPlayerId("pl4k0jvEUuaTdRAEjQ4Jfrgz"); // The unique ID for the player you want to associate with your video.
    videoUpdatePayload.setTitle("null"); // The title you want to use for your video.
    videoUpdatePayload.setDescription("A film about good books."); // A brief description of the video.
    videoUpdatePayload.setPublic(true); // Whether the video is publicly available or not. False means it is set to private. Default is true. Tutorials on [private videos](https://api.video/blog/endpoints/private-videos).
    videoUpdatePayload.setPanoramic(false); // Whether the video is a 360 degree or immersive video.
    videoUpdatePayload.setMp4Support(true); // Whether the player supports the mp4 format.
    videoUpdatePayload.setTags(Arrays.asList("maths", "string theory", "video")); // A list of terms or words you want to tag the video with. Make sure the list includes all the tags you want as whatever you send in this list will overwrite the existing list for the video.
    videoUpdatePayload.setMetadata(Collections.<Metadata>emptyList()); // A list (array) of dictionaries where each dictionary contains a key value pair that describes the video. As with tags, you must send the complete list of metadata you want as whatever you send here will overwrite the existing metadata for the video. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair.


    try {
      Video result = apiInstance.update(videoId, videoUpdatePayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#update");
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
 **videoId** | **String**| The video ID for the video you want to delete. |
 **videoUpdatePayload** | [**VideoUpdatePayload**](VideoUpdatePayload.md)|  |

### Return type


[**Video**](Video.md)

### Authorization

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |

<a name="pickThumbnail"></a>
# **pickThumbnail**
> Video pickThumbnail(videoId, videoThumbnailPickPayload)

Pick a thumbnail

Pick a thumbnail from the given time code. If you'd like to upload an image for your thumbnail, use the [Upload a Thumbnail](https://docs.api.video/reference#post_videos-videoid-thumbnail) endpoint. There may be a short delay for the thumbnail to update. Tutorials using [Thumbnail picking](https://api.video/blog/endpoints/video-pick-a-thumbnail).

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.VideosApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", Environment.SANDBOX);

    VideosApi apiInstance = client.videos();
    
    String videoId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // Unique identifier of the video you want to add a thumbnail to, where you use a section of your video as the thumbnail.
    VideoThumbnailPickPayload videoThumbnailPickPayload = new VideoThumbnailPickPayload(); // 
    videoThumbnailPickPayload.setTimecode("null"); // Frame in video to be used as a placeholder before the video plays. 
Example: &#39;&quot;00:01:00.000&quot; for 1 minute into the video.&#39;
Valid Patterns: 
&quot;hh:mm:ss.ms&quot;
&quot;hh:mm:ss:frameNumber&quot;
&quot;124&quot; (integer value is reported as seconds) 
If selection is out of range, &quot;00:00:00.00&quot; will be chosen.


    try {
      Video result = apiInstance.pickThumbnail(videoId, videoThumbnailPickPayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#pickThumbnail");
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
 **videoId** | **String**| Unique identifier of the video you want to add a thumbnail to, where you use a section of your video as the thumbnail. |
 **videoThumbnailPickPayload** | [**VideoThumbnailPickPayload**](VideoThumbnailPickPayload.md)|  |

### Return type


[**Video**](Video.md)

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

<a name="uploadWithUploadToken"></a>
# **uploadWithUploadToken**
> Video uploadWithUploadToken(token, file)

Upload with an upload token

When given a token, anyone can upload a file to the URI `https://ws.api.video/upload?token=<tokenId>`.  Example with cURL:  ```curl $ curl  --request POST --url 'https://ws.api.video/upload?token=toXXX'  --header 'content-type: multipart/form-data'  -F file=@video.mp4 ```  Or in an HTML form, with a little JavaScript to convert the form into JSON: ```html <!--form for user interaction--> <form name=\"videoUploadForm\" >   <label for=video>Video:</label>   <input type=file name=source/><br/>   <input value=\"Submit\" type=\"submit\"> </form> <div></div> <!--JS takes the form data      uses FormData to turn the response into JSON.     then uses POST to upload the video file.     Update the token parameter in the url to your upload token.     --> <script>    var form = document.forms.namedItem(\"videoUploadForm\");     form.addEventListener('submit', function(ev) {   ev.preventDefault();      var oOutput = document.querySelector(\"div\"),          oData = new FormData(form);      var oReq = new XMLHttpRequest();         oReq.open(\"POST\", \"https://ws.api.video/upload?token=toXXX\", true);      oReq.send(oData);   oReq.onload = function(oEvent) {        if (oReq.status ==201) {          oOutput.innerHTML = \"Your video is uploaded!<br/>\"  + oReq.response;        } else {          oOutput.innerHTML = \"Error \" + oReq.status + \" occurred when trying to upload your file.<br />\";        }      };    }, false);  </script> ```   ### Dealing with large files  You can upload large files on api.video with <a href='https://docs.api.video/reference/post_videos-videoid-source'>Progressive Upload</a>. Alternatively, if you want to use regular upload, we have created a <a href='https://api.video/blog/tutorials/uploading-large-files-with-javascript'>tutorial</a> to walk through the steps required.

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.VideosApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient();
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient(ApiVideoClient.BasePaths.SANDBOX);

    VideosApi apiInstance = client.videos();
    
    String token = "to1tcmSFHeYY5KzyhOqVKMKb"; // The unique identifier for the token you want to use to upload a video.
    File file = new File("/path/to/file"); // The path to the video you want to upload.

    try {
      Video result = apiInstance.uploadWithUploadToken(token, file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#uploadWithUploadToken");
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
 **token** | **String**| The unique identifier for the token you want to use to upload a video. |
 **file** | **File**| The path to the video you want to upload. |


### Upload chunks

Large files are broken into chunks for upload. You can control the size of the chunks using the `setUploadChunkSize()` of method of `ApiVideoClient` before uploading:

```java
apiVideoClient.setUploadChunkSize(50*1024*1024); // use 50MB chunks
apiVideoClient.videos().uploadWithUploadToken(token, file);
```

### Progressive uploads

Progressive uploads make it possible to upload a video source "progressively," i.e., before knowing the total size of the video. This is done by sending chunks of the video source file sequentially.
The last chunk is sent by calling a different method, so api.video knows that it is time to reassemble the different chunks that were received.

```java
String token = "to1tcmSFHeYY5KzyhOqVKMKb"; // The unique identifier for the token you want to use to upload a video.;

UploadWithUploadTokenProgressiveSession session = apiVideoClient.createUploadWithUploadTokenProgressiveSession(token)

session.uploadPart(new File("sample.mp4.part1"));
session.uploadPart(new File("sample.mp4.part2"));
// ...
Video result = session.uploadLastPart(new File("sample.mp4.partn"));
```


### Return type


[**Video**](Video.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Bad Request |  -  |

<a name="create"></a>
# **create**
> Video create(videoCreationPayload)

Create a video

 ## We have tutorials on: * [Creating and uploading videos](https://api.video/blog/tutorials/video-upload-tutorial) * [Uploading large videos](https://api.video/blog/tutorials/video-upload-tutorial-large-videos)   * [Using tags with videos](https://api.video/blog/tutorials/video-tagging-best-practices) * [Private videos](https://api.video/blog/tutorials/tutorial-private-videos) * [Using Dynamic Metadata](https://api.video/blog/tutorials/dynamic-metadata)  * Full list of [tutorials](https://api.video/blog/endpoints/video-create) that demonstrate this endpoint. 

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.VideosApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", Environment.SANDBOX);

    VideosApi apiInstance = client.videos();
    
    VideoCreationPayload videoCreationPayload = new VideoCreationPayload(); // video to create
    videoCreationPayload.setTitle("Maths video"); // The title of your new video.
    videoCreationPayload.setDescription("A video about string theory."); // A brief description of your video.
    videoCreationPayload.setSource("https://www.myvideo.url.com/video.mp4 OR vi4k0jvEUuaTdRAEjQ4JfOyl"); // You can either add a video already on the web, by entering the URL of the video, or you can also enter the &#x60;videoId&#x60; of one of the videos you already have on your api.video acccount, and this will generate a copy of your video. Creating a copy of a video can be especially useful if you want to keep your original video and trim or apply a watermark onto the copy you would create.
    videoCreationPayload.setPublic(true); // Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view. Default is true. Tutorials on [private videos](https://api.video/blog/endpoints/private-videos).
    videoCreationPayload.setPanoramic(false); // Indicates if your video is a 360/immersive video.
    videoCreationPayload.setMp4Support(true); // Enables mp4 version in addition to streamed version.
    videoCreationPayload.setPlayerId("pl45KFKdlddgk654dspkze"); // The unique identification number for your video player.
    videoCreationPayload.setTags(Arrays.asList("maths", "string theory", "video")); // A list of tags you want to use to describe your video.
    videoCreationPayload.setMetadata(Collections.<Metadata>emptyList()); // A list of key value pairs that you use to provide metadata for your video. These pairs can be made dynamic, allowing you to segment your audience. Read more on [dynamic metadata](https://api.video/blog/endpoints/dynamic-metadata).
    videoCreationPayload.setClip(); // 
    videoCreationPayload.setWatermark(); // 


    try {
      Video result = apiInstance.create(videoCreationPayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#create");
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
 **videoCreationPayload** | [**VideoCreationPayload**](VideoCreationPayload.md)| video to create |

### Return type


[**Video**](Video.md)

### Authorization

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**202** | Accepted |  -  |
**400** | Bad Request |  -  |

<a name="upload"></a>
# **upload**
> Video upload(videoId, file)

Upload a video

To upload a video to the videoId you created. Replace {videoId} with the id you'd like to use, {access_token} with your token, and /path/to/video.mp4 with the path to the video you'd like to upload. You can only upload your video to the videoId once. We offer 2 types of upload:  * Regular upload  * Progressive upload The latter allows you to split a video source into X chunks and send those chunks independently (concurrently or sequentially). The 2 main goals for our users are to   * allow the upload of video sources > 200 MiB (200 MiB = the max. allowed file size for regular upload)   * allow to send a video source \"progressively\", i.e., before before knowing the total size of the video.   Once all chunks have been sent, they are reaggregated to one source file. The video source is considered as \"completely sent\" when the \"last\" chunk is sent (i.e., the chunk that \"completes\" the upload). ```bash curl https://ws.api.video/videos/{videoId}/source \\   -H 'Authorization: Bearer {access_token}' \\   -F file=@/path/to/video.mp4    ``` Tutorials using [video upload](https://api.video/blog/endpoints/video-upload).

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.VideosApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", Environment.SANDBOX);

    VideosApi apiInstance = client.videos();
    
    String videoId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // Enter the videoId you want to use to upload your video.
    File file = new File("/path/to/file"); // The path to the video you would like to upload. The path must be local. If you want to use a video from an online source, you must use the \\\"/videos\\\" endpoint and add the \\\"source\\\" parameter when you create a new video.

    try {
      Video result = apiInstance.upload(videoId, file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#upload");
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
 **videoId** | **String**| Enter the videoId you want to use to upload your video. |
 **file** | **File**| The path to the video you would like to upload. The path must be local. If you want to use a video from an online source, you must use the \\\&quot;/videos\\\&quot; endpoint and add the \\\&quot;source\\\&quot; parameter when you create a new video. |


### Upload chunks

Large files are broken into chunks for upload. You can control the size of the chunks using the `setUploadChunkSize()` of method of `ApiVideoClient` before uploading:

```java
apiVideoClient.setUploadChunkSize(50*1024*1024); // use 50MB chunks
apiVideoClient.videos().upload(videoId, file);
```

### Progressive uploads

Progressive uploads make it possible to upload a video source "progressively," i.e., before knowing the total size of the video. This is done by sending chunks of the video source file sequentially.
The last chunk is sent by calling a different method, so api.video knows that it is time to reassemble the different chunks that were received.

```java
String videoId = "vi4k0jvEUuaTdRAEjQ4Jfrgz"; // Enter the videoId you want to use to upload your video.;

UploadProgressiveSession session = apiVideoClient.createUploadProgressiveSession(videoId)

session.uploadPart(new File("sample.mp4.part1"));
session.uploadPart(new File("sample.mp4.part2"));
// ...
Video result = session.uploadLastPart(new File("sample.mp4.partn"));
```


### Return type


[**Video**](Video.md)

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

<a name="uploadThumbnail"></a>
# **uploadThumbnail**
> Video uploadThumbnail(videoId, file)

Upload a thumbnail

The thumbnail is the poster that appears in the player window before video playback begins. This endpoint allows you to upload an image for the thumbnail. To select a still frame from the video using a time stamp, use [Pick a Thumbnail](https://docs.api.video/reference#patch_videos-videoid-thumbnail) to pick a time in the video.  Note: There may be a short delay before the new thumbnail is delivered to our CDN. Tutorials using [Thumbnail upload](https://api.video/blog/endpoints/videos-upload-a-thumbnail).

### Example
```java
// Import classes:
import video.api.client.ApiVideoClient;
import video.api.client.api.ApiException;
import video.api.client.api.models.*;
import video.api.client.api.clients.VideosApi;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiVideoClient client = new ApiVideoClient("YOUR_API_TOKEN");
    // if you rather like to use the sandbox environment:
    // ApiVideoClient client = new ApiVideoClient("YOU_SANDBOX_API_TOKEN", Environment.SANDBOX);

    VideosApi apiInstance = client.videos();
    
    String videoId = "videoId_example"; // Unique identifier of the chosen video 
    File file = new File("/path/to/file"); // The image to be added as a thumbnail. The mime type should be image/jpeg, image/png or image/webp. The max allowed size is 8 MiB.

    try {
      Video result = apiInstance.uploadThumbnail(videoId, file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#uploadThumbnail");
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
 **videoId** | **String**| Unique identifier of the chosen video  |
 **file** | **File**| The image to be added as a thumbnail. The mime type should be image/jpeg, image/png or image/webp. The max allowed size is 8 MiB. |

### Return type


[**Video**](Video.md)

### Authorization

[API token](../README.md#api-token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |

