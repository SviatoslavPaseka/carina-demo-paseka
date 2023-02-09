package com.mfp;

import com.mfp.common.*;
import com.mfp.common.constants.IConstants;
import com.mfp.common.enums.BottomBarButton;
import com.mfp.common.enums.CheckingCheckbox;
import com.mfp.common.enums.CustomDashboardButtons;
import com.mfp.common.enums.NutrientsCustomSummary;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.report.testrail.TestRailCases;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomSummaryPageTest implements IAbstractTest, IMobileUtils {
    @Test()
    @MethodOwner(owner = "spaseka", platform = "android")
    @TestRailCases(testCasesId = "4")
    public void customSummaryPageValidationTest(){
        MFPCommonPageBase mfpCommonPage = initPage(getDriver(), MFPCommonPageBase.class);

        DashboardPageBase dashboardPage = mfpCommonPage.defaultLogin();
        Assert.assertTrue(dashboardPage.isOpened(), "[DASHBOARD PAGE] is not opened after logining");

        DiaryPageBase diaryPage = (DiaryPageBase) mfpCommonPage.getBottomNavigationBar().clickMenuIcon(BottomBarButton.DIARY);
        Assert.assertTrue(diaryPage.isOpened(), "[DIARY PAGE] is not opened after taping on Diary button on bottom navigation bar");

         CustomDashboardPageBase customDashboardPage = diaryPage.clickMoreOptionsForDashboard();
        Assert.assertTrue(customDashboardPage.isOpened(), "[CUSTOM DASHBOARD] is not opened");
        CustomSummaryPageBase customSummaryPage = (CustomSummaryPageBase) customDashboardPage
                            .clickOnOptionOfDashboardByName(CustomDashboardButtons.CUSTOM);
        Assert.assertTrue(customSummaryPage.isOpened(), "[CUSTOM SUMMARY] is not opened");

        Assert.assertTrue(customSummaryPage.isNutrientCheckboxChecked(NutrientsCustomSummary.FAT), "[CUSTOM SUMMARY] is not checked Fat by default");
        Assert.assertTrue(customSummaryPage.isNutrientCheckboxChecked(NutrientsCustomSummary.CARBOHYDRATES), "[CUSTOM SUMMARY] is not checked Carbs by default");
        Assert.assertTrue(customSummaryPage.isNutrientCheckboxChecked(NutrientsCustomSummary.PROTEIN), "[CUSTOM SUMMARY] is not checked Protein by default");
    }

    @Test()
    @MethodOwner(owner = "spaseka", platform = "android")
    @TestRailCases(testCasesId = "6")
    public void customSummaryNutrientsValidationTest(){
        MFPCommonPageBase mfpCommonPage = initPage(getDriver(), MFPCommonPageBase.class);

        DashboardPageBase dashboardPage = mfpCommonPage.defaultLogin();
        Assert.assertTrue(dashboardPage.isOpened(), "[DASHBOARD PAGE] is not opened after logining");

        DiaryPageBase diaryPage = (DiaryPageBase) mfpCommonPage.getBottomNavigationBar().clickMenuIcon(BottomBarButton.DIARY);
        Assert.assertTrue(diaryPage.isOpened(), "[DIARY PAGE] is not opened after taping on Diary button on bottom navigation bar");

        CustomDashboardPageBase customDashboardPage = diaryPage.clickMoreOptionsForDashboard();
        Assert.assertTrue(customDashboardPage.isOpened(), "[CUSTOM DASHBOARD] is not opened");
        CustomSummaryPageBase customSummaryPage = (CustomSummaryPageBase) customDashboardPage
                .clickOnOptionOfDashboardByName(CustomDashboardButtons.CUSTOM);
        Assert.assertTrue(customSummaryPage.isOpened(), "[CUSTOM SUMMARY] is not opened");

        Assert.assertEquals(customSummaryPage.getTextFromSelectedInfo(), IConstants.THREE_NUTRIENTS_SELECTED, "[CUSTOM SUMMARY] is not equals");
        Assert.assertTrue(customSummaryPage.isAcceptButtonEnabled(), "[CUSTOM SUMMARY] accept button is not enabled after checking 3 checkbox");

        customSummaryPage.checkNutrientCheckbox(NutrientsCustomSummary.FAT, CheckingCheckbox.UNCHECK);

        Assert.assertEquals(customSummaryPage.getTextFromSelectedInfo(), IConstants.TWO_NUTRIENT_SELECTED, "[CUSTOM SUMMARY] is not equals");
        Assert.assertFalse(customSummaryPage.isAcceptButtonEnabled(), "[CUSTOM SUMMARY] accept button is enabled after checking 2 checkbox");

        customSummaryPage.checkNutrientCheckbox(NutrientsCustomSummary.FAT, CheckingCheckbox.CHECK);
        customSummaryPage.checkNutrientCheckbox(NutrientsCustomSummary.SATURATED_FAT, CheckingCheckbox.CHECK);

        Assert.assertEquals(customSummaryPage.getTextFromSelectedInfo(), IConstants.FOUR_NUTRIENTS_SELECTED, "[CUSTOM SUMMARY] is not equals");
        Assert.assertFalse(customSummaryPage.isAcceptButtonEnabled(), "[CUSTOM SUMMARY] accept button is enabled after checking 4 checkbox");
    }
}