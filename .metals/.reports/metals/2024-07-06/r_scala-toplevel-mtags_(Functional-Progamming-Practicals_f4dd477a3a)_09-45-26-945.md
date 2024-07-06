error id: file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession04/1.scala:[727..730) in Input.VirtualFile("file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession04/1.scala", "object question_4_01{
    var names: Array[String] = Array()
    var quantities: Array[Int] = Array()

    def displayInventory():Unit={
        var len = names.length
        var i = 0
        println("---------------Inventory---------------")
        println("Name\t\tQuantity")
        while(i<len){
            println(s"${names(i)}\t\t${quantities(i)}")
        }
    }

    def restockItem(name: String , qty: Int):String={
        for (nm <- names){
            if(nm == name){
              quantities(names.indexOf(nm)) = qty  
              return (s"Successfully added items to $name")
            }
        }
        (s"$name not found in the existing inventories!!")
    }

    def 

    def main(args: Array[String]):Unit={

    }
}")
file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession04/1.scala
file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession04/1.scala:27: error: expected identifier; obtained def
    def main(args: Array[String]):Unit={
    ^
#### Short summary: 

expected identifier; obtained def