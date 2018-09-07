import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UnsuccessfulLoginStepdefs {

    UnsuccessfulLoginStepImpl loginStep = new UnsuccessfulLoginStepImpl();

    @Given("^a user wants to login to Cura Health Care$")
    public void aUserWantsToLoginToCuraHealthCare() {
        loginStep.homepage();
    }

    @When("^user enters \"([^\"]*)\" , \"([^\"]*)\"$")
    public void enters(String arg0, String arg1) {
        loginStep.setNamePassword(arg0,arg1);
    }

    @Then("^clicks the LOGIN button$")
    public void clicksTheLOGINButton() throws Exception {
        loginStep.loginButton();
    }

}
