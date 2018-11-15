package Greenfox.week03;

public class String1 {
  public static void main(String[] args) {
    System.out.println(xReplace("axxiomyyya"));
  }
  public static String xReplace (String string) {
    if (string.contains("x")) {
      return xReplace(string.replaceFirst("x", "y"));
    }
    return string;
  }
}
