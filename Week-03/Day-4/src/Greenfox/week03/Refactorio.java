package Greenfox.week03;

public class Refactorio {
  public static void main(String[] args) {
    System.out.println(factorio(9));

  }

  public static int factorio(int a) {
    if (a == 1) {
      return 1;
    } else {
      int result = factorio(a - 1) * a;
      return result;
    }

  }
}
