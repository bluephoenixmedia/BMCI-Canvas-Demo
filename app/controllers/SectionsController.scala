package controllers

import models.Section
import play.api.libs.functional.syntax._
import play.api.libs.json.{JsError, JsSuccess, Json, Writes}
import play.api.mvc.{AbstractController, ControllerComponents}

import javax.inject.Inject

class SectionsController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  case class CreateItem(title: String, content: String)

  val canvasObject = models.CanvasObject

  implicit val writesSection = Writes[Section] {
    case Section(id, title, content) =>
      Json.obj(
        "id" -> id,
        "title" -> title,
        "content" -> content
      )
  }


/*
  implicit val readsCreateItem: Reads[CreateItem] = {
    ((__ \ "title").read[String]) and
      ((__ \ "content").read[String])
    (CreateItem.apply _)
  }
*/
  implicit val readersCreateItem = Json.reads[CreateItem]

  val list = Action {
    Ok(Json.toJson(canvasObject.list())
    )
  }

  val create = Action(parse.json) {  implicit request =>
    request.body.validate[CreateItem] match {
    case JsSuccess(createItem, _) =>
      canvasObject.create(createItem.title, createItem.content) match {
        case Some(section) => Ok(Json.toJson(section))
        case None => InternalServerError
      }
    case JsError(errors) =>
      BadRequest
  }
  }


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

