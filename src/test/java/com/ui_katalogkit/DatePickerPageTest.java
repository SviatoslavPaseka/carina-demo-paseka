package com.ui_katalogkit;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.report.testrail.TestRailCases;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors.DateSelectPageBase;
import com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors.HiddenDateSelectPageBase;
import com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors.TimeSelectPageBase;
import com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors.enums.ChangerArrows;
import com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors.enums.DaysInDatePicker;
import com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors.enums.HourSelectTime;
import com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors.enums.MinuteSelectTime;
import com.ui_katalogkit.common.DatePickerPagesBase.DatePickerPageBase;
import com.ui_katalogkit.common.UiCatalogPagesBase.UiCatalogPageBase;
import com.ui_katalogkit.common.UiCatalogPagesBase.enums.UiKitCatalogNames;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;
import java.time.Month;

public class DatePickerPageTest implements IAbstractTest, IMobileUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test()
    @MethodOwner(owner = "spaseka", platform = "IOS")
    @TestRailCases(testCasesId = "1")
    public void usingDatePickerTest() {
        LOGGER.info("Start test");
        UiCatalogPageBase uiCatalogPage = initPage(getDriver(), UiCatalogPageBase.class);

        DatePickerPageBase datePickerPage = (DatePickerPageBase) uiCatalogPage.tapToElementByName(UiKitCatalogNames.DATE_PICKER);

//        DateSelectPageBase dateSelectPage = datePickerPage.clickDateButton();
//
//
//        dateSelectPage.clickChangeMonth(ChangerArrows.NEXT);
//
//        dateSelectPage.clickOnDayNumber(DaysInDatePicker.ONE);
//
//        HiddenDateSelectPageBase hiddenDateSelectPage = dateSelectPage.comeToYearPicker();
//
//        hiddenDateSelectPage.changeMonth(Month.APRIL);
//
//        dateSelectPage = hiddenDateSelectPage.hideYearPicker();
//
//        datePickerPage = dateSelectPage.clickDismissButton();

        TimeSelectPageBase timeSelectPage = datePickerPage.clickTimeButton();

        timeSelectPage.setHour(HourSelectTime.FIVE);
        timeSelectPage.setMinute(MinuteSelectTime.TWENTY_EIGHT);

    }
}