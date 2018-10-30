package lib.ui.android;

import io.appium.java_client.AppiumDriver;
import lib.ui.ListDetailsPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ListDetailsPageObjectAndroid extends ListDetailsPageObject {

    static {
        ARTICLE_ELEMENT_TPL = "xpath://*[@resource-id='org.wikipedia:id/page_list_item_container']//*[@text='(SUBSTRING)']";
    }

    public ListDetailsPageObjectAndroid(RemoteWebDriver driver){
        super(driver);
    }
}