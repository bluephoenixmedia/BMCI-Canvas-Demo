package controllers

import models.Section
import play.api.libs.json.{Json, Writes}
import play.api.mvc.{AbstractController, ControllerComponents}

import javax.inject.Inject

class SectionsController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  val canvasObject = models.CanvasObject

  implicit val writesSection = Writes[Section] {
    case Section(id, title, content) =>
      Json.obj(
        "id" -> id,
        "title" -> title,
        "content" -> content
      )
  }

  val list = Action {
    Ok(Json.toJson(canvasObject.list())
    )
  }

  val create = Action { NotImplemented }



  def details(id: Long) = Action {
    canvasObject.get(id) match {
      case Some(section) => Ok(Json.toJson(section))
      case None => NotFound
    }
  }
  /*def details(id:Long) = Action {
    canvasObject.get(id) match {
      case None => null
      case Some(section) =>
        Ok(Json.obj(
          "id" -> section.id,
          "title" -> section.title,
          "content" -> section.content
        ))
    }
  }*/


   def update(id: Long) = Action { NotImplemented}

  def delete(id:Long) = Action { NotImplemented}







}

