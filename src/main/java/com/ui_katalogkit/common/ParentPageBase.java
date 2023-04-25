package com.ui_katalogkit.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ParentPageBase extends AbstractPage {
    public ParentPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isOpened();
}
