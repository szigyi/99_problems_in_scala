package p14

import org.scalatest.FunSuite

class P14Test extends FunSuite {

  test("empty list cannot be duplicated") {
    val list = List()
    val duplicated = P14().duplicate(list)
    assert(duplicated.isEmpty)
  }

  test("list with one is duplicated") {
    val list = List(1)
    val duplicated = P14().duplicate(list)
    assert(duplicated.equals(List(1, 1)))
  }

  test("duplicated items are duplicated as well") {
    val list = List(1, 1, 2)
    val duplicated = P14().duplicate(list)
    assert(duplicated.equals(List(1, 1, 1, 1, 2, 2)))
  }

  test("Examplde from website") {
    val list = List('a, 'b, 'c, 'c, 'd)
    val duplicated = P14().duplicate(list)
    assert(duplicated.equals(List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)))
  }
}
