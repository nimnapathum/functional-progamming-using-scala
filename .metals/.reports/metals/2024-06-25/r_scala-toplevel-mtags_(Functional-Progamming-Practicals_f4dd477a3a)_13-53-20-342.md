error id: file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/week3.scala:[425..426) in Input.VirtualFile("file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/week3.scala", "object blast extends App {
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
  //blast(3)
  //blast_head(3)

  def GCD(a: Int,b: Int):Int = {
    if(a>b) GCD(b , a)
    if(a==0) b
    else GCD(b , a%b)
  }

  def 
}
")
file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/week3.scala
file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/week3.scala:24: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace