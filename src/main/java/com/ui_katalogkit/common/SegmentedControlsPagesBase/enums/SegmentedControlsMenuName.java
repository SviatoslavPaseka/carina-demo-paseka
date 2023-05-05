package com.ui_katalogkit.common.SegmentedControlsPagesBase.enums;

public enum SegmentedControlsMenuName {
    DEFAULT("DEFAULT"), TINTED("TINTED"), CUSTOM_SEGMENTS("CUSTOM SEGMENTS"), CUSTOM_BACKGROUND("CUSTOM BACKGROUND");

    private String value;

    SegmentedControlsMenuName(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}