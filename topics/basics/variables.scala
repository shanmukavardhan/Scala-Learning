object VariablesExample {
  def main(args: Array[String]): Unit = {
    // Immutable variable: declared with 'val'
    val name: String = "Scala"
    println(s"Immutable variable (val): $name")
    
    // Mutable variable: declared with 'var'
    var age: Int = 25
    println(s"Mutable variable (var) - initial value: $age")
    
    // Updating the mutable variable
    age = 26
    println(s"Mutable variable (var) - updated value: $age")
    
    // Demonstrating type inference (Scala infers the type automatically)
    val city = "New York"
    var temperature = 75
    println(s"$city is currently $temperature°F")
    
    // A simple arithmetic operation using a mutable variable
    temperature = temperature - 5  // Simulating a drop in temperature
    println(s"After a drop, the temperature is $temperature°F")
  }
}
