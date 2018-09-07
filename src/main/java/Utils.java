import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Utils {

    public WebDriver createDriver()  {
        System.setProperty("webdriver.gecko.driver","/Users/VinothiniB/downloads/geckodriver");
        DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();
        desiredCapabilities.setCapability("marionette",true);

        WebDriver driver = new FirefoxDriver(desiredCapabilities);
        return driver;
    }
}
