package scalaPCLExercises.ex11_04

class MilesToKm extends PclUnitConversion {
  override def convert(input: Double): Double = 1.609344 * input
}
