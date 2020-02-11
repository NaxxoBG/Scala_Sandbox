package scalaPCLExercises.ex11_04

class GallonsToL extends PclUnitConversion {
  override def convert(gals: Double): Double = 4.5461 * gals
}
