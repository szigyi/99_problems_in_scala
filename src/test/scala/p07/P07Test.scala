package p07

import org.scalatest.FunSuite

class P07Test extends FunSuite {

  test("Flattened empty list is empty list") {

    assert(P07().flatten(List()).isEmpty)
  }

//  test("Flattening a flatten list is the original flatten list") {
//    val list = List(List(1, 2))
//    assert(new P07().flatten(list).equals(list))
//  }

  test("Flattening a nested list") {
    val list = List(List(1, 2), List(3, 4))
    val flatten = P07().flatten(list)
    val expected = List(1, 2, 3, 4)
    println(flatten)
    assert(flatten.equals(expected))
  }

  test("Flattening a nested list with duplicated data") {
    val list = List(List(1, 2), List(2, 1))
    val flatten = P07().flatten(list)
    val expected = List(1, 2, 2, 1)
    println(flatten)
    assert(flatten.equals(expected))
  }

//  test("Example from website") {
//    val flatten = P07().flatten(List(List(1, 1), 2, List(3, List(5, 8))))
//    assert(flatten.equals(List(1, 1, 2, 3, 5, 8)))
//  }

}
