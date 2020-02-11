package scalaPCLExercises.ex11_04

object PclConversions {
  def galToL(gals: Double): Double = {
    4.5461 * gals
  }

  def inchesToCm(inches: Double): Double = {
    2.54 * inches
  }

  def miToKm(miles: Double): Double = {
    1.609344 * miles
  }

  def main(args: Array[String]): Unit = {
    println(miToKm(1))
  }
}
