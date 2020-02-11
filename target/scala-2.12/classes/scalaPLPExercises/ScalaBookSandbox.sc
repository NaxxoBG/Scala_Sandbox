import scala.collection.{mutable => m}

val a = List("asd", "greasag", "as3", "564wdsfdf")
println(a.count(_.length == 3))

val pair = (99, "Luftballons")
println(pair._1)
println(pair._2)

val jetset = new m.HashSet[String]
jetset += "Lear"
jetset += ("Boeing", "Airbus")
println(jetset.contains("Cessna"))

val treasureMap = new m.HashMap[Int, String]
treasureMap += (1 -> "Go to island")
treasureMap += (2 -> "Find big X on ground.")
treasureMap += (3 -> "Dig.")
println(treasureMap(2))

val romanNumeral = Map(
  1 -> "I",
  2 -> "II",
  3 -> "III",
  4 -> "IV",
  5 -> "V")
println(romanNumeral(4))

class SimpleGreeter {
  val greeting = "Hello World"
  def greet(): Unit = println(greeting)
}

val g = new SimpleGreeter
g.greet()


class FancyGreeter(greeting: String) {
  if (greeting == null) {
    throw new NullPointerException("greeting was null")
  }
  def greet(): Unit = println(greeting)
}
val greeting = "Atanas"
val gr = new FancyGreeter("Salutations, " + greeting)
gr.greet()

println(gr.toString)
gr.greet()
gr.greet()
gr.greet()
gr.greet()
