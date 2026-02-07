abstract class IntSet:
  def contains(x: Int): Boolean
  def incl(x: Int): IntSet

class NonEmpty(val elem: Int, val left: IntSet, val right: IntSet) extends IntSet:
  def contains(x: Int): Boolean =
    if x < elem then left.contains(x)
    else if x > elem then right.contains(x)
    else true

  def incl(x: Int): IntSet =
    if x < elem then NonEmpty(elem, left.incl(x), right) 
    else if x > elem then NonEmpty(elem, left, right.incl(x))
    else NonEmpty(x, left, right)
  
  override def toString(): String = f"Node($elem, $left, $right)"
end NonEmpty


class Empty() extends IntSet:
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = NonEmpty(x, Empty(), Empty())
  override def toString(): String = "Empty"
end Empty

val t = NonEmpty(5, NonEmpty(4, Empty(), Empty()), NonEmpty(6, Empty(), Empty()))
val tn = t.incl(3)