package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LandingPage {

    WebDriver driver;

    //By landingPageTitle_xpath = By.xpath("//a[@class='navbar-brand'][contains(.,'PRODUCT STORE')]");

    @FindBy(xpath = "//a[@class='navbar-brand'][contains(.,'PRODUCT STORE')]")
    WebElement landingPageTitle_xpath;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void verifyLandingPage(){
        Assert.assertEquals(landingPageTitle_xpath.getText(), "PRODUCT STORE");
    }

}
