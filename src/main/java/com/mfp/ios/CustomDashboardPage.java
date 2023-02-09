package com.mfp.ios;

import com.mfp.common.CustomDashboardPageBase;
import com.mfp.common.enums.CustomDashboardButtons;
import com.qaprosoft.carina.core.foundation.exception.NotImplementedException;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CustomDashboardPageBase.class)
public class CustomDashboardPage extends CustomDashboardPageBase {
    public CustomDashboardPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOptionOfDashboardPresent(CustomDashboardButtons customDashboardButtons){
        throw new NotImplementedException();
    }

    @Override
    public AbstractPage clickOnOptionOfDashboardByName(CustomDashboardButtons customDashboardButton){
        throw new NotImplementedException();
    }

    @Override
    public boolean isOpened(){
        throw new NotImplementedException();
    }

}