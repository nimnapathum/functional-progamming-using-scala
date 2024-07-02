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