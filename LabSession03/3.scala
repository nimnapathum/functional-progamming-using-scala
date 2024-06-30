object question_3_03{
    
    def Average(num1: Int , num2: Int):Double={
        val avg = (num1+num2)/2.0
        BigDecimal(avg).setScale(2 , BigDecimal.RoundingMode.HALF_UP).toDouble
    }
    def main(args: Array[String]):Unit={
        println(Average(125 , 25))
    }
}