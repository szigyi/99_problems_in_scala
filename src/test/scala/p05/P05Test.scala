package p05

import org.scalatest.FunSuite

class P05Test extends FunSuite {

  test("list is empty then reversed list is empty as well") {
    val reversed = P05().reverse(List())

    assert(reversed.isEmpty)
  }

  test("one long list is the same as its reversed") {
    val original = List(1)

    val reversed = P05().reverse(original)

    assert(reversed.equals(original))
  }

  test("two long list") {
    val original = List(1, 2)

    val reversed = P05().reverse(original)

    assert(reversed(0).equals(2))
    assert(reversed(1).equals(1))
  }

  test("five long list") {
    val original = List(1, 2, 3, 4, 5)

    val reversed = P05().reverse(original)

    assert(reversed(0).equals(5))
    assert(reversed(1).equals(4))
    assert(reversed(2).equals(3))
    assert(reversed(3).equals(2))
    assert(reversed(4).equals(1))
  }
}
