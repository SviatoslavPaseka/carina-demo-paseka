package com.mfp.android;

import com.mfp.common.constants.IConstants;
import com.mfp.common.MFPCommonPageBase;
import com.mfp.common.PlansPageBase;
import com.mfp.common.enums.BottomBarButton;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = PlansPageBase.class)
public class PlansPage extends PlansPageBase {

    public PlansPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android:id/toolbar']" +
            "/child::*[contains(@text, '%s')]")
    private ExtendedWebElement title;

    @Override
    public boolean isOpened(){
        return title.format(BottomBarButton.PLANS.getValueInId()).isElementPresent()
                && initPage(getDriver(), MFPCommonPageBase.class)
                .getBottomNavigationBar().isBottomNavBarPresent();
    }
}
