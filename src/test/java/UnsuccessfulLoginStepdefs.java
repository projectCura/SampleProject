import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;

public class UnsuccessfulLoginStepdefs {

    UnsuccessfulLoginStepImpl loginStep = new UnsuccessfulLoginStepImpl();

    @Given("^a user wants to login to Cura Health Care$")
    public void aUserWantsToLoginToCuraHealthCare() {
        loginStep.homepage();
    }

    @When("^user enters Username , Password$")
    public void userEntersUsernamePassword() throws IOException {
        loginStep.setNamePassword();
    }

    @Then("^clicks the LOGIN button$")
    public void clicksTheLOGINButton() throws Exception {
        loginStep.loginButton();
    }
}
