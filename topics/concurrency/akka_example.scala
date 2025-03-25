import akka.actor.{Actor, ActorSystem, Props}

// Define an actor class
class HelloActor extends Actor {
  def receive: Receive = {
    case "hello" =>
      println("Hello from Akka!")
    case message =>
      println(s"Received unknown message: $message")
  }
}

object AkkaExample extends App {
  // Create an ActorSystem
  val system = ActorSystem("HelloSystem")
  
  // Create an instance of HelloActor
  val helloActor = system.actorOf(Props[HelloActor], name = "helloActor")
  
  // Send messages to the actor
  helloActor ! "hello"
  helloActor ! "How are you?"
  
  // Wait for a moment to let the actor process messages
  Thread.sleep(1000)
  
  // Shutdown the ActorSystem
  system.terminate()
}
