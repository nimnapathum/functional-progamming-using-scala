import scala.compiletime.ops.float
object question02{
    def main(args: Array[String]): Unit ={

        var a: Int = 2
        var b: Int = 3
        var c: Int = 4
        var d: Int = 5
        var k: Double = 4.3f
        var g = 4.0f;

        println("Question 02------------------")
        println(s" int a = $a, b = $b, c = $c, d = $d\n float k = $k\n")

        b -= 1
        var result1 =  b * a + c * d
        d -= 1 
        println(s" --b * a + c * d-- = $result1")

        println(s" a++ = $a")
        a += 1

        println(s" -2 * (g - k) + c = ${-2 * (g - k) + c}")

        println(s" c++ = $c")

        c += 1
        println(s" ++c * a++ = ${c * a}")
        a += 1
    }
}