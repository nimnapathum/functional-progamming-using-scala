object question_5_01{
    def getProductList():List[String]={
        var products: List[String] = List()
        var product: String = ""
        while(!(product == "done")){
            product = scala.io.StdIn.readLine(s"Product ${i+1}: ")
            products = products :+ product
        }
        products
    }

    def printProductList(list: List[String]):Unit={
        println("\nProduct List----------")
        var i = 1
        for(product <- list){
            println(s"$i: $product")
            i+=1
        }
    }

    def getTotalProducts(list: List[String]):Int={
        list.length
    }

    def main(args: Array[String]):Unit={
        println("--------========[Product List]========--------")
        var list1 = getProductList()
        printProductList(list1)
        println(s"No of products in the list: ${getTotalProducts(list1)}")
    }
}