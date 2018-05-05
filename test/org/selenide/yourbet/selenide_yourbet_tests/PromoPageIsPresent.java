package org.selenide.yourbet.selenide_yourbet_tests;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.selenide.yourbet.selenide_page_object.ActionsWithElements;

import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.open;

public class PromoPageIsPresent extends ActionsWithElements {
    @Before
    public void testSetUp() {

        //CHROME Browser
        browser = "chrome";
        // System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
        //FIREFOX Browser

        //SAFARI Browser

        //IE Browser

        //EDGE Browser
    }
    @Test
    public void promoPageWithBonusesVisibleTest () {
        ActionsWithElements openURL = open(getTestProperty("url"), ActionsWithElements.class);
        ActionsWithElements searchLogo = openURL.searchLogoPresent();
        ActionsWithElements loginOn = openURL.promoPageIsPresentWithBonuses();
    }
    @After
    public void testShutDown() {
        WebDriverRunner.clearBrowserCache();
        WebDriverRunner.closeWebDriver();
    }
}
