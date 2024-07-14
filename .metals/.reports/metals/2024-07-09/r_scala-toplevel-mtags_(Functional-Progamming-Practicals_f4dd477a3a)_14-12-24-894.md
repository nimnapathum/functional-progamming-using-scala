error id: file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/week5.scala:[216..216) in Input.VirtualFile("file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/week5.scala", "def Collatz(num: Int): Int={
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

def ")
file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/week5.scala
file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/week5.scala:13: error: expected identifier; obtained eof
def 
    ^
#### Short summary: 

expected identifier; obtained eof