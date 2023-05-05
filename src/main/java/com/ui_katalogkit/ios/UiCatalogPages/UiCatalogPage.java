package com.ui_katalogkit.ios.UiCatalogPages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.ParentPageBase;
import com.ui_katalogkit.common.UiCatalogPagesBase.UiCatalogPageBase;
import com.ui_katalogkit.common.UiCatalogPagesBase.enums.UiKitCatalogNames;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = UiCatalogPageBase.class)
public class UiCatalogPage extends UiCatalogPageBase implements IMobileUtils {
    public UiCatalogPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='UIKitCatalog']")
    private ExtendedWebElement pageName;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='%s']")
    private ExtendedWebElement elementName;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='%s']/following-sibling::XCUIElementTypeStaticText")
    private ExtendedWebElement elementSubText;

    @Override
    public String getTextFromPageName() {
        return pageName.getText();
    }

    @Override
    public boolean isOpened() {
        return pageName.isElementPresent();
    }

    @Override
    public ParentPageBase tapToElementByName(UiKitCatalogNames names){
        swipe(elementName.format(names.getElementName()), Direction.UP);
        elementName.format(names.getElementName()).click();
        return initPage(getDriver(), names.getPageClass());
    }

    @Override
    public String getTextFromElementSubText(UiKitCatalogNames names){
        return elementSubText.getText();
    }

    @Override
    public String getTextFromElementName(UiKitCatalogNames names){
        return elementName.getText();
    }
}