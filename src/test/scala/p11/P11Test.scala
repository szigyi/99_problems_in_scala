package p11

import org.scalatest.FunSuite
import p09.P09

class P11Test extends FunSuite {

  class P11T extends P11 {
    override val p09: P09 = P09()
  }
  object P11T { def apply(): P11T = new P11T() }

  test("encoding empty list results in empty list") {
    val list = Nil
    val encoded = P11T().encodeModified(list)
    println(s"1. $encoded")
    assert(encoded.isEmpty)
  }

  test("encoding list with one element does not wrap it into tuple") {
    val list = List(1)
    val encoded = P11T().encodeModified(list)
    println(s"2. $encoded")
    assert(encoded.equals(List(1)))
  }

  test("encoding not consecutive duplicates - does not wrap any element into tuple") {
    val list = List(1, 2, 1, 2, 3)
    val encoded = P11T().encodeModified(list)
    println(s"3. $encoded")
    assert(encoded.equals(List(
      1,
      2,
      1,
      2,
      3
    )))
  }

  test("encoding consecutive duplicates") {
    val list = List(1, 1, 2, 2, 3, 4, 5, 5)
    val encoded = P11T().encodeModified(list)
    println(s"4. $encoded")
    assert(encoded.equals(List(
      (2, 1),
      (2, 2),
      3,
      4,
      (2, 5)
    )))
  }

  test("Example from the website") {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val encoded = P11T().encodeModified(list)
    println(s"5. $encoded")
    assert(encoded.equals(List(
      (4,'a),
      'b,
      (2,'c),
      (2,'a),
      'd,
      (4,'e)
    )))
  }
}
