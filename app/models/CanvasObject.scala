package models

import java.util.concurrent.atomic.AtomicLong
import scala.collection.concurrent.TrieMap

object CanvasObject extends Canvas {

  private val sections = TrieMap.empty[Long, Section]
  private val seq = new AtomicLong

  def list(): Seq[Section]  = sections.values.to(Seq)

  def create(title: String, content: String): Option[Section] = {
    val id = seq.incrementAndGet()
    val section = Section(id, title, content)
    sections.put(id, section)
    Some(section)
  }

  def get(id: Long): Option[Section] = sections.get(id)

  def update(id: Long, title: String, content: String): Option[Section] = {
    val section = Section(id, title, content)
    sections.replace(id, section)
    Some(section)
  }

  def delete(id: Long): Boolean = sections.remove(id).isDefined


}
