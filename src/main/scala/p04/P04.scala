package p04

import scala.annotation.tailrec

class P04 {

  def length[T](list: List[T]): Int = {
    @tailrec
    def loop(remain: List[T], size: Int): Int = remain match {
      case Nil => size
      case _ :: tail => loop(tail, size + 1)
    }
    loop(list, 0)
  }
}

object P04 {
  def apply(): P04 = new P04()
}
