package com.mfp.common;

import com.mfp.common.enums.NameOfMealDiary;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class DiaryPageBase extends AbstractPage {
    public DiaryPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isOpened();

    public abstract String getAmountCaloriesInMeal(NameOfMealDiary mealDiary);

    public abstract boolean isAllMealHasZEROCalories();

    public abstract String getGoalCaloriesText();

    public abstract String getRemainingCaloriesText();

    public abstract Integer getGoalCaloriesInteger();

    public abstract Integer getRemainingCaloriesInteger();
}
