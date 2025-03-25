object CurryingExample {
  
  // A curried function that adds two numbers
  def add(x: Int)(y: Int): Int = x + y

  // Another curried function for more flexibility
  def greet(greeting: String)(name: String): String = s"$greeting, $name!"

  def main(args: Array[String]): Unit = {
    // Calling the curried function directly
    val resultDirect = add(5)(3)
    println(s"Result of add(5)(3): $resultDirect")  // Outputs: 8

    // Partially applying the curried function (no _ needed in Scala 3.4+)
    val addFive = add(5)  // Partially applied function waiting for the second parameter
    println(s"5 + 7 = ${addFive(7)}")  // Outputs: 12

    // Using the curried greet function
    println(greet("Hello")("Scala Learner"))  // Outputs: Hello, Scala Learner!

    // Partial application with greet (no _ needed)
    val sayHi = greet("Hi")
    println(sayHi("Alice"))  // Outputs: Hi, Alice!
  }
}