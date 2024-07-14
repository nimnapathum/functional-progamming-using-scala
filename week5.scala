def Collatz(num: Int): Int={
    println(num)
    if(num <= 1) return 1
    else{
        if(num%2 == 0){
            Collatz(num/2)
        }else{
            Collatz(3 * num + 1)
        }
    }
}

def collatzRec(n: Int , acc: List[Int]): List[Int] = n match{
    case 1 => acc:+ 1
    case _ if (n%2 == 0) => collatzRec(n/2 , acc :+ n)
    case _ => collatzRec(n*3 + 1 , acc :+ n)
}

def collatz(n: Int): List[Int] = {
    collatzRec(n , List())
}