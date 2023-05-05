package com.ui_katalogkit.common.DatePickerPagesBase.DateAndTimeSelectors.enums;

public enum ChangerArrows {
    PREVIOUS("Previous Month"), NEXT("Next Month");

    private String value;

    ChangerArrows(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
