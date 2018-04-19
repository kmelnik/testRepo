package org.selenide.examples.google.selenide_straightforward;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class YourBetSimpleTests {
  @Test
  public void openMainPage() {
    open("https://yourbet.com");
    $(byCssSelector("#applicationContainer img")).shouldBe(visible);
    /*$(By.name("q")).val("selenide").pressEnter();
    $$("#ires .g").shouldHave(sizeGreaterThan(1));
    $("#ires .g").shouldBe(visible).shouldHave(
        text("Selenide: concise UI tests in Java"),
        text("selenide.org"));*/

  }
}
