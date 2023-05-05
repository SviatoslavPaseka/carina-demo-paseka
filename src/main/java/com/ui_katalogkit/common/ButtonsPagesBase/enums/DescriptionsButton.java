package com.ui_katalogkit.common.ButtonsPagesBase.enums;

public enum DescriptionsButton {
    SYSTEM_TEXT("SYSTEM (TEXT)"),
    SYSTEM_CONTACT_ADD("SYSTEM (CONTACT ADD)"),
    SYSTEM_DETAIL_DISCLOSURE("SYSTEM (DETAIL DISCLOSURE)"),
    IMAGE("IMAGE"),
    ATTRIBUTED_TEXT("ATTRIBUTED TEXT"),
    SYSTEM_SYMBOL("SYSTEM (SYMBOL)"),
    SYSTEM_TEXT_SYMBOL("SYSTEM (TEXT + SYMBOL)");

    private String value;

    DescriptionsButton(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
