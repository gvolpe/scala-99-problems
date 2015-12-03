package com.gvolpe.ninetyprobs

import com.gvolpe.ninetyprobs.ListSolutions._

class ListSolutionsSpec extends BaseSpec {

  val numbers = List(5, 8, 3, 7, 4, 1)

  "A list of elements" should {

    "retrieve the last element" in {
      val result = last(numbers)
      result should be (1)
    }

    "fail trying to get the last element of an empty list" in {
      intercept[IllegalArgumentException] {
        last(List())
      }
    }

    "retrieve the penultimate element" in {
      val result = penultimate(numbers)
      result should be (4)
    }

    "fail trying to get the penultimate element of an empty list" in {
      intercept[IllegalArgumentException] {
        penultimate(List())
      }
    }

    "fail trying to get the penultimate element of a list of one element" in {
      intercept[IllegalArgumentException] {
        penultimate(List(2))
      }
    }

    "retrieve the 2nd element (index 1)" in {
      val result = nth(1, numbers)
      result should be (8)
    }

    "fail trying to get the 2nd element of a list of one element" in {
      intercept[IllegalArgumentException] {
        nth(1, List(2))
      }
    }

    "fail trying to get the element with index -1" in {
      intercept[IllegalArgumentException] {
        nth(-1, numbers)
      }
    }

    "retrieve the length" in {
      val result = ListSolutions.length(numbers)
      result should be (numbers.length)
    }

    "reversed" in {
      val result = reverse(numbers)
      result should be (numbers.reverse)
    }

    "BE palindrome" in {
      val result = isPalindrome(List(1,4,6,4,1))
      result should be (true)
    }

    "BE NOT palindrome" in {
      val result = isPalindrome(numbers)
      result should be (false)
    }

    "BE NOT palindrome when the list is empty" in {
      val result = isPalindrome(List())
      result should be (false)
    }

  }

}
