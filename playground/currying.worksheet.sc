// def sum(f: Int => Int): (Int, Int) => Int =
//   def sumF(a: Int, b: Int): Int =
//     if a > b then 0 else f(a) + sumF(a + 1, b)
  
//   sumF

// def sumInts = sum(x => x)
// def sumCubes = sum(x => x * x * x)
// def sumFactorials = sum(factorial)

// def sum(f: Int => Int)(a: Int, b: Int): Int =
//   if a > b then 0 else f(a) + sum(f)(a + 1, b)

// sum(x => x)(1, 5)

// def product(f: Int => Int)(a: Int, b: Int): Int =
//   def loop(a: Int, acc: Int): Int =
//     if a > b then acc else loop(a + 1, acc * f(a))
  
//   loop(a, 1)

// def factorial(n: Int) = product(x => x)(1, n)

// factorial(5)

// def mapReduce(init: Int, red: (Int, Int) => Int)(a: Int, b: Int): Int =
//   if a > b then init else mapReduce(red(init, a), red)(a + 1, b)

// mapReduce(1, (x, y) => x * y)(1, 5)
// mapReduce(0, (x, y) => x + y)(1, 5)

def factorial(n: Int): Int =
  if n <= 1 then n else n * factorial(n - 1)

def mapReduce(acc: Int, reducer: (Int, Int) => Int, f: Int => Int)(a: Int, b: Int): Int =
  if a > b then acc else mapReduce(reducer(acc, f(a)), reducer, f)(a + 1, b)

def sum(f: Int => Int) = mapReduce(0, (x, y) => x + y, f)
sum(factorial)(1, 5)
sum(x => x * x * x)(1, 5)
sum(x => x)(1, 5)

def product(f: Int => Int) = mapReduce(1, (x, y) => x * y, f)
product(factorial)(1, 5)
product(x => x * x * x)(1, 5)
product(x => x)(1, 5)

// mapReduce(1, (x, y) => x * y)(1, 5)
// mapReduce(0, (x, y) => x + y)(1, 5)