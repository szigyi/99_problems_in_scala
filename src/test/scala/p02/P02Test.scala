package p02

import org.scalatest.FunSuite

class P02Test extends FunSuite {

  test("empty array doesn't have last but one element") {
    assertThrows[NoSuchElementException] {
      P02().penultimate(List())
    }
  }

  test("list with one element has no last but one") {
    assertThrows[NoSuchElementException] {
      P02().penultimate(List(1))
    }
  }

  test("list with two elements") {
    val lastButOneElement = 2
    val actualLastButOneElement = P02().penultimate(List(lastButOneElement, 3))
    assert(actualLastButOneElement.equals(lastButOneElement))
  }

  test("find last but one element from long list") {
    val lastButOneElement = 18
    val actualLastButOneElement = P02().penultimate(List(1, 2, 3, 6, lastButOneElement, 9))
    assert(actualLastButOneElement.equals(lastButOneElement))
  }

  test("Example from website") {
    val actualLastButOneElement = P02().penultimate(List(1, 1, 2, 3, 5, 8))
    assert(actualLastButOneElement.equals(5))
  }
}
