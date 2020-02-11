package scalaPCLExercises

object PCLScala {

  def ex11(): Unit = {
    println("Доброутро");
    println("Добър вечер");
    println("Лека нощ");
  }

  def ex11_02(): Unit = {
    val chickenPotatoes = new MyRecipe(450, 60);
    println(chickenPotatoes.toString());
  }

  def main(args: Array[String]): Unit = {
    ex11();
    ex11_02();
  }
}