package lib.ui.mobile_web;

import lib.ui.ArticlePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ArticlePageObjectMW extends ArticlePageObject {

    static {
                TITLE_ID = "css:.heading-holder h1";
                SUBTITLE_TEXT = "xpath://*[contains(text(), '(SUBSTRING)')]";
                FOOTER_ELEMENT = "";
                MORE_OPTIONS_MENU = "";
                ADD_TO_READING_LIST_OPTION = "css:li#ca-watch>a";
                ADD_ARTICLE_BUTTON = "";
                ONBOARDING_BUTTON = "";
                DIRECTORY_NAME_INPUT = "";
                OK_BUTTON = "";
                RETURN_BUTTON = "css:button#searchIcon";
                EXISTED_LIST_TPL = "";
    }

    public ArticlePageObjectMW(RemoteWebDriver driver) {
            super(driver);
    }
}
