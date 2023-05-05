package com.ui_katalogkit.ios.ButtonsPages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.ButtonsPagesBase.ButtonsPageBase;
import com.ui_katalogkit.common.ButtonsPagesBase.enums.DescriptionsButton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ButtonsPageBase.class)
public class ButtonsPage extends ButtonsPageBase {
    public ButtonsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Buttons']")
    private ExtendedWebElement pageName;

    @FindBy(xpath = "//XCUIElementTypeOther[@name='%s'][@accessible='true']")
    private ExtendedWebElement descriptionText;

    @FindBy(xpath = "(//XCUIElementTypeOther[@name='%s'][@accessible='false']/following-sibling::XCUIElementTypeCell/child::XCUIElementTypeButton)[1]")
    private ExtendedWebElement button;

    @Override
    public boolean isOpened() {
        return pageName.isElementPresent();
    }

    @Override
    public String getTextFromDescriptionTextByDescription(DescriptionsButton descriptionsButton){
        return descriptionText.format(descriptionsButton.getValue()).getText();
    }

    @Override
    public String getButtonByDescription(DescriptionsButton descriptionsButton){
        return button.format(descriptionsButton.getValue()).getText();
    }
}
