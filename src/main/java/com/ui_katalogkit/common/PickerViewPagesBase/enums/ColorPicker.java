package com.ui_katalogkit.common.PickerViewPagesBase.enums;

public enum ColorPicker {
    RED("Red"), GREEN("Green"), BLUE("Blue");

    private String value;

    ColorPicker(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}