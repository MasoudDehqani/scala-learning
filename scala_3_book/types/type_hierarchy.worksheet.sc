/*
  multiline string
*/
val quote = """The essence of Scala:
                Fusion of functional and object-oriented
                programming in a typed setting."""

val strippedQuote = """The essence of Scala:
                       |Fusion of functional and object-oriented
                       |programming in a typed setting""".stripMargin

println(quote)

println(strippedQuote)