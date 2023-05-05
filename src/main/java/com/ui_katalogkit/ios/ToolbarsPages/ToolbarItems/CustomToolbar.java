package com.ui_katalogkit.ios.ToolbarsPages.ToolbarItems;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.ToolbarsPagesBase.ToolbarItems.CustomToolbarBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CustomToolbarBase.class)
public class CustomToolbar extends CustomToolbarBase {

    public CustomToolbar(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Tinted Toolbar']")
    private ExtendedWebElement pageName;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='warning']")
    private ExtendedWebElement warningButton;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Button']")
    private ExtendedWebElement ButtonButton;

    @Override
    public boolean isOpened() {
        return pageName.isElementPresent(3);
    }

    @Override
    public void clickWarningButton(){
        warningButton.click();
    }

    @Override
    public void clickButtonButton(){
        ButtonButton.click();
    }
}