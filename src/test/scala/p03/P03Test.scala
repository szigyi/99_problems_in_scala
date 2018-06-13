package p03

import org.scalatest.FunSuite

class P03Test extends FunSuite {

  test("empty array doesn't have kth element") {
    assertThrows[NoSuchElementException] {
      P03().nth(0, List())
    }
  }

  test("nth element is negative") {
    assertThrows[NoSuchElementException] {
      P03().nth(-5, List(1, 2, 3))
    }
  }

  test("nth element is bigger than the list") {
    assertThrows[NoSuchElementException] {
      P03().nth(3, List(1, 2, 3))
    }
  }

  test("list with one element were kth element is 0") {
    val element = 1

    val nth = P03().nth(0, List(element))

    assert(nth.equals(element))
  }

  test("find kth element from long list") {
    val kth = 18
    val nth = P03().nth(4, List(1, 2, 3, 6, kth, 9))
    assert(nth.equals(kth))
  }

  test("find first element from long list") {
    val kth = 18
    val nth = P03().nth(0, List(kth, 2, 3, 6, 1, 9))
    assert(nth.equals(kth))
  }

  test("find last element from long list") {
    val kth = 18
    val nth = P03().nth(4, List(2, 3, 6, 1, kth))
    assert(nth.equals(kth))
  }

  test("Example from website") {
    val nth = P03().nth(2, List(1, 1, 2, 3, 5, 8))
    assert(nth.equals(2))
  }
}
