package p05

import scala.annotation.tailrec

class P05 {

  def reverse[T](list: List[T]): List[T] = {
    @tailrec
    def loop(original: List[T], rev: List[T]): List[T] = {
      if (original.isEmpty) return rev

      loop(original.tail, original.head :: rev)
    }

    loop(list, List())
  }
}

object P05 {
  def apply(): P05 = new P05()
}