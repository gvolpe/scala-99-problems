package com.gvolpe.ninetyprobs

object Lists extends ListProblems {

  override def last[T](list: List[T]): T = list match {
    case List() => throw new IllegalArgumentException("List must contain at least one element")
    case h :: Nil => h
    case h :: t => last(t)
  }

  override def penultimate[T](list: List[T]): T = {
    require(list.length >= 2, "List must contain at least two elements")
    list match {
      case p :: l :: Nil => p
      case h :: t => penultimate(t)
    }
  }

  override def nth[T](list: List[T]): T = ???

  override def length[T](list: List[T]): T = ???

  override def reverse[T](list: List[T]): List[T] = ???

  override def isPalindrome[T](list: List[T]): Boolean = ???

  override def flatten[T](list: List[T], e: T, list2: List[T]): List[T] = ???

  override def compress[T](list: List[T]): List[T] = ???

  override def pack[T](list: List[T]): List[List[T]] = ???

  override def encode[T](list: List[T]): List[(Int, T)] = ???

}
