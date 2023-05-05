package com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors;

import com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors.enums.ChangerArrows;
import com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors.enums.DaysInDatePicker;
import com.ui_katalogkit.common.DatePickerPagesBase.DatePickerPageBase;
import com.ui_katalogkit.common.ParentPageBase;
import org.openqa.selenium.WebDriver;

public abstract class DateSelectPageBase extends ParentPageBase {
    public DateSelectPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract DateSelectPageBase clickChangeMonth(ChangerArrows arrow);

    public abstract HiddenDateSelectPageBase comeToYearPicker();

    public abstract String getTextFromDateText();

    public abstract String isDayNumberEnabled(DaysInDatePicker days);

    public abstract void clickOnDayNumber(DaysInDatePicker days);

    public abstract DatePickerPageBase clickDismissButton();
}
