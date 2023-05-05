package com.ui_katalogkit.ios.ToolbarsPages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.ParentPageBase;
import com.ui_katalogkit.common.ToolbarsPagesBase.ToolbarsPageBase;
import com.ui_katalogkit.common.ToolbarsPagesBase.enums.ToolbarName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ToolbarsPageBase.class)
public class ToolbarsPage extends ToolbarsPageBase {
    public ToolbarsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Toolbars']")
    private ExtendedWebElement pageName;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='%s']")
    private ExtendedWebElement toolbarItem;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='%sToolbarViewController']")
    private ExtendedWebElement toolbarDescription;

    @Override
    public boolean isOpened() {
        return pageName.isElementPresent();
    }

    @Override
    public String getTextToolbarDescription(ToolbarName toolbarName){
        return toolbarDescription.format(toolbarName.getValue()).getText();
    }

    @Override
    public String getTextToolbarItem(ToolbarName toolbarName){
        return toolbarItem.format(toolbarName.getValue()).getText();
    }

    @Override
    public ParentPageBase clickToolbarItem(ToolbarName toolbarName){
        toolbarItem.format(toolbarName.getValue()).click();
        return initPage(getDriver(), toolbarName.getPageClass());
    }
}