package com.mfp.common.componentsBase;

import com.mfp.common.enums.MenuButton;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;

public abstract class BottomNavigationMenuBase extends AbstractUIObject {

    public BottomNavigationMenuBase(WebDriver driver) {
        super(driver);
    }


    public abstract AbstractPage clickMenuIcon (MenuButton menuButton);
}
