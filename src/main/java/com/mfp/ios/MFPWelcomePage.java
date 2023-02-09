package com.mfp.ios;

import com.mfp.common.MFPLogInPageBase;
import com.mfp.common.MFPWelcomePageBase;
import com.qaprosoft.carina.core.foundation.exception.NotImplementedException;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MFPWelcomePageBase.class)
public class MFPWelcomePage extends MFPWelcomePageBase{

    public MFPWelcomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public MFPLogInPageBase clickLoginButton() {
        throw new NotImplementedException();
    }

    @Override
    public boolean isOpened() {
        throw new NotImplementedException();
    }
}
