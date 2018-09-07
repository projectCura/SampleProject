import com.opencsv.CSVReader;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.opencsv.CSVReader;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UnsuccessfulLoginStepImpl extends Utils {

    WebDriver webdriver = createDriver();
    String str = "/Users/VinothiniB/IdeaProjects/cucumbertesting1/src/test/Resources/Datavalues.csv";


    public void homepage() {
        webdriver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
    }

    public void setNamePassword() throws FileNotFoundException , IOException {
        WebElement menu = webdriver.findElement(By.id("menu-toggle"));
        menu.click();
        WebElement login = webdriver.findElement(By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[3]/a"));
        login.click();

        WebElement username = webdriver.findElement(By.id("txt-username"));
        WebElement password = webdriver.findElement(By.id("txt-password"));

        CSVReader reader = new CSVReader(new FileReader(str));
        String[] arr;
        while((arr = reader.readNext()) != null) {
            for(int i = 1; i < arr.length-1;i++){
                String name = arr[i];
                String pass = arr[i+1];
                username.sendKeys(name);
                password.sendKeys(pass);
            }
        }
    }

    public void loginButton() throws Exception {

        WebElement loginButton = webdriver.findElement(By.id("btn-login"));
        loginButton.click();
        String str = webdriver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[1]/p[2]")).getText();
        Assert.assertEquals("Invalid login",str,"Login failed! Please ensure the username and password are valid.");
        Thread.sleep(5000);
    }

}