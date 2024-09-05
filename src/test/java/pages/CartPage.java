package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.GenerateTestData;

public class CartPage {
    WebDriver driver;

    GenerateTestData generateTestData = new GenerateTestData();

    @FindBy(xpath = "//h2[contains(.,'Total')]")
    WebElement total_xpath;

    @FindBy(xpath = "//a[@class='nav-link'][contains(.,'Cart')]")
    WebElement cartLink_xpath;

    @FindBy(xpath = "//button[@type='button'][contains(.,'Place Order')]")
    WebElement placeOrder_xpath;

    @FindBy(xpath = "//input[@id='name']")
    WebElement name_xpath;

    @FindBy(xpath = "//input[@id='country']")
    WebElement country_xpath;

    @FindBy(xpath = "//input[@id='city']")
    WebElement city_xpath;

    @FindBy(xpath = "//input[@id='card']")
    WebElement card_xpath;

    @FindBy(xpath = "//input[@id='month']")
    WebElement month_xpath;

    @FindBy(xpath = "//input[@id='year']")
    WebElement year_xpath;

    @FindBy(xpath = "//button[@type='button'][contains(.,'Purchase')]")
    WebElement purchaseBtn_xpath;


    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void navigateToCart(){
        cartLink_xpath.click();
    }

    public void verifyTheCart(){
        Assert.assertEquals(total_xpath.getText(), "Total");
    }

    public void clickOrderButton(){
        placeOrder_xpath.click();
    }

    public void enterOrderDetails(){
        name_xpath.sendKeys(generateTestData.name);
        country_xpath.sendKeys(generateTestData.country);
        city_xpath.sendKeys(generateTestData.city);
        card_xpath.sendKeys(generateTestData.creditCard);
        month_xpath.sendKeys(generateTestData.month);
        year_xpath.sendKeys(generateTestData.year);
    }

    public void purchaseBtn(){
        purchaseBtn_xpath.click();
    }

    public void clearCart(){

    }


}
