package p12

class P12 {

  def decode[T](encoded: List[(Int, T)]): List[T] = {

    def iter(remaining: List[(Int, T)], uncomp: List[T]): List[T] = remaining match {
      case Nil => uncomp
      case (head: (Int, T)) :: (tail: List[(Int, T)]) => {
        val result = for {
          times <- (0 until head._1)
        } yield head._2
        iter(tail, uncomp ::: result.toList)
      }
    }
    iter(encoded, Nil)
  }
}

object P12 {
  def apply(): P12 = new P12()
}
