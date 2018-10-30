package tests;

import lib.CoreTestCase;
import lib.ui.*;
import lib.ui.factories.*;
import org.junit.Test;

public class ArticleTests extends CoreTestCase {

    @Test
    public void testAddTwoArticles() throws InterruptedException {
        String[] words = {
                "Java (programming language)",
                "C Sharp (programming language)"
        };

        String[] words_subtitles = {
                "bject-oriented programming language",
                "ulti-paradigm (object-oriented) programming language",
                "\"Java language\" redirects here."
        };

        String myList = "OOP";

        SearchPageObject searchPageObject = SearchPageObjectFactory.getPage(driver);
        searchPageObject.goToLoginPage();

        LoginPageObject loginPageObject = LoginPageObjectFactory.getPage(driver);
        loginPageObject.loginAs("SelectYourLogin","SelectYouPassword"); //Please use your credentials

        searchPageObject.skipOnboardingForIos();
        searchPageObject.initSearchInput();
        searchPageObject.typeSearchText(words[0]);
        searchPageObject.waitForSearchResult(words[0]);
        searchPageObject.clickByArticleWithSubstring(words[0]);

        ArticlePageObject articlePageObject =  ArticlePageObjectFactory.getPage(driver);
        articlePageObject.waitForTitleElemet();
        articlePageObject.addArticleToMyNewList(myList);
        articlePageObject.returnToSearch();

        searchPageObject.initSearchInput();
        searchPageObject.typeSearchText(words[1]);
        searchPageObject.waitForSearchResult(words[1]);
        searchPageObject.clickByArticleWithSubstring(words[1]);

        if(Platform.getInstance().isAndroid()) {
            articlePageObject.waitForTitleElemet();
        }

        articlePageObject.addArticleToExistingList(myList);
        articlePageObject.returnToSearch();

        searchPageObject.goToMyLists();
        Thread.sleep(1000);

        MyListsPageObject myListsPageObject = MyListsPageObjectFactory.getPage(driver);

        if(Platform.getInstance().isIOS()) {
            myListsPageObject.openReadingListsTab();
        }

        myListsPageObject.openList(myList);

        ListDetailsPageObject listDetailsPageObject = ListDetailsPageObjectFactory.getPage(driver);
        listDetailsPageObject.deleteArticle(words[1]);

        assertFalse(listDetailsPageObject.isArticlePresent(words[1]));

        listDetailsPageObject.openArticle(words[0]);

        if(Platform.getInstance().isIOS()){
            articlePageObject.assertSubtitleIsPresent(words_subtitles[0]);
        }
        else if(Platform.getInstance().isMW()){
            articlePageObject.assertSubtitleIsPresent(words_subtitles[2]); //it uses another note text for that article instead title
        }
        else {
            articlePageObject.assertTitleIsPresent(words[0]);
        }
    }
}