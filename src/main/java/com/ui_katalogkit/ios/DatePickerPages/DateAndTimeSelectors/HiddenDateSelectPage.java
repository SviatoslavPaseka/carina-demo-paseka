package com.ui_katalogkit.ios.DatePickerPages.DateAndTimeSelectors;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors.DateSelectPageBase;
import com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors.HiddenDateSelectPageBase;
import com.ui_katalogkit.common.DatePickerPagesBase.DatePickerPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.time.Month;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HiddenDateSelectPageBase.class)
public class HiddenDateSelectPage extends HiddenDateSelectPageBase {
    public HiddenDateSelectPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Hide year picker']")
    private ExtendedWebElement hideYearPicker;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Hide year picker']/following-sibling::XCUIElementTypeOther")
    private ExtendedWebElement dateText;

    @FindBy(xpath = "//XCUIElementTypePickerWheel[1]")
    private ExtendedWebElement monthPicker;

    @FindBy(xpath = "//XCUIElementTypePickerWheel[2]")
    private ExtendedWebElement yearPicker;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='PopoverDismissRegion']")
    private ExtendedWebElement dismissButton;

    @Override
    public boolean isOpened() {
        return hideYearPicker.isElementPresent(3) && dateText.isElementPresent(3);
    }

    @Override
    public DateSelectPageBase hideYearPicker(){
        hideYearPicker.click();
        return initPage(getDriver(), DateSelectPageBase.class);
    }

    @Override
    public void changeYear(int year) {
        if (year > 0 && year <= 10000){
            yearPicker.type(Integer.toString(year));
        }else{
            Assert.fail("[HIDDEN DATE SELECT] Year is not in range: [1, 10000]");
        }
    }

    @Override
    public void changeMonth(Month month){
        monthPicker.type(month.toString().substring(0,1).toUpperCase() + month.toString().substring(1).toLowerCase());
    }

    @Override
    public String getYear(){
        return yearPicker.getAttribute("value");
    }

    @Override
    public String getMonth(){
        return yearPicker.getAttribute("value");
    }

    @Override
    public DatePickerPageBase clickDismissButton(){
        dismissButton.click();
        return initPage(getDriver(), DatePickerPageBase.class);
    }
}