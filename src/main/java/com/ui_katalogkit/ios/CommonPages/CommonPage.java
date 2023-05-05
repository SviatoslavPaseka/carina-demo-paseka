package com.ui_katalogkit.ios.CommonPages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.CommonPagesBase.CommonPageBase;
import com.ui_katalogkit.common.UiCatalogPagesBase.UiCatalogPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CommonPageBase.class)
public class CommonPage extends CommonPageBase {
    public CommonPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"UIKitCatalog\"]")
    private ExtendedWebElement backButton;

    @Override
    public UiCatalogPageBase tapBackButton(){
        backButton.click();
        return initPage(getDriver(), UiCatalogPageBase.class);
    }
    @Override
    public boolean isOpened() {
        return backButton.isElementPresent();
    }
}