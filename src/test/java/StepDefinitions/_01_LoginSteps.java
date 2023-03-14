package StepDefinitions;

import io.cucumber.java.en.*;

public class _01_LoginSteps {

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        System.out.println("step1");
    }
    @When("Enter username and password")
    public void enter_username_and_password() {
        System.out.println("step2");
    }
    @When("Click on login Button")
    public void click_on_login_button() {
        System.out.println("step3");
    }
    @Then("User should login successfully")
    public void user_should_login_successfully() {
        System.out.println("step4");
    }

}
