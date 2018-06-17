package p11

import p09.P09

abstract class P11 {

  val p09: P09

  def encodeModified(list: List[Any]): List[Any] = {

    def iter(remaining: List[Any], acc: List[Any]): List[Any] = remaining match {
      case Nil => acc
      case (head: List[_]) :: tail => {
        if (head.size == 1) {
          iter(tail, acc :+ head.head)
        } else {
          iter(tail, acc :+ (head.size, head.head))
        }
      }
      case _ => throw new RuntimeException(s"Data is not in the right format: $remaining")
    }
    if (list.isEmpty) return list
    val packed = p09.pack(list)
    iter(packed, Nil)
  }
}
