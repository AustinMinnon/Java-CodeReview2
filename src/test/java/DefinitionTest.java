import java.time.LocalDateTime;

import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Rule
   public ClearRule clearRule = new ClearRule();

  @Test
  public void definition_instantiatesCorrectly_true() {
    Definition myDefinition = new Definition("Mow the lawn");
    assertEquals(true, myDefinition instanceof Definition);
  }
  @Test
  public void definition_instantiatesWithDescription_true() {
    Definition myDefinition = new Definition("Mow the lawn");
    assertEquals("Mow the lawn", myDefinition.getDescription());
  }
  @Test
  public void isCompleted_isFalseAfterInstantiaon_false() {
    Definition myDefinition = new Definition("Mow the lawn");
    assertEquals(false, myDefinition.isCompleted());
  }
}
