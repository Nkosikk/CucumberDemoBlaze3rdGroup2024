package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"Steps"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@EndToEnd"
        //tags = "@productPage"
        //tags = "@cartPage"
        //tags = "@loginPage"

)
public class runner extends AbstractTestNGCucumberTests {
}
