// def sum(l: List[Int], acc: Int = 0): Int =
//   l match
//     case head :: tail => sum(tail, acc + head)
//     case Nil => acc
  
// sum(List(1, 2, 3, 4))

// def product(f: Int => Int)(a: Int, b: Int): Int =
//   if a > b then 1 else f(a) * product(f)(a + 1, b)
// product(n => n * n)(1, 5)

// def factorial(n: Int) = product(a => a)(1, n)

// factorial(5)

// def sum(a: Int, b: Int): Int =
//   if a > b then 0 else a + sum(a + 1, b)

// def sum(a: Int, b: Int): Int =
//   def loop(a: Int, acc: Int): Int =
//     if a > b then acc else loop(a + 1, acc + a)
  
//   loop(a, 0)

// def sum(f: Int => Int, a: Int, b: Int): Int =
//   if a > b then 0 else f(a) + sum(f, a + 1, b)

// def sumInts(a: Int, b: Int) = sum(x => x, a, b)
// def sumCubes(a: Int, b: Int) = sum(x => x * x * x, a, b)
// def sumFactorials(a: Int, b: Int) = sum(factorial, a, b)

def sum(f: Int => Int): (Int, Int) => Int =
  def sumF(a: Int, b: Int): Int =
    if a > b then 0 else f(a) + sumF(a + 1, b)
  
  sumF

def sumInts = sum(x => x)
def sumCubes = sum(x => x * x * x)
def sumFactorials = sum(factorial)

// sum(1, 5)

// def sumInts(a: Int, b: Int): Int =
//   if a > b then 0 else a + sumInts(a + 1, b)

sumInts(1, 5)

def cube(x: Int): Int = x * x * x

// def sumCubes(a: Int, b: Int): Int =
//   if a > b then 0 else cube(a) + sumCubes(a + 1, b)

sumCubes(1, 5)

def factorial(n: Int): Int =
  if n == 1 then 1 else n * factorial(n - 1)

// def sumFactorials(a: Int, b: Int): Int =
//   if a > b then 0 else factorial(a) + sumFactorial(a + 1, b)

sumFactorials(1, 5)

// def sum(f: Int => Int, a: Int, b: Int): Int =
//   if a > b then 0 else f(a) + sum(f, a + 1, b)

// sum(cube, 1, 5)


def sumF(f: Int => Int)(a: Int, b: Int): Int =
  if a > b then 0 else f(a) + sumF(f)(a + 1, b)

sumF(cube)(1, 5)
sumF(factorial)(1, 5)
