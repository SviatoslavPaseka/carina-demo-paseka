package com.ui_katalogkit.ios.ToolbarsPages.ToolbarItems;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.ToolbarsPagesBase.ToolbarItems.DefaultToolbarBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = DefaultToolbarBase.class)
public class DefaultToolbar extends DefaultToolbarBase {

    public DefaultToolbar(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Default Toolbar']")
    private ExtendedWebElement pageName;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Delete']")
    private ExtendedWebElement deleteButton;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Action']")
    private ExtendedWebElement actionButton;


    @Override
    public boolean isOpened() {
        return pageName.isElementPresent(3);
    }

    @Override
    public void clickDeleteButton(){
        deleteButton.click();
    }

    @Override
    public void clickActionButton(){
        actionButton.click();
    }
}