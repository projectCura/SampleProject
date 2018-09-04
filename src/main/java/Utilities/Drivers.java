package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Drivers {
    public static WebDriver getDriver() {
        System.setProperty("webdriver.gecko.driver", "/Users/venkatkarthi/Downloads/geckodriver");
        DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();
        desiredCapabilities.setCapability("marionette",true);

        WebDriver driver = new FirefoxDriver(desiredCapabilities);
        return driver;
    }
}