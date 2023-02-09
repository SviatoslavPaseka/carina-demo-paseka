package com.mfp.ios;

import com.mfp.common.MFPCommonPageBase;
import com.mfp.common.NewsfeedPageBase;
import com.mfp.common.enums.BottomBarButton;
import com.qaprosoft.carina.core.foundation.exception.NotImplementedException;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = NewsfeedPageBase.class)
public class NewsfeedPage extends NewsfeedPageBase {
    public NewsfeedPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened(){
        throw new NotImplementedException();
    }
}
