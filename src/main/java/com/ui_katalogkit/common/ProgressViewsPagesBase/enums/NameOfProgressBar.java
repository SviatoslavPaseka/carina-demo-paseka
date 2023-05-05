package com.ui_katalogkit.common.ProgressViewsPagesBase.enums;

public enum NameOfProgressBar {
    DEFAULT("DEFAULT"), BAR("BAR"), TINTED("TINTED");

    private String value;

    NameOfProgressBar(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}