package lib.ui;

import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPageObject extends MainPageObject{
        public static String
                NAME_INPUT,
                PASSWORD_INPUT,
                LOGIN_BUTTON;
    public LoginPageObject(RemoteWebDriver driver){
        super(driver);
    }

    public void loginAs(String login, String password){
        waitForElementPresentAndSendKeys(NAME_INPUT, login, "no login input", 5);
        waitForElementPresentAndSendKeys(PASSWORD_INPUT, password, "no password input", 5);
        waitForElementPresentAndClick(LOGIN_BUTTON, "no login button", 5);
    }
}
