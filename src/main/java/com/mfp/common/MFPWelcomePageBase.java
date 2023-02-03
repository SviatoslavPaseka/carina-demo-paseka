package com.mfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class MFPWelcomePageBase extends AbstractPage {
    public MFPWelcomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract MFPLogInPageBase clickLoginButton();

    public abstract boolean isOpened();
}
