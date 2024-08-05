object questions {

  def filterEvenNumbers(list: List[Int]): List[Int] = {
    list.filter(num => num % 2 == 0)
  }

  def calculateSquare(list: List[Int]): List[Int] = {
    list.map(num => num * num)
  }

  def filterPrime(list: List[Int]): List[Int] = {
    list.filter(num => num < 4 || (num % 2 != 0 && num % 3 != 0))
  }

  def main(args: Array[String]): Unit = {
    val list_1: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(filterEvenNumbers(list_1))

    val list_2: List[Int] = List(1, 2, 3, 4, 5)
    println(calculateSquare(list_2))

    println(filterPrime(list_1))
  }
}
