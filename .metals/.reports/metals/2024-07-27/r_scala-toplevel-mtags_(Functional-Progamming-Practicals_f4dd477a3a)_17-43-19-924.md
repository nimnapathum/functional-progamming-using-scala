error id: file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession06/1.scala:[1691..1694) in Input.VirtualFile("file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession06/1.scala", "object question_6_01{
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
    def retreiveProducts(): Unit = {
        println("\n---------=====[Inventory 1]=====----------")
        println("[ID]\t[Product]\t[Quantity]\t[Price]")
        for((id , (product , quantity , price)) <- inventory1){
            println(s"$id\t$product\t$quantity\t$price")
        }
        println("\n---------=====[Inventory 2]=====----------")
        println("[ID]\t[Product]\t[Quantity]\t[Price]")
        for((id , (product , quantity , price)) <- inventory1){
            println(s"$id\t$product\t$quantity\t$price")
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
        var concatedInventory: Map[Int , (String , Int , Double)] = inventory_1 ++ inventory_2
        concatedInventory
    }

    //v
    def 

    def main(args: Array[String]): Unit = {

    }
}")
file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession06/1.scala
file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession06/1.scala:51: error: expected identifier; obtained def
    def main(args: Array[String]): Unit = {
    ^
#### Short summary: 

expected identifier; obtained def