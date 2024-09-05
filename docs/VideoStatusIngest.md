

# VideoStatusIngest

Details about the capturing, transferring, and storing of your video for use immediately or in the future.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | There are four possible statuses depending on how you provide a video file: - &#x60;uploading&#x60; - the API is gathering the video source file from an upload. - &#x60;uploaded&#x60; - the video file is fully uploaded. - &#x60;ingesting&#x60; - the API is gathering the video source file from either a URL, or from cloning. - &#x60;ingested&#x60; - the video file is fully stored.  |  [optional]
**filesize** | **Integer** | The size of your file in bytes. |  [optional]
**receivedBytes** | [**List&lt;BytesRange&gt;**](BytesRange.md) | The total number of bytes received, listed for each chunk of the upload. |  [optional]
**receivedParts** | [**VideoStatusIngestReceivedParts**](VideoStatusIngestReceivedParts.md) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
UPLOADING | &quot;uploading&quot;
UPLOADED | &quot;uploaded&quot;
INGESTING | &quot;ingesting&quot;
INGESTED | &quot;ingested&quot;


## Implemented Interfaces

* Serializable
* DeepObject


