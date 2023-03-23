import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class VehicleSpec extends AnyFlatSpec with Matchers {

  "A Vehicle" should "reduce fuel and move" in {
    val vehicle = new Vehicle(50)

    vehicle.move()
    vehicle.fuel should be(30)

    vehicle.move()
    vehicle.fuel should be(10)

    vehicle.move()
    vehicle.fuel should be(10)
  }

  it should "refill fuel and increase fuel level" in {
    val vehicle = new Vehicle(50)

    vehicle.fillFuel(20)
    vehicle.fuel should be(50)

    vehicle.fillFuel(30)
    vehicle.fuel should be(50)

    vehicle.fillFuel(10)
    vehicle.fuel should be(50)
  }

  it should "not move if there is not enough fuel" in {
    val vehicle = new Vehicle(10)

    vehicle.move()
    vehicle.fuel should be(10)

    vehicle.move()
    vehicle.fuel should be(10)
  }
}
