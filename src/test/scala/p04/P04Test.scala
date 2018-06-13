package p04

import org.scalatest.FunSuite

class P04Test extends FunSuite {

  test("empty array length is 0") {
    val length = P04().length(List())

    assert(length.equals(0))
  }

  test("list's size with one element is 1") {
    val length = P04().length(List(1))

    assert(length.equals(1))
  }

  test("long list has big size") {
    val length = P04().length(List(1, 2, 3, 6, 58, 9))
    assert(length.equals(6))
  }

  test("Example from website") {
    val length = P04().length(List(1, 1, 2, 3, 5, 8))
    assert(length.equals(6))
  }
}
