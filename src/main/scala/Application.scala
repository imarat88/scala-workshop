package org.marco.typelevel

import dbinterface.basic.{Book => BasicBook}

import org.marco.typelevel.dbinterface.generic.Book

import scala.reflect.ClassTag

object Application {

  def myFunc[T: Manifest](t: T): Manifest[T] = manifest[T]

  def main(args: Array[String]): Unit = {

    println(myFunc(BasicBook))

    println(myFunc(Book))

    val p:Singleton = "42"

    println(implicitly[Book.type <:< Singleton])

    println(myFunc(p))
    println(p)

    println(myFunc(dbinterface.singleton.Book))

  }

}
