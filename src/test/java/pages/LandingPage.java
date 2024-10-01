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

    @FindBy(xpath = "//a[@class='nav-link'][contains(.,'Home (current)')]")
    WebElement homePageNavLink_xpath;

    @FindBy(xpath = "//a[contains(@id,'logout2')]")
    WebElement logout2Button_xpath;


    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLoginButton() {
        loginBtn_xpath.click();
    }

    public void clickHomePageNavLink() {
        homePageNavLink_xpath.click();
    }

    public void verifyThatUserIsLoggedIn() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(logout2Button_xpath));
        Assert.assertEquals(logout2Button_xpath.getText(),"Log out");
    }
}


