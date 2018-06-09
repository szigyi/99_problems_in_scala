package p03

class P03 {

  def nth[T](n: Int, list: List[T]): T = list match {
    case Nil => throw new NoSuchElementException
    case head :: tail => if (n == 0) head else nth(n - 1, tail)
  }
}

object P03 {
  def apply(): P03 = new P03()
}
