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
        MFPLogInPageBase logInPage = initPage(getDriver(), MFPLogInPageBase.class);
        UserTutorialPageBase userTutorialPage = logInPage.defaultLogin();

        //in my opinion here i need to create waitPage with waiting spinner,
        // and after filling password and email and taping login button
        //test go to waitPage and wait for end of logining
        //and if login is successful - test going to userTutorialPage...

        Assert.assertTrue(userTutorialPage.isOpened());
        MFPCommonPageBase mfpCommonPage = initPage(getDriver(), MFPCommonPageBase.class);

        DashboardPageBase dashboardPage = userTutorialPage.clickCloseButton();
        Assert.assertTrue(dashboardPage.isOpened(), "[DASHBOARD] is not opened");
        Assert.assertTrue(mfpCommonPage.isBottomNavigationBarPresent(), "bar is not present");

        DiaryPageBase diaryPage = (DiaryPageBase) mfpCommonPage.clickMenuIcon(BottomBarButton.DIARY);
        Assert.assertTrue(diaryPage.isOpened(), "[diaryPage] is not opened");
        Assert.assertTrue(mfpCommonPage.isBottomNavigationBarPresent(), "bar is not present");

        NewsfeedPageBase newsfeedPage = (NewsfeedPageBase) mfpCommonPage.clickMenuIcon(BottomBarButton.NEWSFEED);
        Assert.assertTrue(newsfeedPage.isOpened(), "[newsfeedPage] is not opened");
        Assert.assertTrue(mfpCommonPage.isBottomNavigationBarPresent(), "bar is not present");

        PlansPageBase plansPage = (PlansPageBase) mfpCommonPage.clickMenuIcon(BottomBarButton.PLANS);
        Assert.assertTrue(plansPage.isOpened(), "[plansPage] is not opened");
        Assert.assertTrue(mfpCommonPage.isBottomNavigationBarPresent(), "bar is not present");

        MorePageBase morePage = (MorePageBase) mfpCommonPage.clickMenuIcon(BottomBarButton.MORE);
        Assert.assertTrue(morePage.isOpened(), "[morePage] is not opened");
        Assert.assertTrue(mfpCommonPage.isBottomNavigationBarPresent(), "bar is not present");

        LOGGER.info("End");
    }
}
