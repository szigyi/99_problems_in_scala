package p14

class P14 {

  def duplicate[T](list: List[T]): List[T] = list match {
    case Nil => Nil
    case head :: tail => head :: head :: duplicate(tail)
  }
}

object P14 {
  def apply(): P14 = new P14()
}