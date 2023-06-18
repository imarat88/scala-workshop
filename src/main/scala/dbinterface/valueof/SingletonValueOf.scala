package org.marco.typelevel
package dbinterface.valueof

object SingletonValueOf extends App {

  trait ValueOf[T] {
    def value: T
  }

  trait DbIdentifier[T] {
    def value: String
  }

  object DbIdentifier {
    implicit def anyString[A <: String](implicit singleton: ValueOf[A]): DbIdentifier[A] = new DbIdentifier[A] {
      override def value: String = singleton.value
    }
  }

  class Column[Name](implicit val name: DbIdentifier[Name])

  class Table[Name, Columns](implicit val name: DbIdentifier[Name])

  object book extends Table[
    "book",
    (
      Column["title"],
        Column["number_of_pages"]
      )
  ]

  println(book.name.value)



}
