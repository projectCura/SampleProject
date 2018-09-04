import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features={"src/test/Resources/HealthCareAppointment.feature"})
public class CucumberRunner {
}
