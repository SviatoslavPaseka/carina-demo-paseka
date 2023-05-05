package com.ui_katalogkit.common.ActivityIndicatorsPagesBase;

import com.ui_katalogkit.common.ParentPageBase;
import com.ui_katalogkit.common.ActivityIndicatorsPagesBase.enums.ActivityIndicatorTypes;
import com.ui_katalogkit.common.ActivityIndicatorsPagesBase.enums.TextAboveInProgressIndicator;
import org.openqa.selenium.WebDriver;

public abstract class ActivityIndicatorsPageBase extends ParentPageBase {
    public ActivityIndicatorsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isDefaultInProgressIndicatorEnabled(ActivityIndicatorTypes activityIndicatorType);

    public abstract boolean isTintedInProgressIndicatorEnabled(ActivityIndicatorTypes activityIndicatorType);

    public abstract String getTextFromTextAboveInProgressIndicator(TextAboveInProgressIndicator textAboveInProgressIndicator);
}
