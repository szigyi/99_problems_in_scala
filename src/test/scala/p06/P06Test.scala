package p06

import org.scalatest.FunSuite

class P06Test extends FunSuite {
  test("empty list is palindrome") {
    val list = List()

    assert(new P06().isPalindrome(list))
  }

  test("one elemt list is palindrome") {
    val list = List(1)

    assert(new P06().isPalindrome(list))
  }

  test("is palindrome | small list") {
    val list = List(1, 1)

    assert(new P06().isPalindrome(list))
  }

  test("is palindrome | odd large list") {
    val list = List(1, 1, 2, 7, 3, 7, 2, 1, 1)

    assert(new P06().isPalindrome(list))
  }

  test("is palindrome | even large list") {
    val list = List(1, 1, 2, 7, 3, 3, 7, 2, 1, 1)

    assert(new P06().isPalindrome(list))
  }

  test("is not palindrome | small list") {
    val list = List(1, 2)

    assert(!new P06().isPalindrome(list))
  }

  test("is not palindrome | large list") {
    val list = List(1, 1, 2, 7, 3, 3, 7, 2, 1, 2)

    assert(!new P06().isPalindrome(list))
  }
}
