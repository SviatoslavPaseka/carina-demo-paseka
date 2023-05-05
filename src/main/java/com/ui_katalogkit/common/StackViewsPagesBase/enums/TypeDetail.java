package com.ui_katalogkit.common.StackViewsPagesBase.enums;

public enum TypeDetail {
    DETAIL("Detail"), FURTHER_DETAIL("Further Detail");

    private String value;

    public String getValue() {
        return value;
    }

    TypeDetail(String value) {
        this.value = value;
    }
}