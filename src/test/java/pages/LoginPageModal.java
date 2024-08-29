package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static java.lang.Thread.sleep;

public class LoginPageModal {

    WebDriver driver;

    @FindBy(xpath = "//h5[contains(@id,'logInModalLabel')]")
    WebElement loginpagemodal_xpath;
    @FindBy(xpath = "//input[contains(@id,'loginusername')]")
    WebElement username_xpath;

    @FindBy(xpath = "//input[contains(@id,'loginpassword')]")
    WebElement password_xpath;

    @FindBy(xpath = "//button[@type='button'][contains(.,'Log in')]")
    WebElement loginbutton_xpath;

    @FindBy(xpath = "//a[contains(@id,'nameofuser')]")
    WebElement welcomeAdmin_xpath;

    public LoginPageModal(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void userClicksLogInModal (){
        loginpagemodal_xpath.click();
    }
    public void userEntersUsername (String username) {
        username_xpath.sendKeys(username);
    }

    public void userEntersPassword (String password) {
        password_xpath.sendKeys(password);
    }

    public void clicksLoginButton() {
        loginbutton_xpath.click();
    }

    public void verifyLoginSuccess() throws InterruptedException {
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(welcomeAdmin_xpath.getText(), "Welcome admin");
    }








}
