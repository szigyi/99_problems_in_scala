package p15

class P15 {

  def duplicateN[T](duplicate: Int, list: List[T]): List[T] = {
    def iter(remaining: List[T], acc: List[T]): List[T] = remaining match {
      case Nil => acc
      case head :: tail => iter(tail, nTimes(duplicate, head, acc))
    }
    def nTimes(times: Int, element: T, acc: List[T]): List[T] = if (times == 0) acc else nTimes(times - 1, element, acc :+ element)

    if (list.isEmpty || duplicate < 1) return list
    iter(list, Nil)
  }
}

object P15 {
  def apply(): P15 = new P15()
}
