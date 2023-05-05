package com.ui_katalogkit.common.SearchPagesBase.enums;

public enum Scopes {
    ONE("One"), TWO("Two");

    private String value;

    public String getValue() {
        return value;
    }

    Scopes(String value) {
        this.value = value;
    }
}