import java.util.ArrayList;

import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test
  public void getName_returnsName_true() {
    Word testWord = new Word("Home");
    assertEquals("Home", testWord.getName());
  }
}
