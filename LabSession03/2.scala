object question_3_02{
    def filterAboveFive(list: List[String]):List[String]={
        list.filter(_.length > 5)
    }

    def main(args: Array[String]):Unit={
        var MyList = List("will print" , "no no" , "ofcause this" , "doNot" , "final one")
        var aboveFive = filterAboveFive(MyList)
        println(aboveFive)
    }
}