package scalaPCLExercises

object Greet {
  val defVal = "Hello everyone";

  def main(args: Array[String]): Unit = {
    println(if (args.length == 0) "Hello everyone" else "Hello " + args.reduce((a, b) => a + " " + b));
  }
}
