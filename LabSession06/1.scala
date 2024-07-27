object question_6_01{
    var inventory1: Map[Int , ( String , Int , Double)] = Map(
        1 -> ("Book" , 10 , 100.0),
        2 -> ("Pencil" , 20 , 200.0),
        3 -> ("Pen" , 30 , 300.0),
    )

    var inventory2: Map[Int , (String , Int , Double)] = Map(
        2 -> ("Pencil" , 12 , 200.0),
        3 -> ("Pen" , 2 , 300.0),
        4 -> ("Eraser" , 5 , 50.0),
    )

    //i
    def retreiveProducts(inventory: Map[Int , (String , Int , Double)]): Unit = {
        println(s"\n-------------=====[INVENTORY]=====--------------")
        println("[ID]\t[Product]\t[Quantity]\t[Price]")
        for((id , (product , quantity , price)) <- inventory){
            println(s"$id\t$product\t\t$quantity\t\t$price")
        }
    }

    //ii
    def calculateProducts(inventory: Map[Int , (String , Int , Double)]): Double = {
        var value: Double = 0.0
        for((id , (product , quantity , price)) <- inventory){
            value += quantity * price
        }
        value
    }

    //iii
    def isInventoryEmpty(inventory: Map[Int , (String , Int , Double)]): Boolean = {
        inventory.isEmpty
    }

    //iv
    def mergeInventories(inventory_1: Map[Int , (String , Int , Double)] , inventory_2: Map[Int , (String , Int , Double)]): Map[Int , (String , Int , Double)] = {
        var concatedInventory = scala.collection.mutable.Map[Int , (String , Int , Double)]()
        concatedInventory ++= inventory_1
        for((id , (product , quantity , price)) <- inventory_2){
            if(concatedInventory.contains(id)){
                val (product1 , quantity1 , price1) = concatedInventory(id)
                concatedInventory(id) = (product , quantity + quantity1 , price)
            }else{
                concatedInventory(id) = (product , quantity , price)
            }
        }
        concatedInventory.toMap
    }

    //v
    def checkProduct(specificID: Int , inventory: Map[Int , (String , Int , Double)]): Boolean = {
        var isThere: Boolean = false
        for((id , (product , quantity , price)) <- inventory){
            if(id == specificID){
                isThere = true
            }
        }
        return isThere
    }

    def main(args: Array[String]): Unit = {
        retreiveProducts(inventory1)
        retreiveProducts(inventory2)

        println(s"Total value of Inventory 1: ${calculateProducts(inventory1)}")

        println(s"Is inventory 1 is Empty: ${isInventoryEmpty(inventory1)}")

        var mergeInventory = mergeInventories(inventory1 , inventory2)
        print("\nMerged Inventory")
        retreiveProducts(mergeInventory)

        println(s"\nIs product with ID 2 in inventory 1: ${checkProduct(2 , inventory1)}")
    }
}