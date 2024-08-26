package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

    WebDriver driver;

    @FindBy(xpath = "//a[contains(.,'Log out')]")
    WebElement nameOfUser_xpath;

    @FindBy(xpath = "//a[contains(@id,'login2')]")
    WebElement loginMenuLink_xpath;

    @FindBy(xpath = "//h5[@class='modal-title'][contains(.,'Log in')]")
    WebElement loginModelTitle_xpath;

    @FindBy(xpath = "//input[contains(@id,'loginusername')]")
    WebElement loginUsername_xpath;

    @FindBy(xpath = "//input[contains(@id,'loginpassword')]")
    WebElement loginPassword_xpath;

    @FindBy(xpath = "//button[@type='button'][contains(.,'Log in')]")
    WebElement loginButton_xpath;



    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openLoginPopUpModel() {
        loginMenuLink_xpath.click();
    }

    /*public void verifyLoginPopUpModel(){
        Assert.assertEquals(loginModelTitle_xpath.getText(), "Log in");
    }*/

    public void enterUsername(String username) {
        loginUsername_xpath.sendKeys(username);
    }

    public void enterPassword(String password) {
        loginPassword_xpath.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton_xpath.click();
    }

    public void verifyYouLoggedIn() {
        Assert.assertEquals(nameOfUser_xpath.getText(), "Log out");
    }


}