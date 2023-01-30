package com.qaprosoft.carina.demo.mobile.gui.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class NavigationMenuPageBase extends AbstractPage {

    public NavigationMenuPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract AbstractPage clickMenuButton(NavMenuButton navMenuButton);

    public abstract boolean isOpened();
}
