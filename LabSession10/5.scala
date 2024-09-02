def countLetterOccurrences(words: List[String]): Int = {
    val wordLengths = words.map(_.length)
    val totalLetterCount = wordLengths.reduce(_ + _)
    totalLetterCount
}
