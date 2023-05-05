package com.ui_katalogkit.common.AlertViewsPagesBase.alertWindows;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.ui_katalogkit.common.AlertViewsPagesBase.AlertViewsPageBase;
import com.ui_katalogkit.common.ParentPageBase;
import org.openqa.selenium.WebDriver;

public abstract class AlertSecureTextEntryPageBase extends ParentPageBase {
    public AlertSecureTextEntryPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getTitleText();

    public abstract String getMessageText();

    public abstract boolean isOkButtonEnabled();

    public abstract AlertViewsPageBase clickOk();

    public abstract AlertViewsPageBase clickCancel();

    public abstract void enterText(String value);

    public abstract String getTextFromTextEntry();
}
