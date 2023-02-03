package com.mfp.android;

import com.mfp.common.DiaryPageBase;
import com.mfp.common.constants.IConstants;
import com.mfp.common.MFPCommonPageBase;
import com.mfp.common.enums.NameOfMealDiary;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = DiaryPageBase.class)
public class DiaryPage extends DiaryPageBase {

    public DiaryPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android:id/toolbar']" +
            "/child::*[contains(@text, '%s')]")
    private ExtendedWebElement title;

    @FindBy(xpath = "//*[@resource-id = 'com.myfitnesspal.android:id/txtSectionHeader'][@text = '%s']/following-sibling::*")
    private ExtendedWebElement amountCaloriesInMeal;

    @FindBy(id = "com.myfitnesspal.android:id/goal")
    private ExtendedWebElement goalCalories;

    @FindBy(id = "com.myfitnesspal.android:id/remaining_diary")
    private ExtendedWebElement remainingCalories;

    @Override
    public boolean isOpened(){
        return title.format(IConstants.DIARY).isElementPresent()
                && initPage(getDriver(), MFPCommonPageBase.class)
                .getBottomNavigationBar().isBottomNavBarPresent();
    }

    @Override
    public String getAmountCaloriesInMeal(NameOfMealDiary mealDiary){
        return amountCaloriesInMeal.format(mealDiary.getValue()).getText().trim();
    }

    @Override
    public boolean isAllMealHasZEROCalories(){
        boolean checker = true;
        for (NameOfMealDiary nameOfMealDiary: NameOfMealDiary.values()) {
            if (Integer.parseInt(getAmountCaloriesInMeal(nameOfMealDiary)) != 0){
                checker = false;
            }
        }
        return checker;
    }

    @Override
    public String getGoalCaloriesText(){
        return goalCalories.getText();
    }

    @Override
    public String getRemainingCaloriesText(){
        return remainingCalories.getText();
    }

    @Override
    public Integer getGoalCaloriesInteger(){
        return Integer.parseInt(StringUtils.remove(goalCalories.getText(), ','));
    }

    @Override
    public Integer getRemainingCaloriesInteger(){
        return Integer.parseInt(StringUtils.remove(remainingCalories.getText(), ','));
    }
}
