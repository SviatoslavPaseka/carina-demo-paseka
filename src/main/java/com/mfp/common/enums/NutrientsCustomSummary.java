package com.mfp.common.enums;

public enum NutrientsCustomSummary {
    FAT("Fat"),
    SATURATED_FAT("SatFat"),
    POLYUNSATURATED_FAT("PolyFat"),
    MONOUNSATURATED_FAT("MonoFat"),
    TRANS_FAT("TransFat"),
    CHOLESTEROL("Cholesterol"),
    SODIUM("Sodium"),
    POTASSIUM("Potassium"),
    CARBOHYDRATES("Carbs"),
    FIBER("Fiber"),
    SUGAR("Sugar"),
    PROTEIN("Protein"),
    VITAMIN_A("VitaminA"),
    VITAMIN_C("VitaminC"),
    CALCIUM("Calcium"),
    IRON("Iron");

    private final String buttonId;

    NutrientsCustomSummary(String buttonId) {
        this.buttonId = buttonId;
    }

    public String getButtonId() {
        return buttonId;
    }
}
