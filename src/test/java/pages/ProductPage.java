package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {
    WebDriver driver;

    @FindBy(xpath = "//a[@href='#'][contains(.,'Add to cart')]")
    WebElement addToCart_xpath;

    public ProductPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    public void clickAddToCart() throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(addToCart_xpath));
        addToCart_xpath.click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        // Option 1: Accept the alert (clicks "OK")
        alert.accept();
    }
}
