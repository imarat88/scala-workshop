package org.marco.typelevel
package dbinterface

class Column(name: String) {
  override def toString: String = {
    s"$name"
  }

}
class Table(name: String, columns: List[Column]) {
  override def toString = {
    s"name = $name, columns = ${columns.map(v => v.toString).mkString(", ")}"
  }
}

object book extends Table(
  "book",
  List(
    new Column("title"),
    new Column("number_of_pages")
  )
)


