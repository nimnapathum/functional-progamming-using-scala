object question_9_02{

    def main(args: Array[String]): Unit = {

        val isPositive: Int => Unit = num => num match{
            case n if n <= 0 => println("Negative/Zero")
            case _ => println("Positive")
        }

        val isEven: Int => Unit = num => num match {
            case n if n%2==0 => println("Even Number")
            case _ => println("Odd Number")
        }

        val manyFunctions: (Int => Unit , Int) => Unit = (thisFunction , para) => thisFunction(para)
        print("Enter a Number: ")
        val number = scala.io.StdIn.readInt()
        // isPositive(number)
        // isEven(number)
        manyFunctions(isPositive , number)
        manyFunctions(isEven , number)

    }

}