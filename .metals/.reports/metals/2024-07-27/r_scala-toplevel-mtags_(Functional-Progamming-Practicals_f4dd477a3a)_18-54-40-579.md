error id: file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession06/2.scala:[588..591) in Input.VirtualFile("file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession06/2.scala", "object question_6_02{
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

    def 

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

    def printStudentRecord(student: (String , Int , String)): Unit = {
        if(!student._1.isBlank()){
            print(s"\nName: ${student._1}\tMarks: ${student._2}\tGrade: ${student._3}\n")
            return
        }
        print("Invalid Student Record\n")        
    }



    def main(args: Array[String]): Unit = {

    }
}")
file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession06/2.scala
file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession06/2.scala:19: error: expected identifier; obtained def
    def checkMarks(alert: String): Int = {
    ^
#### Short summary: 

expected identifier; obtained def