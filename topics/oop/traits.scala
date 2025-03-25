// Define a simple Logger trait
trait Logger {
  def log(message: String): Unit = println(s"LOG: $message")
}

// A trait that adds a timestamp to log messages
trait TimestampLogger extends Logger {
  override def log(message: String): Unit = {
    val timestamp = java.time.Instant.now
    super.log(s"[$timestamp] $message")
  }
}

// A Calculator class that mixes in the TimestampLogger trait
class Calculator extends TimestampLogger {
  def add(x: Int, y: Int): Int = {
    val result = x + y
    log(s"Adding $x and $y to get $result")
    result
  }
}

object TraitsExample {
  def main(args: Array[String]): Unit = {
    val calc = new Calculator
    val result = calc.add(10, 15)
    println(s"Result: $result")
  }
}
