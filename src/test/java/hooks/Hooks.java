package hooks;

import utils.BrowserFactory;

public class Hooks {
    public void tearDown(){
        BrowserFactory.quitApp();
    }
}
