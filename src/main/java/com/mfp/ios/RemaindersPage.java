package com.mfp.ios;

import com.mfp.common.QuickAddPageBase;
import com.mfp.common.RemaindersPageBase;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = RemaindersPageBase.class)
public class RemaindersPage extends RemaindersPageBase {
    public RemaindersPage(WebDriver driver) {
        super(driver);
    }
}
