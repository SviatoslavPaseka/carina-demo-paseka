package com.ui_katalogkit.common.SearchPagesBase.SearchBarPagesBase;

import com.ui_katalogkit.common.ParentPageBase;
import com.ui_katalogkit.common.SearchPagesBase.SearchPageBase;
import com.ui_katalogkit.common.SearchPagesBase.enums.Scopes;
import org.openqa.selenium.WebDriver;

public abstract class DefaultSearchBarBase extends ParentPageBase {
    public DefaultSearchBarBase(WebDriver driver) {
        super(driver);
    }

    public abstract SearchPageBase backToSearchPage();

    public abstract void typeTextToSearchField(String text);

    public abstract void clickOnCancelButton();

    public abstract String getTextCancelButton();

    public abstract void clickOnScope (Scopes scope);

    public abstract boolean isClearTextButtonPresent();

    public abstract void clickOnClearTextButton();


    public abstract boolean isScopeSelected(Scopes scope);
}
