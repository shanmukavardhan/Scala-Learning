# Advanced Topics in Scala

This document covers advanced Scala features that allow you to write more expressive, reusable, and powerful code. In this guide, we discuss type classes, implicits, and advanced pattern matching.

---

## 1. Type Classes

Type classes enable ad-hoc polymorphism in Scala, allowing you to define generic behavior for different types without modifying their source code. They provide a way to implement functionality based on the type of data without relying on inheritance.

### Example: The `Show` Type Class

```scala
// Define the type class
trait Show[T] {
  def show(value: T): String
}

// Provide implicit instances for different types
object ShowInstances {
  implicit val intShow: Show[Int] = (value: Int) => s"Int: $value"
  implicit val stringShow: Show[String] = (value: String) => s"String: $value"
}

// Define a helper method that uses a context bound for Show
object Show {
  def display[T: Show](value: T): String = {
    val instance = implicitly[Show[T]]
    instance.show(value)
  }
}

// Usage examples
object TypeClassExample extends App {
  import ShowInstances._
  
  println(Show.display(100))
  println(Show.display("Hello"))
}
```

In this example:
- A trait `Show[T]` is defined as our type class.
- Implicit instances are provided for `Int` and `String`.
- The `display` method uses a context bound to require an implicit `Show[T]` instance.

---

## 2. Implicits

Implicits in Scala can be used for implicit parameters, implicit conversions, and implicit classes. They help to reduce boilerplate code but should be used with caution to keep the code clear.

### 2.1 Implicit Parameters

Implicit parameters allow you to pass arguments automatically if an implicit value is in scope.

```scala
def greet(name: String)(implicit greeting: String): String = s"$greeting, $name!"

implicit val defaultGreeting: String = "Hello"

object ImplicitParameterExample extends App {
  println(greet("Scala"))  // Outputs: Hello, Scala!
}
```

### 2.2 Implicit Conversions

Implicit conversions automatically convert one type to another when needed.

```scala
// Implicit conversion from Int to String
implicit def intToString(x: Int): String = x.toString

object ImplicitConversionExample extends App {
  val number: String = 42  // Automatically converted
  println(s"The number is $number")
}
```

### 2.3 Implicit Classes

Implicit classes allow you to add new methods to existing types.

```scala
object ImplicitClassExample {
  implicit class StringOps(s: String) {
    def excited: String = s + "!"
  }
  
  def main(args: Array[String]): Unit = {
    val greeting = "Hello"
    println(greeting.excited)  // Outputs: Hello!
  }
}
```

---

## 3. Advanced Pattern Matching

Pattern matching is a powerful feature in Scala, allowing you to match on types, values, and even custom extractors.

### 3.1 Sealed Trait Hierarchies

Using sealed traits with case classes ensures that all subtypes are known at compile time, enabling exhaustive pattern matching.

```scala
sealed trait Shape
case class Circle(radius: Double) extends Shape
case class Rectangle(width: Double, height: Double) extends Shape

object PatternMatchingExample extends App {
  def area(shape: Shape): Double = shape match {
    case Circle(r)           => math.Pi * r * r
    case Rectangle(w, h)     => w * h
  }
  
  println(area(Circle(5)))
  println(area(Rectangle(4, 6)))
}
```

### 3.2 Custom Extractors

Custom extractors allow you to define your own patterns using the `unapply` method.

```scala
object Email {
  def unapply(email: String): Option[(String, String)] = {
    email.split("@") match {
      case Array(user, domain) => Some((user, domain))
      case _ => None
    }
  }
}

object CustomExtractorExample extends App {
  val email = "user@example.com"
  
  email match {
    case Email(user, domain) => println(s"User: $user, Domain: $domain")
    case _ => println("Not a valid email")
  }
}
```

---

## Summary

- **Type Classes:** Allow for ad-hoc polymorphism. Learn to define generic behaviors without inheritance.
- **Implicits:** Provide a mechanism for automatic parameter passing, type conversions, and extending existing types.
- **Advanced Pattern Matching:** Leverage sealed traits for exhaustive matching and custom extractors for flexible pattern matching.

By mastering these advanced topics, you'll be able to write more elegant, modular, and maintainable Scala code. Experiment with these examples and integrate them into your projects to deepen your understanding of Scala's advanced features.

Happy coding!
```

This file provides a comprehensive overview of advanced Scala features with practical examples for each concept. Adjust or expand the content as needed for your repository.