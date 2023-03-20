package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.BasicDriver;

import java.time.Duration;

public class _01_LoginSteps {
    DialogContent dc =new DialogContent();

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        BasicDriver.getDriver().get("https://test.mersys.io/");
        BasicDriver.getDriver().manage().window().maximize();
    }
    @When("Enter username and password")
    public void enter_username_and_password() {
        dc.sendKeysMethod(dc.getUserName(), "turkeyts");
        //dialogContent.getUserName().sendKeys("turkeyts");
        dc.sendKeysMethod(dc.getPasswordButton(), "TechnoStudy123");
       // dialogContent.getPasswordButton().sendKeys("TechnoStudy123");
    }
    @When("Click on login Button")
    public void click_on_login_button() {
     dc.clickMethod(dc.getLoginButton());
     //dialogContent.getLoginButton().click();
    }
    @Then("User should login successfully")
    public void user_should_login_successfully()  {
        dc.waitUntilVisible(dc.getDashBoardHeader());
        //Assert.assertTrue(dialogContent.getDashBoardHeader().isDisplayed());
   //    dialogContent.clickMethod(dialogContent.getAcceptCookies());

    }

    @When("Delete country")
    public void deleteCountry() {
        dc.sendKeysMethod(dc.getCountryNameSearch(), "bizeheryerAnkara");
        dc.sendKeysMethod(dc.getCountryCodeSearch(), "");
        dc.clickMethod(dc.getCountrySearchBtn());
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        dc.wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("ms-delete-button[class='ng-star-inserted']"),10));
       dc.clickMethod(dc.getDeleteCountryButton());
        dc.clickMethod(dc.getConfirmDeleteCountry());
    }
}
