package com.mfp.common.enums;

public enum NutrientsCustomSummary {
    FAT("Fat", "fat"), CARBS("Carbs", "carbohydrates"),
    PROTEIN("Protein", "protein");

    private final String buttonId;
    private final String value;

    NutrientsCustomSummary(String buttonId, String value) {
        this.buttonId = buttonId;
        this.value = value;
    }

    public String getButtonId() {
        return buttonId;
    }

    public String getValue() {
        return value;
    }
}
