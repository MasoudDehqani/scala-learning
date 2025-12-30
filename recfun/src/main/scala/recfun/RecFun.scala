package recfun

import scala.annotation.tailrec

def time[A](label: String)(f: => A): A = {
  val start = System.nanoTime()
  val result = f
  val end = System.nanoTime()
  println(s"$label took ${(end - start) / 1e6} ms")
  result
}

object RecFun extends RecFunInterface:

  def main(args: Array[String]): Unit =
    println("")
    println(balance("())(".toList))
    // println("Pascal's Triangle")
    // for row <- 0 to 10 do
    //   for col <- 0 to row do
    //     print(s"${pascal(col, row)} ")
    //   println()

    // println(time("pascal memo") {
    //   pascalMemo(30, 40)
    // })

    // println(time("pascal") {
    //   pascal(30, 40)
    // })
    // println(pascal(3, 6))

  /** Exercise 1
    */
  def pascal(c: Int, r: Int): Int =
    if r < 2 || (c < 1 || c >= r)
    then 1
    else pascal(c, r - 1) + pascal(c - 1, r - 1)

  // def pascalMemo(c: Int, r: Int): Int =
  //   val memo = collection.mutable.Map[String, Int]()

  //   def aux(column: Int, row: Int): Int =
  //     val keyTopLeft = (column - 1).toString() + (row - 1).toString()
  //     val keyTopRight = column.toString() + (row - 1).toString()
  //     if row < 2 || (column < 1 || column >= row)
  //       then 1
  //     else
  //       memo.getOrElseUpdate(keyTopRight, aux(column, row - 1)) + memo.getOrElseUpdate(keyTopLeft, aux(column - 1, row - 1))

  //   aux(c, r)

  /** Exercise 2
    */
  def balance(chars: List[Char]): Boolean =
    def aux(cs: List[Char], open: Int): Boolean =
      cs match
        case Nil      => open == 0
        case '(' :: t => aux(t, open + 1)
        case ')' :: t => open > 0 && aux(t, open - 1)
        case _ :: t   => aux(t, open)
    aux(chars, 0)

  /** Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = ???
