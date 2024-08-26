package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage  {

    @FindBy(xpath = "//a[@id='login2']")
    WebElement _navLogin;

    @FindBy(xpath = "//input[@id='loginusername']")
    WebElement loginUsername;

    @FindBy(xpath = "//input[@id='loginpassword']")
    WebElement loginPassword;

    @FindBy(xpath = "//button[@type='button'][contains(.,'Log in')]")
    WebElement loginButton;

    @FindBy(xpath = "//button[@type='button'][contains(.,'Log in')]")
    WebElement closeLoginForm;

    @FindBy(xpath = "//a[@id='cartur']")
    WebElement cart;

    @FindBy(xpath = "//h2[contains(.,'Products')]")
    WebElement cartPage;

    @FindBy(xpath = "//button[@type='button'][contains(.,'Place Order')]")
    WebElement placeOrderButton;

    @FindBy(xpath = "//a[@href='prod.html?idp_=1'][contains(.,'Samsung galaxy s6')]")
    WebDriver addPhone;

    @FindBy(xpath = "//a[@href='#'][contains(.,'Add to cart')]")
    WebDriver addToCart;

    @FindBy(xpath = "//h2[@class='name'][contains(.,'Samsung galaxy s6')]")
    WebDriver phoneName;

    @FindBy(xpath = "//a[@href='#'][contains(.,'Delete')]")
    WebDriver deleteOption;

    @FindBy(xpath = "//h3[contains(@id,'totalp')]")
    WebElement total;

    @FindBy(xpath = "//input[@id='name']")
    WebElement placeOrderName;

    @FindBy(xpath = "//input[contains(@id,'country')]")
    WebElement placeOrderCountry;

    @FindBy(xpath = "//input[contains(@id,'country')]")
    WebElement placeOrderCity;

    @FindBy(xpath = "//input[contains(@id,'card')]")
    WebElement userCreditCard;

    @FindBy(xpath = "//input[contains(@id,'month')]")
    WebElement cardExpiryMonth;

    @FindBy(xpath = "//input[contains(@id,'year')]")
    WebElement cardExpiryYear;

    @FindBy(xpath = "(//button[@type='button'][contains(.,'Close')])[3]")
    WebElement closePlaceOrderModal;

    @FindBy(xpath = "//button[@type='button'][contains(.,'Purchase')]")
    WebElement purchaseButton;

    @FindBy(xpath = "//h2[contains(.,'Thank you for your purchase!')]")
    WebElement ThankYouMessage;

    @FindBy(xpath = "//button[@class='confirm btn btn-lg btn-primary'][contains(.,'OK')]")
    WebElement okButton;

}
