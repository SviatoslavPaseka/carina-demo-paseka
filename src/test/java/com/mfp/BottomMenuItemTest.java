package com.mfp;

import com.mfp.common.*;
import com.mfp.common.enums.BottomBarButton;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.report.testrail.TestRailCases;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

public class BottomMenuItemTest implements IAbstractTest, IMobileUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    @Test()
    @MethodOwner(owner = "spaseka", platform = "android")
    @TestRailCases(testCasesId = "3")
    public void checkingBottomMenuItemsLeadsEachItemPage(){

        MFPCommonPageBase mfpCommonPage = initPage(getDriver(), MFPCommonPageBase.class);

        DashboardPageBase dashboardPage = mfpCommonPage.defaultLogin();
        Assert.assertTrue(dashboardPage.isOpened(), "[DASHBOARD PAGE] is not opened after logining");

        DiaryPageBase diaryPage = (DiaryPageBase) mfpCommonPage.getBottomNavigationBar().clickMenuIcon(BottomBarButton.DIARY);
        Assert.assertTrue(diaryPage.isOpened(), "[DIARY PAGE] is not opened after taping on Diary button on bottom navigation bar");

        NewsfeedPageBase newsfeedPage = (NewsfeedPageBase) mfpCommonPage.getBottomNavigationBar().clickMenuIcon(BottomBarButton.NEWSFEED);
        Assert.assertTrue(newsfeedPage.isOpened(), "[NEWSFEED PAGE] is not opened after taping on NEWSFEED button on bottom navigation bar");

        PlansPageBase plansPage = (PlansPageBase) mfpCommonPage.getBottomNavigationBar().clickMenuIcon(BottomBarButton.PLANS);
        Assert.assertTrue(plansPage.isOpened(), "[PLANS PAGE] is not opened after taping on PLANS button on bottom navigation bar");

        MorePageBase morePage = (MorePageBase) mfpCommonPage.getBottomNavigationBar().clickMenuIcon(BottomBarButton.MORE);
        Assert.assertTrue(morePage.isOpened(), "[MORE PAGE] is not opened after taping on MORE button on bottom navigation bar");

        LOGGER.info("End");
    }
}
