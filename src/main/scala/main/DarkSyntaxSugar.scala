package main

object DarkSyntaxSugar extends App {

  abstract class AnAbstractType {
    def implemented: Int = 23

    def f(x: Int): Unit
  }

  val anAbstractInstance: AnAbstractType = (a: Int) => println("sweet")
  anAbstractInstance.f(10)

  val prependedList = 2 :: List(3, 4)

  class MyStream[T] {
    def -->:(value: T): MyStream[T] = this
  }

  val myStream = 1 -->: 2 -->: 3 -->: new MyStream[Int]

  class TeenGirl(name: String) {
    def `and then said`(gossip: String) = println(s"$name said $gossip")
  }

  val lilly = new TeenGirl("Lilly")
  lilly `and then said` "scala is sweet"

  class Composite[A, B]

  val composite: Int Composite String = ??? // infix types

  class -->[A, B]

  val towards: Int --> String = ???

  class Mutable {
    private var internalMember: Int = 0

    def member = internalMember // getter
    def member_=(value: Int): Unit = internalMember = value // setter
  }

}
