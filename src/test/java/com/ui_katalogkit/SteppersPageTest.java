package com.ui_katalogkit;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.report.testrail.TestRailCases;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.ui_katalogkit.common.SteppersPagesBase.SteppersPageBase;
import com.ui_katalogkit.common.SteppersPagesBase.enums.IncrementDecrement;
import com.ui_katalogkit.common.SteppersPagesBase.enums.TextStepper;
import com.ui_katalogkit.common.UiCatalogPagesBase.UiCatalogPageBase;
import com.ui_katalogkit.common.UiCatalogPagesBase.enums.UiKitCatalogNames;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

public class SteppersPageTest implements IAbstractTest, IMobileUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @BeforeTest
    public void before() {
        LOGGER.info("BEFORE BLOCK");
    }

    @Test()
    @MethodOwner(owner = "spaseka", platform = "IOS")
    @TestRailCases(testCasesId = "1")
    public void checkingAllFunctionality() {
        LOGGER.info("Start test");
        UiCatalogPageBase uiCatalogPage = initPage(getDriver(), UiCatalogPageBase.class);

        SteppersPageBase steppersPage = (SteppersPageBase) uiCatalogPage.tapToElementByName(UiKitCatalogNames.STEPPERS);

        steppersPage.clickOnChangerButton(TextStepper.DEFAULT, IncrementDecrement.INCREMENT, 8);
        steppersPage.clickOnChangerButton(TextStepper.DEFAULT, IncrementDecrement.DECREMENT);

        LOGGER.info("___" + steppersPage.getValueOfStepper(TextStepper.DEFAULT));
    }
}