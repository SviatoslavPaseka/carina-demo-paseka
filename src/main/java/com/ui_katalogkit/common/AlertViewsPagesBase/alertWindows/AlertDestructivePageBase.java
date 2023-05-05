package com.ui_katalogkit.common.AlertViewsPagesBase.alertWindows;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.ui_katalogkit.common.AlertViewsPagesBase.AlertViewsPageBase;
import com.ui_katalogkit.common.ParentPageBase;
import org.openqa.selenium.WebDriver;

public abstract class AlertDestructivePageBase extends ParentPageBase {
    public AlertDestructivePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract AlertViewsPageBase clickDestructiveButton();

    public abstract AlertViewsPageBase clickSafeButton();

    public abstract String getMessageText();
}
