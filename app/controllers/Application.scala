package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

    def showJson = Action(parse.json) { implicit request =>
      Ok("Received JSON request [" + request.body + "]")
  }
}