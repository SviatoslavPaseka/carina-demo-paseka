package com.mfp.common;

import com.mfp.common.enums.MenuButton;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class DashboardPageBase extends AbstractPage {
    public DashboardPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract AbstractPage openPageInMenu (MenuButton menuButton);
}
