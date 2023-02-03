package com.mfp.common.enums;

public enum NameOfMealDiary {
    BREAKFAST("breakfast"), LUNCH("lunch"), DINNER("dinner"),
    SNACKS("snacks"), EXERCISE("exercise"), WATER("water");

    private String value;

    NameOfMealDiary(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
