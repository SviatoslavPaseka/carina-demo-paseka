package com.ui_katalogkit;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.report.testrail.TestRailCases;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.ui_katalogkit.common.ButtonsPagesBase.ButtonsPageBase;
import com.ui_katalogkit.common.ButtonsPagesBase.enums.DescriptionsButton;
import com.ui_katalogkit.common.UiCatalogPagesBase.UiCatalogPageBase;
import com.ui_katalogkit.common.UiCatalogPagesBase.enums.UiKitCatalogNames;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

public class ButtonsPageTest implements IAbstractTest, IMobileUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test()
    @MethodOwner(owner = "spaseka", platform = "IOS")
    @TestRailCases(testCasesId = "1")
    public void checkingBottomMenuItemsLeadsEachItemPage() {
        LOGGER.info("Start test");
        UiCatalogPageBase uiCatalogPage = initPage(getDriver(), UiCatalogPageBase.class);

        ButtonsPageBase buttonsPage = (ButtonsPageBase) uiCatalogPage.tapToElementByName(UiKitCatalogNames.BUTTONS);

        Assert.assertTrue(buttonsPage.isOpened(), "[BUTTONS PAGE] is not opened (1)");

        for (DescriptionsButton db: DescriptionsButton.values()){
            LOGGER.info(buttonsPage.getTextFromDescriptionTextByDescription(db));

            LOGGER.info(buttonsPage.getButtonByDescription(db));
        }

        Assert.assertTrue(buttonsPage.isOpened(), "[BUTTONS PAGE] is not opened (2)");
    }
}