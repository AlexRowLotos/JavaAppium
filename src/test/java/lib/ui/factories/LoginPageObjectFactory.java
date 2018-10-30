package lib.ui.factories;

import lib.Platform;
import lib.ui.LoginPageObject;
import lib.ui.android.LoginPageObjectAndroid;
import lib.ui.mobile_web.LoginPageObjectMW;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPageObjectFactory {
    public static LoginPageObject getPage(RemoteWebDriver driver) {
        if (Platform.getInstance().isAndroid()) {
            return new LoginPageObjectAndroid(driver);
        } else {
            return new LoginPageObjectMW(driver);
        }
    }
}
