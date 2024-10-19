import akka.actor._
import akka.util.Timeout
import akka.pattern.ask
import scala.concurrent.Await
import scala.concurrent.duration._
import scala.language.postfixOps

case class Message(op: String , x: Int , y: Int)

class MsgSystem extends Actor{
    def receive = {
        case Message("+" , x: Int , y: Int) => sender ! (x + y)
        case Message("-" , x: Int , y: Int) => sender ! (x - y)
        case _ => println("Unknown")
    }
}

class HelloAkka extends Actor {
    def receive = {
        case "Hello" => println("Hello Akka")
        case _ => println("Unknown")
    }
}

// object Main extends App{
//     val system = ActorSystem("HelloSystem")
//     val actor1 = system.actorOf(Props[HelloAkka] , name = "HelloAkka")

//     actor1 ! "Hello"
//     actor1 ! "hey"
// }

object Main extends App{
    val system = ActorSystem("MsgSystem")
    val actor1 = system.actorOf(Props[MsgSystem] , name = "MsgSystem1")
    val actor2 = system.actorOf(Props[MsgSystem] , name = "MsgSystem2")

    implicit val timeout = Timeout(5 seconds)

    val result1 = actor1 ? Message ("+" , 10 , 5)
    val answer1 = Await.result(result1 , timeout.duration)
    println(answer1)  

    val result2 = actor2 ? Message ("-" , 10 , 5)
    val answer2 = Await.result(result2 , timeout.duration)
    println(answer2)  
}