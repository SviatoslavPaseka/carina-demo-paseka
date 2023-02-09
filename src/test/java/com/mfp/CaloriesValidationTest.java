package com.mfp;

import com.mfp.common.*;
import com.mfp.common.enums.BottomBarButton;
import com.mfp.common.enums.ButtonInMoreMenu;
import com.mfp.common.enums.NameOfMealDiary;
import com.mfp.common.enums.NutrientsQuickAdd;
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

        Assert.assertTrue(diaryPage.isMoreButtonByNamePresent(NameOfMealDiary.BREAKFAST), "[Diary Page] Breakfast More Button is not present");
        MoreMenuPageBase moreMenu = diaryPage.clickMoreButtonByName(NameOfMealDiary.BREAKFAST);
        Assert.assertTrue(moreMenu.isOpened(), String.format("[MORE MENU] is not opened after clicking %s More Menu button", NameOfMealDiary.BREAKFAST.getValue()));
        Assert.assertTrue(moreMenu.isButtonPresent(ButtonInMoreMenu.QUICK_ADD), "[MORE MENU] Quick Add Button is not present after taping more button");
        QuickAddPageBase quickAddPage = (QuickAddPageBase) moreMenu.clickOnButton(ButtonInMoreMenu.QUICK_ADD);
        Assert.assertTrue(quickAddPage.isOpened(), "[Quick Add Page] is not opened after taping quick add button");

        quickAddPage.typeNutrient(1, NutrientsQuickAdd.FAT);
        quickAddPage.typeNutrient(1, NutrientsQuickAdd.CARBS);
        quickAddPage.typeNutrient(1, NutrientsQuickAdd.PROTEIN);

        Assert.assertEquals(quickAddPage.getCalories(), 17, "[Quick Add Page] Calories value is not equals 17 after typing values: " +
                "1 to fat field, 1 to carbohydrates field, 1 to protein field");
    }
}