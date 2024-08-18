object question_9_01{

    def main(args: Array[String]): Unit = {
        
        val calculate_interest: Double => Double = deposit => deposit match {
            case d if d <= 20000 => d * 0.02
            case d if d <= 200000 => d * 0.04
            case d if d <= 2000000 => d * 0.035 
            case d if d > 2000000 => d * 0.065
        }  

        val amount = 200000
        println(calculate_interest(amount))

    }
}


//lambda function
//val name: (paras types) => outputType = expression 