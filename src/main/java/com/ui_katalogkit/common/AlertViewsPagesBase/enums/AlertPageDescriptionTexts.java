package com.ui_katalogkit.common.AlertViewsPagesBase.enums;

public enum AlertPageDescriptionTexts {
    ALERT_STYLE("ALERT STYLE"), ACTION_SHEET_STYLE("ACTION SHEET STYLE");

    private String value;

    AlertPageDescriptionTexts(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
