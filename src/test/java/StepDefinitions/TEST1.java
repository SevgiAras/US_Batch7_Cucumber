package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import utilities.BasicDriver;

public class TEST1 {
    @Given("open Google")
    public void openGoogle() {

        BasicDriver.getDriver().get("https://www.Google.com");
    }

    @When("Search for Selenium-JAva")
    public void searchForSeleniumJAva() {

        BasicDriver.getDriver().findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium-Java");

    }
}
