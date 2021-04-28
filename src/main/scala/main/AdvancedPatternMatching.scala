package main

object AdvancedPatternMatching extends App {

  val number = List(1)

  val discription = number match {
    case head :: Nil => println(s"the only  element is $head")
    case _ =>
  }

  class Person(val name: String, val age: Int)

  object Person {
    def unapply(person: Person): Option[(String, Int)] = {
      if (person.age < 25) {
        None
      } else {
        Some(person.name, person.age)
      }
    }

    def unapply(age: Int): Option[String] =
      Some(if (age < 21) "Minor" else "Major")
  }

  val bob = new Person("Bob", 32)

  val greeting = bob match {
    case Person(n, a) => s"Hi, $a, $n"
  }
  println(greeting)

  val legalStatus = bob.age match {
    case Person(status) => s"My status is $status"
  }
  println(legalStatus)


}
