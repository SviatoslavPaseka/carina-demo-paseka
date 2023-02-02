package com.mfp.android;

import com.mfp.common.DashboardPageBase;
import com.mfp.common.MorePageBase;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MorePageBase.class)
public class MorePage extends MorePageBase {

    public MorePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "com.myfitnesspal.android:id/image")
    private ExtendedWebElement profileImage;
    @Override
    public boolean isOpened(){
        return profileImage.isElementPresent();
    }
}
