package com.mfp.android;

import com.mfp.common.DiaryPageBase;
import com.mfp.common.IConstants;
import com.mfp.common.MFPCommonPageBase;
import com.mfp.common.PlansPageBase;
import com.mfp.common.enums.BottomBarButton;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = DiaryPageBase.class)
public class DiaryPage extends DiaryPageBase {

    public DiaryPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android:id/toolbar']" +
            "/child::*[contains(@text, '%s')]")
    private ExtendedWebElement title;

    @Override
    public boolean isOpened(){
        return title.format(IConstants.DIARY).isElementPresent()
                && initPage(getDriver(), MFPCommonPageBase.class)
                .getBottomNavigationBar().isBottomNavBarPresent();
    }
}
