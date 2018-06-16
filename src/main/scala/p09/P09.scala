package p09

class P09 {

  def pack[T](list: List[T]): List[List[T]] = {
    def iter(remaining: List[T], prevPack: List[T], acc: List[List[T]]): List[List[T]] = remaining match {
      case Nil => acc :+ prevPack
      case head :: tail => {
        if (prevPack.contains(head)) {
          iter(tail, prevPack :+ head, acc)
        } else {
          iter(tail, List(head), acc :+ prevPack)
        }
      }
    }
    if (list.isEmpty) return List(list)
    iter(list.tail, List(list.head), List())
  }
}

object P09 {
  def apply(): P09 = new P09()
}