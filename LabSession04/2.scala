object question_4_02{
    def isEven(number: Int):String = number match{
        case x if (x%2 == 0) => "Even Number"
        case _ => "Odd Number"
    }

    def isPositive(number: Int):String = number match{
        case 0 => "Equals to Zero"
        case x if (x > 0) => "Greater than Zero"
        case _ => "Less tha Zero"
    }

    def main(args: Array[String]):Unit={
        print("Enter a Number: ")
        var number: Int = scala.io.StdIn.readInt()
        println(s"$number is a,")
        println(isEven(number))
        println(isPositive(number))
    }
}