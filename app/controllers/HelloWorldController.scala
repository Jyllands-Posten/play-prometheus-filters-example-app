package controllers

import play.api.mvc.{Action, Controller}

class HelloWorldController extends Controller {

  def helloWorld() = Action {
    Ok("Hello world!")
  }

  def helloYou(name: String) = Action {
    Ok(s"""Hello $name!""")
  }

  def error() = Action {
    BadRequest
  }

}
