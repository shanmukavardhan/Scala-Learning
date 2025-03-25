# Object-Oriented Programming in Scala

This document covers the key object-oriented programming (OOP) concepts in Scala. You'll learn about classes, objects, inheritance, traits, abstract classes, and case classes, along with practical code examples.

---

## 1. Classes and Objects

In Scala, a **class** defines a blueprint for objects. A **class** can have parameters, methods, and properties. An **object** is a singleton instance of a class, often used to hold static members or to provide an entry point to your application.

### Example: Classes and Objects

```scala
// Defining a class with constructor parameters
class Person(val name: String, var age: Int) {
  // Method inside the class
  def greet(): Unit = {
    println(s"Hello, my name is $name and I am $age years old.")
  }
}

// Companion object to run the application
object PersonTest {
  def main(args: Array[String]): Unit = {
    val person = new Person("Alice", 30)
    person.greet()
  }
}
```

---

## 2. Inheritance

Inheritance allows a class (subclass) to inherit properties and methods from another class (superclass). Scala uses the `extends` keyword to denote inheritance.

### Example: Inheritance

```scala
// Superclass
class Animal {
  def sound(): Unit = {
    println("Some generic animal sound")
  }
}

// Subclass inheriting from Animal
class Dog extends Animal {
  override def sound(): Unit = {
    println("Bark!")
  }
}

object AnimalTest {
  def main(args: Array[String]): Unit = {
    val dog = new Dog()
    dog.sound()  // Outputs: Bark!
  }
}
```

---

## 3. Traits

Traits are similar to Java interfaces but can also contain concrete implementations. They are used to share interfaces and fields between classes.

### Example: Traits

```scala
trait Logger {
  def log(message: String): Unit = println(s"Log: $message")
}

class Calculator extends Logger {
  def add(x: Int, y: Int): Int = {
    val result = x + y
    log(s"Adding $x and $y to get $result")
    result
  }
}

object CalculatorTest {
  def main(args: Array[String]): Unit = {
    val calc = new Calculator()
    println(calc.add(5, 3))
  }
}
```

---

## 4. Abstract Classes

Abstract classes cannot be instantiated and are intended to be subclassed. They can contain abstract methods (without implementation) as well as concrete methods.

### Example: Abstract Classes

```scala
abstract class Shape {
  def area(): Double  // Abstract method
}

class Circle(val radius: Double) extends Shape {
  // Implementing the abstract method
  def area(): Double = math.Pi * radius * radius
}

object ShapeTest {
  def main(args: Array[String]): Unit = {
    val circle = new Circle(5)
    println(s"Area of circle: ${circle.area()}")
  }
}
```

---

## 5. Case Classes

Case classes are a special type of class in Scala that comes with built-in support for immutability, pattern matching, and automatic implementations of methods such as `equals`, `hashCode`, and `toString`.

### Example: Case Classes

```scala
case class Point(x: Int, y: Int)

object CaseClassTest {
  def main(args: Array[String]): Unit = {
    val point = Point(2, 3)
    println(s"Point: $point")
  }
}
```

---

## Summary

- **Classes and Objects:** The building blocks of OOP in Scala.
- **Inheritance:** Reuse and extend functionality from existing classes.
- **Traits:** Flexible interfaces with concrete implementations.
- **Abstract Classes:** Base classes with abstract members that need implementation in subclasses.
- **Case Classes:** Ideal for modeling immutable data and pattern matching.

Explore these concepts by modifying the examples and trying out new scenarios. Happy coding with Scala!
```

This file provides a comprehensive overview of Scala's OOP features with clear explanations and code examples. Feel free to adjust the content to fit your learning journey!