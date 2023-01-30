package com.qaprosoft.carina.demo.mobile.gui.pages.common;

public enum ZoomButton {
    IN("Zoom in"), OUT("Zoom out");

    private String value;

    ZoomButton(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
