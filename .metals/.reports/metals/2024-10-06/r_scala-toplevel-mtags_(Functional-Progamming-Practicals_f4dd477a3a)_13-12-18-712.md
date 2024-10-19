error id: file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/Akka_/main.scala:[421..421) in Input.VirtualFile("file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/Akka_/main.scala", "import akka.actor._

case class MSG(algo: String , msg: String)

object Main extends App{
    val system = ActorSystem("HashSystem")
    system.actorOf(Props[HashSystem] , name = "HashSystem")
    system.actorOf(Props[Hash] , name = "HashSystem")
    system.actorOf(Props[Hash] , name = "MD5")
    system.actorOf(Props[Hash] , name = "SHA1")
    system.actorOf(Props[PrintHash] , name = "PrintHash")
}

class")
file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/Akka_/main.scala
file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/Akka_/main.scala:14: error: expected identifier; obtained eof
class
     ^
#### Short summary: 

expected identifier; obtained eof