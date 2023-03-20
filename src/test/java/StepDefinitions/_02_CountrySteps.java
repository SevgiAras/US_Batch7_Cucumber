package StepDefinitions;

import Pages.DialogContent;
import Pages.Navigation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_CountrySteps {

    DialogContent dc =new DialogContent();
    Navigation nv =new Navigation();


    @And("Navigate to Country page")
    public void navigateToCountryPage() {
        nv.clickMethod( nv.getSetupBtn());
        nv.clickMethod(nv.getParameterBtn());
        nv.clickMethod(nv.getCountriesBtn());
    }

    @When("Create a new country")
    public void createANewCountry() {
        dc.clickMethod(dc.getAddBtn());
        dc.sendKeysMethod(dc.getFormNAmeInput(),"pat");
        dc.sendKeysMethod(dc.getFormNAmeInput(),"bizeheryerAnkara");
        dc.clickMethod(dc.getSaveBtn());
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.getSuccessMessage(),"Successfully");





    }
}
