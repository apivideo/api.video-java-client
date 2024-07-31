

# AnalyticsMetricsOverTimeResponseContext

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metric** | [**MetricEnum**](#MetricEnum) | Returns the metric you selected. |  [optional]
**interval** | [**IntervalEnum**](#IntervalEnum) | Returns the interval you selected. |  [optional]
**timeframe** | [**AnalyticsAggregatedMetricsResponseContextTimeframe**](AnalyticsAggregatedMetricsResponseContextTimeframe.md) |  |  [optional]



## Enum: MetricEnum

Name | Value
---- | -----
PLAY | &quot;play&quot;
PLAY_RATE | &quot;play-rate&quot;
START | &quot;start&quot;
END | &quot;end&quot;
IMPRESSION | &quot;impression&quot;



## Enum: IntervalEnum

Name | Value
---- | -----
HOUR | &quot;hour&quot;
DAY | &quot;day&quot;


## Implemented Interfaces

* Serializable


