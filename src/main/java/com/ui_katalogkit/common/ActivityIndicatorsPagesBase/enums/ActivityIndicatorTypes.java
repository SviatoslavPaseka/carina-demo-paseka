package com.ui_katalogkit.common.ActivityIndicatorsPagesBase.enums;

public enum ActivityIndicatorTypes {
    BIG("0"), SMALL("5");

    private String number;

    ActivityIndicatorTypes(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}
