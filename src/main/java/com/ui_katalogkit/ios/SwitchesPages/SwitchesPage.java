package com.ui_katalogkit.ios.SwitchesPages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.SwitchesPagesBase.SwitchesPageBase;
import com.ui_katalogkit.common.SwitchesPagesBase.enums.SwitcherName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = SwitchesPageBase.class)
public class SwitchesPage extends SwitchesPageBase {
    public SwitchesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Switches']")
    private ExtendedWebElement pageName;

    @FindBy(xpath = "//XCUIElementTypeOther[@name='%s'][@accessible='true']")
    private ExtendedWebElement textAboveSwitcher;

    @FindBy(xpath = "//XCUIElementTypeOther[@name='%s'][@accessible='false']/following-sibling::XCUIElementTypeCell[1]/child::XCUIElementTypeSwitch")
    private ExtendedWebElement switcher;

    @Override
    public boolean isOpened() {
        return pageName.isElementPresent();
    }

    @Override
    public String getTextFromTextAboveSwitcher(SwitcherName switcherName){
        return textAboveSwitcher.format(switcherName.getValue()).getText();
    }

    @Override
    public void clickSwitcher(SwitcherName switcherName){
        switcher.format(switcherName.getValue()).click();
    }

    @Override
    public boolean switcherStatus(SwitcherName switcherName){
        return switcher.format(switcherName.getValue()).getAttribute("value").equals("1");
    }
}