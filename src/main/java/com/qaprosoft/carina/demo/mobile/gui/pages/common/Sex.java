package com.qaprosoft.carina.demo.mobile.gui.pages.common;

public enum Sex {
    MALE("male"), FEMALE("female");

    String value;

    Sex(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
