package p10

import p09.P09

abstract class P10 {

  val p09: P09

  def encode[T](list: List[T]): List[(Int, T)] = {

    def iter(remaining: List[List[T]], acc: List[(Int, T)]): List[(Int, T)] = remaining match {
      case Nil => acc
      case head :: tail => iter(tail, acc :+ (head.size, head(0)))
    }
    if (list.isEmpty) return Nil
    val packed = p09.pack(list)
    iter(packed, Nil)
  }
}
