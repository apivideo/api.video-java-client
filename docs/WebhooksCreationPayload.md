

# WebhooksCreationPayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**events** | **List&lt;String&gt;** | A list of the webhooks that you are subscribing to. Currently \&quot;video.encoding.quality.completed\&quot; is the only option. video.encoding.quality.completed - a video encoding quality is ready for the video (for example the 720p quality hls encoding video is ready.) | 
**url** | **String** | The the url to which HTTP notifications are sent. It could be any http or https URL. | 


## Implemented Interfaces

* Serializable


