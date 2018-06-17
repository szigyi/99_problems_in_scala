package p12

import org.scalatest.FunSuite

class P12Test extends FunSuite {

  test("empty list cannot be decoded") {
    val encoded = List()
    val decoded = P12().decode(encoded)
    println(s"1. $decoded")
    assert(decoded.isEmpty)
  }

  test("-5 long encoded list is uncompressed into zero element") {
    val encoded = List((-5, 1))
    val decoded = P12().decode(encoded)
    println(s"2. $decoded")
    assert(decoded.equals(List()))
  }

  test("0 long encoded list is uncompressed into zero element") {
    val encoded = List((0, 1))
    val decoded = P12().decode(encoded)
    println(s"3. $decoded")
    assert(decoded.equals(List()))
  }

  test("1 long encoded list is uncompressed into one element") {
    val encoded = List((1, 1))
    val decoded = P12().decode(encoded)
    println(s"4. $decoded")
    assert(decoded.equals(List(1)))
  }

  test("encoded list is uncompressed") {
    val encoded = List((2, 1), (2, 2), (1, 3), (1, 4), (2, 5))
    val decoded = P12().decode(encoded)
    println(s"5. $decoded")
    assert(decoded.equals(List(1, 1, 2, 2, 3, 4, 5, 5)))
  }

  test("Example from website") {
    val encoded = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
    val decoded = P12().decode(encoded)
    println(s"6. $decoded")
    assert(decoded.equals(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}
