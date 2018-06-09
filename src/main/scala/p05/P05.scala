package p05

import scala.annotation.tailrec

class P05 {

  def reverse[T](list: List[T]): List[T] = {
    @tailrec
    def loop(original: List[T], reversed: List[T]): List[T] = original match {
      case Nil => reversed
      case head :: tail => loop(tail, head :: reversed)
    }

    loop(list, List())
  }
}

object P05 {
  def apply(): P05 = new P05()
}