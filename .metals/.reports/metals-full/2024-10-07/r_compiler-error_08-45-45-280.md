file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/week3.scala
### file%3A%2F%2F%2FC%3A%2FUsers%2FASUS%2FDocuments%2FGitHub%2FFunctional-Progamming-Practicals%2Fweek3.scala:1: error: illegal start of definition `def`
def blast(n: Int): Unit = {
^

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.14
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.14\scala-library-2.13.14.jar [exists ]
Options:



action parameters:
uri: file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/week3.scala
text:
```scala
def blast(n: Int): Unit = {
  println(n)
  if (n <= 1) println("Blastoff!")
  else blast(n - 1)
}

def blast_head(n: Int): Unit = {
  if (n > 1) {
    blast_head(n - 1)
    println(n)
  } else println("blastOff!")
}
// blast(3)
// blast_head(3)

def GCD(a: Int, b: Int): Int = b match {
  case 0          => a
  case x if x > a => GCD(x, a)
  case x          => GCD(x, a % x)
}
//println(GCD(15, 35))

def prime(p: Int, n: Int = 2): Boolean = n match {
  case x if (x == p)      => true
  case x if GCD(p, x) > 1 => false
  case x                  => prime(p, x + 1)
}

def prime_seq(p: Int, n: Int): Unit = {
  if (prime(p)) println(p)
  if (p < n) prime_seq(p + 1, n)
}

def power(base: Int, sup: Int): Double = {
  if (sup <= 0) 1
  else power(base, sup - 1) * base
}

def Power(base: Int, sup: Int): Int = sup match{
  case 0 => 1
  case _ => base * Power(base , sup - 1)
}

def line(i: Int):Unit={
    print(i)
    if(i>1) line(i-1)
}

def triangle(i: Int): Unit={
    if(i>1) triangle(i)
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

file%3A%2F%2F%2FC%3A%2FUsers%2FASUS%2FDocuments%2FGitHub%2FFunctional-Progamming-Practicals%2Fweek3.scala:1: error: illegal start of definition `def`
def blast(n: Int): Unit = {
^