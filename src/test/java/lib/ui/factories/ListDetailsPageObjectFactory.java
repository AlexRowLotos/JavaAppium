package lib.ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.ListDetailsPageObject;
import lib.ui.android.ListDetailsPageObjectAndroid;
import lib.ui.ios.ListDetailsPageObjectIos;
import lib.ui.mobile_web.ListDetailsPageObjectMW;
import lib.ui.mobile_web.MyListsPageObjectMW;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ListDetailsPageObjectFactory {
    public static ListDetailsPageObject getPage(RemoteWebDriver driver){
        if(Platform.getInstance().isAndroid()) {
            return new ListDetailsPageObjectAndroid(driver);
        }
        else if(Platform.getInstance().isMW()) {
            return new ListDetailsPageObjectMW(driver);
        }
        else {
            return new ListDetailsPageObjectIos(driver);
        }
    }
}
