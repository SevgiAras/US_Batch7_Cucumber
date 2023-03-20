package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BasicDriver;
import utilities.MyMethod;

import java.util.List;

public class DialogContent extends MyMethod {
    public Object c;

    public DialogContent() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

    @FindBy(css = "input[placeholder='Username']")
    private WebElement userName;

    @FindBy(xpath = "//input[@data-placeholder='Password']")
    private WebElement passwordButton;

    @FindBy(xpath = "//span[contains(text(),'LOGIN')]")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@class='ng-star-inserted']//span[contains(text(),'Dashboard')]")
    private WebElement dashBoardHeader;

    @FindBy(css = "svg[class='svg-inline--fa fa-plus']")
    private WebElement addBtn;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    private WebElement formNAmeInput;

    @FindBy(xpath = "(//input[@data-placeholder='Code')[2]")
    private WebElement formCodeInput;

    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-tooltip-trigger mat-accent mat-button mat-raised-button mat-button-base ng-star-inserted']")
    private WebElement saveBtn;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//div[@id='cconsent-bar']//button[@class='consent-give']")
    private WebElement acceptCookies;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[1]")
    private WebElement countryNameSearch;

    @FindBy(xpath = "(//input[@data-placeholder='Code'])[1]")
    private WebElement countryCodeSearch;

    @FindBy(xpath = "//span[text()='Search']")
    private WebElement countrySearchBtn;

    @FindBy(css = "ms-delete-button")
    private WebElement deleteCountryButton;

    @FindBy(css = "ms-delete-button[class='ng-star-inserted']")
    private List<WebElement> deleteCountryButtonList;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement confirmDeleteCountry;



    public Object getC() {
        return c;
    }


    public WebElement getUserName() {
        return userName;
    }

    public WebElement getPasswordButton() {
        return passwordButton;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getAddBtn() {
        return addBtn;
    }

    public WebElement getDashBoardHeader() {
        return dashBoardHeader;

    }

    public WebElement getFormNAmeInput() {
        return formNAmeInput;
    }

    public WebElement getFormCodeInput() {
        return formCodeInput;
    }

    public WebElement getSaveBtn() {
        return saveBtn;
    }

    public WebElement getAcceptCookies() {
        return acceptCookies;
    }

    public WebElement getCountryNameSearch() {
        return countryNameSearch;
    }

    public WebElement getCountryCodeSearch() {
        return countryCodeSearch;
    }

    public WebElement getCountrySearchBtn() {
        return countrySearchBtn;
    }

    public WebElement getDeleteCountryButton() {
        return deleteCountryButton;
    }

    public WebElement getConfirmDeleteCountry() {
        return confirmDeleteCountry;
    }

    public WebElement getSuccessMessage() {
        return successMessage;


    }

    public List<WebElement> getDeleteCountryButtonList() {
        return deleteCountryButtonList;
    }
    //    public WebElement getAcceptCookies() {
//        return acceptCookies;
//    }
    }

