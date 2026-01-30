def sum(l: List[Int], acc: Int = 0): Int =
  l match
    case head :: tail => sum(tail, acc + head)
    case Nil => acc
  
sum(List(1, 2, 3, 4))
