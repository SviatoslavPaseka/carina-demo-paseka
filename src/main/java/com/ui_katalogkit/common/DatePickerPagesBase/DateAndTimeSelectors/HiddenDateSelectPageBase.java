package com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors;

import com.ui_katalogkit.common.DatePickerPagesBase.DatePickerPageBase;
import com.ui_katalogkit.common.ParentPageBase;
import org.openqa.selenium.WebDriver;

import java.time.Month;

public abstract class HiddenDateSelectPageBase extends ParentPageBase {
    public HiddenDateSelectPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract DateSelectPageBase hideYearPicker();

    public abstract void changeYear(int year);

    public abstract void changeMonth(Month month);

    public abstract String getYear();

    public abstract String getMonth();

    public abstract DatePickerPageBase clickDismissButton();
}