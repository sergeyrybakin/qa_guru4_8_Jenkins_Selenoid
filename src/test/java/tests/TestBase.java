package tests;

import io.qameta.allure.selenide.AllureSelenide;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public class TestBase {
    @BeforeAll
    static void setup() {
        addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        Configuration.startMaximized = true;

        //config for Java + Selenide
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("enableVNC", true);
//        capabilities.setCapability("enableVideo", true);
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud:4444/wd/hub";
    }
}