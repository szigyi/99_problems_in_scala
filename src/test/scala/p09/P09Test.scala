package p09

import org.scalatest.FunSuite

class P09Test extends FunSuite {

  test("there is one empty pack for empty list") {
    val list = List()
    val packed = P09().pack(list)
    println(s"1. $packed")
    assert(packed.size == 1)
    assert(packed(0).isEmpty)
  }

  test("always creates packs, even from one element") {
    val list = List(1)
    val packed = P09().pack(list)
    println(s"2. $packed")
    assert(packed.equals(List(List(1))))
  }

  test("does not put not different items into one pack") {
    val list = List(1, 2, 3, 4, 5)
    val packed = P09().pack(list)
    println(s"3. $packed")
    assert(packed.equals(List(
      List(1),
      List(2),
      List(3),
      List(4),
      List(5)
    )))
  }

  test("does not put not consecutive duplicates into one pack") {
    val list = List(1, 2, 1, 4, 1)
    val packed = P09().pack(list)
    println(s"4. $packed")
    assert(packed.equals(List(
      List(1),
      List(2),
      List(1),
      List(4),
      List(1)
    )))
  }

  test("packing consecutive items") {
    val list = List(1, 1, 1, 2, 3, 3, 4)
    val packed = P09().pack(list)
    println(s"5. $packed")
    assert(packed.equals(List(
      List(1, 1, 1),
      List(2),
      List(3, 3),
      List(4)
    )))
  }
}
