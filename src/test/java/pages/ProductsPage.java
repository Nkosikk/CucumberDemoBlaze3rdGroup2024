package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
    WebDriver driver;

    @FindBy(xpath = "//a[@href='prod.html?idp_=1'][contains(.,'Samsung galaxy s6')]")
    WebElement selectedPhone;

    @FindBy(xpath = "//a[@href='#'][contains(.,'Add to cart')]")
    WebElement addToCart;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ClickProductName() {
        selectedPhone.click();
    }

    public void addItem() {
        addToCart.click();
    }


}
