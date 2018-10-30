package lib.ui.mobile_web;

import lib.Platform;
import lib.ui.ListDetailsPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ListDetailsPageObjectMW extends ListDetailsPageObject {

    static {
        REMOVE_BUTTON = "css:.watch-this-article>a";
        ARTICLE_ELEMENT_TPL = "xpath://a[@class='title']/h3[contains(text(),'(SUBSTRING)')]";
    }

    public ListDetailsPageObjectMW(RemoteWebDriver driver) {
        super(driver);
    }


}