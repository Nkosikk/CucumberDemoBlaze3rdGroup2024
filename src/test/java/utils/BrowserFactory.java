package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class BrowserFactory {
    private static WebDriver driver;

    @BeforeTest
    public WebDriver startApp(String browser, String url) {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox") || browser.equalsIgnoreCase("mozilla")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("safari")) {
            driver = new SafariDriver();
        } /*else if (browser.equalsIgnoreCase("chromium")) {
            driver = new ChromiumDriver();
        }*/ else {
            driver = new EdgeDriver();

        }

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        return driver;
    }

    public static void quitApp() {
        if (driver != null) {
            driver.quit();
        }
    }


}
