package com.ui_katalogkit;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.report.testrail.TestRailCases;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.ui_katalogkit.common.PageControlPagesBase.PageControlPageBase;
import com.ui_katalogkit.common.PageControlPagesBase.enums.NumberClicks;
import com.ui_katalogkit.common.PageControlPagesBase.enums.SideOfMove;
import com.ui_katalogkit.common.UiCatalogPagesBase.UiCatalogPageBase;
import com.ui_katalogkit.common.UiCatalogPagesBase.enums.UiKitCatalogNames;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

public class PageControlPageTest implements IAbstractTest, IMobileUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test()
    @MethodOwner(owner = "spaseka", platform = "IOS")
    @TestRailCases(testCasesId = "1")
    public void clickingOnPageIndicators() {
        LOGGER.info("Start test");

        UiCatalogPageBase uiCatalogPage = initPage(getDriver(), UiCatalogPageBase.class);

        Assert.assertTrue(uiCatalogPage.isOpened());
        Assert.assertEquals(uiCatalogPage.getTextFromPageName(), "UIKitCatalog");

        PageControlPageBase pageControlPage = (PageControlPageBase) uiCatalogPage.tapToElementByName(UiKitCatalogNames.PAGE_CONTROL);

        pageControlPage.movePage(SideOfMove.LEFT, NumberClicks.FIVE);

        LOGGER.info(pageControlPage.getNumberOfPage());
    }
}