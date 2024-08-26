package pages;

import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    BrowserFactory browserFactory =new BrowserFactory();

    final WebDriver driver = browserFactory.browser("chrome", "https://www.demoblaze.com");
    LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);



}
