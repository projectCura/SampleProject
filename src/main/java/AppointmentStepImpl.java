import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppointmentStepImpl extends Utils{

    WebDriver webdriver = createDriver();

    public void login() {
        webdriver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
        WebElement menutab = webdriver.findElement(By.id("menu-toggle"));
        menutab.click();
        WebElement logintab = webdriver.findElement(By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[3]/a"));
        logintab.click();
        WebElement name = webdriver.findElement(By.id("txt-username"));
        name.sendKeys("John Doe");
        WebElement password = webdriver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");
        WebElement loginButton = webdriver.findElement(By.id("btn-login"));
        loginButton.click();
    }

    public void enterDetails() {
        WebElement selectfacility = webdriver.findElement(By.xpath("//*[@id=\"combo_facility\"]"));
        selectfacility.click();
        WebElement selectoption = webdriver.findElement(By.xpath("//*[@id=\"combo_facility\"]/option[3]"));
        selectoption.click();
        WebElement visitdate = webdriver.findElement(By.xpath("//*[@id=\"txt_visit_date\"]"));
        visitdate.click();
        WebElement selectdate = webdriver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[2]/td[2]"));
        selectdate.click();
    }

    public void validateAppointment() {
        WebElement bookapointment = webdriver.findElement(By.xpath("//*[@id=\"btn-book-appointment\"]"));
        bookapointment.click();
        String facilityname = webdriver.findElement(By.xpath("//*[@id=\"facility\"]")).getText();
        Assert.assertTrue("Appointment made without Re-admission",facilityname.equalsIgnoreCase("Seoul CURA Healthcare Center"));
    }

    public void enterReadmissionDetails() {

        WebElement selectfacility = webdriver.findElement(By.xpath("//*[@id=\"combo_facility\"]"));
        selectfacility.click();
        WebElement selectoption = webdriver.findElement(By.xpath("//*[@id=\"combo_facility\"]/option[3]"));
        selectoption.click();
        Boolean value = webdriver.findElement(By.xpath("//*[@id=\"appointment\"]/div/div/form/div[2]/div")).isSelected();
        if(!value)
                webdriver.findElement(By.xpath("//*[@id=\"appointment\"]/div/div/form/div[2]/div")).click();
        WebElement visitdate = webdriver.findElement(By.xpath("//*[@id=\"txt_visit_date\"]"));
        visitdate.click();
        WebElement selectdate = webdriver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[2]/td[2]"));
        selectdate.click();
    }

    public void validateReadmissionAppointment() {
        WebElement bookapointment = webdriver.findElement(By.xpath("//*[@id=\"btn-book-appointment\"]"));
        bookapointment.click();
        String readmission = webdriver.findElement(By.xpath("//*[@id=\"hospital_readmission\"]")).getText();
        Assert.assertTrue("Appointment made without Re-admission",readmission.equalsIgnoreCase("Yes"));
    }
}
