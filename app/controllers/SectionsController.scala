package controllers

import play.api.libs.json.Json
import play.api.mvc.{AbstractController, ControllerComponents}

import javax.inject.Inject

class SectionsController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  val canvasObject = models.CanvasObject
  val list = Action { NotImplemented }
  val create = Action { NotImplemented }

  def details(id:Long) = Action {
    canvasObject.get(id) match {
      case None => null
      case Some(section) =>
        Ok(Json.obj(
          "id" -> section.id,
          "title" -> section.title,
          "content" -> section.content
        ))
    }
  }


   def update(id: Long) = Action { NotImplemented}

  def delete(id:Long) = Action { NotImplemented}

}
