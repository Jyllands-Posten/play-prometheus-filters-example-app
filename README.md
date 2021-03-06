# Play prometheus filters example app

This is an example play application with three routes:

* /hello
* /hello/:name
* /error

These routes are monitored using the [play prometheus filters](https://github.com/Jyllands-Posten/play-prometheus-filters).

You start the application with:

```bash
sbt run
```

These routes can be used with the following curl commands
```bash
curl localhost:9000/hello
curl localhost:9000/hello/yourname
curl localhost:9000/error
```

The prometheus metrics can be viewed on the /metrics endpoint
```bash
curl localhost:9000/metrics
```

The following filters are enabled:

* StatusCounterFilter
* StatusAndRouteLatencyFilter

