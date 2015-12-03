package com.gvolpe.ninetyprobs

import scala.annotation.tailrec

object ListSolutions extends ListProblems {

  @tailrec
  override def last[T](list: List[T]): T = list match {
    case Nil => throw new IllegalArgumentException("List must contain at least one element")
    case h :: Nil => h
    case h :: t => last(t)
  }

  @tailrec
  override def penultimate[T](list: List[T]): T = {
    require(list.length >= 2, "List must contain at least two elements")
    list match {
      case p :: l :: Nil => p
      case h :: t => penultimate(t)
    }
  }

  override def nth[T](index: Int, list: List[T]): T = {
    require(index >= 0, "Index must be greater or equal than zero")
    require(list.length > index, "List length must be greater than the given index")

    @tailrec
    def nthLoop(x: Int, seq: List[T]): T = (x, seq) match {
      case (0, h :: t) => h
      case (n, h :: t) => nthLoop(n - 1, t)
    }
    nthLoop(index, list)
  }

  override def length[T](list: List[T]): Int = list match {
    case Nil => 0
    case h :: t => 1 + length(t)
  }

  override def reverse[T](list: List[T]): List[T] = list match {
    case Nil => List()
    case h :: t => reverse(t) ::: List(h)
  }

  override def isPalindrome[T](list: List[T]): Boolean = ???

  override def flatten[T](list: List[T], e: T, list2: List[T]): List[T] = ???

  override def compress[T](list: List[T]): List[T] = ???

  override def pack[T](list: List[T]): List[List[T]] = ???

  override def encode[T](list: List[T]): List[(Int, T)] = ???

}
