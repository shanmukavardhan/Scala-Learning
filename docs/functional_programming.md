# Functional Programming in Scala

This document covers key functional programming concepts in Scala. It introduces you to the principles of immutability, first-class functions, higher-order functions, anonymous functions, and currying. Scala’s blend of object-oriented and functional programming makes it a powerful language for building robust and concise applications.

---

## 1. Functions as First-Class Citizens

In Scala, functions are first-class citizens. This means you can assign functions to variables, pass them as arguments to other functions, and return them as values.

### Example:

```scala
// Assigning a function to a variable
val add = (x: Int, y: Int) => x + y
println(add(3, 4))  // Outputs: 7
```

---

## 2. Higher-Order Functions

A higher-order function is one that takes functions as parameters or returns a function as a result.

### Example: Function as Parameter

```scala
def applyFunction(x: Int, f: Int => Int): Int = {
  f(x)
}

val square = (n: Int) => n * n
println(applyFunction(5, square))  // Outputs: 25
```

### Example: Function Returning a Function

```scala
def multiplier(factor: Int): Int => Int = {
  (x: Int) => x * factor
}

val timesTwo = multiplier(2)
println(timesTwo(5))  // Outputs: 10
```

---

## 3. Anonymous Functions

Anonymous functions (also known as lambda expressions) are functions without a name. They are especially useful for short operations.

### Example:

```scala
val numbers = List(1, 2, 3, 4, 5)
val doubled = numbers.map(x => x * 2)
println(doubled)  // Outputs: List(2, 4, 6, 8, 10)
```

*Note:* Scala allows you to simplify this further using the underscore syntax:

```scala
val doubledSimplified = numbers.map(_ * 2)
```

---

## 4. Currying

Currying transforms a function that takes multiple arguments into a series of functions that each take a single argument. This can make function composition and partial application more convenient.

### Example:

```scala
def add(x: Int)(y: Int): Int = x + y

val addFive = add(5) _  // Partially applied function
println(addFive(3))     // Outputs: 8

// Alternatively, call curried function directly:
println(add(5)(3))      // Outputs: 8
```

---

## 5. Immutability

Functional programming emphasizes the use of immutable data. Immutable variables (declared with `val`) cannot be changed once assigned, reducing side effects and making code easier to reason about.

### Example:

```scala
val list = List(1, 2, 3)
// Instead of modifying the list, create a new one
val newList = list :+ 4  
println(newList)  // Outputs: List(1, 2, 3, 4)
```

---

## Summary

- **Functions as First-Class Citizens:** Functions can be stored, passed, and returned like any other value.
- **Higher-Order Functions:** Functions that operate on other functions.
- **Anonymous Functions:** Concise, unnamed functions for short operations.
- **Currying:** Transforming multi-argument functions into a series of single-argument functions.
- **Immutability:** Emphasizes creating new data structures rather than modifying existing ones.

By embracing these functional programming principles, you can write more concise, predictable, and testable Scala code. Experiment with these examples and try building your own higher-order functions and currying utilities to deepen your understanding.

Happy coding with Scala!
```

This file provides a clear overview of functional programming in Scala, with practical examples to help you learn and apply these concepts. Feel free to adjust or expand the content as needed!