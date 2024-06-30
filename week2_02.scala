import scala.compiletime.ops.boolean // boolean use krddi auto import un ekak meknm
def maximum(num1: Int , num2: Int):Int={
    if(num1>num2){
        return num1
    }else{
        return num2
    }
}

def is_pass(marks: Int):String={
    if(marks>=50){
        return "Pass"
    }else{
        return "Fail"
    }
}

def grade(marks: Int): String={
    marks match{
        case x if x > 100 => "out of range"
        case x if x >= 75 => "A"
        case x if x >= 65 => "B"
        case x if x >= 50 => "C"
        case x if x >= 35 => "S"
        case x if x >= 0 => "E"
        case x if x < 0 => "out of range"
    }
}

def is_even(num: Int):Boolean={
    num%2 match{
        case 0 => true
        case 1 => false
    }
}

def check_leap_year(year: Int): Boolean={
    if ((year%4 == 0 && year%100 != 0) || (year%400 == 0)){
        return true
    }else{
        return false
    }
}

def leap_year(year: Int):Boolean={
    ((year%4 == 0 && year%100 != 0) || (year%400 == 0)) match{
        case true => true
        case false => false
    }
}

def interest(amount: Int):Double={
    if(amount > 100000){
        return amount * 0.08
    }else if(amount > 10000){
        return amount * 0.07
    }else if(amount > 1000){
        return amount * 0.06
    }else if(amount > 0){
        return amount * 0.05
    }else{
        return 0.0
    }
}

def tax(amount: Double):Double={
    amount match{
        case x if x > 100000 => x * 0.2
        case x if x >= 50000 => x * 0.1
        case _ => 0
    }
}

// def income(hours: Int):Double={
//     hours * 500
// }

def netpay(hours: Int):Double={
    income(hours) - tax(income(hours)) 
}
