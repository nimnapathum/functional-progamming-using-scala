error id: file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession10/5.scala:[8..15) in Input.VirtualFile("file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession10/5.scala", "object  extends App {

  def countLetterOccurrences(words: List[String]): Int = {
    // Use map to transform each word into its length (number of letters)
    val wordLengths = words.map(_.length)

    // Use reduce to sum up all the lengths to get the total count of letters
    val totalLetterCount = wordLengths.reduce(_ + _)

    totalLetterCount
  }

  // Example usage
  val words = List("apple", "banana", "cherry", "date")
  val total = countLetterOccurrences(words)

  println(s"Total count of letter occurrences: $total") // Output: Total count of letter occurrences: 21
}
")
file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession10/5.scala
file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession10/5.scala:1: error: expected identifier; obtained extends
object  extends App {
        ^
#### Short summary: 

expected identifier; obtained extends