package p08

class P08 {

  def compress[T](list: List[T]): List[T] = {
    def iter(remaining: List[T], prev: T, acc: List[T]): List[T] = remaining match {
      case Nil => acc
      case head :: tail => {
        if (head.equals(prev)) iter(tail, head, acc) else iter(tail, head, acc :+ head)
      }
    }
    if (list.isEmpty) return list
    iter(list.tail, list.head, List(list.head))
  }
}

object P08 {
  def apply(): P08 = new P08()
}
