package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.LandingPage;
import utils.BrowserFactory;

public class StepDef {

    WebDriver driver;

    BrowserFactory browserFactory = new BrowserFactory();
    LandingPage landingPage;

    @Given("Landing page is displayed")
    public void landing_page_is_displayed() {
        driver = browserFactory.startApp("edge", "https://www.demoblaze.com/index.html");
        landingPage = new LandingPage(driver);
    }


    @And("I click on the Log in Button")
    public void iClickOnTheLogInButton() {
        landingPage.clickLoginButton();
    }

    @Then("The log in pop up  Alert must be displayed")
    public void theLogInPopUpAlertMustBeDisplayed() {
        landingPage.clickLoginPopUpButton();
    }
}
