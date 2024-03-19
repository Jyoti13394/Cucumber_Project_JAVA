package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
    @Given("User is on landing page")
    public void user_is_on_landing_page() {
        System.out.println("Written code to navigate to landing page");
    }
    @When("User login into application using {string} and {string}")
    public void user_login_into_application(String username, String password) {
        System.out.println(username + " is the username and " + password + " is the password");
    }
    @Then("Home Page is displayed")
    public void home_page_is_displayed() {
        System.out.println("Successful login");
    }
}
