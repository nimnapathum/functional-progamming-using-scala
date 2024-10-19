error id: file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/Akka_1/main.scala:[85..90) in Input.VirtualFile("file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/Akka_1/main.scala", "import akka.actor._

case class Message(op: String , x: Int , y: Int)

class 

class HelloAkka extends Actor {
    def receive = {
        case "Hello" => println("Hello Akka")
        case _ => println("Unknown")
    }
}

object Main extends App{
    val system = ActorSystem("HelloSystem")
    val actor1 = system.actorOf(Props[HelloAkka] , name = "HelloAkka")

    actor1 ! "Hello"
    actor1 ! "hey"
}")
file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/Akka_1/main.scala
file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/Akka_1/main.scala:7: error: expected identifier; obtained class
class HelloAkka extends Actor {
^
#### Short summary: 

expected identifier; obtained class