package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LandingPage {

    WebDriver driver;

    @FindBy(xpath = "//a[contains(@id,'login2')]")
    WebElement loginBtn_xpath;

    @FindBy(xpath = "//input[contains(@id,'loginusername')]")
    WebElement loginUsername_xpath;

    @FindBy(xpath = "//input[contains(@id,'loginpassword')]")
    WebElement loginPassword_xpath;

    @FindBy(xpath = "//button[@type='button'][contains(.,'Log in')]")
    WebElement loginBtnPopUp_xpath;

    public LandingPage(WebDriver driver) {
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

    public void clickLoginButton(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(loginBtn_xpath));
        loginBtn_xpath.click();
    }


    public void enterUserName(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(loginBtnPopUp_xpath));
        loginUsername_xpath.sendKeys("ädmin");
    }

    public void enterUserPassword(){
        loginPassword_xpath.sendKeys("ädmin");
    }


    public void clickLoginPopUpButton(){
        loginBtnPopUp_xpath.click();
    }
}
