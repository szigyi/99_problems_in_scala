package p03

class P03 {

  def nth[T](n: Int, list: List[T]): T = {
    if (n < 0 || n >= list.size || list.isEmpty) throw new NoSuchElementException

    list(n)
  }
}

object P03 {
  def apply(): P03 = new P03()
}
