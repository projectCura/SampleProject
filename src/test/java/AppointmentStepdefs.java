import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppointmentStepdefs {

    AppointmentStepImpl appointmentStep = new AppointmentStepImpl();

    @Given("^the user logins to cura health care$")
    public void theUserLoginsToCuraHealthCare() {
        appointmentStep.login();
    }

    @When("^the user enters details in the appointment page$")
    public void theUserEntersDetailsInTheAppointmentPage() {
        appointmentStep.enterDetails();
    }

    @Then("^clicks Book Appointment button$")
    public void clicksBookAppointmentButton() {
        appointmentStep.validateAppointment();
    }

    @When("^the user enters readmission details in the appointment page$")
    public void theUserEntersReadmissionDetailsInTheAppointmentPage() {
        appointmentStep.enterReadmissionDetails();
    }

    @Then("^clicks Book Appointment button to view appointment$")
    public void clicksBookAppointmentButtonToViewAppointment() {
        appointmentStep.validateReadmissionAppointment();
    }
}
