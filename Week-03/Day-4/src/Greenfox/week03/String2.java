package Greenfox.week03;

public class String2 {
  public static void main(String[] args) {
    System.out.println(xRemove("xxddaasxxyyy"));

  }

  public static String xRemove(String string) {
    if (string.contains("x")) {
      return xRemove(string.replaceFirst("x", ""));
    }
    return string;
  }
}
