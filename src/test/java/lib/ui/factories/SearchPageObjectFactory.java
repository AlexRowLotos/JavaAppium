package lib.ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.SearchPageObject;
import lib.ui.android.SearchPageObjectAndroid;
import lib.ui.ios.SearchPageObjectIos;
import lib.ui.mobile_web.SearchPageObjectMW;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SearchPageObjectFactory {

    public static SearchPageObject getPage(RemoteWebDriver driver){
        if(Platform.getInstance().isAndroid()) {
            return new SearchPageObjectAndroid(driver);
        }
        else if(Platform.getInstance().isMW()) {
            return new SearchPageObjectMW(driver);
        }
        else {
            return new SearchPageObjectIos(driver);
        }
    }
}
