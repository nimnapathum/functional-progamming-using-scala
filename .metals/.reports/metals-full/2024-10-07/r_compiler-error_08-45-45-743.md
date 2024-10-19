file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/week4.scala
### file%3A%2F%2F%2FC%3A%2FUsers%2FASUS%2FDocuments%2FGitHub%2FFunctional-Progamming-Practicals%2Fweek4.scala:1: error: illegal start of definition `def`
def checkFizzBuzz(num: Int):Any= num match{
^

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.14
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.14\scala-library-2.13.14.jar [exists ]
Options:



action parameters:
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
    if(noOfpersons==1) 0
    else (josephusProblem(noOfpersons-1 , iterator) + iterator)% noOfpersons
}
```



#### Error stacktrace:

```
scala.meta.internal.parsers.Reporter.syntaxError(Reporter.scala:16)
	scala.meta.internal.parsers.Reporter.syntaxError$(Reporter.scala:16)
	scala.meta.internal.parsers.Reporter$$anon$1.syntaxError(Reporter.scala:22)
	scala.meta.internal.parsers.Reporter.syntaxError(Reporter.scala:17)
	scala.meta.internal.parsers.Reporter.syntaxError$(Reporter.scala:17)
	scala.meta.internal.parsers.Reporter$$anon$1.syntaxError(Reporter.scala:22)
	scala.meta.internal.parsers.ScalametaParser.statSeqBuf(ScalametaParser.scala:4109)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$statSeq$1(ScalametaParser.scala:4096)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$statSeq$1$adapted(ScalametaParser.scala:4096)
	scala.meta.internal.parsers.ScalametaParser.scala$meta$internal$parsers$ScalametaParser$$listBy(ScalametaParser.scala:562)
	scala.meta.internal.parsers.ScalametaParser.statSeq(ScalametaParser.scala:4096)
	scala.meta.internal.parsers.ScalametaParser.bracelessPackageStats$1(ScalametaParser.scala:4285)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$source$1(ScalametaParser.scala:4288)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:325)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:369)
	scala.meta.internal.parsers.ScalametaParser.source(ScalametaParser.scala:4264)
	scala.meta.internal.parsers.ScalametaParser.entrypointSource(ScalametaParser.scala:4291)
	scala.meta.internal.parsers.ScalametaParser.parseSourceImpl(ScalametaParser.scala:119)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$parseSource$1(ScalametaParser.scala:116)
	scala.meta.internal.parsers.ScalametaParser.parseRuleAfterBOF(ScalametaParser.scala:58)
	scala.meta.internal.parsers.ScalametaParser.parseRule(ScalametaParser.scala:53)
	scala.meta.internal.parsers.ScalametaParser.parseSource(ScalametaParser.scala:116)
	scala.meta.parsers.Parse$.$anonfun$parseSource$1(Parse.scala:30)
	scala.meta.parsers.Parse$$anon$1.apply(Parse.scala:37)
	scala.meta.parsers.Api$XtensionParseDialectInput.parse(Api.scala:22)
	scala.meta.internal.semanticdb.scalac.ParseOps$XtensionCompilationUnitSource.toSource(ParseOps.scala:15)
	scala.meta.internal.semanticdb.scalac.TextDocumentOps$XtensionCompilationUnitDocument.toTextDocument(TextDocumentOps.scala:161)
	scala.meta.internal.pc.SemanticdbTextDocumentProvider.textDocument(SemanticdbTextDocumentProvider.scala:54)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$semanticdbTextDocument$1(ScalaPresentationCompiler.scala:469)
```
#### Short summary: 

file%3A%2F%2F%2FC%3A%2FUsers%2FASUS%2FDocuments%2FGitHub%2FFunctional-Progamming-Practicals%2Fweek4.scala:1: error: illegal start of definition `def`
def checkFizzBuzz(num: Int):Any= num match{
^