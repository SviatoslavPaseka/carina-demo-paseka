package com.mfp.ios;

import com.mfp.common.*;
import com.mfp.common.componentsBase.BottomNavigationBarBase;
import com.mfp.common.constants.IConstants;
import com.mfp.ios.components.BottomNavigationBar;
import com.qaprosoft.carina.core.foundation.exception.NotImplementedException;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MFPCommonPageBase.class)
public class MFPCommonPage extends MFPCommonPageBase {
    public MFPCommonPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public BottomNavigationBarBase getBottomNavigationBar() {
        throw new NotImplementedException();
    }

    @Override
    public DashboardPageBase login(String email, String password){
        throw new NotImplementedException();
    }

    @Override
    public DashboardPageBase defaultLogin(){
        throw new NotImplementedException();
    }
}
