package PetrolStation;

public class Station {
  static int gasAmount;

  static void refill(Car car) {
    gasAmount = gasAmount - (Car.capacity);
    Car.gasAmount = Car.gasAmount + Car.capacity;
  }
}
