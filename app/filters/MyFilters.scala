package filters

import javax.inject.Inject

import com.github.stijndehaes.playprometheusfilters.filters.{StatusAndRouteLatencyFilter, StatusCounterFilter}
import play.api.http.DefaultHttpFilters

class MyFilters @Inject() (
  statusCounterFilter: StatusCounterFilter,
  statusAndRouteLatencyFilter: StatusAndRouteLatencyFilter
) extends DefaultHttpFilters(statusCounterFilter, statusAndRouteLatencyFilter)