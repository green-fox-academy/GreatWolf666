package Apples;

import static org.junit.Assert.*;

public class StringApplesTest {

  @org.junit.Test
  public void getApples() {
    StringApples goldenApple = new StringApples();
    assertEquals("golden apple", goldenApple.getApples());
  }
}
