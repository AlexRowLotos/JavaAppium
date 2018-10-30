package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.MyListsPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MyListsPageObjectIos extends MyListsPageObject {

    static {
        READING_LIST_TAB = "xpath://XCUIElementTypeButton[@name='Reading lists']";
        LIST_ELEMENT_TPL = "xpath://XCUIElementTypeCell/XCUIElementTypeLink[contains(@name,'(SUBSTRING)')]";
    }

    public MyListsPageObjectIos(RemoteWebDriver driver){
        super(driver);
    }
}
