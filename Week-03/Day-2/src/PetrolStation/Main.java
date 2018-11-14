package PetrolStation;

public class Main {
  public static void main(String[] args) {
    Station station = new Station();
    Car car = new Car();
    station.refill(car);
    System.out.println(
        " Car capacity: " + car.capacity
            + " Car gas amount: " + car.gasAmount
            + " Station gas amount: " + station.gasAmount
    );


  }
}
