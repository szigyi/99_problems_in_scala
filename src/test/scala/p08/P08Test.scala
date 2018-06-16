package p08

import org.scalatest.FunSuite

class P08Test extends FunSuite {

  test("cannot compress empty list") {
    assert(P08().compress(Nil).equals(Nil))
  }

  test("list without duplications is not compressed") {
    val list = List(1, 2, 3, 4, 5, 6, 7)
    val compressed = P08().compress(list)
    println(s"2. $compressed")
    assert(compressed.equals(list))
  }

  test("not consecutive duplicated elements are not compressed") {
    val list = List(1, 2, 1, 3, 5, 4, 5, 1)
    val compressed = P08().compress(list)
    println(s"3. $compressed")
    assert(compressed.equals(list))
  }

  test("consecutive duplicated elements are compressed") {
    val list = List(1, 1, 2, 3 ,4, 5, 5, 1)
    val compressed = P08().compress(list)
    println(s"4. $compressed")
    assert(compressed.equals(List(1, 2, 3, 4, 5, 1)))
  }

  test("Example from the website") {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val compressed = P08().compress(list)
    println(s"5. $compressed")
    assert(compressed.equals(List('a, 'b, 'c, 'a, 'd, 'e)))
  }


}
