# Play prometheus filters example app

This is an example play application with three routes:

* /hello
* /hello/:name
* /error

These routes are monitored using the [play prometheus filters](https://github.com/stijndehaes/play-prometheus-filters).

The following filters are enabled:

* StatusCounterFilter
* RouteActionMethodLatencyFilter

