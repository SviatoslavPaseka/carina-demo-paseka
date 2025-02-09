package com.mfp.common;

import com.mfp.common.enums.NameOfMealDiary;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class DiaryPageBase extends AbstractPage {
    public DiaryPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isOpened();

    public abstract Integer getGoalCaloriesInteger();

    public abstract Integer getRemainingCaloriesInteger();

    public abstract DiaryPageBase clearUserDiary();

    public abstract boolean isMoreButtonByNamePresent(NameOfMealDiary nameOfMealDiary);

    public abstract MoreMenuPageBase clickMoreButtonByName(NameOfMealDiary nameOfMealDiary);

    public abstract boolean isMoreOptionsForDashboardPresent();

    public abstract CustomDashboardPageBase clickMoreOptionsForDashboard();
}
