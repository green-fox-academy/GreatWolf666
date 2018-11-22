package Greenfox.week04.AircraftCarrier;

import java.util.concurrent.ExecutionException;

public class Main {
  public static void main(String[] args) throws Exception {
    F14 f14_1 = new F14();
    Carrier carrier = new Carrier(1000, 3000);

    System.out.println(f14_1.refill(500));
    System.out.println(f14_1.fight());
    System.out.println(f14_1.getStatus);


    try {
      carrier.fill();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
