import scala.concurrent.Future
import scala.concurrent.Promise
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Success, Failure}

object FuturesPromisesExample {
  def main(args: Array[String]): Unit = {
    // Example using Future: Asynchronous computation that returns an integer.
    val futureResult: Future[Int] = Future {
      // Simulate a long-running computation
      Thread.sleep(1000)
      42
    }
    
    futureResult.onComplete {
      case Success(value) =>
        println(s"Future completed successfully with value: $value")
      case Failure(exception) =>
        println(s"Future failed with exception: ${exception.getMessage}")
    }
    
    // Example using Promise: Create a Promise that will be completed with a string.
    val promise = Promise[String]()
    val futureFromPromise: Future[String] = promise.future
    
    // Complete the promise asynchronously
    Future {
      Thread.sleep(500)
      promise.success("Hello from Promise!")
    }
    
    futureFromPromise.onComplete {
      case Success(message) =>
        println(s"Promise completed successfully with message: $message")
      case Failure(exception) =>
        println(s"Promise failed with exception: ${exception.getMessage}")
    }
    
    // Keep the JVM alive to allow asynchronous callbacks to complete
    Thread.sleep(2000)
  }
}
