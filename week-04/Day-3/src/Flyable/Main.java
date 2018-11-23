package Flyable;

public class Main {
  public static void main(String[] args) {
    Helicopter Hind = new Helicopter("Mil Mi-24D", 255);


    Hind.takeOff();
    Hind.fly();
    Hind.land();
  }
}
