package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PlaceOrderPage {

    WebDriver driver;

    Faker faker = new Faker();

    String firstName = faker.name().fullName();
    String country = faker.country().name();
    String city = faker.country().capital();
    String creditCard = faker.business().creditCardNumber();
    String month = "May";
    String year ="1957";


    @FindBy(xpath = "//input[@id='name']")
    WebElement name_xpath;

    @FindBy(xpath = "//input[contains(@id,'country')]")
    WebElement country_xpath;

    @FindBy(xpath = "//input[contains(@id,'city')]")
    WebElement city_xpath;

    @FindBy(xpath = "//input[contains(@id,'card')]")
    WebElement card_xpath;

    @FindBy(xpath = "//input[contains(@id,'month')]")
    WebElement month_xpath;

    @FindBy(xpath = "//input[contains(@id,'year')]")
    WebElement year_xpath;

    @FindBy(xpath = "//button[@type='button'][contains(.,'Purchase')]")
    WebElement purchase_xpath;



    public PlaceOrderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void enterUserName(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(name_xpath));
        name_xpath.sendKeys(firstName);
    }

    public void enterCountryName(){
        country_xpath.sendKeys(country);
    }

    public void enterCityName(){
        city_xpath.sendKeys(city);
    }

    public void enterCreditCard(){
        card_xpath.sendKeys(creditCard);
    }

    public void enterMonth(){
        month_xpath.sendKeys(month);
    }

    public void enterYear(){
        year_xpath.sendKeys(year);
    }

    public void clickPurchase(){
        purchase_xpath.click();
    }
}
