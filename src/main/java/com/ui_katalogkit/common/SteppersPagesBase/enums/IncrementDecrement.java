package com.ui_katalogkit.common.SteppersPagesBase.enums;

public enum IncrementDecrement {
    INCREMENT("Increment"), DECREMENT("Decrement");

    private String value;

    public String getValue() {
        return value;
    }

    IncrementDecrement(String value) {
        this.value = value;
    }
}