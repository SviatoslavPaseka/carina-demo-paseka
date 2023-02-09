package com.mfp.ios;

import com.mfp.common.DashboardPageBase;
import com.mfp.common.MFPCommonPageBase;
import com.mfp.common.enums.BottomBarButton;
import com.qaprosoft.carina.core.foundation.exception.NotImplementedException;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = DashboardPageBase.class)
public class DashboardPage extends DashboardPageBase {

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        throw new NotImplementedException();
    }

}
