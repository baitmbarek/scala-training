package io.univalence.training.scala.collections

object CollectionManipulation extends App {

  /**
    * Exercice 1a : Implement the locate method which returns an element if it exists
    */
  def locate(set: Set[String], s: String): Option[String] = ???

  /**
    * Exercice 1b : Using the locate method, implement the isPresent method which
    * returns true if the element is in the set, false otherwise
    */
  def isPresent(set: Set[String], s: String): Boolean = ???

  /**
    * Exercice 1c : Implement the nbOccurrences method which returns the number of elements it finds
    */
  def nbOccurrences(l: List[String], s: String): Option[String] = ???

  /**
    * Exercice 1d : Implement the squares method which returns the sequence of squares
    */
  def squares(seq: Seq[Int]): Seq[Long] = ???

  /**
    * Exercice 1e : Implement the sum of squares method which computes
    */
  def sumOfSquares(seq1: Seq[Int], seq2: Seq[Int]): Long = ???

  /**
    * Exercice 1f : Implement the multiply method which applies a coefficient to each member and keeps only values greater than 1
    */
  def multiply(seq: Seq[Float], f: Float): Seq[Float] = ???

  /**
    * Exercice 1g : Implement the mapsUnion method which adds all elements of map2 to map1 and sums the values when a same key exists in both Maps
    * */
  def addMap(map1: Map[String, Int], map2: Map[String, Int]): Map[String, Int] = ???

  /**
    * Exercice 1h : Implement the difference method which finds the elements present in listA and missing from listB
    */
  def difference(listA: List[String], listB: List[String]): List[String] = ???

  /**
    * Exercice 1i : Implement the intersection method which finds the elements present both in listA and listB
    */
  def intersection(listA: List[String], listB: List[String]): List[String] = ???

  /**
    * Exercice 1j : Implement the anti method which finds the elements present only in listA or in listB
    */
  def anti(listA: List[String], listB: List[String]): List[String] = ???

  /**
    * Exercice 1k : Implement the multiplyAll method which multiplies the elements in the list
    */
  def multiplyAll(list: List[Int]): Long = ???


  case class Person(firstname: String, lastname: String, emails: Seq[String])
  /**
    * Exercice 1l : Implement the countEmails which counts the number of emails containing at least 5 characters & an '@'
    * */
  def countValidEmails(persons: List[Person]): Int = ???

  /**
    * Exercice 1m : Implement the average function and define the return type
    * */
  type ??? = Nothing
  def average(numbers: List[Int]): ??? = ???

}


object Penultimate extends App {
  /**
    * Exercice 2a : Find the penultimate element in a list using Collections API
    * */
  def penultimate(l: List[Int]): Int = ???

  /**
    * Exercice 2b : Find the penultimate element in a list using Recursion
    */
  def recursePenultimate(l: List[Int]): Int = ???

  val l = List(1,2,3,4,5)
  Set(
    penultimate(l) == 4,
    recursePenultimate(l) == 4
  ).foreach{assert}

}

object OptionsApp extends App {

  /**
    * Exercice 3a : Implement the coalesce method which yields the element a if defined or the default value default
    */
  def coalesce[A](a: Option[A], default: A): A = ???

  /**
    * Exercice 3b : Implement the bothOrNothing method which yields a pair if both elements are defined or nothing otherwise
    */
  def bothOrNothing[A,B](a: Option[A], b: Option[B]): Option[(A,B)] = ???

  /**
    * Exercice 3c : Implement the oneOf method which yields "a" if defined or "b" if defined
    */
  def oneOf[A](a: Option[A], b: Option[A]): Option[A] = ???

}

object Words extends App {

  /**
    * Exercice 4a : Write a word count function and retrieve the 5 most used words
    */
  def wordCount(inputStream: LazyList[String]): Map[String, Long] = ???

}