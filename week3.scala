def blast(n: Int): Unit = {
  println(n)
  if (n <= 1) println("Blastoff!")
  else blast(n - 1)
}

def blast_head(n: Int): Unit = {
  if (n > 1) {
    blast_head(n - 1)
    println(n)
  } else println("blastOff!")
}
// blast(3)
// blast_head(3)

def GCD(a: Int, b: Int): Int = b match {
  case 0          => a
  case x if x > a => GCD(x, a)
  case x          => GCD(x, a % x)
}
//println(GCD(15, 35))

def prime(p: Int, n: Int = 2): Boolean = n match {
  case x if (x == p)      => true
  case x if GCD(p, x) > 1 => false
  case x                  => prime(p, x + 1)
}

def prime_seq(p: Int, n: Int): Unit = {
  if (prime(p)) println(p)
  if (p < n) prime_seq(p + 1, n)
}

def power(base: Int, sup: Int): Double = {
  if (sup <= 0) 1
  else power(base, sup - 1) * base
}

def Power(base: Int, sup: Int): Int = sup match{
  case 0 => 1
  case _ => base * Power(base , sup - 1)
}

def line(i: Int):Unit={
    print(i)
    if(i>1) line(i-1)
}

def triangle(i: Int): Unit={
    if(i>1) triangle(i)
}
