package com.ui_katalogkit.ios.ActivityIndicatorsPages;


import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.ActivityIndicatorsPagesBase.ActivityIndicatorsPageBase;
import com.ui_katalogkit.common.ActivityIndicatorsPagesBase.enums.ActivityIndicatorTypes;
import com.ui_katalogkit.common.ActivityIndicatorsPagesBase.enums.TextAboveInProgressIndicator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ActivityIndicatorsPageBase.class)
public class ActivityIndicatorsPage extends ActivityIndicatorsPageBase {
    public ActivityIndicatorsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Activity Indicators']")
    private ExtendedWebElement pageName;

    @FindBy(xpath = "//XCUIElementTypeOther[@name='%s'][@accessible='true']")
    private ExtendedWebElement textAboveProgressIndicator;

    @FindBy(xpath = "//XCUIElementTypeOther[@name='TINTED'][@accessible='false']/preceding-sibling::XCUIElementTypeCell" +
            "/child::XCUIElementTypeActivityIndicator[@index='%s']")
    private ExtendedWebElement defaultInProgressIndicator;

    @FindBy(xpath = "//XCUIElementTypeOther[@name='TINTED'][@accessible='false']/following-sibling::XCUIElementTypeCell" +
            "/child::XCUIElementTypeActivityIndicator[@index='%s']")
    private ExtendedWebElement tintedInProgressIndicator;


    @Override
    public boolean isOpened() {
        return pageName.isElementPresent();
    }

    @Override
    public boolean isDefaultInProgressIndicatorEnabled(ActivityIndicatorTypes activityIndicatorType){
        return Boolean.parseBoolean(defaultInProgressIndicator.format(activityIndicatorType.getNumber()).getAttribute("enabled"));
    }

    @Override
    public boolean isTintedInProgressIndicatorEnabled(ActivityIndicatorTypes activityIndicatorType){
        return Boolean.parseBoolean(tintedInProgressIndicator.format(activityIndicatorType.getNumber()).getAttribute("enabled"));
    }

    @Override
    public String getTextFromTextAboveInProgressIndicator(TextAboveInProgressIndicator textAboveInProgressIndicator){
        return textAboveProgressIndicator.format(textAboveInProgressIndicator.getValue()).getText();
    }
}
