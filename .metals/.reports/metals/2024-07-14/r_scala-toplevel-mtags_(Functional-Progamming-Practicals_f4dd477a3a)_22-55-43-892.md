error id: file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession05/2.scala:[851..854) in Input.VirtualFile("file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession05/2.scala", "object question_5_02{
    //Book definition
    case class Book(title: String , author: String , isbn: String)
    var books: Set[Book] = Set()

    //Library Management
    def AddBook(title: String , author: String , isbn: String):Set[Book]={
        val newBook: Book = Book(title , author , isbn)
        books += newBook
        books
    }

    def Removebook(isbn: String):Set[Book]={
        for(book <- books){
            if(book.isbn == isbn){
                books -= book
            }
        }
        books
    }

    def CheckBook(isbn: String):Unit={
        for(book <- books){
            if(book.isbn == isbn){
                println(s"${book.title} is already in the Library!")
                return
            }
        }
        println(s"$isbn is Not in the Library!")
    }

    def 

    def main(args: Array[String]):Unit={
        
    }
}")
file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession05/2.scala
file:///C:/Users/ASUS/Documents/GitHub/Functional-Progamming-Practicals/LabSession05/2.scala:34: error: expected identifier; obtained def
    def main(args: Array[String]):Unit={
    ^
#### Short summary: 

expected identifier; obtained def