package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LandingPagePopUp {

    WebDriver driver;

    @FindBy(xpath = "//input[contains(@id,'loginusername')]")
    WebElement loginUsername_xpath;

    @FindBy(xpath = "//input[contains(@id,'loginpassword')]")
    WebElement loginPassword_xpath;

    @FindBy(xpath = "//button[@type='button'][contains(.,'Log in')]")
    WebElement loginBtnPopUp_xpath;

    @FindBy(id = "logInModalLabel")
    WebElement logInModalLabel_xpath;

    public LandingPagePopUp(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUserName(String name) {
        loginUsername_xpath.sendKeys(name);
    }

    public void enterUserPassword(String password) {
        loginPassword_xpath.sendKeys(password);
    }


    public void clickLoginPopUpButton() {
        loginBtnPopUp_xpath.click();
    }

    public void verifyThePopUpIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(logInModalLabel_xpath));
        Assert.assertEquals(logInModalLabel_xpath.getText(), "Log in");
    }
}
