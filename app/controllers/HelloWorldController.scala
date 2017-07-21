package controllers

import javax.inject.Inject

import play.api.mvc.{AbstractController, ControllerComponents}

class HelloWorldController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

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
