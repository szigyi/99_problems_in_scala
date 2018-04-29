package p02

class P02 {

  def penultimate[T](list: List[T]): T = {
    if (list.size < 2) throw new NoSuchElementException

    var tail = list.tail
    var butOne = list.head

    while (tail.size > 1) {
      butOne = tail.head
      tail = tail.tail
    }
    butOne
  }
}

object P02 {
  def apply(): P02 = new P02()
}
