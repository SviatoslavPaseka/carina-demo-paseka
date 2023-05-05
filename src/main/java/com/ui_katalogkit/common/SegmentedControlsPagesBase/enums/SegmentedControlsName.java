package com.ui_katalogkit.common.SegmentedControlsPagesBase.enums;

public enum SegmentedControlsName {
    CHECK("Check"), SEARCH("Search"), TOOLS("Tools"),
    AIRPLANE("Airplane"), GIFT("Gift"), BURST("Burst");

    private String value;

    SegmentedControlsName(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}