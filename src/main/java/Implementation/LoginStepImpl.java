package Implementation;
import Utilities.Drivers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class LoginStepImpl extends Drivers {
    private static String facilityname;
    protected static void navigateToWeb(){
        getDriver().navigate().to("http://demoaut.katalon.com");
        getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    protected static void LoginCredentials(String username, String password){

        getDriver().findElement(By.xpath("//div[@class='text-vertical-center']/a")).click();
        getDriver().findElement(By.id("txt-username")).sendKeys(username);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        WebElement password1 = getDriver().findElement(By.id("txt-password"));
        password1.sendKeys(password);
        WebElement loginButton = getDriver().findElement(By.xpath("//div[@class='col-sm-offset-4 col-sm-8']/button"));
        try {
            if(loginButton.isEnabled())
            loginButton.click();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    protected static void successLoginValidations() {

        Assert.assertEquals("Enter Valid Username", "John Doe", "John Doe");
        Assert.assertEquals("Enter Valid Password", "ThisIsNotAPassword", "ThisIsNotAPassword");
        Assert.assertEquals(getDriver().getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
        //Assert.assertTrue("Goood", Boolean.parseBoolean(driver.getWindowHandle()));
    }

    protected static void appointmentCredentials() {
        WebElement selectfacility = getDriver().findElement(By.xpath("//*[@id=\"combo_facility\"]"));
        selectfacility.click();
        WebElement selectoption = getDriver().findElement(By.xpath("//*[@id=\"combo_facility\"]/option[3]"));
        selectoption.click();

    }

    protected static void notification(String errorMessage){
        WebElement bookappointment = getDriver().findElement(By.xpath("//*[@id=\"btn-book-appointment\"]"));
        bookappointment.click();
        System.out.println(errorMessage);
    }
    protected static void confirmsAppointment() {
        WebElement visitdate = getDriver().findElement(By.xpath("//*[@id=\"txt_visit_date\"]"));
        visitdate.click();
        WebElement selectdate = getDriver().findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[2]/td[2]"));
        selectdate.click();
        WebElement bookappointment = getDriver().findElement(By.xpath("//*[@id=\"btn-book-appointment\"]"));
        bookappointment.click();
        facilityname = getDriver().findElement(By.id("facility")).getText();
        WebElement menutab = getDriver().findElement(By.id("menu-toggle"));
        menutab.click();
        WebElement logout = getDriver().findElement(By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[5]/a"));
        logout.click();
    }

    protected void validAppointment() {
        Assert.assertTrue("Appointment is done successfully" ,facilityname.equalsIgnoreCase("Seoul CURA Healthcare Center"));
    }
}
