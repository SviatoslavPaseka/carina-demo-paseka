package com.mfp;

import com.mfp.common.DashboardPageBase;
import com.mfp.common.DiaryPageBase;
import com.mfp.common.MFPCommonPageBase;
import com.mfp.common.QuickAddPageBase;
import com.mfp.common.enums.BottomBarButton;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.report.testrail.TestRailCases;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CaloriesValidationTest implements IAbstractTest, IMobileUtils {

    @Test()
    @MethodOwner(owner = "spaseka", platform = "android")
    @TestRailCases(testCasesId = "3")
    public void CaloriesValidationQuickAddTest(){
        MFPCommonPageBase mfpCommonPage = initPage(getDriver(), MFPCommonPageBase.class);

        DashboardPageBase dashboardPage = mfpCommonPage.defaultLogin();
        Assert.assertTrue(dashboardPage.isOpened(), "[DASHBOARD PAGE] is not opened after logining");

        DiaryPageBase diaryPage = (DiaryPageBase) mfpCommonPage.getBottomNavigationBar().clickMenuIcon(BottomBarButton.DIARY);
        Assert.assertTrue(diaryPage.isOpened(), "[DIARY PAGE] is not opened after taping on Diary button on bottom navigation bar");

        Assert.assertTrue(diaryPage.isBreakfastMoreButtonPresent(), "[Diary Page] Breakfast More Button is not present");
        diaryPage.clickBreakfastMoreButton();
        Assert.assertTrue(diaryPage.isQuickAddButtonPresent(), "[Diary Page] Quick Add Button is not present after taping more button");
        QuickAddPageBase quickAddPage = diaryPage.clickQuickAddButton();
        Assert.assertTrue(quickAddPage.isOpened(), "[Quick Add Page] is not opened after taping quick add button");

        quickAddPage.typeFat(1);
        quickAddPage.typeCarbohydrates(1);
        quickAddPage.typeProtein(1);

        Assert.assertEquals(quickAddPage.getCaloriesInteger(), 17, "[Quick Add Page] Calories value is not equals 17 after typing values: " +
                "1 to fat field, 1 to carbohydrates field, 1 to protein field");
    }
}