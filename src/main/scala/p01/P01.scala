package p01

import java.util.NoSuchElementException

class P01 {

  def last[T](list: List[T]): T = list match {
    case Nil => throw new NoSuchElementException
    case last :: Nil => last
    case _ :: tail => last(tail)
  }
}

object P01 {
  def apply(): P01 = new P01()
}
