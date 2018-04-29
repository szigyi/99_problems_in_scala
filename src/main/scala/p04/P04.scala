package p04

import scala.annotation.tailrec

class P04 {

//  def length[T](list: List[T]): Int = {
//    list.size
//  }

  def length[T](list: List[T]): Int = {
    @tailrec
    def loop(remain: List[T], size: Int): Int = {
      if (remain.isEmpty) return size
      else loop(remain.tail, size + 1)
    }
    loop(list, 0)
  }
}

object P04 {
  def apply(): P04 = new P04()
}
