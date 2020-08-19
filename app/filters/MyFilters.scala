package filters

import javax.inject.Inject

import io.github.jyllandsposten.playprometheusfilters.filters.{StatusAndRouteLatencyFilter, StatusCounterFilter}
import play.api.http.DefaultHttpFilters

class MyFilters @Inject() (
  statusCounterFilter: StatusCounterFilter,
  statusAndRouteLatencyFilter: StatusAndRouteLatencyFilter
) extends DefaultHttpFilters(statusCounterFilter, statusAndRouteLatencyFilter)