package com.mfp.android;

import com.mfp.common.DashboardPageBase;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = DashboardPageBase.class)
public class DashboardPage extends DashboardPageBase {

    public DashboardPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//android.view.View[@content-desc='User avatar']")
    private ExtendedWebElement userAvatar;

    @FindBy(id = "com.myfitnesspal.android:id/progressPleaseWait")
    private ExtendedWebElement waitingSpinner;
    @Override
    public boolean isOpened() {
        return userAvatar.isElementPresent()
                && !waitingSpinner.isElementPresent();
    }

}
