package Steps;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LandingPage;
import pages.LoginPageModal;
import utils.BrowserFactory;

public class StepDefinition {

    WebDriver driver;
    BrowserFactory browserFactory = new BrowserFactory();

    LandingPage landingPage = null;

    LoginPageModal loginPageModal = null;

    //part1
    @Given("Landing page is displayed")
    public void landing_page_is_displayed() {
        driver = browserFactory.startApp("chrome","https://www.demoblaze.com/index.html");
        landingPage = new LandingPage(driver);
        loginPageModal = new LoginPageModal(driver);
    }

    @When("User verifies login page link visible")
    public void userVerifiesLandingLoginPageLinkVisible() throws InterruptedException {
        landingPage.verifyLandingLoginLinkVisible();
    }

    @And("User clicks login page link")
    public void userClicksLandingLoginPageLink() {
        landingPage.clickLandingLoginLink();

    }
    @Then("Login page pop-up is displayed")
    public void loginPagePopUpIsDisplayed() {
        landingPage.verifyLandingLoginModalPopUpIsVisible();
    }

    //part2 (Howtosimplify repeptitionofcodeleadingtonext test)//
    @Given("User clicks Login page modal")
    public void userToClicksLoginPageModal() {
        loginPageModal.userClicksLogInModal();
    }

    @When("User enters username <username>")
    public void userEntersUsernameUsername(String username) {
        loginPageModal.userEntersUsername(username);
    }

    @And("User enters password <password>")
    public void userEntersPasswordPassword(String password) {
        loginPageModal.userEntersPassword(password);
    }

    @And("User clicks login button")
    public void userClicksLoginButton() {
        loginPageModal.clicksLoginButton();
    }

    @Then("User to verify they are successfully logged in to site.")
    public void userToVerifyTheyAreSuccessfullyLoggedInToSite() throws InterruptedException {
        loginPageModal.verifyLoginSuccess();
    }









    @After
    public void closeBrowser() {
        driver.quit();
    }



}
