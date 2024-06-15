object Functions_Test_4 extends App {
  val cover_price = 24.95

  def discount(price: Double): Double = {
    price * 0.4
  }

  def cost_low(amount: Int): Double = {
    amount * 0.75
  }

  def cost_high(amount: Int): Double = {
    amount * 3.0
  }

  def net_worth(amount: Int): Double = {
    amount * cover_price
  }

  def find_cost(amount: Int): Double = {
    val base_price = net_worth(amount)
    if (amount <= 50) {
      base_price - cost_high(amount)
    } else {
      base_price - cost_high(50) - cost_low(amount - 50)
    }
  }

  def total_cost(amount: Int): Double = {
    find_cost(amount) - discount(cover_price) * amount
  }

  val noOfCopies = 60
  val cost = total_cost(noOfCopies)
  println(s"Total cost for $noOfCopies copies: Rs. $cost")
}
