package com.ui_katalogkit.ios.DatePickerPages.DateAndTimeSelectors;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors.TimeSelectPageBase;
import com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors.enums.DayIntervalSelectTime;
import com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors.enums.HourSelectTime;
import com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors.enums.MinuteSelectTime;
import com.ui_katalogkit.common.DatePickerPagesBase.DatePickerPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = TimeSelectPageBase.class)
public class TimeSelectPage extends TimeSelectPageBase {
    public TimeSelectPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypePickerWheel[1]")
    private ExtendedWebElement hour;

    @FindBy(xpath = "//XCUIElementTypePickerWheel[2]")
    private ExtendedWebElement minute;

    @FindBy(xpath = "//XCUIElementTypePickerWheel[3]")
    private ExtendedWebElement dayInterval;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='PopoverDismissRegion']")
    private ExtendedWebElement dismissButton;

    @Override
    public boolean isOpened() {
        return hour.isElementPresent(3) && minute.isElementPresent(3);
    }

    @Override
    public void setHour(HourSelectTime hourSelectTime){
        hour.type(hourSelectTime.getValue());
    }

    @Override
    public void setMinute(MinuteSelectTime minuteSelectTime){
        minute.type(minuteSelectTime.getValue());
    }

    @Override
    public void setDayInterval(DayIntervalSelectTime dayIntervalSelectTime){
        dayInterval.type(dayIntervalSelectTime.getValue());
    }

    @Override
    public String getHourText(){
        return hour.getText();
    }

    @Override
    public String getMinuteText(){
        return minute.getText();
    }

    @Override
    public String getDayIntervalText(){
        return dayInterval.getText();
    }

    @Override
    public DatePickerPageBase clickDismissButton(){
        dismissButton.click();
        return initPage(getDriver(), DatePickerPageBase.class);
    }
}