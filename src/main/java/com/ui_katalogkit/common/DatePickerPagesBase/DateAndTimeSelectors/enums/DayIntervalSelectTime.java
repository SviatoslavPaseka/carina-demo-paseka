package com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors.enums;

public enum DayIntervalSelectTime {
    AM("AM"), PM("PM");

    private String value;

    DayIntervalSelectTime(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
