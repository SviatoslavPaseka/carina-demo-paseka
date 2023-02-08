package com.mfp.common;

import com.mfp.common.enums.NutrientsCustomSummary;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CustomSummaryPageBase extends AbstractPage {
    public CustomSummaryPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isNutrientCheckboxChecked(NutrientsCustomSummary nutrientCustomSummary);

    public abstract DiaryPageBase clickAcceptButton();

    public abstract boolean isOpened();
}
