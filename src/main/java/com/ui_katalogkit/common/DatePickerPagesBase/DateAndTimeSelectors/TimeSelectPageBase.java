package com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors;

import com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors.enums.DayIntervalSelectTime;
import com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors.enums.HourSelectTime;
import com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors.enums.MinuteSelectTime;
import com.ui_katalogkit.common.DatePickerPagesBase.DatePickerPageBase;
import com.ui_katalogkit.common.ParentPageBase;
import org.openqa.selenium.WebDriver;

public abstract class TimeSelectPageBase extends ParentPageBase {
    public TimeSelectPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void setHour(HourSelectTime hourSelectTime);

    public abstract void setMinute(MinuteSelectTime minuteSelectTime);

    public abstract void setDayInterval(DayIntervalSelectTime dayIntervalSelectTime);

    public abstract String getHourText();

    public abstract String getMinuteText();

    public abstract String getDayIntervalText();

    public abstract DatePickerPageBase clickDismissButton();
}
