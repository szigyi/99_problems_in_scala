package p07

class P07 {

  def flatten(list: List[Any]): List[Any] = {

    def flattenIter(remaining: List[Any], acc: List[Any]): List[Any] = remaining match {
      case Nil => acc
      case (head: List[_]) :: Nil => flattenIter(head, acc)
      case (head: List[_]) :: tail => flattenIter(tail, acc ::: head)
      case head :: tail => flattenIter(tail, acc :+ head)
    }
    flattenIter(list, List())
  }
}

object P07 {
  def apply(): P07 = new P07()
}
