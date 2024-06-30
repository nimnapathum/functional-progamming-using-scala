file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession03/4.scala
### java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/ASUS/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12-sources.jar!/scala/collection/immutable/List.scala

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 622
uri: file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession03/4.scala
text:
```scala
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

    def sumOfEvens_using_match(numList: List[Int]):Int= numList m@@
    def main(args: Array[String]):Unit={
        val numList: List[Int] = List( 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8)
        val sumofevens = sumOfEvens(numList)
        println(s"Sum of the List : $sumofevens")
        println(s"Sum of the List using recursion: ${sumOfEvens_using_recursion(numList)}")
        
    }
}
```



#### Error stacktrace:

```
java.base/sun.nio.fs.WindowsPathParser.normalize(WindowsPathParser.java:182)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:153)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:77)
	java.base/sun.nio.fs.WindowsPath.parse(WindowsPath.java:92)
	java.base/sun.nio.fs.WindowsFileSystem.getPath(WindowsFileSystem.java:232)
	java.base/java.nio.file.Path.of(Path.java:147)
	java.base/java.nio.file.Paths.get(Paths.java:69)
	scala.meta.io.AbsolutePath$.apply(AbsolutePath.scala:58)
	scala.meta.internal.metals.MetalsSymbolSearch.$anonfun$definitionSourceToplevels$2(MetalsSymbolSearch.scala:70)
	scala.Option.map(Option.scala:242)
	scala.meta.internal.metals.MetalsSymbolSearch.definitionSourceToplevels(MetalsSymbolSearch.scala:69)
	dotty.tools.pc.completions.CaseKeywordCompletion$.sortSubclasses(MatchCaseCompletions.scala:309)
	dotty.tools.pc.completions.CaseKeywordCompletion$.matchContribute(MatchCaseCompletions.scala:259)
	dotty.tools.pc.completions.Completions.advancedCompletions(Completions.scala:307)
	dotty.tools.pc.completions.Completions.completions(Completions.scala:110)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:92)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:143)
```
#### Short summary: 

java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/ASUS/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12-sources.jar!/scala/collection/immutable/List.scala