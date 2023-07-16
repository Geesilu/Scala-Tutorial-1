object Main {
  // Define a function to calculate the area of a disk
  def calculateDiskArea(radius: Double): Double = {
    val pi = math.Pi
    pi * radius * radius
  }

  def main(args: Array[String]): Unit = {
    // Call the function with radius 5
    val radius = 5.0
    val area = calculateDiskArea(radius)

    // Print the result
    println(s"The area of the disk with radius $radius is $area")
  }
}
