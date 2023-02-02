package com.mfp.common;

import com.mfp.common.enums.MenuButton;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class DiaryPageBase extends AbstractPage {
    public DiaryPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract AbstractPage openPageInMenu (MenuButton menuButton);
}
