package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.LandingPage;
import pages.LandingPagePopUp;
import utils.BrowserFactory;

public class StepDef {

    WebDriver driver;

    BrowserFactory browserFactory = new BrowserFactory();
    LandingPage landingPage;
    LandingPagePopUp landingPagePopUp;

    @Given("Landing page is displayed")
    public void landing_page_is_displayed() {
        driver = browserFactory.startApp("edge", "https://www.demoblaze.com/index.html");
        landingPage = new LandingPage(driver);
        landingPagePopUp = new LandingPagePopUp(driver);
    }


    @And("I click on the Log in Button")
    public void iClickOnTheLogInButton() {
        landingPage.clickLoginButton();
    }

    @Then("The log in pop up  Alert must be displayed")
    public void theLogInPopUpAlertMustBeDisplayed() {
        landingPage.verifyThePopUpIsDisplayed();
    }

    @Given("Landing page is displayed and the Log in pop up is displayed")
    public void landingPageIsDisplayedAndTheLogInPopUpIsDisplayed() {
        landingPage.verifyThePopUpIsDisplayed();
    }


    @Given("I click on the Log in  on the pop up")
    public void i_click_on_the_log_in_on_the_pop_up() {
        landingPagePopUp.clickLoginPopUpButton();
    }

    @Then("I must be logged in")
    public void i_must_be_logged_in() {
        landingPage.verifyThatUserIsLoggedIn();
    }

    @And("I enter the username (.*)$")
    public void iEnterTheUsername(String username) {
        landingPagePopUp.enterUserName(username);
    }

    @And("I enter the password (.*)$")
    public void iEnterThePasswordAdmin(String password) {
        landingPagePopUp.enterUserPassword(password);
    }
}
