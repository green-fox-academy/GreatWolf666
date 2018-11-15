package Greenfox.week03;

public class Fibonacci {
  public static void main(String[] args) {
    System.out.println(fibonacci(8));
  }

  public static int fibonacci(int input) {
    if (input == 0) {
      return 0;
    } else if (input == 1) {
      return 1;
    }
    return fibonacci((input - 1)) + fibonacci((input - 2));
  }
}
