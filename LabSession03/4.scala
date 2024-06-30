object question_3_04{
    def sumOfEvens(numList: List[Int]):Int={
        var sumofevens = 0
        for (num <- numList){
            if (num%2 == 0){
                sumofevens += num
            }
        } 
        sumofevens
    }
    def main(args: Array[String]):Unit={
        val numList: List[Int] = List( 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8)
        val sumofevens = sumOfEvens(numList)
        println(sumofevens)
    }
}