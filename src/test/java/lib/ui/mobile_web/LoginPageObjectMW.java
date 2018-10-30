package lib.ui.mobile_web;

import lib.ui.LoginPageObject;
import lib.ui.factories.LoginPageObjectFactory;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPageObjectMW extends LoginPageObject {
    static {
                NAME_INPUT = "css:input#wpName1";
                PASSWORD_INPUT = "css:input#wpPassword1";
                LOGIN_BUTTON = "css:button.mw-htmlform-submit";
    }

    public LoginPageObjectMW(RemoteWebDriver driver) {
        super(driver);
    }
}
