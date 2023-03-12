package org.marco.typelevel
package dbinterface.generic

class Column(name: String) {

  override def toString: String = {
    s"$name"
  }

}
class Table[Columns](name: String, columns: Columns) {
  override def toString: String = {
    s"name = $name, columns = ${columns.toString}"
  }
}

object Book extends Table(
  "book",
  (
    new Column("title"),
    new Column("number_of_pages")
  )
)


