package com.ui_katalogkit.common.SearchPagesBase;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.ui_katalogkit.common.ParentPageBase;
import com.ui_katalogkit.common.SearchPagesBase.enums.SearchBarName;
import org.openqa.selenium.WebDriver;

public abstract class SearchPageBase extends ParentPageBase {
    public SearchPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getTextFromSearchBarsMenu();

    public abstract String getTextFromSearchBar(SearchBarName searchBarName);

    public abstract String getTextFromSearchBarDescription(SearchBarName searchBarName);

    public abstract ParentPageBase clickOnSearchBar(SearchBarName searchBarName);
}
