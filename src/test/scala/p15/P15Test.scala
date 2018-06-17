package p15

import org.scalatest.FunSuite

class P15Test extends FunSuite {

  test("empty list cannot be duplicated") {
    val list = List()
    val duplicate = 2
    val duplicated = P15().duplicateN(duplicate, list)
    println(s"1. $duplicated")
    assert(duplicated.isEmpty)
  }

  test("list duplicated 1 times is the list itself") {
    val list = List(1)
    val duplicate = 1
    val duplicated = P15().duplicateN(duplicate, list)
    println(s"2. $duplicated")
    assert(duplicated.equals(list))
  }

  test("list duplicated -1 times is the list itself") {
    val list = List(1)
    val duplicate = -1
    val duplicated = P15().duplicateN(duplicate, list)
    println(s"3. $duplicated")
    assert(duplicated.equals(list))
  }

  test("list with one is duplicated N times") {
    val list = List(1)
    val duplicate = 2
    val duplicated = P15().duplicateN(duplicate, list)
    println(s"4. $duplicated")
    assert(duplicated.equals(List(1, 1)))
  }

  test("list is duplicated N times") {
    val list = List(1, 1, 2)
    val duplicate = 3
    val duplicated = P15().duplicateN(duplicate, list)
    println(s"5. $duplicated")
    assert(duplicated.equals(List(1, 1, 1, 1, 1, 1, 2, 2, 2)))
  }

  test("Example from website") {
    val list = List('a, 'b, 'c, 'c, 'd)
    val duplicate = 3
    val duplicated = P15().duplicateN(duplicate, list)
    println(s"6. $duplicated")
    assert(duplicated.equals(List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)))
  }
}
