package scalaPCLExercises

class MyRecipe(var calories: Int, var cookTime: Int){
  override def toString: String = s"This meal contains $calories calories and it " +
    s"cooks for about $cookTime minutes";
}


