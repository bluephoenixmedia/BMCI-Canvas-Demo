package models

case class Section(id: Long, title: String, content: String)

trait Canvas {
  def list(): Seq[Section]
  def create(title: String, content: String): Option[Section]
  def get(id: Long): Option[Section]
  def update(id: Long, title: String, content: String): Option[Section]
  def delete (id: Long): Boolean
}
