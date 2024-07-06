file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession04/1.scala
### java.lang.AssertionError: NoDenotation.owner

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 954
uri: file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession04/1.scala
text:
```scala
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

    def sellItem(name: String , qty: Int):String={
        for (nm <- names){
            if(nm == name){
                if(quantities(names.indexOf(nm)) < qty){
                    return(s"Not enough items: $name")
                }els@@
              quantities(names.indexOf(nm)) -= qty  
              return (s"Successfully added items to $name")
            }
        }
        (s"$name not found in the existing inventories!!")
    }

    def main(args: Array[String]):Unit={

    }
}
```



#### Error stacktrace:

```
dotty.tools.dotc.core.SymDenotations$NoDenotation$.owner(SymDenotations.scala:2615)
	dotty.tools.dotc.core.SymUtils.isLocalToBlock(SymUtils.scala:332)
	dotty.tools.dotc.util.Signatures$.applyCallInfo(Signatures.scala:222)
	dotty.tools.dotc.util.Signatures$.computeSignatureHelp(Signatures.scala:101)
	dotty.tools.dotc.util.Signatures$.signatureHelp(Signatures.scala:88)
	dotty.tools.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:53)
	dotty.tools.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:391)
```
#### Short summary: 

java.lang.AssertionError: NoDenotation.owner