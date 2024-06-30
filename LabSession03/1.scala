object question_3_01 {
  def reverseString(string: String): String = {
    if (string.isEmpty) ""
    else reverseString(string.tail) + string.head
  }

  def main(args: Array[String]): Unit = {
    var string = "String to be reversed"
    var reversed_string = reverseString(string)
    println(reversed_string)
  }
}
