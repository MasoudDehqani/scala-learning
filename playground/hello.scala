import scala.io.StdIn.readLine

sealed trait SomeTrait
case class CaseClassOne(val a: Int) extends SomeTrait
case class CaseClassTwo(val b: String) extends SomeTrait
case class CaseClassThree(val c: Boolean) extends SomeTrait

def and(x: Boolean, y: => Boolean): Boolean = if x then y else false
def or(x: Boolean, y: Boolean): Boolean = if x then true else y

def loop: Boolean = loop

@main
def hello(): Unit =
  // println("Enter your name:")
  // val name = readLine()
  // println(s"Your name is: $name")

  val lst = List(1, 2, 3, 4, 5, 6, 7, 8)
  val lstModified = lst.map(_ * 2)
  println(
    s"The list ${List(1, 2, 3, 4)} is doubled like this: ${lst.map(_ * 2)} with map and lambda function"
  )

  val multilineString = """The essence of Scala:
               Fusion of functional and object-oriented
               programming in a typed setting."""

  val multilineStringStripped = """The essence of Scala:
               |Fusion of functional and object-oriented
               |programming in a typed setting.""".stripMargin

  println(multilineString)
  println(multilineStringStripped)

  val num = 2

  if num == 2 then println("Two")
  else if num == 4 then println("Four")
  else println("I don't know")

  val anotherNum =
    if num == 2 then "Two" else if num == 3 then "Three" else "Nothing"
  println(anotherNum)

  num match
    case 1 => println("One")
    case 2 => println("Two")
    case n => println(num)

  val newLst =
    for
      n <- lst
      if n % 2 == 0
    yield n + 100

  println(newLst)

  val tst: SomeTrait = CaseClassOne(2)

  tst match
    case a: CaseClassOne   => println(a)
    case CaseClassTwo(b)   => println(b)
    case CaseClassThree(c) => println(c)

  tst match
    case CaseClassOne(a)   => println(a)
    case CaseClassTwo(b)   => println(b)
    case CaseClassThree(c) => println(c)

  def getClassAsString(x: Matchable) = x match
    case s: String  => println("string")
    case i: Int     => println("integer")
    case d: Double  => println("double")
    case l: List[?] => println("list")
    case _          => "unknown"

  getClassAsString(2)
  getClassAsString("s")
  getClassAsString(2.2)
  getClassAsString(List(1, 2, 3))
  val s = getClassAsString(true)
  println(s)

  println(and(false, loop))
  println(false && false)

  println(or(false, true))
  println(false || true)
