package com.ui_katalogkit.ios.ToolbarsPages.ToolbarItems;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.ToolbarsPagesBase.ToolbarItems.TintedToolbarBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = TintedToolbarBase.class)
public class TintedToolbar extends TintedToolbarBase {

    public TintedToolbar(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Tinted Toolbar']")
    private ExtendedWebElement pageName;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Refresh']")
    private ExtendedWebElement refreshButton;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Share']")
    private ExtendedWebElement shareButton;

    @Override
    public boolean isOpened() {
        return pageName.isElementPresent(3);
    }

    @Override
    public void clickRefreshButton(){
        refreshButton.click();
    }

    @Override
    public void clickShareButton(){
        shareButton.click();
    }
}