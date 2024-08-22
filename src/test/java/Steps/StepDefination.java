package Steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;

public class StepDefination {

    WebDriver driver;

    BrowserFactory browserFactory = new BrowserFactory();

    @Given("Landing page is displayed")
    public void landing_page_is_displayed() {

    }


}
