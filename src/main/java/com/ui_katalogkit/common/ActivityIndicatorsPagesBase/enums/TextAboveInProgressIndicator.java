package com.ui_katalogkit.common.ActivityIndicatorsPagesBase.enums;

public enum TextAboveInProgressIndicator {
    DEFAULT("DEFAULT"), TINTED("TINTED");

    private String value;

    TextAboveInProgressIndicator(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
