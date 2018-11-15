package Greenfox.week03;

public class Bunny1 {
  public static void main(String[] args) {
    System.out.println(bunnyEarCounter(10, 2)); // This one prints out the input / equation

  }

  public static int bunnyEarCounter(int bunnies, int ears) {
    if (bunnies == 0) { //This stops the call
      return 0;
    }
    return bunnyEarCounter(bunnies - 1, ears) + ears; //bunnies -1 makes it count forward
  }
}
