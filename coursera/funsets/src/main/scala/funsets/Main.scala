package funsets

object Main extends App:
  import FunSets.*
  println(contains(singletonSet(1), 1))
  // println(toString(singletonSet(1)))
  println(forall(singletonSet(1), x => x == 1))
