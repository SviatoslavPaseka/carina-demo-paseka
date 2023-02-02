package com.mfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class NewsfeedPageBase extends AbstractPage {
    public NewsfeedPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isOpened();
}
