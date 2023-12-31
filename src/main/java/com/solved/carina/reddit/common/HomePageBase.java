package com.solved.carina.reddit.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class HomePageBase extends AbstractPage {
    public HomePageBase (WebDriver driver){
        super(driver);
    }

    public abstract LoginPageBase clickOnLoginBtn();

    public abstract String getPostTitle();
    public abstract String clickOnGetAppBtn();
    public abstract void clickOnSearchBar();
    public abstract SearchResultsPageBase searchFromCSV(String searchForThis);
}
