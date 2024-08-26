package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
//import pages.BasePage;
import pages.LoginPage;
import pages.ProductsPage;
import utils.BrowserFactory;

public class StepDefination {

    WebDriver driver;
    LoginPage loginPage = null;
    BrowserFactory browserFactory = new BrowserFactory();
    ProductsPage productsPage = null;

    @Given("Landing page is displayed")
    public void landing_page_is_displayed() {

    }

    @Given("Login modal is displayed")
    public void loginModalIsDisplayed() {
        driver = browserFactory.startApp("chrome", "https://www.demoblaze.com/index.html");
        loginPage = new LoginPage(driver);
        loginPage.openLoginPopUpModel();
    }


/*
    @Then("click login on navigation bar")
    public void click_login_on_navigation_bar() {

    }

    @Given("Login page is displayed")
    public void loginPageIsDisplayed() {

    }*/


    @And("user enters username(.*)$")
    public void userEntersUsernameUsername(String username) throws Exception {
        loginPage.enterUsername(username);
        Thread.sleep(2000);
    }

    @And("user enters password(.*)$")
    public void userEntersPasswordPassword(String password) {

        loginPage.enterPassword(password.replaceAll("\\s", ""));
    }

    @When("click login button")
    public void clickLoginButton() throws Exception {
        loginPage.clickLoginButton();
        Thread.sleep(3000);
    }

    @Then("verify that the user has logged in")
    public void verifyThatTheUserHasLoggedIn() throws Exception {
        loginPage.verifyYouLoggedIn();
        Thread.sleep(2000);
    }

    @And("select product")
    public void selectProduct() throws Exception{
        productsPage = new ProductsPage(driver);
        productsPage.ClickProductName();
        Thread.sleep(2000);
    }

    @And("add to cart")
    public void addToCart() throws Exception{
        productsPage.addItem();
        Thread.sleep(2000);
    }



       /*
    @Then("click login on navigation bar")
    public void click_login_on_navigation_bar() {

    }

    @Given("Login modal is displayed")
    public void login_modal_is_displayed() {

    }
    @Given("user enters username admin")
    public void user_enters_username_admin() {

    }
    @Given("user enters password admin")
    public void user_enters_password_admin() {

    }
    @Then("click login button")
    public void click_login_button() {

    }
*/

}
