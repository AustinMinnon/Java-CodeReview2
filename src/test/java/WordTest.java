import java.util.ArrayList;

import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test
  public void getName_returnsName_true() {
    Word testWord = new Word("Home");
    assertEquals("Home", testWord.getName());
  }
  @Test
  public void getId_returnsWordId() {
    Word testWord = new Word("Home");
    assertTrue(Word.all().size() == testWord.getId());
  }
  @Test
  public void getDefinitions_initiallyReturnsEmptyArrayList() {
    Word testWord = new Word("Home");
    assertTrue(testWord.getDefinitions() instanceof ArrayList);
  }
  @Test
  public void all_returnsAllInstancesOfWord_true() {
    Word firstWord = new Word("Home");
    Word secondWord = new Word("Home");
    assertTrue(Word.all().contains(firstWord));
    assertTrue(Word.all().contains(secondWord));
  }
  @Test
  public void clear_removesAllWordInstancesFromMemory() {
    Word testWord = new Word("Home");
    Word.clear();
    assertEquals(Word.all().size(), 0);
  }
}
