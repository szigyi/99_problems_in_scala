package p13

class P13 {

  def encode[T](list: List[T]): List[(Int, T)] = {

    def iter(remaining: List[T], bag: List[T], acc: List[(Int, T)]): List[(Int, T)] = remaining match {
      case Nil => addBagToAccumulator(bag, acc)
      case head :: tail => {
        if (bag.contains(head)) {
          iter(tail, bag :+ head, acc)
        } else {
          iter(tail, List(head), addBagToAccumulator(bag, acc))
        }
      }
    }
    def addBagToAccumulator(bag: List[T], acc: List[(Int, T)]): List[(Int, T)] = acc :+ (bag.size, bag.head)

    if (list.isEmpty) return Nil
    iter(list.tail, List(list.head), Nil)
  }
}

object P13 {
  def apply(): P13 = new P13()
}
