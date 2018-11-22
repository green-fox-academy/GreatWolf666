package Anagram;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  Anagram anagramTester = new Anagram();

  @Test
  public void checkIfAnagram() {
    assertTrue(anagramTester.checkIfAnagram("Panzerkampfwagen", "Panzerkampfwagen"));
    assertTrue(anagramTester.checkIfAnagram("Panzerkampfwagen", "Panzerabwehrkanone"));
    assertTrue(anagramTester.checkIfAnagram("Panzerkampfwagen", "kampfwagenPanzer"));
    assertTrue(anagramTester.checkIfAnagram("Panzerkampfwagen", "fwagenPkampanzer"));

  }
  @Test
  public void checkArgument(){
    assertFalse(anagramTester.checkIfAnagram("Panzerkampfwagen", "23"));
  }
  @Test (expected = NullPointerException.class)

  public void checkNull(){
    assertTrue(anagramTester.checkIfAnagram(null, null));
  }

}

