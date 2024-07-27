error id: file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession06/2.scala:[1013..1016) in Input.VirtualFile("file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession06/2.scala", "object question_6_02{
    def getStudentInfo(): (String , Int , String) = {
        var name: String = scala.io.StdIn.readLine("Enter the Name: ")
        while(name.isBlank()){
            println("Invalid Name! Try again")
            name = scala.io.StdIn.readLine("Enter the Name: ")
        }
        var marks = checkMarks("")
        while(marks == -1){
            println("Invalid Marks! Please enter the correct Marks")
            marks = checkMarks("correct")
        }
        var grade = setGrade(marks)
        (name , marks , grade)
    }

    def checkMarks(alert: String): Int = {
        print(s"Enter the ${alert}Marks:")
        var marks: Int = scala.io.StdIn.readInt()
        if(marks < 0 || marks > 100){
            return marks
        }
        return -1
    }

    def setGrade(marks: Int): String = marks match{
        case x if x < 50 => "D"
        case x if x < 75 => "C"
        case x if x < 90 => "B"
        case _ => "A"
    }

    def 
    def main(args: Array[String]): Unit = {

    }
}")
file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession06/2.scala
file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession06/2.scala:34: error: expected identifier; obtained def
    def main(args: Array[String]): Unit = {
    ^
#### Short summary: 

expected identifier; obtained def