package com.mfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class QuickAddPageBase extends AbstractPage {
    public QuickAddPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeFat(int value);

    public abstract void typeCarbohydrates(int value);

    public abstract void typeProtein(int value);

    public abstract int getCaloriesInteger();

    public abstract boolean isOpened();
}
