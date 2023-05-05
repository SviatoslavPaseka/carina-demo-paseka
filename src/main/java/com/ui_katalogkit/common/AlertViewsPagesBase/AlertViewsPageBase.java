package com.ui_katalogkit.common.AlertViewsPagesBase;

import com.ui_katalogkit.common.ParentPageBase;
import com.ui_katalogkit.common.AlertViewsPagesBase.enums.AlertPageDescriptionTexts;
import com.ui_katalogkit.common.AlertViewsPagesBase.enums.AlertViewsItem;
import org.openqa.selenium.WebDriver;

public abstract class AlertViewsPageBase extends ParentPageBase {
    public AlertViewsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getDescriptionText(AlertPageDescriptionTexts descriptionTexts);

    public abstract ParentPageBase tapAlertViewItem(AlertViewsItem itemName);
}