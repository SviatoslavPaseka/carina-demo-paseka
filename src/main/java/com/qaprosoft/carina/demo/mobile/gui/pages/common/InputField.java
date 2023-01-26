package com.qaprosoft.carina.demo.mobile.gui.pages.common;

public enum InputField {
    PASSWORD("password"), NAME("name");

    private String value;

    InputField(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
