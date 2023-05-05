package com.ui_katalogkit.common.SwitchesPagesBase.enums;

public enum SwitcherName {
    DEFAULT("DEFAULT"), TINTED("TINTED");

    private String value;

    public String getValue() {
        return value;
    }

    SwitcherName(String value) {
        this.value = value;
    }
}