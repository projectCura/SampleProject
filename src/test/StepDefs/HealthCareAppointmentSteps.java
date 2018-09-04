package StepDefs;

 import cucumber.api.PendingException;
 import Implementation.LoginStepImpl;
 import cucumber.api.java.en.Given;
 import cucumber.api.java.en.Then;
 import cucumber.api.java.en.When;

public class HealthCareAppointmentSteps extends LoginStepImpl
{

    @Given("^User navigates to the login page$")
    public void userNavigatesToTheLoginPage() {
        navigateToWeb();
    }

    @When("^User submits username and password$")
    public void userSubmitsUsernameAndPassword() {
        LoginCredentials("John Doe","ThisIsNotAPassword");
    }

    @Then("^User should be logged in$")
    public void userShouldBeLoggedIn() {
        successLoginValidations();
    }

    @When("^the user makes an appointment$")
    public void theUserMakesAnAppointment() {
        appointmentCredentials();
    }

    @Then("^the user makes a successful appointment$")
    public void theUserMakesASuccessfulAppointment() {
        confirmsAppointment();
        validAppointment();
    }

    @Then("^User should be poped-up with error message as \"([^\"]*)\"$")
    public void userShouldBePopedUpWithErrorMessageAs(String errormessage) {
        notification(errormessage);
    }
}
