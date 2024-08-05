object questions {

  def filterEvenNumbers(list: List[Int]): List[Int] = {
    list.filter(num => num % 2 == 0)
  }

  def calculateSquare(list: List[Int]): List[Int] = {
    list.map(num => num * num)
  }

  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else if (n == 2) true
    else !(2 to math.sqrt(n).toInt).exists(x => n % x == 0)
  }

  def filterPrime(list: List[Int]): List[Int] = {
    list.filter(num => isPrime(num))
  }

  def main(args: Array[String]): Unit = {
    val list_1: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(filterEvenNumbers(list_1))

    val list_2: List[Int] = List(1, 2, 3, 4, 5)
    println(calculateSquare(list_2))

    println(filterPrime(list_1))
  }
}
