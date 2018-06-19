package org.selenide.yourbet.selenide_yourbet_tests;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.selenide.yourbet.selenide_page_object.ActionsWithElements;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.open;

public class MainPageLoginPossitiveTest extends ActionsWithElements {


    @Before
    public void testSetUp()  {

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
    public void loginOnPossitiveTest() {
        ActionsWithElements openURL = open(getTestProperty("url"), ActionsWithElements.class);
        ActionsWithElements assertUserNickName = openURL.noteOfChangePrivacyPolicy();
        assertUserNickName.loginMethod();
        assertUserNickName.authNickNameElement.shouldHave(text(getTestProperty("auth_User_Nickname")));
    }

    @After
    public void testShutDown() {
        WebDriverRunner.clearBrowserCache();
        WebDriverRunner.closeWebDriver();
    }
}
