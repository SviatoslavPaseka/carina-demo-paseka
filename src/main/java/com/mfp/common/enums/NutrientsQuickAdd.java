package com.mfp.common.enums;

public enum NutrientsQuickAdd {
    FAT("fat", "Fat"), CARBS("carbs", "Carbs"),
    PROTEIN("protein", "Protein");

    private String value;
    private String nutrientId;

    NutrientsQuickAdd(String value, String nameInDOMId) {
        this.value = value;
        this.nutrientId = nameInDOMId;
    }

    public String getValue() {
        return value;
    }

    public String getNutrientId() {
        return nutrientId;
    }
}
