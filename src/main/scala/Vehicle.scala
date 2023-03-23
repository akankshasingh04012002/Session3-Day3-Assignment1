
class Vehicle(var fuel: Int) {
  val fuelCapacity = 50

  def move(): Unit = {
    if (fuel >= 20) {
      fuel -= 20
      println("Vehicle moved! Current fuel: " + fuel)
    } else {
      println("Not enough fuel to move the vehicle!")
    }
  }

  def fillFuel(fuelToAdd: Int): Unit = {
    if (fuel + fuelToAdd > fuelCapacity) {
      fuel = fuelCapacity
    } else {
      fuel += fuelToAdd
    }
    println("Fuel added! Current fuel: " + fuel)
  }
}


