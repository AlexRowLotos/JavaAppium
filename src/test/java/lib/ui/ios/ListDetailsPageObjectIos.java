package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.ListDetailsPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ListDetailsPageObjectIos extends ListDetailsPageObject {

    static {
        ARTICLE_ELEMENT_TPL = "xpath://XCUIElementTypeCell/XCUIElementTypeLink[contains(@name,'(SUBSTRING)')]";
        EDIT_BUTTON = "xpath://XCUIElementTypeButton[contains(@name,'Edit')]";
        REMOVE_BUTTON = "xpath://XCUIElementTypeButton[contains(@name,'Remove')]";
    }

    public ListDetailsPageObjectIos(RemoteWebDriver driver){
        super(driver);
    }
}