package com.qaprosoft.carina.demo.mobile.gui.pages.common;

public enum NavMenuBtn {
    WEB_VIEW("Web View"), CHARTS("Charts"),
    MAP("Map"), UI_ELEMENTS("UI Elements");

    private String value;

    NavMenuBtn(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
