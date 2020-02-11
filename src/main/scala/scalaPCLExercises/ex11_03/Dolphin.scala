package scalaPCLExercises.ex11_03

class Dolphin(val name:String) extends Animal with Fish {
  override def speak(): Unit = println("I am a dolphin so i communicate by making sounds and clicks")

  override def eat(): Unit = println("I eat fish and squid")

  override def swim(): Unit = println("I am a very good swimmer")
}

object Dolphin {
  def main(args: Array[String]): Unit = {
    val dolphin = new Dolphin("Willy");
    dolphin.eat()
    dolphin.speak()
    dolphin.swim()
  }
}
