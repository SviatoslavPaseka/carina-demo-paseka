package com.ui_katalogkit.common.SlidersPagesBase.enums;

public enum SliderName {
    DEFAULT("DEFAULT"), TINTED("TINTED"), CUSTOM("CUSTOM"), MIN_AND_MAX_IMAGES("MIN AND MAX IMAGES");

    private String value;

    SliderName(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}