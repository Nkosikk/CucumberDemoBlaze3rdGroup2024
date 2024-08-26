package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import utils.BrowserFactory;

public class Hooks {

    /*@Before
    public void browser() {
        BrowserFactory browserFactory = new BrowserFactory();
        final WebDriver driver = browserFactory.startApp("chrome", "https://www.demoblaze.com");

    }*/

    @After
    public void tearDown() {
        BrowserFactory.quitApp();
    }

}
