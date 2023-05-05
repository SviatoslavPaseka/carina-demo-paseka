package com.ui_katalogkit.common.TextFieldsPagesBase.enums;

public enum TextFieldName {
    DEFAULT("DEFAULT"), TINTED("TINTED"), SECURE("SECURE"),
    SPECIFIC_KEYBOARD("SPECIFIC KEYBOARD"), CUSTOM("CUSTOM"), SEARCH("SEARCH");

    private String value;

    public String getValue() {
        return value;
    }
    TextFieldName(String value) {
        this.value = value;
    }
}