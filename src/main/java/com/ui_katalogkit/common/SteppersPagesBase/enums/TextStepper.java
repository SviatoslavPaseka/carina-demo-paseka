package com.ui_katalogkit.common.SteppersPagesBase.enums;

public enum TextStepper {
    DEFAULT("DEFAULT"), TINTED("TINTED"), CUSTOM("CUSTOM");

    private String value;

    public String getValue() {
        return value;
    }

    TextStepper(String value) {
        this.value = value;
    }
}