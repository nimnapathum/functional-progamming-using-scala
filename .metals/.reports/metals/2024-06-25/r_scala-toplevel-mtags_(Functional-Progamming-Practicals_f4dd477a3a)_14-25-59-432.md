error id: file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/week3.scala:[648..649) in Input.VirtualFile("file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/week3.scala", "object blast extends App {
  def blast(n: Int): Unit = {
    println(n)
    if (n <= 1) println("Blastoff!")
    else blast(n - 1)
  }

  def blast_head(n: Int): Unit = {
    if (n > 1) {
      blast_head(n - 1)
      println(n)
    } else println("blastOff!")
  }
  // blast(3)
  // blast_head(3)

  def GCD(a: Int, b: Int): Int = b match {
    case 0          => a
    case x if x > a => GCD(x, a)
    case x          => GCD(x, a % x)
  }
  //println(GCD(15, 35))

  def prime(p: Int , n: Int): Boolean = n match{
    case x if(x==p) => true
    case x if GCD(p,x)>1 => false
    case x => prime(p , x+1)
  }

  def
}
")
file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/week3.scala
file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/week3.scala:31: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace