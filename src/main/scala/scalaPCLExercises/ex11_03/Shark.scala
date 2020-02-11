package scalaPCLExercises.ex11_03

class Shark(val name: String, val placeFound: String) extends Animal with Fish {
  override def speak(): Unit = println("I cannot speak")

  override def eat(): Unit = println("I am eating other fish")

  override def swim(): Unit = println("I am a fast swimmer")

  override def toString: String = s"The $name is found in $placeFound"
}

object Shark {
  def main(args: Array[String]): Unit = {
    val shark = new Shark("tiger shark", "tropical and temperate waters")
    shark.eat()
    shark.speak()
    shark.swim()
  }
}