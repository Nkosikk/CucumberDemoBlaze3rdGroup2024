package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class LandingPage {

    WebDriver driver;

    @FindBy(xpath = "//a[contains(@id,'login2')]")
    WebElement landingLoginpagelink_xpath;

    @FindBy(xpath = "//h5[contains(@id,'logInModalLabel')]")
    WebElement landingLoginpagemodal_xpath;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void verifyLandingLoginLinkVisible() throws InterruptedException {
        sleep(3000);
        Assert.assertEquals(landingLoginpagelink_xpath.getText(), "Log in");
    }
    public void clickLandingLoginLink() {landingLoginpagelink_xpath.click();
    }

    public void verifyLandingLoginModalPopUpIsVisible(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(landingLoginpagemodal_xpath));
    }






}
