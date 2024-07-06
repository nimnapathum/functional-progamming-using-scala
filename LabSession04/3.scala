object TextFormat {
  def toUpper(name: String): String = {
    name.toUpperCase()
  }

  def toLower(name: String): String = {
    name.toLowerCase()
  }

  def formatNames(name: String, formatFunc: String => String): String = {
    formatFunc(name)
  }

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    names.foreach { name =>
      val formattedName = name match {
        case "Benny" => formatNames(name, toUpper)
        case "Niroshan" => 
          formatNames(name.substring(0, 2), toUpper) + formatNames(name.substring(2), toLower)
        case "Saman" => formatNames(name, toLower)
        case "Kumara" => 
          formatNames(name.substring(0, 1), toUpper) + formatNames(name.substring(1, 5), toLower) + formatNames(name.substring(5), toUpper)
        case _ => name
      }
      println(formattedName)
    }
  }
}
