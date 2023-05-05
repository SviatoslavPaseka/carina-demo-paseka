package com.ui_katalogkit.common.StackViewsPagesBase.enums;

public enum IncrementDecrement {
    INCREMENT("increment"), DECREMENT("decrement");

    private String value;

    public String getValue() {
        return value;
    }

    IncrementDecrement(String value) {
        this.value = value;
    }
}