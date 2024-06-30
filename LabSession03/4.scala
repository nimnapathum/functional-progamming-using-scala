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

    def sumOfEvens_using_recursion(numlist: List[Int]):Int={
        if (numlist.isEmpty) 0
        else{
            val first = numlist.head
            if (first % 2 == 0) first + sumOfEvens_using_recursion(numlist.tail)
            else sumOfEvens_using_recursion(numlist.tail)
        }
    }

    def main(args: Array[String]):Unit={
        val numList: List[Int] = List( 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8)
        val sumofevens = sumOfEvens(numList)
        println(s"Sum of the List : $sumofevens")
        println(s"Sum of the List using recursion: ${sumOfEvens_using_recursion(numList)}")
        
    }
}