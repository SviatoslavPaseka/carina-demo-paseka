package com.ui_katalogkit.ios;


import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.ActivityIndicatorsPageBase;
import com.ui_katalogkit.common.UiCatalogPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ActivityIndicatorsPageBase.class)
public class ActivityIndicatorsPage extends ActivityIndicatorsPageBase {
    public ActivityIndicatorsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Activity Indicators\"]")
    private ExtendedWebElement pageName;

    @Override
    public boolean isOpened() {
        return pageName.isElementPresent();
    }
}
