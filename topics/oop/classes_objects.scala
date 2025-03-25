object ClassesObjectsExample {
  // A simple class definition
  class Person(val name: String, var age: Int) {
    def greet(): Unit = {
      println(s"Hello, my name is $name and I'm $age years old.")
    }
  }

  // A subclass that extends Person
  class Student(name: String, age: Int, val studentId: String) extends Person(name, age) {
    override def greet(): Unit = {
      println(s"Hello, my name is $name, I'm $age years old, and my student ID is $studentId.")
    }
  }

  def main(args: Array[String]): Unit = {
    val person = new Person("Alice", 30)
    person.greet()

    val student = new Student("Bob", 22, "S12345")
    student.greet()
  }
}
