package main

object Main extends App {

  trait Animal {
    def m(): Unit
  }

  class Dog extends Animal {
    override def m(): Unit = println("Hello from a method")
  }

  val dog = new Dog()
  dog.m()

  var animal = new Animal {
    override def m(): Unit = println("Animal from hello")
  }

  animal.m()
}
