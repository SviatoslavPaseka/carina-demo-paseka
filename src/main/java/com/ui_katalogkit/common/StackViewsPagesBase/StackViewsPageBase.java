package com.ui_katalogkit.common.StackViewsPagesBase;

import com.ui_katalogkit.common.ParentPageBase;
import com.ui_katalogkit.common.StackViewsPagesBase.enums.IncrementDecrement;
import com.ui_katalogkit.common.StackViewsPagesBase.enums.NumberOfSquare;
import com.ui_katalogkit.common.StackViewsPagesBase.enums.TypeDetail;
import org.openqa.selenium.WebDriver;

public abstract class StackViewsPageBase extends ParentPageBase {
    public StackViewsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isDetailTextPresent(TypeDetail typeDetail);

    public abstract String getTextFromDetailTextPresent(TypeDetail typeDetail);

    public abstract boolean isTextFieldPresent(TypeDetail typeDetail);

    public abstract void typeTextToTextField(TypeDetail typeDetail, String text);

    public abstract String getTextFromTextField(TypeDetail typeDetail);

    public abstract boolean isDetailChangerPresent(TypeDetail typeDetail);

    public abstract void clickDetailChanger(TypeDetail typeDetail);

    public abstract boolean isAddRemoveChangerEnabled(IncrementDecrement incrementDecrement);

    public abstract void clickAddRemoveChanger(IncrementDecrement incrementDecrement);

    public abstract boolean isSquarePresent(NumberOfSquare numberOfSquare);
}