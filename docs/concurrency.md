# Concurrency in Scala

This document covers the key concurrency features in Scala. You'll learn about futures, promises, and get a brief introduction to Akka for building concurrent and distributed applications.

---

## 1. Futures

Futures allow you to perform asynchronous computations. A future represents a value that may become available at some point, and you can attach callbacks to it to handle its completion.

### Example: Creating and Using a Future

```scala
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Success, Failure}

val futureResult: Future[Int] = Future {
  // Simulate a long-running computation
  Thread.sleep(1000)
  42
}

futureResult.onComplete {
  case Success(value) => println(s"The answer is $value")
  case Failure(e)     => println(s"An error occurred: ${e.getMessage}")
}

// Keep the JVM alive for the asynchronous callback
Thread.sleep(2000)
```

In this example:
- A future is created that computes the value `42` after a delay.
- The `onComplete` callback handles both success and failure cases.

---

## 2. Promises

A promise is a writable, single-assignment container that completes a future. It provides a means to complete a future manually.

### Example: Using a Promise

```scala
import scala.concurrent.{Future, Promise}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Success, Failure}

val promise = Promise[String]()
val futureValue: Future[String] = promise.future

// Complete the promise after some computation
Future {
  Thread.sleep(500)
  promise.success("Hello, Scala concurrency!")
}

futureValue.onComplete {
  case Success(message) => println(message)
  case Failure(e)       => println(s"Error: ${e.getMessage}")
}

// Keep the JVM alive for the asynchronous callback
Thread.sleep(1000)
```

Here, the promise is completed with a success message which is then handled by the attached callback.

---

## 3. Introduction to Akka

Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications. Although a full exploration is beyond the scope of this document, here's a simple example using Akka actors.

### Example: Basic Akka Actor

First, add the necessary Akka dependencies to your build (if using a build tool) or download the libraries.

```scala
import akka.actor.{Actor, ActorSystem, Props}

// Define an actor
class HelloActor extends Actor {
  def receive: Receive = {
    case "hello" => println("Hello from Akka!")
    case _       => println("Unknown message")
  }
}

object AkkaExample extends App {
  // Create the actor system
  val system = ActorSystem("HelloSystem")
  // Create an actor of type HelloActor
  val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")
  
  // Send a message to the actor
  helloActor ! "hello"
  
  // Shutdown the actor system
  system.terminate()
}
```

In this example:
- An actor class `HelloActor` is defined.
- An actor system is created, and an actor instance is spawned.
- A message is sent to the actor, and the actor processes it accordingly.

---

## Summary

- **Futures:** Allow asynchronous computations with callbacks for handling success and failure.
- **Promises:** Enable manual completion of futures.
- **Akka:** Provides a powerful toolkit for building concurrent and distributed systems using actors.

By exploring these concepts, you can effectively manage concurrent operations in your Scala applications. Experiment with these examples and adjust them to build more complex and robust concurrent programs.

Happy coding with Scala concurrency!
```

This file provides a clear overview of concurrency in Scala, including practical examples for futures, promises, and a brief introduction to Akka. Feel free to adjust or expand upon the content as needed!