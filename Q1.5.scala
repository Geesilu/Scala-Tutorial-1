object RunningTimeCalculator {
  def calculateTotalRunningTime(easyPace: Double, tempoPace: Double): Double = {
    val distanceEasy1 = 2.0 // km
    val distanceTempo = 3.0 // km
    val distanceEasy2 = 2.0 // km

    val timeEasy1 = easyPace * distanceEasy1
    val timeTempo = tempoPace * distanceTempo
    val timeEasy2 = easyPace * distanceEasy2

    timeEasy1 + timeTempo + timeEasy2
  }

  def main(args: Array[String]): Unit = {
    val easyPace = 8.0 // min per km
    val tempoPace = 7.0 // min per km

    val totalRunningTime = calculateTotalRunningTime(easyPace, tempoPace)
    println(s"The total running time is $totalRunningTime minutes")
  }
}
