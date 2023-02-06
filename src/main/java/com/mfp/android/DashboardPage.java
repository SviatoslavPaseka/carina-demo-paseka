package com.mfp.android;

import com.mfp.common.DashboardPageBase;
import com.mfp.common.MFPCommonPageBase;
import com.mfp.common.enums.BottomBarButton;
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

    @Override
    public boolean isOpened() {
        return userAvatar.isElementPresent()
                && !initPage(getDriver(), MFPCommonPageBase.class)
                    .getBottomNavigationBar().isBottomNavBarClickable(BottomBarButton.DASHBOARD);
    }

}
