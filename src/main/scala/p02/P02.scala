package p02

class P02 {

  def penultimate[T](list: List[T]): T = list match {
    case Nil => throw new NoSuchElementException
    case _ :: Nil => throw new NoSuchElementException
    case butOne :: _ :: Nil => butOne
    case _ :: tail => penultimate(tail)
  }
}

object P02 {
  def apply(): P02 = new P02()
}
