package tests;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.codeborne.selenide.Configuration;

public class TestBase {
    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;

        //config for Java + Selenide
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("enableVNC", true);
//        capabilities.setCapability("enableVideo", true);
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud:4444/wd/hub";
    }
}