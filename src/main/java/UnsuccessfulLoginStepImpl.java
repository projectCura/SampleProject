import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UnsuccessfulLoginStepImpl extends Utils {

    WebDriver webdriver = createDriver();

    public void homepage() {
        webdriver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
    }

    public void setNamePassword(String arg0, String arg1) {
        webdriver.findElement(By.id("menu-toggle")).click();
        webdriver.findElement(By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[3]/a")).click();
        webdriver.findElement(By.id("txt-username")).sendKeys(arg0);
        webdriver.findElement(By.id("txt-password")).sendKeys(arg1);
    }

    public void loginButton() throws Exception {
        webdriver.findElement(By.id("btn-login")).click();
        String str = webdriver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[1]/p[2]")).getText();
        Assert.assertEquals("Invalid login",str,"Login failed! Please ensure the username and password are valid.");
        Thread.sleep(5000);
    }

}