error id: file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/week4.scala:[581..581) in Input.VirtualFile("file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/week4.scala", "def checkFizzBuzz(num: Int):Any= num match{
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

def ")
file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/week4.scala
file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/week4.scala:24: error: expected identifier; obtained eof
def 
    ^
#### Short summary: 

expected identifier; obtained eof