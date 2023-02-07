package com.mfp.common;

import com.mfp.common.enums.ButtonInMoreMenu;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class MoreMenuPageBase extends AbstractPage {
    public MoreMenuPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract AbstractPage clickOnButton(ButtonInMoreMenu moreMenu);

    public abstract boolean isButtonPresent(ButtonInMoreMenu ButtonsInMoreMenu);

    public abstract boolean isOpened();
}
