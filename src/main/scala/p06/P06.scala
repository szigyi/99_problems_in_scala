package p06

import scala.collection.immutable.{List, Stack}

class P06 {

  def isPalindrome[T](list: List[T]): Boolean = {

    def takeHalf(size: Int, f: (Int) => List[T]): List[T] = {
      if (size % 2 == 0) {
        val half = size / 2
        f.apply(half)
      } else {
        val half = (size + 1) / 2
        f.apply(half)
      }
    }

    val leftPartReversed = takeHalf(list.size, list.take).reverse
    val rightPart = takeHalf(list.size, list.takeRight)
    println(s"Left: $leftPartReversed")
    println(s"Right: $rightPart")
    leftPartReversed.equals(rightPart)
  }
}

object P06 {
  def apply: P06 = new P06()
}
