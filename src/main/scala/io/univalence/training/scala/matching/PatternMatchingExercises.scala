package io.univalence.training.scala.matching

object PrimitivesMatching extends App {

  /**
    * Implement the stringify method which returns the string representation of any given value or reference.
    * For booleans, true should be translated to 'vrai' and false should be translated to 'false'
    * For options, we should consider printing its content if defined or return an empty string otherwise
    * For tuples we will return a Json representation like {"_1": member1, "_2": member2} depending on members types
    */
  def stringify(any: Any): String = {
    any match {
      case i: Int => ???
      case s: String => ???
      case b: Boolean => ???
      case o: Option[Any] => ???
      case tuple: Tuple2[Any,Any] => ???
      case _ => any.toString
    }
  }

}
