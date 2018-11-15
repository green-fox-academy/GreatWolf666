package Greenfox.week03;

public class SumDigits {
  public static void main(String[] args) {
    System.out.println(sumDigit(126));
  }

  public static int sumDigit(int n) {
    if (n == 0) {
      return 0;
    }
    return n % 10 + sumDigit(n / 10);
  }
}
