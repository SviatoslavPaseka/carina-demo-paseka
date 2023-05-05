package com.ui_katalogkit;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.report.testrail.TestRailCases;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.ui_katalogkit.common.SlidersPagesBase.SlidersPageBase;
import com.ui_katalogkit.common.StackViewsPagesBase.StackViewsPageBase;
import com.ui_katalogkit.common.StackViewsPagesBase.enums.IncrementDecrement;
import com.ui_katalogkit.common.StackViewsPagesBase.enums.NumberOfSquare;
import com.ui_katalogkit.common.StackViewsPagesBase.enums.TypeDetail;
import com.ui_katalogkit.common.UiCatalogPagesBase.UiCatalogPageBase;
import com.ui_katalogkit.common.UiCatalogPagesBase.enums.UiKitCatalogNames;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

public class StackViewsPageTest implements IAbstractTest, IMobileUtils {
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

        StackViewsPageBase stackViewsPage = (StackViewsPageBase) uiCatalogPage.tapToElementByName(UiKitCatalogNames.STACK_VIEWS);

        stackViewsPage.typeTextToTextField(TypeDetail.DETAIL, "DETAIL");
        stackViewsPage.clickDetailChanger(TypeDetail.DETAIL);
        stackViewsPage.typeTextToTextField(TypeDetail.FURTHER_DETAIL, "FURTHER DETAIL");

        stackViewsPage.clickAddRemoveChanger(IncrementDecrement.INCREMENT);
        Assert.assertTrue(stackViewsPage.isSquarePresent(NumberOfSquare.ONE), "[STACK VIEWS] Square number one is not present");
        Assert.assertFalse(stackViewsPage.isSquarePresent(NumberOfSquare.TWO), "[STACK VIEWS] Square number two is not present");

        stackViewsPage.clickAddRemoveChanger(IncrementDecrement.DECREMENT);
        stackViewsPage.clickAddRemoveChanger(IncrementDecrement.INCREMENT);
        stackViewsPage.clickAddRemoveChanger(IncrementDecrement.INCREMENT);
        stackViewsPage.clickAddRemoveChanger(IncrementDecrement.INCREMENT);
        Assert.assertTrue(stackViewsPage.isSquarePresent(NumberOfSquare.THREE), "[STACK VIEWS] Square number two is not present");

        stackViewsPage.clickDetailChanger(TypeDetail.FURTHER_DETAIL);
        stackViewsPage.clickDetailChanger(TypeDetail.DETAIL);

        Assert.assertEquals(stackViewsPage.getTextFromTextField(TypeDetail.FURTHER_DETAIL), "FURTHER DETAIL");
    }
}