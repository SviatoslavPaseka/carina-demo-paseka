package com.mfp.ios;

import com.mfp.common.MFPLogInPageBase;
import com.mfp.common.UserTutorialPageBase;
import com.qaprosoft.carina.core.foundation.exception.NotImplementedException;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MFPLogInPageBase.class)
public class MFPLogInPage extends MFPLogInPageBase {

    public MFPLogInPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeEmail(String email) {
        throw new NotImplementedException();
    }

    @Override
    public void typePassword(String password) {
        throw new NotImplementedException();
    }

    @Override
    public UserTutorialPageBase clickLoginButton() {
        throw new NotImplementedException();
    }

    @Override
    public boolean isOpened(){
        throw new NotImplementedException();
    }

    @Override
    public boolean isLoginButtonEnabled(){
        throw new NotImplementedException();
    }
}