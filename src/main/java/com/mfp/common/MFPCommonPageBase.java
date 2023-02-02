package com.mfp.common;

import com.mfp.common.enums.BottomBarButton;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class MFPCommonPageBase extends AbstractPage {
    public MFPCommonPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isBottomNavigationBarPresent();

    public abstract AbstractPage clickMenuIcon(BottomBarButton bottomBarButton);
}
