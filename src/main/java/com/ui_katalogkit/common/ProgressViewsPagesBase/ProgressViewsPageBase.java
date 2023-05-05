package com.ui_katalogkit.common.ProgressViewsPagesBase;

import com.ui_katalogkit.common.ParentPageBase;
import com.ui_katalogkit.common.ProgressViewsPagesBase.enums.NameOfProgressBar;
import org.openqa.selenium.WebDriver;

public abstract class ProgressViewsPageBase extends ParentPageBase {
    public ProgressViewsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getTextFromDescription(NameOfProgressBar description);

    public abstract String getPercentOfProgressBar(NameOfProgressBar description);
}
