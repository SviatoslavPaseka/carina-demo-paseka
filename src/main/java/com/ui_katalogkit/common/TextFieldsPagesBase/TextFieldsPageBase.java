package com.ui_katalogkit.common.TextFieldsPagesBase;

import com.ui_katalogkit.common.ParentPageBase;
import com.ui_katalogkit.common.TextFieldsPagesBase.enums.TextFieldName;
import org.openqa.selenium.WebDriver;

public abstract class TextFieldsPageBase extends ParentPageBase {
    public TextFieldsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getTextFromTextAboveTextField(TextFieldName textFieldName);

    public abstract String getTextFromTextField(TextFieldName textFieldName);

    public abstract void typeTextToTextField(TextFieldName textFieldName, String text);

    public abstract boolean isClearButtonPresent();

    public abstract void clearTextInSearchTextField();

    public abstract void clickOnTextField(TextFieldName textFieldName);
}
