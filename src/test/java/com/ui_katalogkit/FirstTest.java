package com.ui_katalogkit;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.report.testrail.TestRailCases;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.ui_katalogkit.common.CommonPageBase;
import com.ui_katalogkit.common.ParentPageBase;
import com.ui_katalogkit.common.UiCatalogPageBase;
import com.ui_katalogkit.common.enums.UiKitCatalogNames;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

public class FirstTest implements IAbstractTest, IMobileUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @BeforeTest
    public void before(){
        LOGGER.info("BEFORE BLOCK");
    }

    @Test()
    @MethodOwner(owner = "spaseka", platform = "IOS")
    @TestRailCases(testCasesId = "1")
    public void checkingBottomMenuItemsLeadsEachItemPage(){
        LOGGER.info("Start test");
        UiCatalogPageBase uiCatalogPage = initPage(getDriver(), UiCatalogPageBase.class);
        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);

        Assert.assertTrue(uiCatalogPage.isOpened());
        Assert.assertEquals(uiCatalogPage.getTextFromPageName(), "UIKitCatalog");

        for(UiKitCatalogNames names: UiKitCatalogNames.values()){
            ParentPageBase currentPage = uiCatalogPage.tapToElementByName(names);
            LOGGER.info("Checking if the page" + names.getElementName() + " is open");
            Assert.assertTrue(currentPage.isOpened(), names.getElementName() + " page is not opened");
            commonPage.tapBackButton();
        }

        LOGGER.info("End");
    }
}