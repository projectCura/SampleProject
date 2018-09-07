//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//import net.thucydides.core.annotations.Step;
//import net.thucydides.core.annotations.Steps;
//import org.awaitility.Awaitility;
//import org.openqa.selenium.WebDriver;
//import static org.hamcrest.Matcher.*;
//
//public class LoginSteps extends Utils{
//
////    Utility uobj = new Utility();
////    WebDriver d = uobj.createDriver();
//
//  @Steps
//
//  LoginStepImpl loginstepimpl=new LoginStepImpl();
//
//    @Given("a valid user")
//    public void aValidUser(){
//        {
//            System.out.println("Valid user");
//            loginstepimpl.checkLoginUrl();
//        }
//    }
//
//    @When("the user enters the valid data")
//    public void theUserEntersTheValidData(){
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("Enters valid data");
//        System.out.println("trying api request now");
////        RestAssured.given().when().get("https://jsonplaceholder.typicode.com/todos/1").then().assertThat().statusCode(200);
//        System.out.println("successfull");
//
////        RestAssured.given().when().
////                get("https://jsonplaceholder.typicode.com/todos/1").then().
//    }
//
//    @Then("login should successful")
//    public void loginShouldSuccessful(){
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("Successful login");
//    }
////
////    @Given("a invalid user")
////    public void aInvalidUser(){
////        // Write code here that turns the phrase above into concrete actions
////        //System.out.println("Ivalid user");
////    }
////
////    @When("the user enters the invalid data")
////    public void theUserEntersTheInvalidData(){
////        // Write code here that turns the phrase above into concrete actions
////        //System.out.println("Invalid data");
////    }
////
////    @Then("login should unsuccessful")
////    public void loginShouldUnsuccessful(){
////        // Write code here that turns the phrase above into concrete actions
////        //System.out.println("UnSuccessful login");
////    }
//}
