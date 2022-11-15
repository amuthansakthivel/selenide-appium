package com.codeborne.selenide.appium.ios;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.appium.AppiumSelectors.byTagAndName;
import static com.codeborne.selenide.appium.AppiumSelectors.byName;
import static com.codeborne.selenide.appium.AppiumSelectors.withName;
import static com.codeborne.selenide.appium.AppiumSelectors.withTagAndName;

class IosSelectorsTest {

  @Test
  void testAppiumSelectorsInIosApp() {
    closeWebDriver();
    Configuration.browser = IosTestAppDriverFactory.class.getName();
    Configuration.browserSize = null;
    open();
    $(byTagAndName("*", "IntegerA")).setValue("2");
    $(byName("IntegerB")).setValue("4");
    $(withName("ComputeSum")).click();
    $(withTagAndName("*", "Answ"))
      .shouldHave(text("6"));
  }
}
