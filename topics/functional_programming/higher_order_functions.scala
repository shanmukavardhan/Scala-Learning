object HigherOrderFunctionsExample {
  
  // A simple higher-order function that takes a function as a parameter
  def applyOperation(x: Int, y: Int, op: (Int, Int) => Int): Int = {
    op(x, y)
  }

  // A function that returns a function (multiplier)
  def createMultiplier(factor: Int): Int => Int = {
    (x: Int) => x * factor
  }

  def main(args: Array[String]): Unit = {
    // Example usage of applyOperation
    val sum = applyOperation(10, 5, (a, b) => a + b)
    println(s"Sum: $sum")  // Outputs: Sum: 15

    val product = applyOperation(10, 5, (a, b) => a * b)
    println(s"Product: $product")  // Outputs: Product: 50

    // Using a predefined function
    def subtract(a: Int, b: Int): Int = a - b
    val difference = applyOperation(10, 5, subtract)
    println(s"Difference: $difference")  // Outputs: Difference: 5

    // Example usage of createMultiplier
    val timesThree = createMultiplier(3)
    println(s"10 multiplied by 3: ${timesThree(10)}")  // Outputs: 30
  }
}
