package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LandingPage {

    WebDriver driver;

    @FindBy(xpath = "//a[contains(@id,'login2')]")
    WebElement loginBtn_xpath;

    @FindBy(id = "logInModalLabel")
    WebElement logInModalLabel_xpath;

    @FindBy(xpath = "//a[contains(@id,'logout2')]")
    WebElement logout2Button_xpath;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLoginButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(loginBtn_xpath));
        loginBtn_xpath.click();
    }

    public void verifyThePopUpIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(logInModalLabel_xpath));
        Assert.assertEquals(logInModalLabel_xpath.getText(), "Log in");
    }

    public void verifyThatUserIsLoggedIn() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(logout2Button_xpath));
    }
}
