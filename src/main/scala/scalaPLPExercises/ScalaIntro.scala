package scalaPLPExercises

object ScalaIntro {

  def main(args: Array[String]): Unit = {

    // -------------------------------------------------------------

    def square(n: Int) {
      println(n + "\t: " + n * n)
    }

    for (i <- 1 to 10) {
      square(i)
    }

    // -------------------------------------------------------------
    // Short-hand function declaration
    def f(a: Int, b: Int): Int = a + b;

    println(f(1, 2))


    // -------------------------------------------------------------
    // Another way to declare a function
    def add(a: Int, b: Int): Int = {
      a + b
    }

    // Immediate functional invocation
    ((a: Int) => a + 1) (1)
    // -------------------------------------------------------------


    def apply(f: Int => Int, x: Int): Int = {
      f(x)
    }

    def linear(a: Double, b: Double): Double => Double = {
      x: Double => a * x + b
    }

    def myLinear = linear(2, 3)(4)

    println(myLinear)

    def sum(f: Int => Int, a: Int, b: Int): Int = {
      if (a > b) {
        0
      } else {
        f(a) + sum(f, a + 1, b)
      }
    }

    println(sum((x: Int) => 2 * x, 1, 10))

    def currying(a: Int)(b: Int)(c: Int)(f: Int => Int) = f(a * b * c)

    currying(1)(2)(3)(x => x * 10)


    def sum2(a:Int) : Int = {
      if (a == 0) {
        return 0
      }
      a + sum2(a - 1);
    }
    println("Answer is " + sum2(125))
  }
}
