

# AnalyticsMetricsBreakdownResponseContext

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metric** | [**MetricEnum**](#MetricEnum) | Returns the metric you selected. |  [optional]
**breakdown** | [**BreakdownEnum**](#BreakdownEnum) | Returns the dimension you selected. |  [optional]
**timeframe** | [**AnalyticsAggregatedMetricsResponseContextTimeframe**](AnalyticsAggregatedMetricsResponseContextTimeframe.md) |  |  [optional]



## Enum: MetricEnum

Name | Value
---- | -----
PLAY | &quot;play&quot;
PLAY_RATE | &quot;play-rate&quot;
START | &quot;start&quot;
END | &quot;end&quot;
IMPRESSION | &quot;impression&quot;



## Enum: BreakdownEnum

Name | Value
---- | -----
MEDIA_ID | &quot;media-id&quot;
MEDIA_TYPE | &quot;media-type&quot;
CONTINENT | &quot;continent&quot;
COUNTRY | &quot;country&quot;
DEVICE_TYPE | &quot;device-type&quot;
OPERATING_SYSTEM | &quot;operating-system&quot;
BROWSER | &quot;browser&quot;


## Implemented Interfaces

* Serializable
* DeepObject


