package org.marco.typelevel
package dbinterface.singleton

class Column[Name]()
class Table[Name, Columns]()

object Book extends Table[
  "book",
  (
    Column["title"],
      Column["number_of_pages"]
    )
]
