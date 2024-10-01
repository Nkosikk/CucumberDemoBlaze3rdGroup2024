package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.*;
import utils.BrowserFactory;

public class StepDef {

    WebDriver driver;

    BrowserFactory browserFactory = new BrowserFactory();
    LandingPage landingPage;
    LandingPagePopUp landingPagePopUp;
    HomeProductPage homeProductPage;
    CartPage cartPage;
    ProductPage productPage;
    PlaceOrderPage placeOrderPage;

    @Given("Landing page is displayed")
    public void landing_page_is_displayed() {
        driver = browserFactory.startApp("chrome", "https://www.demoblaze.com/index.html");
        landingPage = new LandingPage(driver);
        landingPagePopUp = new LandingPagePopUp(driver);
    }


    @And("I click on the Log in Button")
    public void iClickOnTheLogInButton() {
        landingPage.clickLoginButton();
    }

    @Then("The log in pop up  Alert must be displayed")
    public void theLogInPopUpAlertMustBeDisplayed() {
        landingPagePopUp.verifyThePopUpIsDisplayed();
    }

    @Given("Landing page is displayed and the Log in pop up is displayed")
    public void landingPageIsDisplayedAndTheLogInPopUpIsDisplayed() {
        landingPagePopUp.verifyThePopUpIsDisplayed();
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

    @And("I click on the Log in  on the pop up")
    public void i_click_on_the_log_in_on_the_pop_up() throws InterruptedException {
        landingPagePopUp.clickLoginPopUpButton();
        Thread.sleep(2000);
    }

    @Then("I click on the Samsung galaxy sSix")
    public void iClickOnTheSamsungGalaxySSix() throws InterruptedException {
        homeProductPage = new HomeProductPage(driver);
        Thread.sleep(2000);
        homeProductPage.chooseAProduct();
    }

    @And("I click on the Cart button")
    public void iClickOnTheCartButton() throws InterruptedException {
        Thread.sleep(2000);
        cartPage = new CartPage(driver);
        cartPage.clickCartUlrButton();
    }

    @Then("I empty the Cart")
    public void iEmptyTheCart() throws InterruptedException {
        cartPage.emptyCart();
    }

    @And("I click on the home page")
    public void iClickOnTheHomePage() throws InterruptedException {
        Thread.sleep(2000);
        landingPage.clickHomePageNavLink();
    }

    @And("I click add to cart")
    public void iClickAddToCart() throws InterruptedException {
        productPage = new ProductPage(driver);
        productPage.clickAddToCart();
    }

    @Then("I click the Place Order button to order")
    public void iClickThePlaceOrderButtonToOrder() {
        cartPage.clickThePlaceOrderButton();
    }

    @Then("I enter my username")
    public void i_enter_my_username() {
        placeOrderPage = new PlaceOrderPage(driver);
        placeOrderPage.enterUserName();
    }

    @Then("I enter country")
    public void i_enter_country() {
        placeOrderPage.enterCountryName();
    }

    @Then("I enter city")
    public void i_enter_city() {
        placeOrderPage.enterCityName();
    }

    @Then("I enter my Credit Card number")
    public void i_enter_my_credit_card_number() {
        placeOrderPage.enterCreditCard();
    }

    @Then("I enter the month")
    public void i_enter_the_month() {
        placeOrderPage.enterMonth();
    }

    @Then("I enter the year")
    public void i_enter_the_year() {
        placeOrderPage.enterYear();
    }

    @Then("I click the Purchase Button")
    public void iClickThePurchaseButton() {
        placeOrderPage.clickPurchase();
    }
}
