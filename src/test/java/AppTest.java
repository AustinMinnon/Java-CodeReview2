import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.fluentlenium.core.filter.FilterConstructor.*;
import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Rule
  public ClearRule clearRule = new ClearRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Dictionary");
  }

  @Test
  public void WordIsCreatedTest() {
    goTo("http://localhost:4567/");
    click("a", withText("Add Word"));
    fill("#name").with("Mow the lawn");
    submit(".btn");
    assertThat(pageSource()).contains("Your word has been saved");
  }

  @Test
  public void WordIsDisplayedTest() {
    goTo("http://localhost:4567/words/new");
    fill("#name").with("Household chores");
    submit(".btn");
    click("a", withText("view words"));
    assertThat(pageSource()).contains("Household chores");
  }

  @Test
  public void DefinitionIsDisplayedinWordTest() {
    goTo("http://localhost:4567/words/new");
    fill("#name").with("Great");
    submit(".btn");
    click("a", withText("view words"));
    click("a", withText("Great"));
    click("a", withText("Add a new definition"));
    fill("#description").with("a wonderful word definition.");
    submit(".btn");
    click("a", withText("view words"));
    click("a", withText("Great"));
    assertThat(pageSource()).contains("a wonderful word definition.");
  }
}
