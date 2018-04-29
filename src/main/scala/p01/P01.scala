package p01

import java.util.NoSuchElementException

class P01 {

  def lastOfficial[T](list: List[T]): T = {
    list.last
  }

  def last[T](list: List[T]): T = {
    if (list.isEmpty) throw new NoSuchElementException

    var tail = list

    while (!tail.isEmpty) {
      tail = tail.tail
    }
    tail.head
  }
}

object P01 {
  def apply(): P01 = new P01()
}
