file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/week4.scala
### dotty.tools.dotc.ast.Trees$UnAssignedTypeException: type of Ident(persons) is not assigned

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 654
uri: file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/week4.scala
text:
```scala
def checkFizzBuzz(num: Int):Any= num match{
    case x if(x%3==0 && x%5==0) => "FizzBuzz"
    case x if(x%3==0) => "Fizz"
    case x if(x%5==0) => "Buzz"
    case _ => num
}

def FizzBuzz(start: Int , end: Int):Unit={
    println(checkFizzBuzz(start))
    if(start<end) FizzBuzz(start+1 , end)    
}

def fibonacci(num: Int):Int=num match{
    case x if (x==0) => 0
    case x if (x==1) => 1
    case x => fibonacci(num-1) + fibonacci(num-2)
}

def fibonacciSequence(num: Int):Unit={
    println(fibonacci(num-num))
    fibonacciSequence(num-(num-1))
}

def josephusProblem(noOfpersons: Int , iterator: Int):Int={
    var persons[@@]
}
```



#### Error stacktrace:

```
dotty.tools.dotc.ast.Trees$Tree.tpe(Trees.scala:74)
	dotty.tools.dotc.util.Signatures$.applyCallInfo(Signatures.scala:207)
	dotty.tools.dotc.util.Signatures$.computeSignatureHelp(Signatures.scala:104)
	dotty.tools.dotc.util.Signatures$.signatureHelp(Signatures.scala:88)
	dotty.tools.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:53)
	dotty.tools.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:391)
```
#### Short summary: 

dotty.tools.dotc.ast.Trees$UnAssignedTypeException: type of Ident(persons) is not assigned