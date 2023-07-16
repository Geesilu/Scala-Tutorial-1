object SphereVolumeCalculator {
  def calculateSphereVolume(radius: Double): Double = {
    val pi = math.Pi
    (4.0 / 3.0) * pi * math.pow(radius, 3)
  }

  def main(args: Array[String]): Unit = {
    val radius = 5.0
    val volume = calculateSphereVolume(radius)
    println(s"The volume of the sphere with radius $radius is $volume")
  }
}
