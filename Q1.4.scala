object WholesaleCostCalculator {
  def calculateWholesaleCost(numCopies: Int): Double = {
    val coverPrice = 24.95
    val discountRate = 0.4
    val discountAmount = coverPrice * discountRate
    val discountedPrice = coverPrice - discountAmount

    val shippingCostFirst50 = 3.0
    val shippingCostPerAdditionalCopy = 0.75

    if (numCopies <= 50) {
      discountedPrice * numCopies + shippingCostFirst50
    } else {
      discountedPrice * numCopies + shippingCostFirst50 + shippingCostPerAdditionalCopy * (numCopies - 50)
    }
  }

  def main(args: Array[String]): Unit = {
    val numCopies = 60
    val totalWholesaleCost = calculateWholesaleCost(numCopies)
    println(s"The total wholesale cost for $numCopies copies is Rs. $totalWholesaleCost")
  }
}
