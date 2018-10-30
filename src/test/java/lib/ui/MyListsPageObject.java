package lib.ui;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MyListsPageObject extends MainPageObject {

    public static String
            READING_LIST_TAB,
            REMOVE_BUTTON_MW,
            LIST_ELEMENT_TPL;

    public MyListsPageObject(RemoteWebDriver driver) {
        super(driver);
    }

    public void openReadingListsTab(){
        this.waitForElementPresentAndClick(READING_LIST_TAB, "there is no reading lists tab", 5);
    }
    private static String getListElement(String substring) {
        return LIST_ELEMENT_TPL.replace("(SUBSTRING)",substring);
    }

    public void openList(String name) {
        if (Platform.getInstance().isMW()) {
            this.waitForElementPresentAndClick(READING_LIST_TAB, "no list tab", 5);
        }
        else {
            this.waitForElementPresentAndClick(getListElement(name), "no list with selected name", 5);
        }
    }
}