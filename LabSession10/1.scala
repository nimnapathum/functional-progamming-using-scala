class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero")
  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1)

  def neg: Rational = new Rational(-numer, denom)

  override def toString: String = s"$numer/$denom"

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def subtract(r: Rational) = new Rational(numer * r.denom - r.numer * denom, denom * r.denom)
}
