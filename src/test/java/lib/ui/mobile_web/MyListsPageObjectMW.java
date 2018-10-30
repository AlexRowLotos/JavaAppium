package lib.ui.mobile_web;

import lib.ui.MyListsPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MyListsPageObjectMW extends MyListsPageObject {
    static {
        READING_LIST_TAB = "css:a[title='Special:Watchlist']";
        LIST_ELEMENT_TPL = "xpath://a[@class='title']/h3[contains(text(),'(SUBSTRING)')]";
    }

    public MyListsPageObjectMW(RemoteWebDriver driver) {
        super(driver);
    }
}
