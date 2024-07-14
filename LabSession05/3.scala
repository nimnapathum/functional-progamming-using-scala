object question_5_03{
    def fibonacci(number: Int):Int= number match{
        case number if number <= 0 => 0
        case 1 => 1
        case _ => fibonacci(number-1) + fibonacci(number-2)
    }

    def fibonacciSeries(number: Int):Unit={
        var i = 1
        while(i<=number){
            print(s"${fibonacci(i)} ")
            i+=1
        }
        println()
    }

    def main(args: Array[String]):Unit={
        print("----------------Fibonacci_Number_Series-------------------\nEnter the Number: ")
        var number = scala.io.StdIn.readInt()
        fibonacciSeries(number)
    }
}