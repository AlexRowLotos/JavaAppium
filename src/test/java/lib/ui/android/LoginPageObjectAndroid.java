package lib.ui.android;

import lib.ui.LoginPageObject;
import lib.ui.factories.LoginPageObjectFactory;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPageObjectAndroid extends LoginPageObject {
    public LoginPageObjectAndroid(RemoteWebDriver driver) {
        super(driver);
    }
}
