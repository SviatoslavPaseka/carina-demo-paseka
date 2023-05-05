package com.ui_katalogkit.common.DatePickerPagesBase;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors.DateSelectPageBase;
import com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors.TimeSelectPageBase;
import com.ui_katalogkit.common.ParentPageBase;
import org.openqa.selenium.WebDriver;

public abstract class DatePickerPageBase extends ParentPageBase {
    public DatePickerPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract DateSelectPageBase clickDateButton();

    public abstract TimeSelectPageBase clickTimeButton();
}
