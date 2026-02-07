// def flatten(list: List[Any]): List[Any] =
//   def aux(l: List[Any], acc: List[Any] = List()): List[Any] = l match
//     case (h: List[_]) :: next => aux(next, aux(h, acc))
//     case head :: next => aux(next, acc ++ List(head))
//     case Nil => acc
  
//   aux(list)


/*
  written by chatgpt
*/
// def flatten(list: List[Any]): List[Any] =
//   def aux(l: List[Any], acc: List[Any]): List[Any] = l match
//     case (h: List[_]) :: t => aux(h ++ t, acc)
//     case h :: t => aux(t, h :: acc)
//     case Nil => acc
  
//   aux(list, Nil).reverse

/*
  written by Martin Odersky in the course
*/
def flatten(list: Any): List[Any] = list match
    case Nil => Nil 
    case h :: t => flatten(h) ++ flatten(t)
    case _ => list :: Nil

flatten(List(List(1, 1), 2, List(3, List(5, 8))))