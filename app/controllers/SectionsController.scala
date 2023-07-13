package controllers

import play.api.mvc.{AbstractController, ControllerComponents}

import javax.inject.Inject

class SectionsController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  val canvasObject = models.CanvasObject
  val list = Action { NotImplemented }
  val create = Action { NotImplemented }

  def details(id:Long) = Action {NotImplemented}
  def update(id: Long) = Action { NotImplemented}

  def delete(id:Long) = Action { NotImplemented}

}
