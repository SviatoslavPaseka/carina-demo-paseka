package com.ui_katalogkit.common.AlertViewsPagesBase.alertWindows;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.ui_katalogkit.common.AlertViewsPagesBase.AlertViewsPageBase;
import com.ui_katalogkit.common.ParentPageBase;
import org.openqa.selenium.WebDriver;

public abstract class AlertConfirmCancelPageBase extends ParentPageBase {
    public AlertConfirmCancelPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract AlertViewsPageBase clickCancel();

    public abstract AlertViewsPageBase clickConfirm();

    public abstract String getMessageText();
}
