package scalaPCLExercises.ex11_04

class InchesToCm extends PclUnitConversion {
  override def convert(input: Double): Double = 2.54 * input
}
