package org.marco.typelevel
package dbinterface.typeclass

trait DbIdentifier[T] {
  def value: String
}

object DbIdentifier {
  implicit object book extends DbIdentifier["book"] {
    override def value: String = "book"
  }

  implicit object title extends DbIdentifier["title"] {
    override def value: String = "title"
  }

  implicit object numberOfPages extends DbIdentifier["number_of_pages"] {
    override def value: String = "number_of_pages"
  }

}

class Column[Name](implicit val name: DbIdentifier[Name])

class Table[Name, Columns](implicit val name: DbIdentifier[Name]){

}

object book extends Table[
"book",
(
Column["title"],
Column["number_of_pages"]
  )
]

object main extends App {
  println(book.name.value)
}