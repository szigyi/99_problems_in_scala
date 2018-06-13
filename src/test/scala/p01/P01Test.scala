package p01

class P01Test extends org.scalatest.FunSuite {

  test("empty array doesn't have last element") {
    assertThrows[NoSuchElementException] {
      P01().last(List())
    }
  }

  test("list with one element") {
    val firstElement = 1
    val last = P01().last(List(firstElement))
    assert(last.equals(firstElement))
  }

  test("find last element from long list") {
    val lastElement = 18
    val last = P01().last(List(1, 2, 3, 6, lastElement))
    assert(last.equals(lastElement))
  }

  test("Example from website") {
    val last = P01().last(List(1, 1, 2, 3, 5, 8))
    assert(last.equals(8))
  }
}
