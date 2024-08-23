package Steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.LandingPage;
import utils.BrowserFactory;

public class StepDef {

    WebDriver driver;

    BrowserFactory browserFactory = new BrowserFactory();
    LandingPage landingPage;

    @Given("Landing page is displayed")
    public void landing_page_is_displayed() {
        driver= browserFactory.startApp("edge", "https://www.demoblaze.com/index.html");
        landingPage = new LandingPage(driver);
    }


}
