package Greenfox.week03;

public class Bunny2 {
  public static void main(String[] args) {
    System.out.println(earCounter(3, 2, 4));
  }

  public static int earCounter(int oddEar, int evenEar, int line) {
    if (line == 0) {
      return 0;
    } else if (line % 2 == 0) {
      return earCounter(oddEar, evenEar, line - 1) + evenEar;
    }
    return earCounter(oddEar, evenEar, line - 1) + oddEar;
  }
}
