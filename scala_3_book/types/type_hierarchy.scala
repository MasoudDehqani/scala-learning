// immutable and mutable value/variable
val x = 1
var y = 1

/*
  All value types
*/
val bool: Boolean = true
val byte: Byte = 1 // 8-bit signed
val short: Short = 1 // 16-bit signed
val int: Int = 1 // 32-bit signed
val long: Long = 1 // 32-bit signed
val float: Float = 2.1 // 32-bit IEEE 754 single-precision float
val double: Double = 2.1 // 64-bit IEEE 754 double-precision float
val unit: Unit = () // carries no meaningful information and only has one instance
val char: Char = 'a' // 16-bit unsigned Unicode character
val string: String = "abc" // a sequence of Char

val i = 1 // defaults to Int
val f = 1.2 // defaults to Double

// Different way ot represent numerical values
val l = 1_000L // with L or l it would be Long
val d = 2.2D // with D or d it would be Double
val fl = -2.2F // with F or f it would be Float

val h = 0xACE // hexadecimal
val hl = 0xfd_3aL // Long hexadecimal                                              

val q = .25      // val q: Double = 0.25
val r = 2.5e-1   // val r: Double = 0.25
val s = .0025e2F // val s: Float = 0.25

/*
  multiline string
*/
val quote = """The essence of Scala:
               Fusion of functional and object-oriented
               programming in a typed setting."""

val strippedQuote = """The essence of Scala:
                       |Fusion of functional and object-oriented
                       |programming in a typed setting""".stripMargin

/*  
  BigInt and BigDecimal
*/
val a = BigInt(1_234_567_890_987_654_321L)
val b = BigDecimal(123_456.789)

/*
  Type casting
*/
val bt: Byte = 127
val in: Int = bt  // 127

val face: Char = '☺'
val number: Int = face  // 9786

// Currently, the usage of null is considered bad practice. It should be used mostly for interoperability with other JVM languages
val nl: Null = null // is subtype of all reference types. has a single value which is keyword literal null

/*
  Nothing -> is subtype of all types. 
  - it is called bottom type
  - There is no value that has the type Nothing
  - A common use is to signal non-termination, such as a thrown exception, 
  program exit, or an infinite loop—i.e., it is the type of an expression
  which does not evaluate to a value, or a method that does not return normally  
*/    
