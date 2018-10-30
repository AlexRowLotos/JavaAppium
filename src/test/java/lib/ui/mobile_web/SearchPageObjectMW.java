package lib.ui.mobile_web;

import io.appium.java_client.AppiumDriver;
import lib.ui.SearchPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SearchPageObjectMW extends SearchPageObject {

    static {
        SEARCH_INPUT_ELEMENT = "css:button#searchIcon";
        SEARCH_INPUT = "css:form>input[type='search']";
        SEARCH_RESULT_TPL = "xpath://div[contains(@class, 'results')]//a[contains(@data-title,'(SUBSTRING)')]";
        SEARCH_RESULTS_ITEMS = "css:ul.page-list>li.page-summary";
        SEARCH_CANCEL_BUTTON = "css:button.cancel";
        NAVIGATE_MY_LISTS = "css:a.mw-ui-icon-minerva-watchlist";
        SEARCH_RESULT_DOUBLE_TPL = "xpath://div[contains(@class, 'wikipedia-description')][contains(@text, '(SUBSTRING)')]";
        MAIN_MENU_BUTTON_MW = "css:a.main-menu-button";
    }

    public SearchPageObjectMW(RemoteWebDriver driver)
    {
        super(driver);
    }
}