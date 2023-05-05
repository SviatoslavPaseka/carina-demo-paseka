package com.ui_katalogkit.ios.WebViewPages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.WebViewPagesBase.WebViewPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = WebViewPageBase.class)
public class WebViewPage extends WebViewPageBase {
    public WebViewPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Web View']")
    private ExtendedWebElement pageName;

    @FindBy(xpath = "//XCUIElementTypeOther[@name='This is HTML content inside a WKWebView .']")
    private ExtendedWebElement text;

    @Override
    public boolean isOpened() {
        return pageName.isElementPresent();
    }

    public String getText(){
        return text.getText();
    }
}
