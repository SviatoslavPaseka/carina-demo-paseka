package com.ui_katalogkit.ios.DatePickerPages.DateAndTimeSelectors;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors.HiddenDateSelectPageBase;
import com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors.enums.ChangerArrows;
import com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors.DateSelectPageBase;
import com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors.enums.DaysInDatePicker;
import com.ui_katalogkit.common.DatePickerPagesBase.DatePickerPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = DateSelectPageBase.class)
public class DateSelectPage extends DateSelectPageBase {

    Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public DateSelectPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeButton[@name='%s']")
    private ExtendedWebElement arrowChangesMonth;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Show year picker']")
    private ExtendedWebElement showYearPicker;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Show year picker']/following-sibling::XCUIElementTypeOther")
    private ExtendedWebElement dateText;

    @FindBy(xpath = "//XCUIElementTypeImage[@name='Forward']")
    private ExtendedWebElement forward;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='%s']/parent::XCUIElementTypeOther/parent::XCUIElementTypeOther/parent::XCUIElementTypeButton")
    private ExtendedWebElement dayNumberText;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='%s']")
    private ExtendedWebElement dayNumber;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='PopoverDismissRegion']")
    private ExtendedWebElement dismissButton;

    @Override
    public boolean isOpened() {
        return showYearPicker.isElementPresent(3) && forward.isElementPresent(3);
    }

    @Override
    public DateSelectPageBase clickChangeMonth(ChangerArrows arrow){
        arrowChangesMonth.format(arrow.getValue()).click();
        return initPage(getDriver(), DateSelectPageBase.class);
    }

    @Override
    public HiddenDateSelectPageBase comeToYearPicker(){
        showYearPicker.click();
        return initPage(getDriver(), HiddenDateSelectPageBase.class);
    }

    @Override
    public String getTextFromDateText(){
        return dateText.getText();
    }

    @Override
    public String isDayNumberEnabled(DaysInDatePicker days){
        return dayNumberText.getAttribute("enabled");
    }

    @Override
    public void clickOnDayNumber(DaysInDatePicker days){

        dayNumber.format(days.getNumber()).click();
    }

    @Override
    public DatePickerPageBase clickDismissButton(){
        dismissButton.click();
        return initPage(getDriver(), DatePickerPageBase.class);
    }
}