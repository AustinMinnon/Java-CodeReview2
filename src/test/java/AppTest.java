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

  // @Test
  // public void rootTest() {
  //   goTo("http://localhost:4567/");
  //   assertThat(pageSource()).contains("Todo list!");
  // }
  //
  // @Test
  // public void WordIsCreatedTest() {
  //   goTo("http://localhost:4567/");
  //   click("a", withText("Add a new Word"));
  //   fill("#name").with("Mow the lawn");
  //   submit(".btn");
  //   assertThat(pageSource()).contains("Your Word has been saved.");
  // }
  //
  // @Test
  // public void WordIsCreatedTest() {
  //   goTo("http://localhost:4567/");
  //   click("a", withText("Add a new Word"));
  //   fill("#name").with("Household chores");
  //   submit(".btn");
  //   assertThat(pageSource()).contains("Your Word has been saved.");
  // }
  //
  // @Test
  // public void WordIsDisplayedTest() {
  //   goTo("http://localhost:4567/categories/new");
  //   fill("#name").with("Household chores");
  //   submit(".btn");
  //   click("a", withText("View categories"));
  //   assertThat(pageSource()).contains("Household chores");
  // }
  //
  // @Test
  // public void WordWordsFormIsDisplayed() {
  //   goTo("http://localhost:4567/categories/new");
  //   fill("#name").with("Shopping");
  //   submit(".btn");
  //   click("a", withText("View categories"));
  //   click("a", withText("Shopping"));
  //   click("a", withText("Add a new Word"));
  //   assertThat(pageSource()).contains("Add a Word to Shopping");
  // }
}
