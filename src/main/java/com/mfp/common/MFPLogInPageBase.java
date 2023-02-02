package com.mfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class MFPLogInPageBase extends AbstractPage {
    public MFPLogInPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeEmail(String email);
    public abstract void typePassword(String password);
    public abstract void clickLoginButton();

    public abstract UserTutorialPageBase defaultLogin();
}
