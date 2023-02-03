package com.mfp;

import com.mfp.common.DashboardPageBase;
import com.mfp.common.DiaryPageBase;
import com.mfp.common.MFPCommonPageBase;
import com.mfp.common.enums.BottomBarButton;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.report.testrail.TestRailCases;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DiaryCaloriesValueTest implements IAbstractTest, IMobileUtils {

    @Test()
    @MethodOwner(owner = "spaseka", platform = "android")
    @TestRailCases(testCasesId = "2")
    public void caloriesValueTest(){
        MFPCommonPageBase mfpCommonPage = initPage(getDriver(), MFPCommonPageBase.class);

        DashboardPageBase dashboardPage = mfpCommonPage.defaultLogin();
        Assert.assertTrue(dashboardPage.isOpened(), "[DASHBOARD PAGE] is not opened after logining");

        DiaryPageBase diaryPage = (DiaryPageBase) mfpCommonPage.getBottomNavigationBar().clickMenuIcon(BottomBarButton.DIARY);
        Assert.assertTrue(diaryPage.isOpened(), "[DIARY PAGE] is not opened after taping on Diary button on bottom navigation bar");

        Assert.assertTrue(diaryPage.isAllMealHasZEROCalories(), "[DIARY PAGE] some of meal has calories which is different from 0");

        Integer goalCalories = diaryPage.getGoalCaloriesInteger();
        Integer remainingCalories = diaryPage.getRemainingCaloriesInteger();

        Assert.assertEquals(goalCalories, remainingCalories, "[DIARY PAGE] goal and remaining calories is not equals before anu changing in meal");
    }
}
