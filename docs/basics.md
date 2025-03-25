# Scala Basics

This document covers the fundamentals of Scala programming. It is designed to introduce you to the core concepts and syntax needed to get started with Scala.

---

## 1. Variables & Data Types

Scala supports both immutable (`val`) and mutable (`var`) variables.

### Example:

```scala
// Immutable variable
val name: String = "Scala"
// Mutable variable
var age: Int = 10
```

- **`val`**: Once assigned, its value cannot be changed.
- **`var`**: The value can be updated.

---

## 2. Basic Data Types

Scala includes several basic data types:

- **Int**: Integer values (e.g., `10`)
- **Double**: Floating-point numbers (e.g., `3.14`)
- **Boolean**: True or false values (e.g., `true`)
- **String**: Sequence of characters (e.g., `"Hello, Scala!"`)

---

## 3. Functions

Functions in Scala are declared using the `def` keyword. Functions can take parameters and return a value.

### Example:

```scala
def add(x: Int, y: Int): Int = {
  x + y
}

val sum = add(5, 3)  // sum equals 8
```

- The return type is declared after the parameter list.
- The function body is enclosed in curly braces.

---

## 4. Control Structures

### If-Else Statements

```scala
val num = 10
if (num > 5) {
  println("Greater than 5")
} else {
  println("5 or less")
}
```

### Pattern Matching

Pattern matching is a powerful feature in Scala that works similarly to switch-case in other languages.

```scala
val day = "Monday"
val dayType = day match {
  case "Saturday" | "Sunday" => "Weekend"
  case _ => "Weekday"
}
println(dayType)
```

---

## 5. Loops

Scala supports various loop constructs such as `for`, `while`, and `do-while`.

### For Loop Example:

```scala
for (i <- 1 to 5) {
  println(s"Number: $i")
}
```

### While Loop Example:

```scala
var count = 1
while (count <= 5) {
  println(s"Count: $count")
  count += 1
}
```

---

## 6. Collections

Scala provides a rich set of collections. Here are some common ones:

- **List**: Immutable sequence.
- **Array**: Mutable sequence.
- **Map**: Key-value pairs.
- **Set**: A collection of unique elements.

### Example of a List:

```scala
val numbers = List(1, 2, 3, 4, 5)
numbers.foreach(println)
```

---

## Summary

This document covered the basic building blocks of Scala:
- Variable declaration and data types.
- Defining and using functions.
- Control structures including if-else and pattern matching.
- Looping constructs.
- An introduction to Scala collections.

Explore the code examples provided and experiment with your own modifications to build a solid foundation in Scala. Happy coding!
```

Feel free to customize the content and examples as needed to fit your learning journey!