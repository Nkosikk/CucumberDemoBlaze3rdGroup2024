package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomeProductPage {
    WebDriver driver;

    @FindBy(xpath = "//a[@href='prod.html?idp_=1'][contains(.,'Samsung galaxy s6')]")
    WebElement samsungS6_xpath;

    public HomeProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void chooseAProduct() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(samsungS6_xpath));
        samsungS6_xpath.click();
    }
}
