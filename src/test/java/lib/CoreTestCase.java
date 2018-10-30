package lib;

import io.appium.java_client.AppiumDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CoreTestCase extends TestCase {
    protected RemoteWebDriver driver;
    protected Platform Platform;

    @Before
    public void setUp() throws Exception {
        super.setUp();

        driver = Platform.getInstance().getDriver();
        this.openWikiWebPageForMobileWeb();
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();

        driver.quit();
    }

    protected void openWikiWebPageForMobileWeb() {
        if(Platform.getInstance().isMW()) {
            driver.get("https://en.m.wikipedia.org/");
        }
        else {
            System.out.println("Do nothing for another platform");
        }
    }
}