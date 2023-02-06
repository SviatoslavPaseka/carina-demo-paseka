package com.mfp.common.componentsBase;

import com.mfp.common.enums.BottomBarButton;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class BottomNavigationBarBase extends AbstractUIObject {
    public BottomNavigationBarBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public BottomNavigationBarBase(WebDriver driver) {
        super(driver);
    }


    public abstract AbstractPage clickMenuIcon (BottomBarButton barButton);

    public abstract boolean isBottomNavBarPresent();

    public abstract Boolean isBottomNavBarClickable(BottomBarButton bottomBarButton);
}
