class Account(private var balance: Double) {

  def deposit(amount: Double): Unit = {
    require(amount > 0, "Deposit amount must be positive")
    balance += amount
  }

  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Withdraw amount must be positive")
    if (amount <= balance) {
      balance -= amount
    } else {
      println(s"Insufficient funds. Current balance: $$${balance}.")
    }
  }

  def transfer(amount: Double, toAccount: Account): Unit = {
    require(amount > 0, "Transfer amount must be positive")
    if (amount <= balance) {
      this.withdraw(amount) 
      toAccount.deposit(amount)
    } else {
      println(s"Insufficient funds for transfer. Current balance: $$${balance}.")
    }
  }

  def getBalance: Double = balance

  def applyInterest(): Unit = {
    if (balance > 0) {
      balance += balance * 0.05 
    } else {
      balance += balance * 0.10 
    }
  }

  override def toString: String = f"Account balance: $$${balance}%.2f"
}

class Bank(val accounts: List[Account]) {

  def accountsWithNegativeBalances: List[Account] = accounts.filter(_.getBalance < 0)

  def totalBalance: Double = accounts.map(_.getBalance).sum

  def applyInterestToAll(): Unit = accounts.foreach(_.applyInterest())

  override def toString: String = accounts.mkString("\n")
}

object Main extends App {
  val account1 = new Account(1000.00)
  val account2 = new Account(-200.00)
  val account3 = new Account(500.00)
  val account4 = new Account(-50.00)

  val bank = new Bank(List(account1, account2, account3, account4))

  println("Accounts with negative balances:")
  bank.accountsWithNegativeBalances.foreach(println)

  println(f"\nTotal balance of all accounts: $$${bank.totalBalance}%.2f")

  bank.applyInterestToAll()
  println("\nFinal balances after applying interest:")
  println(bank)
}
