package com.qaprosoft.carina.demo.mobile.gui.pages.common;

public enum ZoomBtn {
    IN("in"), OUT("out");

    private String value;

    ZoomBtn(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
