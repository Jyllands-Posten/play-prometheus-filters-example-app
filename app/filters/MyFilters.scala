package filters

import javax.inject.Inject

import com.github.stijndehaes.playprometheusfilters.filters.{RouteActionMethodLatencyFilter, StatusCounterFilter}
import play.api.http.DefaultHttpFilters

class MyFilters @Inject() (statusCounterFilter: StatusCounterFilter, routeActionMethodLatencyFilter: RouteActionMethodLatencyFilter) extends DefaultHttpFilters(statusCounterFilter, routeActionMethodLatencyFilter)