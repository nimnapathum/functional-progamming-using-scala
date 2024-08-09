object question_8_02{
    def main(args: Array[String]): Unit = {
        val multifyOf3: Int => Boolean = (x: Int) => x % 3 == 0
        val multifyOf5: Int => Boolean = (x: Int) => x % 5 == 0

        print("Enter a Number: ")
        val number = scala.io.StdIn.readInt()

        val result = (multifyOf3(number) , multifyOf5(number)) match{
            case (true , true) => "Multiple of Both Three and Five"
            case (true , false) => "Multiple of Three"
            case (false , true) => "Multiple of Five"
            case (false , false) => "Not a Multiple of Three of Five"
        }

        println(result)
        
    }
}