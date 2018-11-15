package Greenfox.week03;

public class Main {

  public static void main(String[] args) {
    System.out.println("loop: ");


    // write your code here
  }

  public static void counter(int limit) {
    for (int i = 0; i < limit; i++) {
      System.out.println(i);

    }
  }
  public static void reCounter(int limit){
    System.out.println(limit);
    reCounter(5);
  }
}
