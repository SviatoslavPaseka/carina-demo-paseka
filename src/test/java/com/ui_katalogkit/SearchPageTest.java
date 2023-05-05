package com.ui_katalogkit;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.report.testrail.TestRailCases;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.ui_katalogkit.common.SearchPagesBase.SearchBarPagesBase.DefaultSearchBarBase;
import com.ui_katalogkit.common.SearchPagesBase.SearchPageBase;
import com.ui_katalogkit.common.SearchPagesBase.enums.Scopes;
import com.ui_katalogkit.common.SearchPagesBase.enums.SearchBarName;
import com.ui_katalogkit.common.UiCatalogPagesBase.UiCatalogPageBase;
import com.ui_katalogkit.common.UiCatalogPagesBase.enums.UiKitCatalogNames;
import com.ui_katalogkit.ios.SearchPages.SearchBarPages.DefaultSearchBar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

public class SearchPageTest implements IAbstractTest, IMobileUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @BeforeTest
    public void before(){
        LOGGER.info("BEFORE BLOCK");
    }

    @Test()
    @MethodOwner(owner = "spaseka", platform = "IOS")
    @TestRailCases(testCasesId = "1")
    public void checkingAllFunctionality() {
        LOGGER.info("Start test");

        UiCatalogPageBase uiCatalogPage = initPage(getDriver(), UiCatalogPageBase.class);

        SearchPageBase searchPage = (SearchPageBase) uiCatalogPage.tapToElementByName(UiKitCatalogNames.SEARCH);

        DefaultSearchBar defaultSearchBar = (DefaultSearchBar) searchPage.clickOnSearchBar(SearchBarName.DEFAULT);

        defaultSearchBar.clickOnScope(Scopes.TWO);
        defaultSearchBar.clickOnScope(Scopes.ONE);

        LOGGER.info("Is scope selected"  + defaultSearchBar.isScopeSelected(Scopes.TWO));
    }
}