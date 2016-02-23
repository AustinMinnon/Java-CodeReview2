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
  @Test
  public void getCreateAt_instantiatesWithCurrentTime_today() {
    Definition myDefinition = new Definition("Mow the lawnn");
    assertEquals(LocalDateTime.now().getDayOfWeek(), myDefinition.getCreatedAt().getDayOfWeek());
  }
  @Test
  public void all_returnsAllInstancesOfDefinition_true() {
    Definition firstDefinition = new Definition("Mow the lawn");
    Definition secondDefinition = new Definition("Buy groceries");
    assertTrue(Definition.all().contains(firstDefinition));
    assertTrue(Definition.all().contains(secondDefinition));
  }
  @Test
  public void newId_definitionsInstantiateWithAnID_true() {
    Definition myDefinition = new Definition("Mow the lawn");
    assertEquals(Definition.all().size(), myDefinition.getId());
 }
}
