package com.ui_katalogkit.common.AlertViewsPagesBase.alertWindows;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.ui_katalogkit.common.AlertViewsPagesBase.AlertViewsPageBase;
import com.ui_katalogkit.common.ParentPageBase;
import org.openqa.selenium.WebDriver;

public abstract class AlertOtherPageBase extends ParentPageBase {
    public AlertOtherPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getTitleText();

    public abstract String getMessageText();

    public abstract AlertViewsPageBase clickCancel();

    public abstract AlertViewsPageBase clickChoiceOne();

    public abstract AlertViewsPageBase clickChoiceTwo();
}
