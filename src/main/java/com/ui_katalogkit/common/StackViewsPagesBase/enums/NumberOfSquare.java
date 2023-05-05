package com.ui_katalogkit.common.StackViewsPagesBase.enums;

public enum NumberOfSquare {
    ONE("1"), TWO("2"), THREE("3");

    private String number;

    public String getNumber() {
        return number;
    }

    NumberOfSquare(String number) {
        this.number = number;
    }
}