package Steps;

import io.cucumber.java.After;
import utils.BrowserFactory;

public class Hooks {

    BrowserFactory browserFactory = new BrowserFactory();
    public void tearDown() {
        BrowserFactory.quitApp();
    }

}
