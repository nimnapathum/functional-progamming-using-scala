object question_6_02 {
  def getStudentInfo(): (String, Int, String) = {
    var name: String = getStudentInfoWithRetry(0).toString
    var marks: Int = getStudentInfoWithRetry(1).asInstanceOf[Int]
    var state: Boolean = false
    while (!state) {
      val (name0, marks0, state0) = validateInput(name, marks)
      name = name0
      marks = marks0
      state = state0
    }
    val grade = setGrade(marks)
    (name, marks, grade)
  }

  def getStudentInfoWithRetry(what: Int): Any = {
    if (what == 0) {
      val name: String = scala.io.StdIn.readLine("Enter the Name: ")
      name
    } else {
      print(s"Enter the Marks: ")
      val marks: Int = scala.io.StdIn.readInt()
      marks
    }
  }

  def validateInput(name: String, marks: Int): (String, Int, Boolean) = {
    if (name.isBlank) {
      if (checkMarks(marks) == -1) {
        (
          getStudentInfoWithRetry(0).toString,
          getStudentInfoWithRetry(1).asInstanceOf[Int],
          false
        )
      } else {
        (getStudentInfoWithRetry(0).toString, marks, false)
      }
    } else {
      if (checkMarks(marks) == -1) {
        (name, getStudentInfoWithRetry(1).asInstanceOf[Int], false)
      } else {
        (name, marks, true)
      }
    }
  }

  def validateInput_(name: String , marks: Int): ( Boolean, Option[String]) = {
    if (name.isBlank) {
      return (false, Some("Name cannot be empty."))
    }
    if (marks >= 0 && marks <= 100) {
      return (false, Some("Marks must be between 0 and the total possible marks."))
    }
    (true, None)
  }

  def checkMarks(marks: Int): Int = {
    if (marks >= 0 && marks <= 100) {
      marks
    } else {
      -1
    }
  }

  def setGrade(marks: Int): String = marks match {
    case x if x < 50 => "D"
    case x if x < 75 => "C"
    case x if x < 90 => "B"
    case _           => "A"
  }

  def printStudentRecord(student: (String, Int, String)): Unit = {
    if (!student._1.isBlank) {
      println(
        s"\nName: ${student._1}\tMarks: ${student._2}\tGrade: ${student._3}\n"
      )
    } else {
      println("Invalid Student Record")
    }
  }

  def main(args: Array[String]): Unit = {
    val student1 = getStudentInfo()
    printStudentRecord(student1)
  }
}
