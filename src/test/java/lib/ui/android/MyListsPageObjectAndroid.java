package lib.ui.android;

import io.appium.java_client.AppiumDriver;
import lib.ui.MyListsPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MyListsPageObjectAndroid extends MyListsPageObject {

    static {
        LIST_ELEMENT_TPL = "xpath://*[@text='(SUBSTRING)']";
    }

    public MyListsPageObjectAndroid(RemoteWebDriver driver){
        super(driver);
    }
}
