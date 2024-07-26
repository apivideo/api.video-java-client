

# FilterBy2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mediaId** | **String** | Returns analytics based on the unique identifiers of a video or a live stream. |  [optional]
**mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) |  |  [optional]
**continent** | [**ContinentEnum**](#ContinentEnum) | Returns analytics based on the viewers&#39; continent. The list of supported continents names are based on the [GeoNames public database](https://www.geonames.org/countries/). You must use the ISO-3166 alpha2 format, for example &#x60;EU&#x60;. |  [optional]
**country** | **String** | Returns analytics based on the viewers&#39; country. The list of supported country names are based on the [GeoNames public database](https://www.geonames.org/countries/). You must use the ISO-3166 alpha2 format, for example &#x60;FR&#x60;. |  [optional]
**deviceType** | **String** | Returns analytics based on the type of device used by the viewers. Possible response values are: &#x60;computer&#x60;, &#x60;phone&#x60;, &#x60;tablet&#x60;, &#x60;tv&#x60;, &#x60;console&#x60;, &#x60;wearable&#x60;, &#x60;unknown&#x60;. |  [optional]
**operatingSystem** | **String** | Returns analytics based on the operating system used by the viewers. Response values include &#x60;windows&#x60;, &#x60;mac osx&#x60;, &#x60;android&#x60;, &#x60;ios&#x60;, &#x60;linux&#x60;. |  [optional]
**browser** | **String** | Returns analytics based on the browser used by the viewers. Response values include &#x60;chrome&#x60;, &#x60;firefox&#x60;, &#x60;edge&#x60;, &#x60;opera&#x60;. |  [optional]
**tag** | **String** | Returns analytics for videos using this tag. This filter only accepts a single value and is case sensitive. Read more about tagging your videos [here](https://docs.api.video/vod/tags-metadata). |  [optional]



## Enum: MediaTypeEnum

Name | Value
---- | -----
VIDEO | &quot;video&quot;
LIVE_STREAM | &quot;live-stream&quot;



## Enum: ContinentEnum

Name | Value
---- | -----
AS | &quot;AS&quot;
AF | &quot;AF&quot;
NA | &quot;NA&quot;
SA | &quot;SA&quot;
AN | &quot;AN&quot;
EU | &quot;EU&quot;
AZ | &quot;AZ&quot;


## Implemented Interfaces

* Serializable


