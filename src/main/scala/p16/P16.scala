package p16

class P16 {

  def drop[T](nth: Int, list: List[T]): List[T] = list match {
    case Nil => Nil
    case rem => {
      if (nth < 1) {
        rem
      } else if (nth > rem.size) {
        rem
      } else {
        println(s"\tnth: $nth")
        println(s"\ttake-1: ${rem.take(nth - 1)}")
        println(s"\tdrop: ${rem.drop(nth)}")
        rem.take(nth - 1) ::: drop(nth, rem.drop(nth))
      }
    }
  }
}

object P16 {
  def apply(): P16 = new P16()
}
