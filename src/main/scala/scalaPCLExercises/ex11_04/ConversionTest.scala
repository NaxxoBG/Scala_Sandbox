package scalaPCLExercises.ex11_04

object ConversionTest {
  def main(args: Array[String]): Unit = {
    val gallonsToL = new GallonsToL()
    val res1 = gallonsToL.convert(3.352)
    println(s"3.352 U.K. gallons are $res1 liters")

    val inchesToCm = new InchesToCm()
    val res2 = inchesToCm.convert(15.5)
    println(s"15.5 inches are $res2 centimeters")

    val milesToKm = new MilesToKm()
    val res3 = milesToKm.convert(624)
    println(s"624 miles are $res3 kilometers")
  }
}
