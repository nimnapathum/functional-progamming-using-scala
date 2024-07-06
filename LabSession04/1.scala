object question_4_01{
    var names: Array[String] = Array()
    var quantities: Array[Int] = Array()

    def displayInventory():Unit={
        var len = names.length
        var i = 0
        println("---------------Inventory---------------")
        println("Name\t\tQuantity")
        while(i<len){
            println(s"${names(i)}\t\t${quantities(i)}")
            i += 1
        }
    }

    def restockItem(name: String , qty: Int):String={
        for (nm <- names){
            if(nm == name){
              quantities(names.indexOf(nm)) += qty  
              return (s"Successfully added items to $name")
            }
        }
        (s"$name not found in the existing inventories!!")
    }

    def sellItem(name: String , qty: Int):String={
        for (nm <- names){
            if(nm == name){
                if(quantities(names.indexOf(nm)) < qty){
                    return (s"Not enough items: $name")
                }else{
                    quantities(names.indexOf(nm)) -= qty  
                    return (s"Successfully sell $qty $name items")
                }
            }
        }
        (s"$name not found in the existing inventories!!")
    }

    def main(args: Array[String]):Unit={
        names = Array("Book" , "Pen" , "Pencil")
        quantities = Array(5 , 10 , 10)
        
        displayInventory()
        println()

        println(restockItem("Book" , 5)) //restock items when already existing product
        displayInventory()
        println()

        println(restockItem("Ruler" , 2)) //restock items when not a already existing item
        displayInventory()
        println()

        println(sellItem("Book" , 5)) // sell items when it is enough items
        displayInventory()
        println()

        println(sellItem("Book" , 20)) // sell items when it is not enough items
        displayInventory()
        println()

        println(sellItem("Ruler" , 5)) // sell items when not a already existing item
        displayInventory()
        println()
    }
}