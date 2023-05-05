package com.ui_katalogkit;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.report.testrail.TestRailCases;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.ui_katalogkit.common.AlertViewsPagesBase.AlertViewsPageBase;
import com.ui_katalogkit.common.AlertViewsPagesBase.alertWindows.*;
import com.ui_katalogkit.common.AlertViewsPagesBase.enums.AlertViewsItem;
import com.ui_katalogkit.common.CommonPagesBase.CommonPageBase;
import com.ui_katalogkit.common.UiCatalogPagesBase.UiCatalogPageBase;
import com.ui_katalogkit.common.UiCatalogPagesBase.enums.UiKitCatalogNames;
import com.ui_katalogkit.ios.AlertViewsPages.alertWindows.AlertSecureTextEntryPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

public class AlertViewsTest implements IAbstractTest, IMobileUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test()
    @MethodOwner(owner = "spaseka", platform = "IOS")
    @TestRailCases(testCasesId = "2")
    public void checkingAllItemsFromAlertViewsPage() {
        LOGGER.info("Start test");

        UiCatalogPageBase uiCatalogPage = initPage(getDriver(), UiCatalogPageBase.class);
        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);

        Assert.assertTrue(uiCatalogPage.isOpened());

        AlertViewsPageBase alertViewsPage = (AlertViewsPageBase) uiCatalogPage.tapToElementByName(UiKitCatalogNames.ALERT_VIEWS);

        Assert.assertTrue(alertViewsPage.isOpened(), "[ALERT VIEWS] page is not opened");

        AlertSimplePageBase alertSimplePage = (AlertSimplePageBase) alertViewsPage.tapAlertViewItem(AlertViewsItem.SIMPLE);

        alertViewsPage = alertSimplePage.clickOk();

        AlertOkayCancelPageBase alertOkayCancelPage = (AlertOkayCancelPageBase) alertViewsPage.tapAlertViewItem(AlertViewsItem.OKAY_CANCEL);

        alertViewsPage = alertOkayCancelPage.clickOk();

        AlertOtherPageBase alertOtherPage = (AlertOtherPageBase) alertViewsPage.tapAlertViewItem(AlertViewsItem.OTHER);

        alertViewsPage = alertOtherPage.clickChoiceOne();

        AlertTextEntryPageBase alertTextEntryPage = (AlertTextEntryPageBase) alertViewsPage.tapAlertViewItem(AlertViewsItem.TEXT_ENTRY);

        alertTextEntryPage.enterText("Example text");
        Assert.assertEquals(alertTextEntryPage.getTextFromTextEntry(), "Example text", "[ALERT TEXT ENTRY] written text if not equals typed text");

        alertViewsPage = alertTextEntryPage.clickOk();

        AlertSecureTextEntryPageBase alertSecureTextEntry = (AlertSecureTextEntryPage) alertViewsPage.tapAlertViewItem(AlertViewsItem.SECURE_TEXT_ENTRY);

        alertSecureTextEntry.enterText("Example text");
        Assert.assertTrue(alertSecureTextEntry.isOkButtonEnabled(), "[ALERT SECURE TEXT ENTRY] 'OK' button is not enabled after typing of text");

        alertViewsPage = alertSecureTextEntry.clickOk();

        AlertConfirmCancelPageBase alertConfirmCancelPage = (AlertConfirmCancelPageBase) alertViewsPage.tapAlertViewItem(AlertViewsItem.CONFIRM_CANCEL);

        alertViewsPage = alertConfirmCancelPage.clickConfirm();

        AlertDestructivePageBase alertDestructivePage = (AlertDestructivePageBase) alertViewsPage.tapAlertViewItem(AlertViewsItem.DESTRUCTIVE);

        alertViewsPage = alertDestructivePage.clickDestructiveButton();

        Assert.assertTrue(alertViewsPage.isOpened(), "[ALERT VIEWS] main page is not opened after all actions");
    }
}