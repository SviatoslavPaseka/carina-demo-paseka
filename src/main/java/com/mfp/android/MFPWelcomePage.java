package com.mfp.android;

import com.mfp.common.MFPLogInPageBase;
import com.mfp.common.MFPWelcomePageBase;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MFPWelcomePageBase.class)
public class MFPWelcomePage extends MFPWelcomePageBase{

    @FindBy(id = "com.myfitnesspal.android:id/buttonLogIn")
    private ExtendedWebElement loginButton;

    @FindBy(id = "com.myfitnesspal.android:id/buttonSignUp")
    private ExtendedWebElement signupButton;


    public MFPWelcomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public MFPLogInPageBase clickLoginButton() {
        loginButton.click();
        return initPage(getDriver(), MFPLogInPageBase.class);
    }

    @Override
    public boolean isOpened() {
        return loginButton.isElementPresent()
                && signupButton.isElementPresent();
    }
}
