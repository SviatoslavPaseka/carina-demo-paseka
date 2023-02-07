package com.mfp.common.enums;

public enum NameOfMealDiary {
    BREAKFAST("Breakfast"), LUNCH("Lunch"), DINNER("Dinner"),
    SNACKS("Snacks");

    private String value;

    NameOfMealDiary(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
