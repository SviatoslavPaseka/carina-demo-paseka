package com.mfp.ios;

import com.mfp.common.DashboardPageBase;
import com.mfp.common.MFPCommonPageBase;
import com.mfp.common.UserTutorialPageBase;
import com.qaprosoft.carina.core.foundation.exception.NotImplementedException;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = UserTutorialPageBase.class)
public class UserTutorialPage extends UserTutorialPageBase {

    public UserTutorialPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public DashboardPageBase clickCloseButton(){
        throw new NotImplementedException();
    }

    @Override
    public boolean isOpened(){
        throw new NotImplementedException();
    }
}