package p13

import org.scalatest.FunSuite

class P13Test extends FunSuite {

  test("encoding empty list results in empty list") {
    val list = Nil
    val encoded = P13().encode(list)
    println(s"1. $encoded")
    assert(encoded.isEmpty)
  }

  test("encoding list with one element") {
    val list = List(1)
    val encoded = P13().encode(list)
    println(s"2. $encoded")
    assert(encoded.equals(List(
      (1, 1)
    )))
  }

  test("encoding not consecutive duplicates") {
    val list = List(1, 2, 1, 2, 3)
    val encoded = P13().encode(list)
    println(s"3. $encoded")
    assert(encoded.equals(List(
      (1, 1),
      (1, 2),
      (1, 1),
      (1, 2),
      (1, 3)
    )))
  }

  test("encoding consecutive duplicates") {
    val list = List(1, 1, 2, 2, 3, 4, 5, 5)
    val encoded = P13().encode(list)
    println(s"4. $encoded")
    assert(encoded.equals(List(
      (2, 1),
      (2, 2),
      (1, 3),
      (1, 4),
      (2, 5)
    )))
  }

  test("Example from the website") {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val encoded = P13().encode(list)
    println(s"5. $encoded")
    assert(encoded.equals(List(
      (4,'a),
      (1,'b),
      (2,'c),
      (2,'a),
      (1,'d),
      (4,'e)
    )))
  }
}
