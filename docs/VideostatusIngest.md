

# VideostatusIngest

Details about the capturing, transferring, and storing of your video for use immediately or in the future.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | There are three possible ingest statuses. missing - you are missing information required to ingest the video. uploading - the video is in the process of being uploaded. uploaded - the video is ready for use. |  [optional]
**filesize** | **Integer** | The size of your file in bytes. |  [optional]
**receivedBytes** | [**List&lt;BytesRange&gt;**](BytesRange.md) | The total number of bytes received, listed for each chunk of the upload. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
MISSING | &quot;missing&quot;
UPLOADING | &quot;uploading&quot;
UPLOADED | &quot;uploaded&quot;


## Implemented Interfaces

* Serializable


