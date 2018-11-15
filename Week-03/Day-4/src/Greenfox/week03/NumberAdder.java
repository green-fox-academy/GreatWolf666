package Greenfox.week03;

public class NumberAdder {
  public static void main(String[] args) {
    numAddreCursion(10);


  }

  public static void numAddreCursion(int n) {
    if (n == 0) {
      return;
    }
    numAddreCursion(n - 1);
    System.out.println(n);
  }
}
