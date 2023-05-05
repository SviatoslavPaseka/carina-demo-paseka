package com.ui_katalogkit.ios.ProgressViewsPages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.ProgressViewsPagesBase.ProgressViewsPageBase;
import com.ui_katalogkit.common.ProgressViewsPagesBase.enums.NameOfProgressBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ProgressViewsPageBase.class)
public class ProgressViewsPage extends ProgressViewsPageBase {
    public ProgressViewsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Progress Views']")
    private ExtendedWebElement pageName;

    @FindBy(xpath = "(//XCUIElementTypeOther[@name='%s'][@accessible='true'])")
    private ExtendedWebElement nameOfProgressBar;

    @FindBy(xpath = "((//XCUIElementTypeOther[@name='%s'][@accessible='false'])/following-sibling::XCUIElementTypeCell[1]/child::*[@name='Progress']")
    private ExtendedWebElement progressBar;

    @Override
    public boolean isOpened() {
        return pageName.isElementPresent();
    }

    @Override
    public String getTextFromDescription(NameOfProgressBar description){
        return nameOfProgressBar.format(description.getValue()).getText();
    }

    @Override
    public String getPercentOfProgressBar(NameOfProgressBar description){
        return progressBar.format(description.getValue()).getAttribute("value");
    }
}