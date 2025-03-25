object LoopsExample {
  def main(args: Array[String]): Unit = {
    // For loop using a range from 1 to 5
    println("For loop (1 to 5):")
    for (i <- 1 to 5) {
      println(s"Number: $i")
    }

    // For loop iterating over a collection (List)
    println("\nFor loop over a list of fruits:")
    val fruits = List("Apple", "Banana", "Cherry")
    for (fruit <- fruits) {
      println(s"Fruit: $fruit")
    }

    // For loop with yield to produce a new collection (squares of numbers)
    println("\nFor loop with yield (squares of 1 to 5):")
    val squares = for (i <- 1 to 5) yield i * i
    println(s"Squares: ${squares.mkString(", ")}")

    // While loop example
    println("\nWhile loop:")
    var count = 1
    while (count <= 5) {
      println(s"Count: $count")
      count += 1
    }

    // Alternative to Do-While loop using a while loop
    println("\nSimulated Do-While loop (using while):")
    var j = 1
    while (true) {
      println(s"j: $j")
      j += 1
      if (j > 5) {
        // Break out of the loop when condition is met
        scala.util.control.Breaks.break()
      }
    }
  }
}