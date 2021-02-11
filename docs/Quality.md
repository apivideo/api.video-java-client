

# Quality

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quality** | [**QualityEnum**](#QualityEnum) | The quality of the video you have, in pixels. Choices include 360p, 480p, 720p, 1080p, and 2160p. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of your video. Statuses include waiting - the video is waiting to be encoded. encoding - the video is in the process of being encoded. encoded - the video was successfully encoded. failed - the video failed to be encoded. |  [optional]



## Enum: QualityEnum

Name | Value
---- | -----
_240P | &quot;240p&quot;
_360P | &quot;360p&quot;
_480P | &quot;480p&quot;
_720P | &quot;720p&quot;
_1080P | &quot;1080p&quot;
_2160P | &quot;2160p&quot;



## Enum: StatusEnum

Name | Value
---- | -----
WAITING | &quot;waiting&quot;
ENCODING | &quot;encoding&quot;
ENCODED | &quot;encoded&quot;
FAILED | &quot;failed&quot;


## Implemented Interfaces

* Serializable


