package org.marco.typelevel

import dbinterface.book

object Application {

  def main(args: Array[String]): Unit = {
    println(book.getClass)
    println(book.toString)
  }

}
