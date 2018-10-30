package lib.ui.factories;
import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.ArticlePageObject;
import lib.ui.android.ArticlePageObjectAndroid;
import lib.ui.ios.ArticlePageObjectIos;
import lib.ui.mobile_web.ArticlePageObjectMW;
import org.openqa.selenium.remote.RemoteWebDriver;


public class ArticlePageObjectFactory {
    public static ArticlePageObject getPage(RemoteWebDriver driver){
        if(Platform.getInstance().isAndroid()) {
            return new ArticlePageObjectAndroid(driver);
        }
        else if(Platform.getInstance().isMW()) {
            return new ArticlePageObjectMW(driver);
        }
        else {
            return new ArticlePageObjectIos(driver);
        }
    }
}
