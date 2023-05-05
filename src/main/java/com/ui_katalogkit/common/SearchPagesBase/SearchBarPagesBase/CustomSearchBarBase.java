package com.ui_katalogkit.common.SearchPagesBase.SearchBarPagesBase;

import com.ui_katalogkit.common.ParentPageBase;
import com.ui_katalogkit.common.SearchPagesBase.SearchPageBase;
import org.openqa.selenium.WebDriver;

public abstract class CustomSearchBarBase extends ParentPageBase {
    public CustomSearchBarBase(WebDriver driver) {
        super(driver);
    }

    public abstract SearchPageBase backToSearchPage();

    public abstract void typeTextToSearchField(String text);

    public abstract void clickOnBookmark();

    public abstract void clickOnCancelButton();

    public abstract String getTextCancelButton();

    public abstract boolean isClearTextButtonPresent();

    public abstract void clickOnClearTextButton();
}
