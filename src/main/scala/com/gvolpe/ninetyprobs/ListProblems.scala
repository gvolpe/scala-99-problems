package com.gvolpe.ninetyprobs

trait ListProblems {

  /**
    * P01 (*) Find the last element of a list.
    * */
  def last[T](list: List[T]): T

  /**
    * P02 (*) Find the last but one element of a list.
    * */
  def penultimate[T](list: List[T]): T

  /**
    * P03 (*) Find the Kth element of a list.
    * */
  def nth[T](index: Int, list: List[T]): T

  /**
    * P04 (*) Find the number of elements of a list.
    * */
  def length[T](list: List[T]): T

  /**
    * P05 (*) Reverse a list.
    * */
  def reverse[T](list: List[T]): List[T]

  /**
    * P06 (*) Find out whether a list is a palindrome.
    * */
  def isPalindrome[T](list: List[T]): Boolean

  /**
    * P07 (**) Flatten a nested list structure.
    * */
  def flatten[T](list: List[T], e: T, list2: List[T]): List[T]

  /**
    * P08 (**) Eliminate consecutive duplicates of list elements.
    * */
  def compress[T](list: List[T]): List[T]

  /**
    * P09 (**) Pack consecutive duplicates of list elements into sublists.
    * */
  def pack[T](list: List[T]): List[List[T]]

  /**
    * P10 (*) Run-length encoding of a list.
    * */
  def encode[T](list: List[T]): List[(Int,T)]

}
