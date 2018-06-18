package p16

import org.scalatest.FunSuite

class P16Test extends FunSuite {

  test("empty list cannot be dropped") {
    val list = Nil
    val nth = 2
    val dropped = P16().drop(nth, list)
    println(s"1. $dropped")
    assert(dropped.isEmpty)
  }

  test("nth is bigger then size of list") {
    val list = List(1, 2, 3)
    val nth = 4
    val dropped = P16().drop(nth, list)
    println(s"2. $dropped")
    assert(dropped.equals(list))
  }

  test("negative nth is not allowed, return the original list") {
    val list = List(1, 2, 3)
    val nth = -1
    val dropped = P16().drop(nth, list)
    println(s"3. $dropped")
    assert(dropped.equals(list))
  }

  test("0 nth is not allowed, return the original list") {
    val list = List(1, 2, 3)
    val nth = 0
    val dropped = P16().drop(nth, list)
    println(s"4. $dropped")
    assert(dropped.equals(list))
  }

  test("nth is 1, it drops every element") {
    val list = List(1, 2, 3)
    val nth = 1
    val dropped = P16().drop(nth, list)
    println(s"5. $dropped")
    assert(dropped.isEmpty)
  }

  test("nth is 2 and the list is small") {
    val list = List(1, 2, 3, 4)
    val nth = 2
    val dropped = P16().drop(nth, list)
    println(s"6. $dropped")
    assert(dropped.equals(List(1, 3)))
  }

  test("nth is 3 and list is much bigger") {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val nth = 3
    val dropped = P16().drop(nth, list)
    println(s"7. $dropped")
    assert(dropped.equals(List(1, 2, 4, 5, 7, 8, 10)))
  }

  test("Example from the website") {
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    val nth = 3
    val dropped = P16().drop(nth, list)
    println(s"7. $dropped")
    assert(dropped.equals(List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)))
  }
}
