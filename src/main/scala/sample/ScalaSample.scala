package sample

object ScalaSample extends Greetings {

  def main(args: Array[String]): Unit = {
    println(sayHello);
  }

  override def sayHello: String = "Hello"
}
