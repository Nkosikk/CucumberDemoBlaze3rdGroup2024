package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;

public class StepDefination {

    WebDriver driver;

    BrowserFactory browserFactory = new BrowserFactory();

    @Given("Landing page is displayed")
    public void landing_page_is_displayed() {

    }

    @When("navigation bar is displayed")
    public void navigationBarIsDisplayed() {
    }

    @Then("click login on navigation bar")
    public void clickLoginOnNavigationBar() {
    }

     @And("^user enters username username(.)$")
    public void userEntersUsernameUsername() {
    }

    @And("^user enters password password(.)$")
    public void userEntersPasswordPassword() {
    }

    @Then("click login button")
    public void clickLoginButton() {
    }
/*

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
    }

    @When("the user enters an invalid username or password")
    public void theUserEntersAnInvalidUsernameOrPassword() {
    }

    @And("clicks the login button")
    public void clicksTheLoginButton() {
    }

    @Then("an error message should be displayed")
    public void anErrorMessageShouldBeDisplayed() {
    }

    @When("the user leaves the username field empty")
    public void theUserLeavesTheUsernameFieldEmpty() {
    }

    @And("enters a valid password")
    public void entersAValidPassword() {
    }

    @Then("an error message indicating the username is required should be displayed")
    public void anErrorMessageIndicatingTheUsernameIsRequiredShouldBeDisplayed() {
    }

    @When("the user enters a valid username")
    public void theUserEntersAValidUsername() {
    }

    @And("leaves the password field empty")
    public void leavesThePasswordFieldEmpty() {
    }

    @Then("an error message indicating the password is required should be displayed")
    public void anErrorMessageIndicatingThePasswordIsRequiredShouldBeDisplayed() {
    }
*/


}
