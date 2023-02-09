package com.mfp.common;

import com.mfp.common.enums.CustomDashboardButtons;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CustomDashboardPageBase extends AbstractPage {
    public CustomDashboardPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isOptionOfDashboardPresent(CustomDashboardButtons customDashboardButtons);

    public abstract AbstractPage clickOnOptionOfDashboardByName(CustomDashboardButtons customDashboardButton);

    public abstract boolean isOpened();
}
