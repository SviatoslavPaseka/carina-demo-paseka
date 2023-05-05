package com.ui_katalogkit.ios.TextViewPages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.TextViewPagesBase.TextViewPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = TextViewPageBase.class)
public class TextViewPage extends TextViewPageBase {
    public TextViewPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Text View\"]")
    private ExtendedWebElement pageName;

    @Override
    public boolean isOpened() {
        return pageName.isElementPresent();
    }
}
