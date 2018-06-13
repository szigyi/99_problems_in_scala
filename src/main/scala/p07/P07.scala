package p07

class P07 {

  def flatten(list: List[Any]): List[Any] = {

    def iterator(remaining: List[Any], acc: List[Any]): List[Any] = remaining match {
      case Nil => acc
      case head :: tail => head match {
        case List => iterator(head.asInstanceOf[List[Any]], acc)
        case _ => {
          val newAcc = head :: acc
          iterator(tail, newAcc)
        }
      }
    }
    iterator(list, List())


//    def flattenIter(remaining: List[List[T]], acc: List[T]): List[T] = remaining match {
//      case Nil => acc
//      case head :: tail => flattenIter(tail, flat(head, acc))
//    }
//
//    def flat(embeddedList: List[T], acc: List[T]): List[T] = embeddedList match {
//      case Nil => acc
//      case head :: tail => head :: flat(tail, acc)
//    }
//
//    flattenIter(list, List())
  }
}

object P07 {
  def apply(): P07 = new P07()
}
