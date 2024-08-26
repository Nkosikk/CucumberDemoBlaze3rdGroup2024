package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/Features/EndToEnd.feature"}, //EndToEnd.feature", "src/test/resources/Features/LandingPage.feature"
        glue = {"Steps"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags =  "@EndToEnd"

)
public class runner extends AbstractTestNGCucumberTests {
}
