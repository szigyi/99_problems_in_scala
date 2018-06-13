package p07

class P07 {

  def flatten[T](list: List[List[T]]): List[T] = {

    for {
      subList <- list
      element <- subList
    } yield element

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
