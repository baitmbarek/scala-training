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
    * Exercice 1e : Implement the multiply method which applies a coefficient to each member and keeps only values greater than 1
    */
  def multiply(seq: Seq[Float], f: Float): Seq[Float] = ???

  /**
    * Exercice 1f : Implement the mapsUnion method which adds all elements of map2 to map1 and sums the values when a same key exists in both Maps
    * */
  def addMap(map1: Map[String, Int], map2: Map[String, Int]): Map[String, Int] = ???

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


