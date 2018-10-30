package lib.ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.MyListsPageObject;
import lib.ui.android.MyListsPageObjectAndroid;
import lib.ui.ios.ArticlePageObjectIos;
import lib.ui.ios.MyListsPageObjectIos;
import lib.ui.mobile_web.ArticlePageObjectMW;
import lib.ui.mobile_web.MyListsPageObjectMW;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MyListsPageObjectFactory {

    public static MyListsPageObject getPage(RemoteWebDriver driver){
        if(Platform.getInstance().isAndroid()) {
            return new MyListsPageObjectAndroid(driver);
        }
        else if(Platform.getInstance().isMW()) {
            return new MyListsPageObjectMW(driver);
        }
        else {
            return new MyListsPageObjectIos(driver);
        }

    }
}
