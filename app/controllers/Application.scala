package controllers

import models.Task
import play.api.data.Forms._
import play.api.data._
import play.api.mvc._

class Application extends Controller {

  val taskForm = Form(
    "label" -> nonEmptyText
  )

  def index = Action {
    Redirect(routes.Application.tasks)
  }

  def tasks = Action {
    Ok(views.html.index(Task.all(), taskForm))
   }

  def newTask = TODO

  def deleteTask(id: Long) = TODO

}
