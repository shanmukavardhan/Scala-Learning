object FunctionsExample {

  // A simple function that adds two numbers
  def add(x: Int, y: Int): Int = {
    x + y
  }

  // A function with no parameters that returns a greeting message
  def greet(): String = "Hello, Scala!"

  // A function with a default parameter value
  def multiply(x: Int, y: Int = 2): Int = {
    x * y
  }

  // A recursive function to calculate factorial
  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * factorial(n - 1)
  }

  // A function that accepts variable number of arguments and returns their sum
  def sumAll(numbers: Int*): Int = {
    numbers.sum
  }

  def main(args: Array[String]): Unit = {
    println("Demonstrating basic functions in Scala:")

    // Call greet() function
    println(s"greet(): ${greet()}")

    // Call add() function
    println(s"add(3, 4): ${add(3, 4)}")

    // Call multiply() function with default parameter
    println(s"multiply(5): ${multiply(5)}")
    
    // Call multiply() with both parameters provided
    println(s"multiply(5, 3): ${multiply(5, 3)}")

    // Call recursive factorial function
    println(s"factorial(5): ${factorial(5)}")

    // Call function with variable arguments
    println(s"sumAll(1, 2, 3, 4, 5): ${sumAll(1, 2, 3, 4, 5)}")
  }
}
