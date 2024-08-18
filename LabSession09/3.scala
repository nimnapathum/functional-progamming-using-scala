object question_9_03{

    def toUpper(text: String): String = text.toUpperCase()
    def toLower(text: String): String = text.toLowerCase()

    def formatNames(name: String)(formatFunction: String => String): String = formatFunction(name)

    def main(args: Array[String]): Unit = {
        println(formatNames("Benny")(toUpper))
        println(formatNames("Niroshan")(name => name.substring(0 , 2).toUpperCase + name.substring(2).toLowerCase))
        println(formatNames("Saman")(toLower))
        println(formatNames("Kumara")(name => name.substring(0,1).toUpperCase + name.substring(1,5).toLowerCase + name.substring(5).toUpperCase ))
    }

}