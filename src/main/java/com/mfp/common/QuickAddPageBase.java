package com.mfp.common;

import com.mfp.common.enums.NutrientsQuickAdd;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class QuickAddPageBase extends AbstractPage {
    public QuickAddPageBase(WebDriver driver) {
        super(driver);
    }


    public abstract void typeNutrient(int value, NutrientsQuickAdd nutrient);

    public abstract int getCalories();

    public abstract boolean isOpened();
}
