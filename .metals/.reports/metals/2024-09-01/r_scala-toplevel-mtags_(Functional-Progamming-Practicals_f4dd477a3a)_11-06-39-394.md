error id: file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession10/2.scala:[313..314) in Input.VirtualFile("file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession10/2.scala", "class Rational(n: Int , d: Int){
    require(d != 0 , "Denominator cannot be zero")
    private val  g = gcd(n.abs, d.abs)
    val numer = n / g
    val denom = d / g

    def this(n: Int) = this(n, 1)

    def +(r: Rational) = new Rational(numer * r.denom + r.numer * denom, denom * r.denom)

    def
}

object question_10_2 {
    def sub(): Unit = {
      val x = new Rational(3, 4)
      val y = new Rational(5, 8)
      val z = new Rational(2, 7)
      
      val result = x.subtract(y).subtract(z)
      println(result)
    }


  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)
  }
}")
file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession10/2.scala
file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession10/2.scala:12: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace