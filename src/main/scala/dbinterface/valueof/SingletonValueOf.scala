package org.marco.typelevel
package dbinterface.valueof

object SingletonValueOf {

  trait ValueOf[T] {
    def value: T
  }

  trait DbIdentifier[T] {
    def value: String
  }

  object DbIdentifier {
    implicit def anyString[A <: String](implicit singleton: ValueOf[A]) = new DbIdentifier[A] {
      override def value: String = singleton.value
    }
  }



}
