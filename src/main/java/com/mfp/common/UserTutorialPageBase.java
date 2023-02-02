package com.mfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class UserTutorialPageBase extends AbstractPage {

    public UserTutorialPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickCloseButton();
}
