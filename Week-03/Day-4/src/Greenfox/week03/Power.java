package Greenfox.week03;

public class Power {
  public static void main(String[] args) {
    System.out.println(powerN(6,6));

  }
  public static int powerN (int base, int power) {
    if (power == 0) {
      return 1;
    }
    return powerN(base,power -1)* base;
  }
}
