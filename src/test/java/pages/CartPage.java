package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CartPage {

    WebDriver driver;

    @FindBy(xpath = "(//a[@href='#'][contains(.,'Delete')])[1]")
    WebElement productToDelete_xpath;

    @FindBy(xpath = "//a[@href='#'][contains(.,'Delete')]")
    List<WebElement> allElements;

    @FindBy(xpath = "//a[@href='cart.html']")
    WebElement cartur_xpath;

    @FindBy(xpath = "//button[@type='button'][contains(.,'Place Order')]")
    WebElement placeOrder_xpath;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void emptyCart() throws InterruptedException {

        int i = allElements.size();

        if (i > 0) {
            for (int s = 0; s < i; s++) {
                //Thread.sleep(2000);
                new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(productToDelete_xpath));
                productToDelete_xpath.click();
            }
        }
    }

    public void clickCartUlrButton() throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(cartur_xpath));
        cartur_xpath.click();
        Thread.sleep(3000);
    }

    public void clickThePlaceOrderButton() {
        placeOrder_xpath.click();
    }
}
