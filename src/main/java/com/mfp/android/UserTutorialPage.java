package com.mfp.android;

import com.mfp.common.DashboardPageBase;
import com.mfp.common.MFPCommonPageBase;
import com.mfp.common.UserTutorialPageBase;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = UserTutorialPageBase.class)
public class UserTutorialPage extends UserTutorialPageBase {

    @FindBy(xpath = "//*[@resource-id = 'buttonExistingUserTutorial']/child::android.widget.Button")
    private ExtendedWebElement closeButton;

    public UserTutorialPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public DashboardPageBase clickCloseButton(){
        closeButton.click();
        return initPage(getDriver(), DashboardPageBase.class);
    }

    @Override
    public boolean isOpened(){
        return closeButton.isElementPresent()
                && initPage(getDriver(), MFPCommonPageBase.class)
                .getBottomNavigationBar().isBottomNavBarPresent();
    }
}