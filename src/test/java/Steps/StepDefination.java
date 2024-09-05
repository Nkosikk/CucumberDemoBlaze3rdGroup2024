package Steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.LandingPage;
import pages.LoginPage;
import pages.ProductPage;
import utils.BrowserFactory;
import utils.GenerateTestData;

public class StepDefination {

    WebDriver driver;
    BrowserFactory browserFactory = new BrowserFactory();
    LandingPage landingPage = null;
    LoginPage loginPage = null;
    ProductPage productPage = null;
    CartPage cartPage = null;

    @Before
    public void openBrowserAndInitialisPages(){
        driver = browserFactory.startApp("chrome", "https://www.demoblaze.com/index.html");
        landingPage = new LandingPage(driver);
        loginPage = new LoginPage(driver);
    }

    @Given("Landing page is displayed")
    public void landing_page_is_displayed() {
        landingPage.verifyLandingPage();
    }

    @Given("login page is displayed")
    public void login_page_is_displayed() throws InterruptedException {
        loginPage.openLoginPopUpModel();
        Thread.sleep(2000);
    }
    @And("I enter username (.*)$")
    public void i_enter_username(String username) throws InterruptedException {
        loginPage.enterUsername(username);
        Thread.sleep(2000);
    }
    @And("I enter password (.*)$")
    public void i_enter_password(String password) throws InterruptedException {
        loginPage.enterPassword(password.replaceAll("\\s", ""));
        Thread.sleep(2000);
    }
    @When("I click login button")
    public void i_click_login_button() throws Exception {
        loginPage.clickLoginButton();
        Thread.sleep(4000);
    }
    @Then("verify that the user has logged in")
    public void verifyThatTheUserHasLoggedIn() throws Exception {
        loginPage.verifyYouLoggedIn();
        Thread.sleep(2000);
    }

    @And("select product")
    public void selectProduct() throws Exception{
        productPage = new ProductPage(driver);
        productPage.ClickProductName();
        Thread.sleep(2000);
    }

    @And("add to cart")
    public void addToCart() throws Exception{
        productPage.addItem();
        Thread.sleep(2000);
    }

    @And("I click ok on the alert")
    public void acceptOrDismissAlert() throws Exception{
        driver.switchTo().alert().dismiss();
        //driver.switchTo().alert().accept();
        Thread.sleep(2000);
    }


    @When("I click on Cart at the menu")
    public void iClickOnCartAtTheMenu() throws InterruptedException {
        cartPage = new CartPage(driver);
        cartPage.navigateToCart();
        Thread.sleep(2000);
    }

    @Then("Verify I am on cart")
    public void verifyIAmOnCart() throws InterruptedException {
        cartPage.verifyTheCart();
        Thread.sleep(2000);
    }

    @And("I want to click on the order button")
    public void iWantToClickOnTheOrderButton() throws InterruptedException {
        cartPage.clickOrderButton();
        Thread.sleep(2000);
    }

    @And("I enter order details")
    public void iEnterOrderDetails() throws InterruptedException {
        cartPage.enterOrderDetails();
        Thread.sleep(2000);
    }

    @And("I click the purchase button")
    public void iClickThePurchaseButton() throws InterruptedException {
        cartPage.purchaseBtn();
        Thread.sleep(2000);
    }

    @Given("that the user has logged in")
    public void thatTheUserHasLoggedIn() throws InterruptedException {
        Thread.sleep(4000);
        loginPage.verifyYouLoggedIn();
        Thread.sleep(2000);
    }
}
