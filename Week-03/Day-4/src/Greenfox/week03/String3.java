package Greenfox.week03;

public class String3 {
  public static void main(String[] args) {
    String input = "adjnsnspinjapyjgnfjasndsp";
    System.out.println(adjacentR(input, input.length()));

  }
  public static String adjacentR(String input, int length){
    if (length > 1) {
      input = input.substring(0, length - 1) + "*" + input.substring(length-1);
      return adjacentR(input, length - 1);
    }
    return input;
  }
}
