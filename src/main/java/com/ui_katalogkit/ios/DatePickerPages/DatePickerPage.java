package com.ui_katalogkit.ios.DatePickerPages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors.DateSelectPageBase;
import com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors.TimeSelectPageBase;
import com.ui_katalogkit.common.DatePickerPagesBase.DatePickerPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = DatePickerPageBase.class)
public class DatePickerPage extends DatePickerPageBase {
    public DatePickerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Date Picker']")
    private ExtendedWebElement pageName;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Date and Time Picker']/child::XCUIElementTypeButton[1]")
    private ExtendedWebElement dateButton;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Date and Time Picker']/child::XCUIElementTypeButton[2]")
    private ExtendedWebElement timeButton;

    @FindBy(xpath = "//XCUIElementTypeDatePicker/following-sibling::XCUIElementTypeStaticText")
    private ExtendedWebElement textWithDateAndTime;

    @Override
    public boolean isOpened() {
        return pageName.isElementPresent();
    }

    @Override
    public DateSelectPageBase clickDateButton (){
        dateButton.click();
        return initPage(getDriver(), DateSelectPageBase.class);
    }

    @Override
    public TimeSelectPageBase clickTimeButton (){
        timeButton.click();
        return initPage(getDriver(), TimeSelectPageBase.class);
    }
}